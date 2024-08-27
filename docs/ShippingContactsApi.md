# ShippingContactsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerShippingContacts**](ShippingContactsApi.md#createCustomerShippingContacts) | **POST** /customers/{id}/shipping_contacts | Create a shipping contacts
[**deleteCustomerShippingContacts**](ShippingContactsApi.md#deleteCustomerShippingContacts) | **DELETE** /customers/{id}/shipping_contacts/{shipping_contacts_id} | Delete shipping contacts
[**updateCustomerShippingContacts**](ShippingContactsApi.md#updateCustomerShippingContacts) | **PUT** /customers/{id}/shipping_contacts/{shipping_contacts_id} | Update shipping contacts


<a id="createCustomerShippingContacts"></a>
# **createCustomerShippingContacts**
> CustomerShippingContactsResponse createCustomerShippingContacts(id, customerShippingContacts, acceptLanguage, xChildCompanyId)

Create a shipping contacts

Create a shipping contacts for a customer.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = ShippingContactsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val customerShippingContacts : CustomerShippingContacts =  // CustomerShippingContacts | requested field for customer shippings contacts
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CustomerShippingContactsResponse = apiInstance.createCustomerShippingContacts(id, customerShippingContacts, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingContactsApi#createCustomerShippingContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingContactsApi#createCustomerShippingContacts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **customerShippingContacts** | [**CustomerShippingContacts**](CustomerShippingContacts.md)| requested field for customer shippings contacts |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**CustomerShippingContactsResponse**](CustomerShippingContactsResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="deleteCustomerShippingContacts"></a>
# **deleteCustomerShippingContacts**
> CustomerShippingContactsResponse deleteCustomerShippingContacts(id, shippingContactsId, acceptLanguage, xChildCompanyId)

Delete shipping contacts

Delete shipping contact that corresponds to a customer ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = ShippingContactsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val shippingContactsId : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | identifier
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CustomerShippingContactsResponse = apiInstance.deleteCustomerShippingContacts(id, shippingContactsId, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingContactsApi#deleteCustomerShippingContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingContactsApi#deleteCustomerShippingContacts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **shippingContactsId** | **kotlin.String**| identifier |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**CustomerShippingContactsResponse**](CustomerShippingContactsResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="updateCustomerShippingContacts"></a>
# **updateCustomerShippingContacts**
> CustomerShippingContactsResponse updateCustomerShippingContacts(id, shippingContactsId, customerUpdateShippingContacts, acceptLanguage, xChildCompanyId)

Update shipping contacts

Update shipping contact that corresponds to a customer ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = ShippingContactsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val shippingContactsId : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | identifier
val customerUpdateShippingContacts : CustomerUpdateShippingContacts =  // CustomerUpdateShippingContacts | requested field for customer update shippings contacts
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CustomerShippingContactsResponse = apiInstance.updateCustomerShippingContacts(id, shippingContactsId, customerUpdateShippingContacts, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingContactsApi#updateCustomerShippingContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingContactsApi#updateCustomerShippingContacts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **shippingContactsId** | **kotlin.String**| identifier |
 **customerUpdateShippingContacts** | [**CustomerUpdateShippingContacts**](CustomerUpdateShippingContacts.md)| requested field for customer update shippings contacts |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**CustomerShippingContactsResponse**](CustomerShippingContactsResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

