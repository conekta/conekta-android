# PayoutOrdersApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPayoutOrder**](PayoutOrdersApi.md#createPayoutOrder) | **POST** /payout_orders | Create payout order
[**getPayoutOrderById**](PayoutOrdersApi.md#getPayoutOrderById) | **GET** /payout_orders/{id} | Get Payout Order
[**getPayoutOrders**](PayoutOrdersApi.md#getPayoutOrders) | **GET** /payout_orders | Get a list of Payout Orders


<a id="createPayoutOrder"></a>
# **createPayoutOrder**
> PayoutOrderResponse createPayoutOrder(payoutOrder, acceptLanguage)

Create payout order

Create a new payout order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PayoutOrdersApi()
val payoutOrder : PayoutOrder =  // PayoutOrder | requested field for payout order
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : PayoutOrderResponse = apiInstance.createPayoutOrder(payoutOrder, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutOrdersApi#createPayoutOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutOrdersApi#createPayoutOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payoutOrder** | [**PayoutOrder**](PayoutOrder.md)| requested field for payout order |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**PayoutOrderResponse**](PayoutOrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getPayoutOrderById"></a>
# **getPayoutOrderById**
> PayoutOrderResponse getPayoutOrderById(id, acceptLanguage)

Get Payout Order

Gets a payout Order resource that corresponds to a payout order ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PayoutOrdersApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : PayoutOrderResponse = apiInstance.getPayoutOrderById(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutOrdersApi#getPayoutOrderById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutOrdersApi#getPayoutOrderById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**PayoutOrderResponse**](PayoutOrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getPayoutOrders"></a>
# **getPayoutOrders**
> PayoutOrdersResponse getPayoutOrders(acceptLanguage, limit, search, next, previous)

Get a list of Payout Orders

Get Payout order details in the form of a list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PayoutOrdersApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
try {
    val result : PayoutOrdersResponse = apiInstance.getPayoutOrders(acceptLanguage, limit, search, next, previous)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayoutOrdersApi#getPayoutOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayoutOrdersApi#getPayoutOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **limit** | **kotlin.Int**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **search** | **kotlin.String**| General order search, e.g. by mail, reference etc. | [optional]
 **next** | **kotlin.String**| next page | [optional]
 **previous** | **kotlin.String**| previous page | [optional]

### Return type

[**PayoutOrdersResponse**](PayoutOrdersResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

