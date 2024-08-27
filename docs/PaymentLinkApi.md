# PaymentLinkApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCheckout**](PaymentLinkApi.md#cancelCheckout) | **PUT** /checkouts/{id}/cancel | Cancel Payment Link
[**createCheckout**](PaymentLinkApi.md#createCheckout) | **POST** /checkouts | Create Unique Payment Link
[**emailCheckout**](PaymentLinkApi.md#emailCheckout) | **POST** /checkouts/{id}/email | Send an email
[**getCheckout**](PaymentLinkApi.md#getCheckout) | **GET** /checkouts/{id} | Get a payment link by ID
[**getCheckouts**](PaymentLinkApi.md#getCheckouts) | **GET** /checkouts | Get a list of payment links
[**smsCheckout**](PaymentLinkApi.md#smsCheckout) | **POST** /checkouts/{id}/sms | Send an sms


<a id="cancelCheckout"></a>
# **cancelCheckout**
> CheckoutResponse cancelCheckout(id, acceptLanguage, xChildCompanyId)

Cancel Payment Link

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PaymentLinkApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CheckoutResponse = apiInstance.cancelCheckout(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentLinkApi#cancelCheckout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentLinkApi#cancelCheckout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**CheckoutResponse**](CheckoutResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="createCheckout"></a>
# **createCheckout**
> CheckoutResponse createCheckout(checkout, acceptLanguage, xChildCompanyId)

Create Unique Payment Link

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PaymentLinkApi()
val checkout : Checkout =  // Checkout | requested field for checkout
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CheckoutResponse = apiInstance.createCheckout(checkout, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentLinkApi#createCheckout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentLinkApi#createCheckout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkout** | [**Checkout**](Checkout.md)| requested field for checkout |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**CheckoutResponse**](CheckoutResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="emailCheckout"></a>
# **emailCheckout**
> CheckoutResponse emailCheckout(id, emailCheckoutRequest, acceptLanguage, xChildCompanyId)

Send an email

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PaymentLinkApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val emailCheckoutRequest : EmailCheckoutRequest =  // EmailCheckoutRequest | requested field for sms checkout
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CheckoutResponse = apiInstance.emailCheckout(id, emailCheckoutRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentLinkApi#emailCheckout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentLinkApi#emailCheckout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **emailCheckoutRequest** | [**EmailCheckoutRequest**](EmailCheckoutRequest.md)| requested field for sms checkout |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**CheckoutResponse**](CheckoutResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getCheckout"></a>
# **getCheckout**
> CheckoutResponse getCheckout(id, acceptLanguage, xChildCompanyId)

Get a payment link by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PaymentLinkApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CheckoutResponse = apiInstance.getCheckout(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentLinkApi#getCheckout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentLinkApi#getCheckout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**CheckoutResponse**](CheckoutResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getCheckouts"></a>
# **getCheckouts**
> CheckoutsResponse getCheckouts(acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get a list of payment links

Returns a list of links generated by the merchant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PaymentLinkApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
try {
    val result : CheckoutsResponse = apiInstance.getCheckouts(acceptLanguage, xChildCompanyId, limit, search, next, previous)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentLinkApi#getCheckouts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentLinkApi#getCheckouts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]
 **limit** | **kotlin.Int**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **search** | **kotlin.String**| General order search, e.g. by mail, reference etc. | [optional]
 **next** | **kotlin.String**| next page | [optional]
 **previous** | **kotlin.String**| previous page | [optional]

### Return type

[**CheckoutsResponse**](CheckoutsResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="smsCheckout"></a>
# **smsCheckout**
> CheckoutResponse smsCheckout(id, smsCheckoutRequest, acceptLanguage, xChildCompanyId)

Send an sms

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PaymentLinkApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val smsCheckoutRequest : SmsCheckoutRequest =  // SmsCheckoutRequest | requested field for sms checkout
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CheckoutResponse = apiInstance.smsCheckout(id, smsCheckoutRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentLinkApi#smsCheckout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentLinkApi#smsCheckout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **smsCheckoutRequest** | [**SmsCheckoutRequest**](SmsCheckoutRequest.md)| requested field for sms checkout |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**CheckoutResponse**](CheckoutResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

