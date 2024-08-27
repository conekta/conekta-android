# PaymentMethodsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerPaymentMethods**](PaymentMethodsApi.md#createCustomerPaymentMethods) | **POST** /customers/{id}/payment_sources | Create Payment Method
[**deleteCustomerPaymentMethods**](PaymentMethodsApi.md#deleteCustomerPaymentMethods) | **DELETE** /customers/{id}/payment_sources/{payment_method_id} | Delete Payment Method
[**getCustomerPaymentMethods**](PaymentMethodsApi.md#getCustomerPaymentMethods) | **GET** /customers/{id}/payment_sources | Get Payment Methods
[**updateCustomerPaymentMethods**](PaymentMethodsApi.md#updateCustomerPaymentMethods) | **PUT** /customers/{id}/payment_sources/{payment_method_id} | Update Payment Method


<a id="createCustomerPaymentMethods"></a>
# **createCustomerPaymentMethods**
> CreateCustomerPaymentMethodsResponse createCustomerPaymentMethods(id, createCustomerPaymentMethodsRequest, acceptLanguage, xChildCompanyId)

Create Payment Method

Create a payment method for a customer.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PaymentMethodsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val createCustomerPaymentMethodsRequest : CreateCustomerPaymentMethodsRequest = {"type":"card","token_id":"tok_test_visa_4242"} // CreateCustomerPaymentMethodsRequest | requested field for customer payment methods
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CreateCustomerPaymentMethodsResponse = apiInstance.createCustomerPaymentMethods(id, createCustomerPaymentMethodsRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsApi#createCustomerPaymentMethods")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsApi#createCustomerPaymentMethods")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **createCustomerPaymentMethodsRequest** | [**CreateCustomerPaymentMethodsRequest**](CreateCustomerPaymentMethodsRequest.md)| requested field for customer payment methods |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**CreateCustomerPaymentMethodsResponse**](CreateCustomerPaymentMethodsResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="deleteCustomerPaymentMethods"></a>
# **deleteCustomerPaymentMethods**
> UpdateCustomerPaymentMethodsResponse deleteCustomerPaymentMethods(id, paymentMethodId, acceptLanguage, xChildCompanyId)

Delete Payment Method

Delete an existing payment method

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PaymentMethodsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val paymentMethodId : kotlin.String = src_2tQ974hSHcsdeSZHG // kotlin.String | Identifier of the payment method
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : UpdateCustomerPaymentMethodsResponse = apiInstance.deleteCustomerPaymentMethods(id, paymentMethodId, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsApi#deleteCustomerPaymentMethods")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsApi#deleteCustomerPaymentMethods")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **paymentMethodId** | **kotlin.String**| Identifier of the payment method |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**UpdateCustomerPaymentMethodsResponse**](UpdateCustomerPaymentMethodsResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getCustomerPaymentMethods"></a>
# **getCustomerPaymentMethods**
> GetPaymentMethodResponse getCustomerPaymentMethods(id, acceptLanguage, xChildCompanyId, limit, next, previous, search)

Get Payment Methods

Get a list of Payment Methods

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PaymentMethodsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
try {
    val result : GetPaymentMethodResponse = apiInstance.getCustomerPaymentMethods(id, acceptLanguage, xChildCompanyId, limit, next, previous, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsApi#getCustomerPaymentMethods")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsApi#getCustomerPaymentMethods")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]
 **limit** | **kotlin.Int**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **next** | **kotlin.String**| next page | [optional]
 **previous** | **kotlin.String**| previous page | [optional]
 **search** | **kotlin.String**| General order search, e.g. by mail, reference etc. | [optional]

### Return type

[**GetPaymentMethodResponse**](GetPaymentMethodResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="updateCustomerPaymentMethods"></a>
# **updateCustomerPaymentMethods**
> UpdateCustomerPaymentMethodsResponse updateCustomerPaymentMethods(id, paymentMethodId, updatePaymentMethods, acceptLanguage, xChildCompanyId)

Update Payment Method

Gets a payment Method that corresponds to a customer ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PaymentMethodsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val paymentMethodId : kotlin.String = src_2tQ974hSHcsdeSZHG // kotlin.String | Identifier of the payment method
val updatePaymentMethods : UpdatePaymentMethods =  // UpdatePaymentMethods | requested field for customer payment methods
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : UpdateCustomerPaymentMethodsResponse = apiInstance.updateCustomerPaymentMethods(id, paymentMethodId, updatePaymentMethods, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsApi#updateCustomerPaymentMethods")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsApi#updateCustomerPaymentMethods")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **paymentMethodId** | **kotlin.String**| Identifier of the payment method |
 **updatePaymentMethods** | [**UpdatePaymentMethods**](UpdatePaymentMethods.md)| requested field for customer payment methods |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**UpdateCustomerPaymentMethodsResponse**](UpdateCustomerPaymentMethodsResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

