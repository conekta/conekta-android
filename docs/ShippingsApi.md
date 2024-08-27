# ShippingsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ordersCreateShipping**](ShippingsApi.md#ordersCreateShipping) | **POST** /orders/{id}/shipping_lines | Create Shipping
[**ordersDeleteShipping**](ShippingsApi.md#ordersDeleteShipping) | **DELETE** /orders/{id}/shipping_lines/{shipping_id} | Delete Shipping
[**ordersUpdateShipping**](ShippingsApi.md#ordersUpdateShipping) | **PUT** /orders/{id}/shipping_lines/{shipping_id} | Update Shipping


<a id="ordersCreateShipping"></a>
# **ordersCreateShipping**
> ShippingOrderResponse ordersCreateShipping(id, shippingRequest, acceptLanguage, xChildCompanyId)

Create Shipping

Create new shipping for an existing orden

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = ShippingsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val shippingRequest : ShippingRequest =  // ShippingRequest | requested field for a shipping
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : ShippingOrderResponse = apiInstance.ordersCreateShipping(id, shippingRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingsApi#ordersCreateShipping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingsApi#ordersCreateShipping")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **shippingRequest** | [**ShippingRequest**](ShippingRequest.md)| requested field for a shipping |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**ShippingOrderResponse**](ShippingOrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="ordersDeleteShipping"></a>
# **ordersDeleteShipping**
> ShippingOrderResponse ordersDeleteShipping(id, shippingId, acceptLanguage, xChildCompanyId)

Delete Shipping

Delete shipping

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = ShippingsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val shippingId : kotlin.String = ship_lin_2tQ974hSHcsdeSZHG // kotlin.String | identifier
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : ShippingOrderResponse = apiInstance.ordersDeleteShipping(id, shippingId, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingsApi#ordersDeleteShipping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingsApi#ordersDeleteShipping")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **shippingId** | **kotlin.String**| identifier |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**ShippingOrderResponse**](ShippingOrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="ordersUpdateShipping"></a>
# **ordersUpdateShipping**
> ShippingOrderResponse ordersUpdateShipping(id, shippingId, shippingRequest, acceptLanguage, xChildCompanyId)

Update Shipping

Update existing shipping for an existing orden

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = ShippingsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val shippingId : kotlin.String = ship_lin_2tQ974hSHcsdeSZHG // kotlin.String | identifier
val shippingRequest : ShippingRequest =  // ShippingRequest | requested field for a shipping
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : ShippingOrderResponse = apiInstance.ordersUpdateShipping(id, shippingId, shippingRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingsApi#ordersUpdateShipping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingsApi#ordersUpdateShipping")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **shippingId** | **kotlin.String**| identifier |
 **shippingRequest** | [**ShippingRequest**](ShippingRequest.md)| requested field for a shipping |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**ShippingOrderResponse**](ShippingOrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

