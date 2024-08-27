# DiscountsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ordersCreateDiscountLine**](DiscountsApi.md#ordersCreateDiscountLine) | **POST** /orders/{id}/discount_lines | Create Discount
[**ordersDeleteDiscountLines**](DiscountsApi.md#ordersDeleteDiscountLines) | **DELETE** /orders/{id}/discount_lines/{discount_lines_id} | Delete Discount
[**ordersGetDiscountLine**](DiscountsApi.md#ordersGetDiscountLine) | **GET** /orders/{id}/discount_lines/{discount_lines_id} | Get Discount
[**ordersGetDiscountLines**](DiscountsApi.md#ordersGetDiscountLines) | **GET** /orders/{id}/discount_lines | Get a List of Discount
[**ordersUpdateDiscountLines**](DiscountsApi.md#ordersUpdateDiscountLines) | **PUT** /orders/{id}/discount_lines/{discount_lines_id} | Update Discount


<a id="ordersCreateDiscountLine"></a>
# **ordersCreateDiscountLine**
> DiscountLinesResponse ordersCreateDiscountLine(id, orderDiscountLinesRequest, acceptLanguage, xChildCompanyId)

Create Discount

Create discount lines for an existing orden

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = DiscountsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val orderDiscountLinesRequest : OrderDiscountLinesRequest =  // OrderDiscountLinesRequest | requested field for a discount lines
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : DiscountLinesResponse = apiInstance.ordersCreateDiscountLine(id, orderDiscountLinesRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#ordersCreateDiscountLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#ordersCreateDiscountLine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **orderDiscountLinesRequest** | [**OrderDiscountLinesRequest**](OrderDiscountLinesRequest.md)| requested field for a discount lines |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**DiscountLinesResponse**](DiscountLinesResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="ordersDeleteDiscountLines"></a>
# **ordersDeleteDiscountLines**
> DiscountLinesResponse ordersDeleteDiscountLines(id, discountLinesId, acceptLanguage, xChildCompanyId)

Delete Discount

Delete an existing discount lines for an existing orden

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = DiscountsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val discountLinesId : kotlin.String = dis_lin_2tQ974hSHcsdeSZHG // kotlin.String | discount line id identifier
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : DiscountLinesResponse = apiInstance.ordersDeleteDiscountLines(id, discountLinesId, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#ordersDeleteDiscountLines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#ordersDeleteDiscountLines")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **discountLinesId** | **kotlin.String**| discount line id identifier |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**DiscountLinesResponse**](DiscountLinesResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="ordersGetDiscountLine"></a>
# **ordersGetDiscountLine**
> DiscountLinesResponse ordersGetDiscountLine(id, discountLinesId, acceptLanguage, xChildCompanyId)

Get Discount

Get an existing discount lines for an existing orden

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = DiscountsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val discountLinesId : kotlin.String = dis_lin_2tQ974hSHcsdeSZHG // kotlin.String | discount line id identifier
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : DiscountLinesResponse = apiInstance.ordersGetDiscountLine(id, discountLinesId, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#ordersGetDiscountLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#ordersGetDiscountLine")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **discountLinesId** | **kotlin.String**| discount line id identifier |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**DiscountLinesResponse**](DiscountLinesResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="ordersGetDiscountLines"></a>
# **ordersGetDiscountLines**
> GetOrderDiscountLinesResponse ordersGetDiscountLines(id, acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get a List of Discount

Get discount lines for an existing orden

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = DiscountsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
try {
    val result : GetOrderDiscountLinesResponse = apiInstance.ordersGetDiscountLines(id, acceptLanguage, xChildCompanyId, limit, search, next, previous)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#ordersGetDiscountLines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#ordersGetDiscountLines")
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
 **search** | **kotlin.String**| General order search, e.g. by mail, reference etc. | [optional]
 **next** | **kotlin.String**| next page | [optional]
 **previous** | **kotlin.String**| previous page | [optional]

### Return type

[**GetOrderDiscountLinesResponse**](GetOrderDiscountLinesResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="ordersUpdateDiscountLines"></a>
# **ordersUpdateDiscountLines**
> DiscountLinesResponse ordersUpdateDiscountLines(id, discountLinesId, updateOrderDiscountLinesRequest, acceptLanguage, xChildCompanyId)

Update Discount

Update an existing discount lines for an existing orden

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = DiscountsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val discountLinesId : kotlin.String = dis_lin_2tQ974hSHcsdeSZHG // kotlin.String | discount line id identifier
val updateOrderDiscountLinesRequest : UpdateOrderDiscountLinesRequest =  // UpdateOrderDiscountLinesRequest | requested field for a discount lines
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : DiscountLinesResponse = apiInstance.ordersUpdateDiscountLines(id, discountLinesId, updateOrderDiscountLinesRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountsApi#ordersUpdateDiscountLines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountsApi#ordersUpdateDiscountLines")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **discountLinesId** | **kotlin.String**| discount line id identifier |
 **updateOrderDiscountLinesRequest** | [**UpdateOrderDiscountLinesRequest**](UpdateOrderDiscountLinesRequest.md)| requested field for a discount lines |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**DiscountLinesResponse**](DiscountLinesResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

