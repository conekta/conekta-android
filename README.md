# org.openapitools.client - Kotlin client library for Conekta API


A kotlin client for Android using the currently recommended http client, Volley. See https://developer.android.com/training/volley

- Currently sends GsonRequests
- Currently only supports Gson as a serializer - will throw an exception if a different serializer is chosen
- Defaults the source location to src/main/java as per standard Android builds


## Design

Volley is a queue/request based layer on top of http url stack specific to Android. Android favours dependency injection and
a layered architecture, and IO performed off the main thread to maintain UI responsiveness, with a preferred technique of
kotlin co-routines. The code gen library reflects these factors.

- Api calls use co-routines, and execute them using volley callbacks to avoid tying up a thread.
- Facilitate dependency injection, with default implementations available.
- Generate a requestFactory that can be overridden
- Allow the passing of the RequestFactory per tag (api client) or per operation (an extra parameter is created on operations with non-global security), with per operation auth overriding global security.
- DI scoping of the Request Factory and pre-generated auth header factories allow for thread safe and secure setting of credentials.
- Lazy header factories allow for refreshing tokens etc
- Factoring of header factories to the Request Factory allow ambient provision of credentials. Code gen library is credential storage agnostic.
- Header factories allow the merging of generated headers from open api spec with dynamically added headers

- Injection of http url stack to allow custom http stacks. Default implementation is best practice singleton
- Data classes used for serialisation to reflect volley's preference - an immutable request that once queued can't be tampered with.

- Reuse model class and other jvm common infrastructure

- Optional generation of room database models, and transform methods to these from open api models
- Room and api models can be extended with additional extension properties.

## Future improvements
- Option to generate image requests on certain conditionals e.g content-type gif etc
- Support for kotlin serialization.
- Multi part form parameters and support for file inputs

## Usage
Hilt Dependency injection example - with default values for parameters overridden.
```
 @Provides
    internal fun provideSomeApi(
        context: Context,
        restService: IRestService,
        configurationService: IConfigurationService,
        sessionService: ISessionService
    ): SomeApi {
        return SomeApi(
            context = context,
            requestQueue = restService.getRequestQueue(),
            requestFactory = RequestFactory(listOf(createSessionHeaderFactory(sessionService), createTraceHeaderFactory()),
                postProcessors = listOf(retryPolicySetter)),
            basePath = configurationService.getBaseUrl()
        )
    }
```
Here is the constructor so you can see the defaults
```class SomeApi (
val context: Context,
val requestQueue: Lazy<RequestQueue> = lazy(initializer = {
    Volley.newRequestQueue(context.applicationContext)
    }),
    val requestFactory: IRequestFactory = RequestFactory(),
    val basePath: String = "https://yourbasepath.from_input_parameter.com/api",
    private val postProcessors :List <(Request<*>) -> Unit> = listOf()) {
```

### Overriding defaults
The above constructor for each api allows the following to be customized
- A custom context, so either a singleton request queue or different scope can be created - see
https://developer.android.com/training/volley/requestqueue#singleton
- An overridable request queue - which in turn can have a custom http url stack passed to it
- An overridable request factory constructor call, or a request factory that can be overridden by a custom template, with
custom header factory, request post processors and custom gson adapters injected.

#### Overriding request generation
Request generation can be overridden by
- Overriding the entire request factory template
- Supplying custom header factories - methods that take any possible parameters but return a map of headers
- Supplying custom request post processors - methods that take and return the request object

Header factory examples can be found in the auth section, as these are implemented as header factories. eg
```
val basicAuthHeaderFactoryBuilder = { username: String?, password: String? ->
{ mapOf("Authorization" to "Basic " + Base64.encodeToString("${username ?: ""}:${password ?: ""}".toByteArray(), Base64.DEFAULT))}
}
```
In this case it's a lambda function (a factory method) that takes an username and password, and returns a map of headers. Other
generated code will supply the username and password. In this case it results in a map of  just one key/value pair, but
it could be multiple. The important part is it's returning a map - and that the surrounding code
will can bind the inputs to it at some point.

Here is a different example that supplies tracing header values
```
/**
 * Create a lambda of tracing headers to be injected into an API's [RequestFactory].
 */
private fun createTraceHeaderFactory(): () -> Map<String, String> = {
    mapOf(
        HttpHeaderType.b3_traceId.rawValue to UUIDExtensions.asTraceId(UUID.randomUUID()),
        HttpHeaderType.b3_spanId.rawValue to UUIDExtensions.asSpanId(UUID.randomUUID()),
        HttpHeaderType.b3_sampled.rawValue to "1"
    )
}
```
Finally a post processor example
```
 /**
     * Configure a [DefaultRetryPolicy] to be injected into the [RequestFactory] with a maximum number of retries of zero.
     */
    private val retryPolicySetter = { request: Request<*> ->
        Unit.apply {
            request.setRetryPolicy(
                DefaultRetryPolicy(
                    RestService.DEFAULT_TIMEOUT_MS,
                    0,
                    DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
                )
            )
        }
    }
```

