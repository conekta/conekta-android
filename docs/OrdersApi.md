# OrdersApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrder**](OrdersApi.md#cancelOrder) | **POST** /orders/{id}/cancel | Cancel Order
[**createOrder**](OrdersApi.md#createOrder) | **POST** /orders | Create order
[**getOrderById**](OrdersApi.md#getOrderById) | **GET** /orders/{id} | Get Order
[**getOrders**](OrdersApi.md#getOrders) | **GET** /orders | Get a list of Orders
[**orderCancelRefund**](OrdersApi.md#orderCancelRefund) | **DELETE** /orders/{id}/refunds/{refund_id} | Cancel Refund
[**orderRefund**](OrdersApi.md#orderRefund) | **POST** /orders/{id}/refunds | Refund Order
[**ordersCreateCapture**](OrdersApi.md#ordersCreateCapture) | **POST** /orders/{id}/capture | Capture Order
[**updateOrder**](OrdersApi.md#updateOrder) | **PUT** /orders/{id} | Update Order


<a id="cancelOrder"></a>
# **cancelOrder**
> OrderResponse cancelOrder(id, acceptLanguage, xChildCompanyId)

Cancel Order

Cancel an order that has been previously created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = OrdersApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : OrderResponse = apiInstance.cancelOrder(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#cancelOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#cancelOrder")
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

[**OrderResponse**](OrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="createOrder"></a>
# **createOrder**
> OrderResponse createOrder(orderRequest, acceptLanguage, xChildCompanyId)

Create order

Create a new order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = OrdersApi()
val orderRequest : OrderRequest =  // OrderRequest | requested field for order
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : OrderResponse = apiInstance.createOrder(orderRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRequest** | [**OrderRequest**](OrderRequest.md)| requested field for order |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getOrderById"></a>
# **getOrderById**
> OrderResponse getOrderById(id, acceptLanguage, xChildCompanyId)

Get Order

Info for a specific order

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = OrdersApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : OrderResponse = apiInstance.getOrderById(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderById")
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

[**OrderResponse**](OrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getOrders"></a>
# **getOrders**
> GetOrdersResponse getOrders(acceptLanguage, xChildCompanyId, limit, search, next, previous, paymentStatus, lastPaymentInfoStatus, createdAt, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte)

Get a list of Orders

Get order details in the form of a list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = OrdersApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
val paymentStatus : kotlin.String = paid // kotlin.String | Filters by order status
val lastPaymentInfoStatus : kotlin.String = pending_payment // kotlin.String | Filters by last payment info status
val createdAt : kotlin.Long = 1612137600 // kotlin.Long | created equal to
val createdAtGte : kotlin.Long = 1612137600 // kotlin.Long | created at greater than or equal to
val createdAtLte : kotlin.Long = 1612137600 // kotlin.Long | created at less than or equal to
val updatedAtGte : kotlin.Long = 1612137600 // kotlin.Long | updated at greater than or equal to
val updatedAtLte : kotlin.Long = 1612137600 // kotlin.Long | updated at less than or equal to
try {
    val result : GetOrdersResponse = apiInstance.getOrders(acceptLanguage, xChildCompanyId, limit, search, next, previous, paymentStatus, lastPaymentInfoStatus, createdAt, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrders")
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
 **paymentStatus** | **kotlin.String**| Filters by order status | [optional]
 **lastPaymentInfoStatus** | **kotlin.String**| Filters by last payment info status | [optional]
 **createdAt** | **kotlin.Long**| created equal to | [optional]
 **createdAtGte** | **kotlin.Long**| created at greater than or equal to | [optional]
 **createdAtLte** | **kotlin.Long**| created at less than or equal to | [optional]
 **updatedAtGte** | **kotlin.Long**| updated at greater than or equal to | [optional]
 **updatedAtLte** | **kotlin.Long**| updated at less than or equal to | [optional]

### Return type

[**GetOrdersResponse**](GetOrdersResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="orderCancelRefund"></a>
# **orderCancelRefund**
> OrderResponse orderCancelRefund(id, refundId, acceptLanguage, xChildCompanyId)

Cancel Refund

A refunded order describes the items, amount, and reason an order is being refunded.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = OrdersApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val refundId : kotlin.String = 6407b5bee1329a000175ba11 // kotlin.String | refund identifier
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : OrderResponse = apiInstance.orderCancelRefund(id, refundId, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#orderCancelRefund")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#orderCancelRefund")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **refundId** | **kotlin.String**| refund identifier |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="orderRefund"></a>
# **orderRefund**
> OrderResponse orderRefund(id, orderRefundRequest, acceptLanguage, xChildCompanyId)

Refund Order

A refunded order describes the items, amount, and reason an order is being refunded.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = OrdersApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val orderRefundRequest : OrderRefundRequest =  // OrderRefundRequest | requested field for a refund
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : OrderResponse = apiInstance.orderRefund(id, orderRefundRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#orderRefund")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#orderRefund")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **orderRefundRequest** | [**OrderRefundRequest**](OrderRefundRequest.md)| requested field for a refund |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="ordersCreateCapture"></a>
# **ordersCreateCapture**
> OrderResponse ordersCreateCapture(id, acceptLanguage, xChildCompanyId, orderCaptureRequest)

Capture Order

Processes an order that has been previously authorized.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = OrdersApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val orderCaptureRequest : OrderCaptureRequest =  // OrderCaptureRequest | requested fields for capture order
try {
    val result : OrderResponse = apiInstance.ordersCreateCapture(id, acceptLanguage, xChildCompanyId, orderCaptureRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#ordersCreateCapture")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#ordersCreateCapture")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]
 **orderCaptureRequest** | [**OrderCaptureRequest**](OrderCaptureRequest.md)| requested fields for capture order | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="updateOrder"></a>
# **updateOrder**
> OrderResponse updateOrder(id, orderUpdateRequest, acceptLanguage)

Update Order

Update an existing Order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = OrdersApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val orderUpdateRequest : OrderUpdateRequest =  // OrderUpdateRequest | requested field for an order
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : OrderResponse = apiInstance.updateOrder(id, orderUpdateRequest, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#updateOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#updateOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **orderUpdateRequest** | [**OrderUpdateRequest**](OrderUpdateRequest.md)| requested field for an order |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

