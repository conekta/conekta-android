# conektasdk

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.conekta</groupId>
    <artifactId>conektasdk</artifactId>
    <version>6.0.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.conekta:conektasdk:6.0.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/conektasdk-6.0.0-SNAPSHOT.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.conekta.AntifraudApi;

public class AntifraudApiExample {

    public static void main(String[] args) {
        AntifraudApi apiInstance = new AntifraudApi();
        CreateRiskRulesData createRiskRulesData = new CreateRiskRulesData(); // CreateRiskRulesData | requested field for blacklist rule
        String acceptLanguage = es; // String | Use for knowing which language to use
        try {
            BlacklistRuleResponse result = apiInstance.createRuleBlacklist(createRiskRulesData, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AntifraudApi#createRuleBlacklist");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.conekta.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AntifraudApi* | [**createRuleBlacklist**](docs/AntifraudApi.md#createRuleBlacklist) | **POST** /antifraud/blacklists | Create blacklisted rule
*AntifraudApi* | [**createRuleWhitelist**](docs/AntifraudApi.md#createRuleWhitelist) | **POST** /antifraud/whitelists | Create whitelisted rule
*AntifraudApi* | [**deleteRuleBlacklist**](docs/AntifraudApi.md#deleteRuleBlacklist) | **DELETE** /antifraud/blacklists/{id} | Delete blacklisted rule
*AntifraudApi* | [**deleteRuleWhitelist**](docs/AntifraudApi.md#deleteRuleWhitelist) | **DELETE** /antifraud/whitelists/{id} | Delete whitelisted rule
*AntifraudApi* | [**getRuleBlacklist**](docs/AntifraudApi.md#getRuleBlacklist) | **GET** /antifraud/blacklists | Get list of blacklisted rules
*AntifraudApi* | [**getRuleWhitelist**](docs/AntifraudApi.md#getRuleWhitelist) | **GET** /antifraud/whitelists | Get a list of whitelisted rules
*ApiKeysApi* | [**createApiKey**](docs/ApiKeysApi.md#createApiKey) | **POST** /api_keys | Create Api Key
*ApiKeysApi* | [**deleteApiKey**](docs/ApiKeysApi.md#deleteApiKey) | **DELETE** /api_keys/{id} | Delete Api Key
*ApiKeysApi* | [**getApiKey**](docs/ApiKeysApi.md#getApiKey) | **GET** /api_keys/{id} | Get Api Key
*ApiKeysApi* | [**getApiKeys**](docs/ApiKeysApi.md#getApiKeys) | **GET** /api_keys | Get list of Api Keys
*ApiKeysApi* | [**updateApiKey**](docs/ApiKeysApi.md#updateApiKey) | **PUT** /api_keys/{id} | Update Api Key
*BalancesApi* | [**getBalance**](docs/BalancesApi.md#getBalance) | **GET** /balance | Get a company&#39;s balance
*ChargesApi* | [**getCharges**](docs/ChargesApi.md#getCharges) | **GET** /charges | Get A List of Charges
*ChargesApi* | [**ordersCreateCharge**](docs/ChargesApi.md#ordersCreateCharge) | **POST** /orders/{id}/charges | Create charge
*ChargesApi* | [**updateCharge**](docs/ChargesApi.md#updateCharge) | **PUT** /charges/{id} | Update a charge
*CompaniesApi* | [**getCompanies**](docs/CompaniesApi.md#getCompanies) | **GET** /companies | Get List of Companies
*CompaniesApi* | [**getCompany**](docs/CompaniesApi.md#getCompany) | **GET** /companies/{id} | Get Company
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createCustomer) | **POST** /customers | Create customer
*CustomersApi* | [**createCustomerFiscalEntities**](docs/CustomersApi.md#createCustomerFiscalEntities) | **POST** /customers/{id}/fiscal_entities | Create Fiscal Entity
*CustomersApi* | [**deleteCustomerById**](docs/CustomersApi.md#deleteCustomerById) | **DELETE** /customers/{id} | Delete Customer
*CustomersApi* | [**getCustomerById**](docs/CustomersApi.md#getCustomerById) | **GET** /customers/{id} | Get Customer
*CustomersApi* | [**getCustomers**](docs/CustomersApi.md#getCustomers) | **GET** /customers | Get a list of customers
*CustomersApi* | [**updateCustomer**](docs/CustomersApi.md#updateCustomer) | **PUT** /customers/{id} | Update customer
*CustomersApi* | [**updateCustomerFiscalEntities**](docs/CustomersApi.md#updateCustomerFiscalEntities) | **PUT** /customers/{id}/fiscal_entities/{fiscal_entities_id} | Update  Fiscal Entity
*DiscountsApi* | [**ordersCreateDiscountLine**](docs/DiscountsApi.md#ordersCreateDiscountLine) | **POST** /orders/{id}/discount_lines | Create Discount
*DiscountsApi* | [**ordersDeleteDiscountLines**](docs/DiscountsApi.md#ordersDeleteDiscountLines) | **DELETE** /orders/{id}/discount_lines/{discount_lines_id} | Delete Discount
*DiscountsApi* | [**ordersGetDiscountLine**](docs/DiscountsApi.md#ordersGetDiscountLine) | **GET** /orders/{id}/discount_lines/{discount_lines_id} | Get Discount
*DiscountsApi* | [**ordersGetDiscountLines**](docs/DiscountsApi.md#ordersGetDiscountLines) | **GET** /orders/{id}/discount_lines | Get a List of Discount
*DiscountsApi* | [**ordersUpdateDiscountLines**](docs/DiscountsApi.md#ordersUpdateDiscountLines) | **PUT** /orders/{id}/discount_lines/{discount_lines_id} | Update Discount
*EventsApi* | [**getEvent**](docs/EventsApi.md#getEvent) | **GET** /events/{id} | Get Event
*EventsApi* | [**getEvents**](docs/EventsApi.md#getEvents) | **GET** /events | Get list of Events
*EventsApi* | [**resendEvent**](docs/EventsApi.md#resendEvent) | **POST** /events/{event_id}/webhook_logs/{webhook_log_id}/resend | Resend Event
*LogsApi* | [**getLogById**](docs/LogsApi.md#getLogById) | **GET** /logs/{id} | Get Log
*LogsApi* | [**getLogs**](docs/LogsApi.md#getLogs) | **GET** /logs | Get List Of Logs
*OrdersApi* | [**cancelOrder**](docs/OrdersApi.md#cancelOrder) | **POST** /orders/{id}/cancel | Cancel Order
*OrdersApi* | [**createOrder**](docs/OrdersApi.md#createOrder) | **POST** /orders | Create order
*OrdersApi* | [**getOrderById**](docs/OrdersApi.md#getOrderById) | **GET** /orders/{id} | Get Order
*OrdersApi* | [**getOrders**](docs/OrdersApi.md#getOrders) | **GET** /orders | Get a list of Orders
*OrdersApi* | [**orderCancelRefund**](docs/OrdersApi.md#orderCancelRefund) | **DELETE** /orders/{id}/refunds/{refund_id} | Cancel Refund
*OrdersApi* | [**orderRefund**](docs/OrdersApi.md#orderRefund) | **POST** /orders/{id}/refunds | Refund Order
*OrdersApi* | [**ordersCreateCapture**](docs/OrdersApi.md#ordersCreateCapture) | **POST** /orders/{id}/capture | Capture Order
*OrdersApi* | [**updateOrder**](docs/OrdersApi.md#updateOrder) | **PUT** /orders/{id} | Update Order
*PaymentLinkApi* | [**cancelCheckout**](docs/PaymentLinkApi.md#cancelCheckout) | **PUT** /checkouts/{id}/cancel | Cancel Payment Link
*PaymentLinkApi* | [**createCheckout**](docs/PaymentLinkApi.md#createCheckout) | **POST** /checkouts | Create Unique Payment Link
*PaymentLinkApi* | [**emailCheckout**](docs/PaymentLinkApi.md#emailCheckout) | **POST** /checkouts/{id}/email | Send an email
*PaymentLinkApi* | [**getCheckout**](docs/PaymentLinkApi.md#getCheckout) | **GET** /checkouts/{id} | Get a payment link by ID
*PaymentLinkApi* | [**getCheckouts**](docs/PaymentLinkApi.md#getCheckouts) | **GET** /checkouts | Get a list of payment links
*PaymentLinkApi* | [**smsCheckout**](docs/PaymentLinkApi.md#smsCheckout) | **POST** /checkouts/{id}/sms | Send an sms
*PaymentMethodsApi* | [**createCustomerPaymentMethods**](docs/PaymentMethodsApi.md#createCustomerPaymentMethods) | **POST** /customers/{id}/payment_sources | Create Payment Method
*PaymentMethodsApi* | [**deleteCustomerPaymentMethods**](docs/PaymentMethodsApi.md#deleteCustomerPaymentMethods) | **DELETE** /customers/{id}/payment_sources/{payment_method_id} | Delete Payment Method
*PaymentMethodsApi* | [**getCustomerPaymentMethods**](docs/PaymentMethodsApi.md#getCustomerPaymentMethods) | **GET** /customers/{id}/payment_sources | Get Payment Methods
*PaymentMethodsApi* | [**updateCustomerPaymentMethods**](docs/PaymentMethodsApi.md#updateCustomerPaymentMethods) | **PUT** /customers/{id}/payment_sources/{payment_method_id} | Update Payment Method
*PayoutOrdersApi* | [**createPayoutOrder**](docs/PayoutOrdersApi.md#createPayoutOrder) | **POST** /payout_orders | Create payout order
*PayoutOrdersApi* | [**getPayoutOrderById**](docs/PayoutOrdersApi.md#getPayoutOrderById) | **GET** /payout_orders/{id} | Get Payout Order
*PayoutOrdersApi* | [**getPayoutOrders**](docs/PayoutOrdersApi.md#getPayoutOrders) | **GET** /payout_orders | Get a list of Payout Orders
*PlansApi* | [**createPlan**](docs/PlansApi.md#createPlan) | **POST** /plans | Create Plan
*PlansApi* | [**deletePlan**](docs/PlansApi.md#deletePlan) | **DELETE** /plans/{id} | Delete Plan
*PlansApi* | [**getPlan**](docs/PlansApi.md#getPlan) | **GET** /plans/{id} | Get Plan
*PlansApi* | [**getPlans**](docs/PlansApi.md#getPlans) | **GET** /plans | Get A List of Plans
*PlansApi* | [**updatePlan**](docs/PlansApi.md#updatePlan) | **PUT** /plans/{id} | Update Plan
*ProductsApi* | [**ordersCreateProduct**](docs/ProductsApi.md#ordersCreateProduct) | **POST** /orders/{id}/line_items | Create Product
*ProductsApi* | [**ordersDeleteProduct**](docs/ProductsApi.md#ordersDeleteProduct) | **DELETE** /orders/{id}/line_items/{line_item_id} | Delete Product
*ProductsApi* | [**ordersUpdateProduct**](docs/ProductsApi.md#ordersUpdateProduct) | **PUT** /orders/{id}/line_items/{line_item_id} | Update Product
*ShippingContactsApi* | [**createCustomerShippingContacts**](docs/ShippingContactsApi.md#createCustomerShippingContacts) | **POST** /customers/{id}/shipping_contacts | Create a shipping contacts
*ShippingContactsApi* | [**deleteCustomerShippingContacts**](docs/ShippingContactsApi.md#deleteCustomerShippingContacts) | **DELETE** /customers/{id}/shipping_contacts/{shipping_contacts_id} | Delete shipping contacts
*ShippingContactsApi* | [**updateCustomerShippingContacts**](docs/ShippingContactsApi.md#updateCustomerShippingContacts) | **PUT** /customers/{id}/shipping_contacts/{shipping_contacts_id} | Update shipping contacts
*ShippingsApi* | [**ordersCreateShipping**](docs/ShippingsApi.md#ordersCreateShipping) | **POST** /orders/{id}/shipping_lines | Create Shipping
*ShippingsApi* | [**ordersDeleteShipping**](docs/ShippingsApi.md#ordersDeleteShipping) | **DELETE** /orders/{id}/shipping_lines/{shipping_id} | Delete Shipping
*ShippingsApi* | [**ordersUpdateShipping**](docs/ShippingsApi.md#ordersUpdateShipping) | **PUT** /orders/{id}/shipping_lines/{shipping_id} | Update Shipping
*SubscriptionsApi* | [**cancelSubscription**](docs/SubscriptionsApi.md#cancelSubscription) | **POST** /customers/{id}/subscription/cancel | Cancel Subscription
*SubscriptionsApi* | [**createSubscription**](docs/SubscriptionsApi.md#createSubscription) | **POST** /customers/{id}/subscription | Create Subscription
*SubscriptionsApi* | [**getAllEventsFromSubscription**](docs/SubscriptionsApi.md#getAllEventsFromSubscription) | **GET** /customers/{id}/subscription/events | Get Events By Subscription
*SubscriptionsApi* | [**getSubscription**](docs/SubscriptionsApi.md#getSubscription) | **GET** /customers/{id}/subscription | Get Subscription
*SubscriptionsApi* | [**pauseSubscription**](docs/SubscriptionsApi.md#pauseSubscription) | **POST** /customers/{id}/subscription/pause | Pause Subscription
*SubscriptionsApi* | [**resumeSubscription**](docs/SubscriptionsApi.md#resumeSubscription) | **POST** /customers/{id}/subscription/resume | Resume Subscription
*SubscriptionsApi* | [**updateSubscription**](docs/SubscriptionsApi.md#updateSubscription) | **PUT** /customers/{id}/subscription | Update Subscription
*TaxesApi* | [**ordersCreateTaxes**](docs/TaxesApi.md#ordersCreateTaxes) | **POST** /orders/{id}/tax_lines | Create Tax
*TaxesApi* | [**ordersDeleteTaxes**](docs/TaxesApi.md#ordersDeleteTaxes) | **DELETE** /orders/{id}/tax_lines/{tax_id} | Delete Tax
*TaxesApi* | [**ordersUpdateTaxes**](docs/TaxesApi.md#ordersUpdateTaxes) | **PUT** /orders/{id}/tax_lines/{tax_id} | Update Tax
*TokensApi* | [**createToken**](docs/TokensApi.md#createToken) | **POST** /tokens | Create Token
*TransactionsApi* | [**getTransaction**](docs/TransactionsApi.md#getTransaction) | **GET** /transactions/{id} | Get transaction
*TransactionsApi* | [**getTransactions**](docs/TransactionsApi.md#getTransactions) | **GET** /transactions | Get List transactions
*TransfersApi* | [**getTransfer**](docs/TransfersApi.md#getTransfer) | **GET** /transfers/{id} | Get Transfer
*TransfersApi* | [**getTransfers**](docs/TransfersApi.md#getTransfers) | **GET** /transfers | Get a list of transfers
*WebhookKeysApi* | [**createWebhookKey**](docs/WebhookKeysApi.md#createWebhookKey) | **POST** /webhook_keys | Create Webhook Key
*WebhookKeysApi* | [**deleteWebhookKey**](docs/WebhookKeysApi.md#deleteWebhookKey) | **DELETE** /webhook_keys/{id} | Delete Webhook key
*WebhookKeysApi* | [**getWebhookKey**](docs/WebhookKeysApi.md#getWebhookKey) | **GET** /webhook_keys/{id} | Get Webhook Key
*WebhookKeysApi* | [**getWebhookKeys**](docs/WebhookKeysApi.md#getWebhookKeys) | **GET** /webhook_keys | Get List of Webhook Keys
*WebhookKeysApi* | [**updateWebhookKey**](docs/WebhookKeysApi.md#updateWebhookKey) | **PUT** /webhook_keys/{id} | Update Webhook Key
*WebhooksApi* | [**createWebhook**](docs/WebhooksApi.md#createWebhook) | **POST** /webhooks | Create Webhook
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{id} | Delete Webhook
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /webhooks/{id} | Get Webhook
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getWebhooks) | **GET** /webhooks | Get List of Webhooks
*WebhooksApi* | [**testWebhook**](docs/WebhooksApi.md#testWebhook) | **POST** /webhooks/{id}/test | Test Webhook
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updateWebhook) | **PUT** /webhooks/{id} | Update Webhook


## Documentation for Models

 - [ApiKeyCreateResponse](docs/ApiKeyCreateResponse.md)
 - [ApiKeyRequest](docs/ApiKeyRequest.md)
 - [ApiKeyResponse](docs/ApiKeyResponse.md)
 - [ApiKeyResponseOnDelete](docs/ApiKeyResponseOnDelete.md)
 - [ApiKeyUpdateRequest](docs/ApiKeyUpdateRequest.md)
 - [BalanceCommonField](docs/BalanceCommonField.md)
 - [BalanceResponse](docs/BalanceResponse.md)
 - [BlacklistRuleResponse](docs/BlacklistRuleResponse.md)
 - [ChargeOrderResponse](docs/ChargeOrderResponse.md)
 - [ChargeOrderResponsePaymentMethod](docs/ChargeOrderResponsePaymentMethod.md)
 - [ChargeRequest](docs/ChargeRequest.md)
 - [ChargeRequestPaymentMethod](docs/ChargeRequestPaymentMethod.md)
 - [ChargeResponse](docs/ChargeResponse.md)
 - [ChargeResponseChannel](docs/ChargeResponseChannel.md)
 - [ChargeResponsePaymentMethod](docs/ChargeResponsePaymentMethod.md)
 - [ChargeResponseRefunds](docs/ChargeResponseRefunds.md)
 - [ChargeResponseRefundsData](docs/ChargeResponseRefundsData.md)
 - [ChargeUpdateRequest](docs/ChargeUpdateRequest.md)
 - [ChargesDataResponse](docs/ChargesDataResponse.md)
 - [Checkout](docs/Checkout.md)
 - [CheckoutOrderTemplate](docs/CheckoutOrderTemplate.md)
 - [CheckoutOrderTemplateCustomerInfo](docs/CheckoutOrderTemplateCustomerInfo.md)
 - [CheckoutRequest](docs/CheckoutRequest.md)
 - [CheckoutResponse](docs/CheckoutResponse.md)
 - [CheckoutsResponse](docs/CheckoutsResponse.md)
 - [CompanyFiscalInfoAddressResponse](docs/CompanyFiscalInfoAddressResponse.md)
 - [CompanyFiscalInfoResponse](docs/CompanyFiscalInfoResponse.md)
 - [CompanyPayoutDestinationResponse](docs/CompanyPayoutDestinationResponse.md)
 - [CompanyResponse](docs/CompanyResponse.md)
 - [CreateCustomerFiscalEntitiesResponse](docs/CreateCustomerFiscalEntitiesResponse.md)
 - [CreateCustomerPaymentMethodsRequest](docs/CreateCustomerPaymentMethodsRequest.md)
 - [CreateCustomerPaymentMethodsResponse](docs/CreateCustomerPaymentMethodsResponse.md)
 - [CreateRiskRulesData](docs/CreateRiskRulesData.md)
 - [Customer](docs/Customer.md)
 - [CustomerAddress](docs/CustomerAddress.md)
 - [CustomerAntifraudInfo](docs/CustomerAntifraudInfo.md)
 - [CustomerAntifraudInfoResponse](docs/CustomerAntifraudInfoResponse.md)
 - [CustomerFiscalEntitiesDataResponse](docs/CustomerFiscalEntitiesDataResponse.md)
 - [CustomerFiscalEntitiesRequest](docs/CustomerFiscalEntitiesRequest.md)
 - [CustomerFiscalEntitiesResponse](docs/CustomerFiscalEntitiesResponse.md)
 - [CustomerInfo](docs/CustomerInfo.md)
 - [CustomerInfoJustCustomerId](docs/CustomerInfoJustCustomerId.md)
 - [CustomerInfoJustCustomerIdResponse](docs/CustomerInfoJustCustomerIdResponse.md)
 - [CustomerPaymentMethodRequest](docs/CustomerPaymentMethodRequest.md)
 - [CustomerPaymentMethodsData](docs/CustomerPaymentMethodsData.md)
 - [CustomerPaymentMethodsRequest](docs/CustomerPaymentMethodsRequest.md)
 - [CustomerPaymentMethodsResponse](docs/CustomerPaymentMethodsResponse.md)
 - [CustomerResponse](docs/CustomerResponse.md)
 - [CustomerResponseShippingContacts](docs/CustomerResponseShippingContacts.md)
 - [CustomerShippingContacts](docs/CustomerShippingContacts.md)
 - [CustomerShippingContactsAddress](docs/CustomerShippingContactsAddress.md)
 - [CustomerShippingContactsDataResponse](docs/CustomerShippingContactsDataResponse.md)
 - [CustomerShippingContactsResponse](docs/CustomerShippingContactsResponse.md)
 - [CustomerShippingContactsResponseAddress](docs/CustomerShippingContactsResponseAddress.md)
 - [CustomerUpdateFiscalEntitiesRequest](docs/CustomerUpdateFiscalEntitiesRequest.md)
 - [CustomerUpdateShippingContacts](docs/CustomerUpdateShippingContacts.md)
 - [CustomersResponse](docs/CustomersResponse.md)
 - [DeleteApiKeysResponse](docs/DeleteApiKeysResponse.md)
 - [DeletedBlacklistRuleResponse](docs/DeletedBlacklistRuleResponse.md)
 - [DeletedWhitelistRuleResponse](docs/DeletedWhitelistRuleResponse.md)
 - [Details](docs/Details.md)
 - [DetailsError](docs/DetailsError.md)
 - [DiscountLinesDataResponse](docs/DiscountLinesDataResponse.md)
 - [DiscountLinesResponse](docs/DiscountLinesResponse.md)
 - [EmailCheckoutRequest](docs/EmailCheckoutRequest.md)
 - [Error](docs/Error.md)
 - [EventResponse](docs/EventResponse.md)
 - [EventTypes](docs/EventTypes.md)
 - [EventsResendResponse](docs/EventsResendResponse.md)
 - [FiscalEntityAddress](docs/FiscalEntityAddress.md)
 - [GetApiKeysResponse](docs/GetApiKeysResponse.md)
 - [GetChargesResponse](docs/GetChargesResponse.md)
 - [GetCompaniesResponse](docs/GetCompaniesResponse.md)
 - [GetCustomerPaymentMethodDataResponse](docs/GetCustomerPaymentMethodDataResponse.md)
 - [GetEventsResponse](docs/GetEventsResponse.md)
 - [GetOrderDiscountLinesResponse](docs/GetOrderDiscountLinesResponse.md)
 - [GetOrdersResponse](docs/GetOrdersResponse.md)
 - [GetPaymentMethodResponse](docs/GetPaymentMethodResponse.md)
 - [GetPlansResponse](docs/GetPlansResponse.md)
 - [GetTransactionsResponse](docs/GetTransactionsResponse.md)
 - [GetTransfersResponse](docs/GetTransfersResponse.md)
 - [GetWebhookKeysResponse](docs/GetWebhookKeysResponse.md)
 - [GetWebhooksResponse](docs/GetWebhooksResponse.md)
 - [LogResponse](docs/LogResponse.md)
 - [LogsResponse](docs/LogsResponse.md)
 - [LogsResponseData](docs/LogsResponseData.md)
 - [OrderCaptureRequest](docs/OrderCaptureRequest.md)
 - [OrderCustomerInfoResponse](docs/OrderCustomerInfoResponse.md)
 - [OrderDiscountLinesRequest](docs/OrderDiscountLinesRequest.md)
 - [OrderFiscalEntityAddressResponse](docs/OrderFiscalEntityAddressResponse.md)
 - [OrderFiscalEntityRequest](docs/OrderFiscalEntityRequest.md)
 - [OrderFiscalEntityResponse](docs/OrderFiscalEntityResponse.md)
 - [OrderNextActionResponse](docs/OrderNextActionResponse.md)
 - [OrderNextActionResponseRedirectToUrl](docs/OrderNextActionResponseRedirectToUrl.md)
 - [OrderRefundRequest](docs/OrderRefundRequest.md)
 - [OrderRequest](docs/OrderRequest.md)
 - [OrderRequestCustomerInfo](docs/OrderRequestCustomerInfo.md)
 - [OrderResponse](docs/OrderResponse.md)
 - [OrderResponseCharges](docs/OrderResponseCharges.md)
 - [OrderResponseCheckout](docs/OrderResponseCheckout.md)
 - [OrderResponseCustomerInfo](docs/OrderResponseCustomerInfo.md)
 - [OrderResponseDiscountLines](docs/OrderResponseDiscountLines.md)
 - [OrderResponseProducts](docs/OrderResponseProducts.md)
 - [OrderResponseShippingContact](docs/OrderResponseShippingContact.md)
 - [OrderTaxRequest](docs/OrderTaxRequest.md)
 - [OrderUpdateFiscalEntityRequest](docs/OrderUpdateFiscalEntityRequest.md)
 - [OrderUpdateRequest](docs/OrderUpdateRequest.md)
 - [OrderUpdateRequestCustomerInfo](docs/OrderUpdateRequestCustomerInfo.md)
 - [OrdersResponse](docs/OrdersResponse.md)
 - [Page](docs/Page.md)
 - [Pagination](docs/Pagination.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentMethodBankTransfer](docs/PaymentMethodBankTransfer.md)
 - [PaymentMethodCard](docs/PaymentMethodCard.md)
 - [PaymentMethodCardRequest](docs/PaymentMethodCardRequest.md)
 - [PaymentMethodCardResponse](docs/PaymentMethodCardResponse.md)
 - [PaymentMethodCash](docs/PaymentMethodCash.md)
 - [PaymentMethodCashRequest](docs/PaymentMethodCashRequest.md)
 - [PaymentMethodCashResponse](docs/PaymentMethodCashResponse.md)
 - [PaymentMethodGeneralRequest](docs/PaymentMethodGeneralRequest.md)
 - [PaymentMethodResponse](docs/PaymentMethodResponse.md)
 - [PaymentMethodSpeiRecurrent](docs/PaymentMethodSpeiRecurrent.md)
 - [PaymentMethodSpeiRequest](docs/PaymentMethodSpeiRequest.md)
 - [PaymentMethodTokenRequest](docs/PaymentMethodTokenRequest.md)
 - [Payout](docs/Payout.md)
 - [PayoutMethod](docs/PayoutMethod.md)
 - [PayoutOrder](docs/PayoutOrder.md)
 - [PayoutOrderPayoutsItem](docs/PayoutOrderPayoutsItem.md)
 - [PayoutOrderResponse](docs/PayoutOrderResponse.md)
 - [PayoutOrderResponseCustomerInfo](docs/PayoutOrderResponseCustomerInfo.md)
 - [PayoutOrdersResponse](docs/PayoutOrdersResponse.md)
 - [PlanRequest](docs/PlanRequest.md)
 - [PlanResponse](docs/PlanResponse.md)
 - [PlanUpdateRequest](docs/PlanUpdateRequest.md)
 - [Product](docs/Product.md)
 - [ProductDataResponse](docs/ProductDataResponse.md)
 - [ProductOrderResponse](docs/ProductOrderResponse.md)
 - [RiskRulesData](docs/RiskRulesData.md)
 - [RiskRulesList](docs/RiskRulesList.md)
 - [ShippingOrderResponse](docs/ShippingOrderResponse.md)
 - [ShippingRequest](docs/ShippingRequest.md)
 - [SmsCheckoutRequest](docs/SmsCheckoutRequest.md)
 - [SubscriptionEventsResponse](docs/SubscriptionEventsResponse.md)
 - [SubscriptionRequest](docs/SubscriptionRequest.md)
 - [SubscriptionResponse](docs/SubscriptionResponse.md)
 - [SubscriptionUpdateRequest](docs/SubscriptionUpdateRequest.md)
 - [Token](docs/Token.md)
 - [TokenCard](docs/TokenCard.md)
 - [TokenCheckout](docs/TokenCheckout.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [TokenResponseCheckout](docs/TokenResponseCheckout.md)
 - [TransactionResponse](docs/TransactionResponse.md)
 - [TransferDestinationResponse](docs/TransferDestinationResponse.md)
 - [TransferMethodResponse](docs/TransferMethodResponse.md)
 - [TransferResponse](docs/TransferResponse.md)
 - [TransfersResponse](docs/TransfersResponse.md)
 - [UpdateCustomer](docs/UpdateCustomer.md)
 - [UpdateCustomerAntifraudInfo](docs/UpdateCustomerAntifraudInfo.md)
 - [UpdateCustomerFiscalEntitiesResponse](docs/UpdateCustomerFiscalEntitiesResponse.md)
 - [UpdateCustomerPaymentMethodsResponse](docs/UpdateCustomerPaymentMethodsResponse.md)
 - [UpdateOrderDiscountLinesRequest](docs/UpdateOrderDiscountLinesRequest.md)
 - [UpdateOrderTaxRequest](docs/UpdateOrderTaxRequest.md)
 - [UpdateOrderTaxResponse](docs/UpdateOrderTaxResponse.md)
 - [UpdatePaymentMethods](docs/UpdatePaymentMethods.md)
 - [UpdateProduct](docs/UpdateProduct.md)
 - [WebhookKeyCreateResponse](docs/WebhookKeyCreateResponse.md)
 - [WebhookKeyDeleteResponse](docs/WebhookKeyDeleteResponse.md)
 - [WebhookKeyRequest](docs/WebhookKeyRequest.md)
 - [WebhookKeyResponse](docs/WebhookKeyResponse.md)
 - [WebhookKeyUpdateRequest](docs/WebhookKeyUpdateRequest.md)
 - [WebhookLog](docs/WebhookLog.md)
 - [WebhookRequest](docs/WebhookRequest.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WebhookUpdateRequest](docs/WebhookUpdateRequest.md)
 - [WhitelistlistRuleResponse](docs/WhitelistlistRuleResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth

- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

engineering@conekta.com