### Serialization
#### Gson and Polymorphic types
The GsonRequest object can be passed custom type adapters
```
class GsonRequest<T>(
    method: Int,
    url: String,
    private val body: Any?,
    private val headers: Map<String, String>?,
    private val params: MutableMap<String, String>?,
    private val contentTypeForBody: String?,
    private val encodingForParams: String?,
    private val gsonAdapters: Map<Type, Object>?,
    private val type: Type,
    private val listener: Response.Listener<T>,
    errorListener: Response.ErrorListener
) : Request<T>(method, url, errorListener) {

    val gsonBuilder: GsonBuilder = GsonBuilder()
        .registerTypeAdapter(OffsetDateTime::class.java, OffsetDateTimeAdapter())
        .registerTypeAdapter(LocalDateTime::class.java, LocalDateTimeAdapter())
        .registerTypeAdapter(LocalDate::class.java, LocalDateAdapter())
        .registerTypeAdapter(ByteArray::class.java, ByteArrayAdapter())

```
## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.conekta.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AntifraudApi* | [**createRuleBlacklist**](docs/AntifraudApi.md#createruleblacklist) | **POST** /antifraud/blacklists | Create blacklisted rule
*AntifraudApi* | [**createRuleWhitelist**](docs/AntifraudApi.md#createrulewhitelist) | **POST** /antifraud/whitelists | Create whitelisted rule
*AntifraudApi* | [**deleteRuleBlacklist**](docs/AntifraudApi.md#deleteruleblacklist) | **DELETE** /antifraud/blacklists/{id} | Delete blacklisted rule
*AntifraudApi* | [**deleteRuleWhitelist**](docs/AntifraudApi.md#deleterulewhitelist) | **DELETE** /antifraud/whitelists/{id} | Delete whitelisted rule
*AntifraudApi* | [**getRuleBlacklist**](docs/AntifraudApi.md#getruleblacklist) | **GET** /antifraud/blacklists | Get list of blacklisted rules
*AntifraudApi* | [**getRuleWhitelist**](docs/AntifraudApi.md#getrulewhitelist) | **GET** /antifraud/whitelists | Get a list of whitelisted rules
*ApiKeysApi* | [**createApiKey**](docs/ApiKeysApi.md#createapikey) | **POST** /api_keys | Create Api Key
*ApiKeysApi* | [**deleteApiKey**](docs/ApiKeysApi.md#deleteapikey) | **DELETE** /api_keys/{id} | Delete Api Key
*ApiKeysApi* | [**getApiKey**](docs/ApiKeysApi.md#getapikey) | **GET** /api_keys/{id} | Get Api Key
*ApiKeysApi* | [**getApiKeys**](docs/ApiKeysApi.md#getapikeys) | **GET** /api_keys | Get list of Api Keys
*ApiKeysApi* | [**updateApiKey**](docs/ApiKeysApi.md#updateapikey) | **PUT** /api_keys/{id} | Update Api Key
*BalancesApi* | [**getBalance**](docs/BalancesApi.md#getbalance) | **GET** /balance | Get a company's balance
*ChargesApi* | [**getCharges**](docs/ChargesApi.md#getcharges) | **GET** /charges | Get A List of Charges
*ChargesApi* | [**ordersCreateCharge**](docs/ChargesApi.md#orderscreatecharge) | **POST** /orders/{id}/charges | Create charge
*ChargesApi* | [**updateCharge**](docs/ChargesApi.md#updatecharge) | **PUT** /charges/{id} | Update a charge
*CompaniesApi* | [**getCompanies**](docs/CompaniesApi.md#getcompanies) | **GET** /companies | Get List of Companies
*CompaniesApi* | [**getCompany**](docs/CompaniesApi.md#getcompany) | **GET** /companies/{id} | Get Company
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createcustomer) | **POST** /customers | Create customer
*CustomersApi* | [**createCustomerFiscalEntities**](docs/CustomersApi.md#createcustomerfiscalentities) | **POST** /customers/{id}/fiscal_entities | Create Fiscal Entity
*CustomersApi* | [**deleteCustomerById**](docs/CustomersApi.md#deletecustomerbyid) | **DELETE** /customers/{id} | Delete Customer
*CustomersApi* | [**getCustomerById**](docs/CustomersApi.md#getcustomerbyid) | **GET** /customers/{id} | Get Customer
*CustomersApi* | [**getCustomers**](docs/CustomersApi.md#getcustomers) | **GET** /customers | Get a list of customers
*CustomersApi* | [**updateCustomer**](docs/CustomersApi.md#updatecustomer) | **PUT** /customers/{id} | Update customer
*CustomersApi* | [**updateCustomerFiscalEntities**](docs/CustomersApi.md#updatecustomerfiscalentities) | **PUT** /customers/{id}/fiscal_entities/{fiscal_entities_id} | Update  Fiscal Entity
*DiscountsApi* | [**ordersCreateDiscountLine**](docs/DiscountsApi.md#orderscreatediscountline) | **POST** /orders/{id}/discount_lines | Create Discount
*DiscountsApi* | [**ordersDeleteDiscountLines**](docs/DiscountsApi.md#ordersdeletediscountlines) | **DELETE** /orders/{id}/discount_lines/{discount_lines_id} | Delete Discount
*DiscountsApi* | [**ordersGetDiscountLine**](docs/DiscountsApi.md#ordersgetdiscountline) | **GET** /orders/{id}/discount_lines/{discount_lines_id} | Get Discount
*DiscountsApi* | [**ordersGetDiscountLines**](docs/DiscountsApi.md#ordersgetdiscountlines) | **GET** /orders/{id}/discount_lines | Get a List of Discount
*DiscountsApi* | [**ordersUpdateDiscountLines**](docs/DiscountsApi.md#ordersupdatediscountlines) | **PUT** /orders/{id}/discount_lines/{discount_lines_id} | Update Discount
*EventsApi* | [**getEvent**](docs/EventsApi.md#getevent) | **GET** /events/{id} | Get Event
*EventsApi* | [**getEvents**](docs/EventsApi.md#getevents) | **GET** /events | Get list of Events
*EventsApi* | [**resendEvent**](docs/EventsApi.md#resendevent) | **POST** /events/{event_id}/webhook_logs/{webhook_log_id}/resend | Resend Event
*LogsApi* | [**getLogById**](docs/LogsApi.md#getlogbyid) | **GET** /logs/{id} | Get Log
*LogsApi* | [**getLogs**](docs/LogsApi.md#getlogs) | **GET** /logs | Get List Of Logs
*OrdersApi* | [**cancelOrder**](docs/OrdersApi.md#cancelorder) | **POST** /orders/{id}/cancel | Cancel Order
*OrdersApi* | [**createOrder**](docs/OrdersApi.md#createorder) | **POST** /orders | Create order
*OrdersApi* | [**getOrderById**](docs/OrdersApi.md#getorderbyid) | **GET** /orders/{id} | Get Order
*OrdersApi* | [**getOrders**](docs/OrdersApi.md#getorders) | **GET** /orders | Get a list of Orders
*OrdersApi* | [**orderCancelRefund**](docs/OrdersApi.md#ordercancelrefund) | **DELETE** /orders/{id}/refunds/{refund_id} | Cancel Refund
*OrdersApi* | [**orderRefund**](docs/OrdersApi.md#orderrefund) | **POST** /orders/{id}/refunds | Refund Order
*OrdersApi* | [**ordersCreateCapture**](docs/OrdersApi.md#orderscreatecapture) | **POST** /orders/{id}/capture | Capture Order
*OrdersApi* | [**updateOrder**](docs/OrdersApi.md#updateorder) | **PUT** /orders/{id} | Update Order
*PaymentLinkApi* | [**cancelCheckout**](docs/PaymentLinkApi.md#cancelcheckout) | **PUT** /checkouts/{id}/cancel | Cancel Payment Link
*PaymentLinkApi* | [**createCheckout**](docs/PaymentLinkApi.md#createcheckout) | **POST** /checkouts | Create Unique Payment Link
*PaymentLinkApi* | [**emailCheckout**](docs/PaymentLinkApi.md#emailcheckout) | **POST** /checkouts/{id}/email | Send an email
*PaymentLinkApi* | [**getCheckout**](docs/PaymentLinkApi.md#getcheckout) | **GET** /checkouts/{id} | Get a payment link by ID
*PaymentLinkApi* | [**getCheckouts**](docs/PaymentLinkApi.md#getcheckouts) | **GET** /checkouts | Get a list of payment links
*PaymentLinkApi* | [**smsCheckout**](docs/PaymentLinkApi.md#smscheckout) | **POST** /checkouts/{id}/sms | Send an sms
*PaymentMethodsApi* | [**createCustomerPaymentMethods**](docs/PaymentMethodsApi.md#createcustomerpaymentmethods) | **POST** /customers/{id}/payment_sources | Create Payment Method
*PaymentMethodsApi* | [**deleteCustomerPaymentMethods**](docs/PaymentMethodsApi.md#deletecustomerpaymentmethods) | **DELETE** /customers/{id}/payment_sources/{payment_method_id} | Delete Payment Method
*PaymentMethodsApi* | [**getCustomerPaymentMethods**](docs/PaymentMethodsApi.md#getcustomerpaymentmethods) | **GET** /customers/{id}/payment_sources | Get Payment Methods
*PaymentMethodsApi* | [**updateCustomerPaymentMethods**](docs/PaymentMethodsApi.md#updatecustomerpaymentmethods) | **PUT** /customers/{id}/payment_sources/{payment_method_id} | Update Payment Method
*PayoutOrdersApi* | [**createPayoutOrder**](docs/PayoutOrdersApi.md#createpayoutorder) | **POST** /payout_orders | Create payout order
*PayoutOrdersApi* | [**getPayoutOrderById**](docs/PayoutOrdersApi.md#getpayoutorderbyid) | **GET** /payout_orders/{id} | Get Payout Order
*PayoutOrdersApi* | [**getPayoutOrders**](docs/PayoutOrdersApi.md#getpayoutorders) | **GET** /payout_orders | Get a list of Payout Orders
*PlansApi* | [**createPlan**](docs/PlansApi.md#createplan) | **POST** /plans | Create Plan
*PlansApi* | [**deletePlan**](docs/PlansApi.md#deleteplan) | **DELETE** /plans/{id} | Delete Plan
*PlansApi* | [**getPlan**](docs/PlansApi.md#getplan) | **GET** /plans/{id} | Get Plan
*PlansApi* | [**getPlans**](docs/PlansApi.md#getplans) | **GET** /plans | Get A List of Plans
*PlansApi* | [**updatePlan**](docs/PlansApi.md#updateplan) | **PUT** /plans/{id} | Update Plan
*ProductsApi* | [**ordersCreateProduct**](docs/ProductsApi.md#orderscreateproduct) | **POST** /orders/{id}/line_items | Create Product
*ProductsApi* | [**ordersDeleteProduct**](docs/ProductsApi.md#ordersdeleteproduct) | **DELETE** /orders/{id}/line_items/{line_item_id} | Delete Product
*ProductsApi* | [**ordersUpdateProduct**](docs/ProductsApi.md#ordersupdateproduct) | **PUT** /orders/{id}/line_items/{line_item_id} | Update Product
*ShippingContactsApi* | [**createCustomerShippingContacts**](docs/ShippingContactsApi.md#createcustomershippingcontacts) | **POST** /customers/{id}/shipping_contacts | Create a shipping contacts
*ShippingContactsApi* | [**deleteCustomerShippingContacts**](docs/ShippingContactsApi.md#deletecustomershippingcontacts) | **DELETE** /customers/{id}/shipping_contacts/{shipping_contacts_id} | Delete shipping contacts
*ShippingContactsApi* | [**updateCustomerShippingContacts**](docs/ShippingContactsApi.md#updatecustomershippingcontacts) | **PUT** /customers/{id}/shipping_contacts/{shipping_contacts_id} | Update shipping contacts
*ShippingsApi* | [**ordersCreateShipping**](docs/ShippingsApi.md#orderscreateshipping) | **POST** /orders/{id}/shipping_lines | Create Shipping
*ShippingsApi* | [**ordersDeleteShipping**](docs/ShippingsApi.md#ordersdeleteshipping) | **DELETE** /orders/{id}/shipping_lines/{shipping_id} | Delete Shipping
*ShippingsApi* | [**ordersUpdateShipping**](docs/ShippingsApi.md#ordersupdateshipping) | **PUT** /orders/{id}/shipping_lines/{shipping_id} | Update Shipping
*SubscriptionsApi* | [**cancelSubscription**](docs/SubscriptionsApi.md#cancelsubscription) | **POST** /customers/{id}/subscription/cancel | Cancel Subscription
*SubscriptionsApi* | [**createSubscription**](docs/SubscriptionsApi.md#createsubscription) | **POST** /customers/{id}/subscription | Create Subscription
*SubscriptionsApi* | [**getAllEventsFromSubscription**](docs/SubscriptionsApi.md#getalleventsfromsubscription) | **GET** /customers/{id}/subscription/events | Get Events By Subscription
*SubscriptionsApi* | [**getSubscription**](docs/SubscriptionsApi.md#getsubscription) | **GET** /customers/{id}/subscription | Get Subscription
*SubscriptionsApi* | [**pauseSubscription**](docs/SubscriptionsApi.md#pausesubscription) | **POST** /customers/{id}/subscription/pause | Pause Subscription
*SubscriptionsApi* | [**resumeSubscription**](docs/SubscriptionsApi.md#resumesubscription) | **POST** /customers/{id}/subscription/resume | Resume Subscription
*SubscriptionsApi* | [**updateSubscription**](docs/SubscriptionsApi.md#updatesubscription) | **PUT** /customers/{id}/subscription | Update Subscription
*TaxesApi* | [**ordersCreateTaxes**](docs/TaxesApi.md#orderscreatetaxes) | **POST** /orders/{id}/tax_lines | Create Tax
*TaxesApi* | [**ordersDeleteTaxes**](docs/TaxesApi.md#ordersdeletetaxes) | **DELETE** /orders/{id}/tax_lines/{tax_id} | Delete Tax
*TaxesApi* | [**ordersUpdateTaxes**](docs/TaxesApi.md#ordersupdatetaxes) | **PUT** /orders/{id}/tax_lines/{tax_id} | Update Tax
*TokensApi* | [**createToken**](docs/TokensApi.md#createtoken) | **POST** /tokens | Create Token
*TransactionsApi* | [**getTransaction**](docs/TransactionsApi.md#gettransaction) | **GET** /transactions/{id} | Get transaction
*TransactionsApi* | [**getTransactions**](docs/TransactionsApi.md#gettransactions) | **GET** /transactions | Get List transactions
*TransfersApi* | [**getTransfer**](docs/TransfersApi.md#gettransfer) | **GET** /transfers/{id} | Get Transfer
*TransfersApi* | [**getTransfers**](docs/TransfersApi.md#gettransfers) | **GET** /transfers | Get a list of transfers
*WebhookKeysApi* | [**createWebhookKey**](docs/WebhookKeysApi.md#createwebhookkey) | **POST** /webhook_keys | Create Webhook Key
*WebhookKeysApi* | [**deleteWebhookKey**](docs/WebhookKeysApi.md#deletewebhookkey) | **DELETE** /webhook_keys/{id} | Delete Webhook key
*WebhookKeysApi* | [**getWebhookKey**](docs/WebhookKeysApi.md#getwebhookkey) | **GET** /webhook_keys/{id} | Get Webhook Key
*WebhookKeysApi* | [**getWebhookKeys**](docs/WebhookKeysApi.md#getwebhookkeys) | **GET** /webhook_keys | Get List of Webhook Keys
*WebhookKeysApi* | [**updateWebhookKey**](docs/WebhookKeysApi.md#updatewebhookkey) | **PUT** /webhook_keys/{id} | Update Webhook Key
*WebhooksApi* | [**createWebhook**](docs/WebhooksApi.md#createwebhook) | **POST** /webhooks | Create Webhook
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deletewebhook) | **DELETE** /webhooks/{id} | Delete Webhook
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getwebhook) | **GET** /webhooks/{id} | Get Webhook
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getwebhooks) | **GET** /webhooks | Get List of Webhooks
*WebhooksApi* | [**testWebhook**](docs/WebhooksApi.md#testwebhook) | **POST** /webhooks/{id}/test | Test Webhook
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updatewebhook) | **PUT** /webhooks/{id} | Update Webhook


<a id="documentation-for-models"></a>
## Documentation for Models

 - [io.conekta.model.ApiKeyCreateResponse](docs/ApiKeyCreateResponse.md)
 - [io.conekta.model.ApiKeyRequest](docs/ApiKeyRequest.md)
 - [io.conekta.model.ApiKeyResponse](docs/ApiKeyResponse.md)
 - [io.conekta.model.ApiKeyResponseOnDelete](docs/ApiKeyResponseOnDelete.md)
 - [io.conekta.model.ApiKeyUpdateRequest](docs/ApiKeyUpdateRequest.md)
 - [io.conekta.model.BalanceCommonField](docs/BalanceCommonField.md)
 - [io.conekta.model.BalanceResponse](docs/BalanceResponse.md)
 - [io.conekta.model.BlacklistRuleResponse](docs/BlacklistRuleResponse.md)
 - [io.conekta.model.ChargeOrderResponse](docs/ChargeOrderResponse.md)
 - [io.conekta.model.ChargeOrderResponsePaymentMethod](docs/ChargeOrderResponsePaymentMethod.md)
 - [io.conekta.model.ChargeRequest](docs/ChargeRequest.md)
 - [io.conekta.model.ChargeRequestPaymentMethod](docs/ChargeRequestPaymentMethod.md)
 - [io.conekta.model.ChargeResponse](docs/ChargeResponse.md)
 - [io.conekta.model.ChargeResponseChannel](docs/ChargeResponseChannel.md)
 - [io.conekta.model.ChargeResponsePaymentMethod](docs/ChargeResponsePaymentMethod.md)
 - [io.conekta.model.ChargeResponseRefunds](docs/ChargeResponseRefunds.md)
 - [io.conekta.model.ChargeResponseRefundsData](docs/ChargeResponseRefundsData.md)
 - [io.conekta.model.ChargeUpdateRequest](docs/ChargeUpdateRequest.md)
 - [io.conekta.model.ChargesDataResponse](docs/ChargesDataResponse.md)
 - [io.conekta.model.Checkout](docs/Checkout.md)
 - [io.conekta.model.CheckoutOrderTemplate](docs/CheckoutOrderTemplate.md)
 - [io.conekta.model.CheckoutOrderTemplateCustomerInfo](docs/CheckoutOrderTemplateCustomerInfo.md)
 - [io.conekta.model.CheckoutRequest](docs/CheckoutRequest.md)
 - [io.conekta.model.CheckoutResponse](docs/CheckoutResponse.md)
 - [io.conekta.model.CheckoutsResponse](docs/CheckoutsResponse.md)
 - [io.conekta.model.CompanyFiscalInfoAddressResponse](docs/CompanyFiscalInfoAddressResponse.md)
 - [io.conekta.model.CompanyFiscalInfoResponse](docs/CompanyFiscalInfoResponse.md)
 - [io.conekta.model.CompanyPayoutDestinationResponse](docs/CompanyPayoutDestinationResponse.md)
 - [io.conekta.model.CompanyResponse](docs/CompanyResponse.md)
 - [io.conekta.model.CreateCustomerFiscalEntitiesResponse](docs/CreateCustomerFiscalEntitiesResponse.md)
 - [io.conekta.model.CreateCustomerPaymentMethodsRequest](docs/CreateCustomerPaymentMethodsRequest.md)
 - [io.conekta.model.CreateCustomerPaymentMethodsResponse](docs/CreateCustomerPaymentMethodsResponse.md)
 - [io.conekta.model.CreateRiskRulesData](docs/CreateRiskRulesData.md)
 - [io.conekta.model.Customer](docs/Customer.md)
 - [io.conekta.model.CustomerAddress](docs/CustomerAddress.md)
 - [io.conekta.model.CustomerAntifraudInfo](docs/CustomerAntifraudInfo.md)
 - [io.conekta.model.CustomerAntifraudInfoResponse](docs/CustomerAntifraudInfoResponse.md)
 - [io.conekta.model.CustomerFiscalEntitiesDataResponse](docs/CustomerFiscalEntitiesDataResponse.md)
 - [io.conekta.model.CustomerFiscalEntitiesRequest](docs/CustomerFiscalEntitiesRequest.md)
 - [io.conekta.model.CustomerFiscalEntitiesResponse](docs/CustomerFiscalEntitiesResponse.md)
 - [io.conekta.model.CustomerInfo](docs/CustomerInfo.md)
 - [io.conekta.model.CustomerInfoJustCustomerId](docs/CustomerInfoJustCustomerId.md)
 - [io.conekta.model.CustomerInfoJustCustomerIdResponse](docs/CustomerInfoJustCustomerIdResponse.md)
 - [io.conekta.model.CustomerPaymentMethodRequest](docs/CustomerPaymentMethodRequest.md)
 - [io.conekta.model.CustomerPaymentMethodsData](docs/CustomerPaymentMethodsData.md)
 - [io.conekta.model.CustomerPaymentMethodsRequest](docs/CustomerPaymentMethodsRequest.md)
 - [io.conekta.model.CustomerPaymentMethodsResponse](docs/CustomerPaymentMethodsResponse.md)
 - [io.conekta.model.CustomerResponse](docs/CustomerResponse.md)
 - [io.conekta.model.CustomerResponseShippingContacts](docs/CustomerResponseShippingContacts.md)
 - [io.conekta.model.CustomerShippingContacts](docs/CustomerShippingContacts.md)
 - [io.conekta.model.CustomerShippingContactsAddress](docs/CustomerShippingContactsAddress.md)
 - [io.conekta.model.CustomerShippingContactsDataResponse](docs/CustomerShippingContactsDataResponse.md)
 - [io.conekta.model.CustomerShippingContactsResponse](docs/CustomerShippingContactsResponse.md)
 - [io.conekta.model.CustomerShippingContactsResponseAddress](docs/CustomerShippingContactsResponseAddress.md)
 - [io.conekta.model.CustomerUpdateFiscalEntitiesRequest](docs/CustomerUpdateFiscalEntitiesRequest.md)
 - [io.conekta.model.CustomerUpdateShippingContacts](docs/CustomerUpdateShippingContacts.md)
 - [io.conekta.model.CustomersResponse](docs/CustomersResponse.md)
 - [io.conekta.model.DeleteApiKeysResponse](docs/DeleteApiKeysResponse.md)
 - [io.conekta.model.DeletedBlacklistRuleResponse](docs/DeletedBlacklistRuleResponse.md)
 - [io.conekta.model.DeletedWhitelistRuleResponse](docs/DeletedWhitelistRuleResponse.md)
 - [io.conekta.model.Details](docs/Details.md)
 - [io.conekta.model.DetailsError](docs/DetailsError.md)
 - [io.conekta.model.DiscountLinesDataResponse](docs/DiscountLinesDataResponse.md)
 - [io.conekta.model.DiscountLinesResponse](docs/DiscountLinesResponse.md)
 - [io.conekta.model.EmailCheckoutRequest](docs/EmailCheckoutRequest.md)
 - [io.conekta.model.Error](docs/Error.md)
 - [io.conekta.model.EventResponse](docs/EventResponse.md)
 - [io.conekta.model.EventTypes](docs/EventTypes.md)
 - [io.conekta.model.EventsResendResponse](docs/EventsResendResponse.md)
 - [io.conekta.model.FiscalEntityAddress](docs/FiscalEntityAddress.md)
 - [io.conekta.model.GetApiKeysResponse](docs/GetApiKeysResponse.md)
 - [io.conekta.model.GetChargesResponse](docs/GetChargesResponse.md)
 - [io.conekta.model.GetCompaniesResponse](docs/GetCompaniesResponse.md)
 - [io.conekta.model.GetCustomerPaymentMethodDataResponse](docs/GetCustomerPaymentMethodDataResponse.md)
 - [io.conekta.model.GetEventsResponse](docs/GetEventsResponse.md)
 - [io.conekta.model.GetOrderDiscountLinesResponse](docs/GetOrderDiscountLinesResponse.md)
 - [io.conekta.model.GetOrdersResponse](docs/GetOrdersResponse.md)
 - [io.conekta.model.GetPaymentMethodResponse](docs/GetPaymentMethodResponse.md)
 - [io.conekta.model.GetPlansResponse](docs/GetPlansResponse.md)
 - [io.conekta.model.GetTransactionsResponse](docs/GetTransactionsResponse.md)
 - [io.conekta.model.GetTransfersResponse](docs/GetTransfersResponse.md)
 - [io.conekta.model.GetWebhookKeysResponse](docs/GetWebhookKeysResponse.md)
 - [io.conekta.model.GetWebhooksResponse](docs/GetWebhooksResponse.md)
 - [io.conekta.model.LogResponse](docs/LogResponse.md)
 - [io.conekta.model.LogsResponse](docs/LogsResponse.md)
 - [io.conekta.model.LogsResponseData](docs/LogsResponseData.md)
 - [io.conekta.model.OrderCaptureRequest](docs/OrderCaptureRequest.md)
 - [io.conekta.model.OrderCustomerInfoResponse](docs/OrderCustomerInfoResponse.md)
 - [io.conekta.model.OrderDiscountLinesRequest](docs/OrderDiscountLinesRequest.md)
 - [io.conekta.model.OrderFiscalEntityAddressResponse](docs/OrderFiscalEntityAddressResponse.md)
 - [io.conekta.model.OrderFiscalEntityRequest](docs/OrderFiscalEntityRequest.md)
 - [io.conekta.model.OrderFiscalEntityResponse](docs/OrderFiscalEntityResponse.md)
 - [io.conekta.model.OrderNextActionResponse](docs/OrderNextActionResponse.md)
 - [io.conekta.model.OrderNextActionResponseRedirectToUrl](docs/OrderNextActionResponseRedirectToUrl.md)
 - [io.conekta.model.OrderRefundRequest](docs/OrderRefundRequest.md)
 - [io.conekta.model.OrderRequest](docs/OrderRequest.md)
 - [io.conekta.model.OrderRequestCustomerInfo](docs/OrderRequestCustomerInfo.md)
 - [io.conekta.model.OrderResponse](docs/OrderResponse.md)
 - [io.conekta.model.OrderResponseCharges](docs/OrderResponseCharges.md)
 - [io.conekta.model.OrderResponseCheckout](docs/OrderResponseCheckout.md)
 - [io.conekta.model.OrderResponseCustomerInfo](docs/OrderResponseCustomerInfo.md)
 - [io.conekta.model.OrderResponseDiscountLines](docs/OrderResponseDiscountLines.md)
 - [io.conekta.model.OrderResponseProducts](docs/OrderResponseProducts.md)
 - [io.conekta.model.OrderResponseShippingContact](docs/OrderResponseShippingContact.md)
 - [io.conekta.model.OrderTaxRequest](docs/OrderTaxRequest.md)
 - [io.conekta.model.OrderUpdateFiscalEntityRequest](docs/OrderUpdateFiscalEntityRequest.md)
 - [io.conekta.model.OrderUpdateRequest](docs/OrderUpdateRequest.md)
 - [io.conekta.model.OrderUpdateRequestCustomerInfo](docs/OrderUpdateRequestCustomerInfo.md)
 - [io.conekta.model.OrdersResponse](docs/OrdersResponse.md)
 - [io.conekta.model.Page](docs/Page.md)
 - [io.conekta.model.Pagination](docs/Pagination.md)
 - [io.conekta.model.PaymentMethod](docs/PaymentMethod.md)
 - [io.conekta.model.PaymentMethodBankTransfer](docs/PaymentMethodBankTransfer.md)
 - [io.conekta.model.PaymentMethodCard](docs/PaymentMethodCard.md)
 - [io.conekta.model.PaymentMethodCardRequest](docs/PaymentMethodCardRequest.md)
 - [io.conekta.model.PaymentMethodCardResponse](docs/PaymentMethodCardResponse.md)
 - [io.conekta.model.PaymentMethodCash](docs/PaymentMethodCash.md)
 - [io.conekta.model.PaymentMethodCashRequest](docs/PaymentMethodCashRequest.md)
 - [io.conekta.model.PaymentMethodCashResponse](docs/PaymentMethodCashResponse.md)
 - [io.conekta.model.PaymentMethodGeneralRequest](docs/PaymentMethodGeneralRequest.md)
 - [io.conekta.model.PaymentMethodResponse](docs/PaymentMethodResponse.md)
 - [io.conekta.model.PaymentMethodSpeiRecurrent](docs/PaymentMethodSpeiRecurrent.md)
 - [io.conekta.model.PaymentMethodSpeiRequest](docs/PaymentMethodSpeiRequest.md)
 - [io.conekta.model.PaymentMethodTokenRequest](docs/PaymentMethodTokenRequest.md)
 - [io.conekta.model.Payout](docs/Payout.md)
 - [io.conekta.model.PayoutMethod](docs/PayoutMethod.md)
 - [io.conekta.model.PayoutOrder](docs/PayoutOrder.md)
 - [io.conekta.model.PayoutOrderPayoutsItem](docs/PayoutOrderPayoutsItem.md)
 - [io.conekta.model.PayoutOrderResponse](docs/PayoutOrderResponse.md)
 - [io.conekta.model.PayoutOrderResponseCustomerInfo](docs/PayoutOrderResponseCustomerInfo.md)
 - [io.conekta.model.PayoutOrdersResponse](docs/PayoutOrdersResponse.md)
 - [io.conekta.model.PlanRequest](docs/PlanRequest.md)
 - [io.conekta.model.PlanResponse](docs/PlanResponse.md)
 - [io.conekta.model.PlanUpdateRequest](docs/PlanUpdateRequest.md)
 - [io.conekta.model.Product](docs/Product.md)
 - [io.conekta.model.ProductDataResponse](docs/ProductDataResponse.md)
 - [io.conekta.model.ProductOrderResponse](docs/ProductOrderResponse.md)
 - [io.conekta.model.RiskRulesData](docs/RiskRulesData.md)
 - [io.conekta.model.RiskRulesList](docs/RiskRulesList.md)
 - [io.conekta.model.ShippingOrderResponse](docs/ShippingOrderResponse.md)
 - [io.conekta.model.ShippingRequest](docs/ShippingRequest.md)
 - [io.conekta.model.SmsCheckoutRequest](docs/SmsCheckoutRequest.md)
 - [io.conekta.model.SubscriptionEventsResponse](docs/SubscriptionEventsResponse.md)
 - [io.conekta.model.SubscriptionRequest](docs/SubscriptionRequest.md)
 - [io.conekta.model.SubscriptionResponse](docs/SubscriptionResponse.md)
 - [io.conekta.model.SubscriptionUpdateRequest](docs/SubscriptionUpdateRequest.md)
 - [io.conekta.model.Token](docs/Token.md)
 - [io.conekta.model.TokenCard](docs/TokenCard.md)
 - [io.conekta.model.TokenCheckout](docs/TokenCheckout.md)
 - [io.conekta.model.TokenResponse](docs/TokenResponse.md)
 - [io.conekta.model.TokenResponseCheckout](docs/TokenResponseCheckout.md)
 - [io.conekta.model.TransactionResponse](docs/TransactionResponse.md)
 - [io.conekta.model.TransferDestinationResponse](docs/TransferDestinationResponse.md)
 - [io.conekta.model.TransferMethodResponse](docs/TransferMethodResponse.md)
 - [io.conekta.model.TransferResponse](docs/TransferResponse.md)
 - [io.conekta.model.TransfersResponse](docs/TransfersResponse.md)
 - [io.conekta.model.UpdateCustomer](docs/UpdateCustomer.md)
 - [io.conekta.model.UpdateCustomerAntifraudInfo](docs/UpdateCustomerAntifraudInfo.md)
 - [io.conekta.model.UpdateCustomerFiscalEntitiesResponse](docs/UpdateCustomerFiscalEntitiesResponse.md)
 - [io.conekta.model.UpdateCustomerPaymentMethodsResponse](docs/UpdateCustomerPaymentMethodsResponse.md)
 - [io.conekta.model.UpdateOrderDiscountLinesRequest](docs/UpdateOrderDiscountLinesRequest.md)
 - [io.conekta.model.UpdateOrderTaxRequest](docs/UpdateOrderTaxRequest.md)
 - [io.conekta.model.UpdateOrderTaxResponse](docs/UpdateOrderTaxResponse.md)
 - [io.conekta.model.UpdatePaymentMethods](docs/UpdatePaymentMethods.md)
 - [io.conekta.model.UpdateProduct](docs/UpdateProduct.md)
 - [io.conekta.model.WebhookKeyCreateResponse](docs/WebhookKeyCreateResponse.md)
 - [io.conekta.model.WebhookKeyDeleteResponse](docs/WebhookKeyDeleteResponse.md)
 - [io.conekta.model.WebhookKeyRequest](docs/WebhookKeyRequest.md)
 - [io.conekta.model.WebhookKeyResponse](docs/WebhookKeyResponse.md)
 - [io.conekta.model.WebhookKeyUpdateRequest](docs/WebhookKeyUpdateRequest.md)
 - [io.conekta.model.WebhookLog](docs/WebhookLog.md)
 - [io.conekta.model.WebhookRequest](docs/WebhookRequest.md)
 - [io.conekta.model.WebhookResponse](docs/WebhookResponse.md)
 - [io.conekta.model.WebhookUpdateRequest](docs/WebhookUpdateRequest.md)
 - [io.conekta.model.WhitelistlistRuleResponse](docs/WhitelistlistRuleResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="bearerAuth"></a>
### bearerAuth

- **Type**: HTTP Bearer Token authentication

