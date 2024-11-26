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



## cancelOrder

> OrderResponse cancelOrder(id, acceptLanguage, xChildCompanyId)

Cancel Order

Cancel an order that has been previously created.

### Example

```java
// Import classes:
//import io.conekta.OrdersApi;

OrdersApi apiInstance = new OrdersApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    OrderResponse result = apiInstance.cancelOrder(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#cancelOrder");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## createOrder

> OrderResponse createOrder(orderRequest, acceptLanguage, xChildCompanyId)

Create order

Create a new order.

### Example

```java
// Import classes:
//import io.conekta.OrdersApi;

OrdersApi apiInstance = new OrdersApi();
OrderRequest orderRequest = new OrderRequest(); // OrderRequest | requested field for order
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    OrderResponse result = apiInstance.createOrder(orderRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#createOrder");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRequest** | [**OrderRequest**](OrderRequest.md)| requested field for order |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## getOrderById

> OrderResponse getOrderById(id, acceptLanguage, xChildCompanyId)

Get Order

Info for a specific order

### Example

```java
// Import classes:
//import io.conekta.OrdersApi;

OrdersApi apiInstance = new OrdersApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    OrderResponse result = apiInstance.getOrderById(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrderById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getOrders

> GetOrdersResponse getOrders(acceptLanguage, xChildCompanyId, limit, search, next, previous, paymentStatus, lastPaymentInfoStatus, createdAt, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte)

Get a list of Orders

Get order details in the form of a list

### Example

```java
// Import classes:
//import io.conekta.OrdersApi;

OrdersApi apiInstance = new OrdersApi();
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String search = null; // String | General order search, e.g. by mail, reference etc.
String next = null; // String | next page
String previous = null; // String | previous page
String paymentStatus = paid; // String | Filters by order status
String lastPaymentInfoStatus = pending_payment; // String | Filters by last payment info status
Long createdAt = 1612137600; // Long | created equal to
Long createdAtGte = 1612137600; // Long | created at greater than or equal to
Long createdAtLte = 1612137600; // Long | created at less than or equal to
Long updatedAtGte = 1612137600; // Long | updated at greater than or equal to
Long updatedAtLte = 1612137600; // Long | updated at less than or equal to
try {
    GetOrdersResponse result = apiInstance.getOrders(acceptLanguage, xChildCompanyId, limit, search, next, previous, paymentStatus, lastPaymentInfoStatus, createdAt, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrders");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]
 **limit** | **Integer**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **search** | **String**| General order search, e.g. by mail, reference etc. | [optional] [default to null]
 **next** | **String**| next page | [optional] [default to null]
 **previous** | **String**| previous page | [optional] [default to null]
 **paymentStatus** | **String**| Filters by order status | [optional] [default to null]
 **lastPaymentInfoStatus** | **String**| Filters by last payment info status | [optional] [default to null]
 **createdAt** | **Long**| created equal to | [optional] [default to null]
 **createdAtGte** | **Long**| created at greater than or equal to | [optional] [default to null]
 **createdAtLte** | **Long**| created at less than or equal to | [optional] [default to null]
 **updatedAtGte** | **Long**| updated at greater than or equal to | [optional] [default to null]
 **updatedAtLte** | **Long**| updated at less than or equal to | [optional] [default to null]

### Return type

[**GetOrdersResponse**](GetOrdersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## orderCancelRefund

> OrderResponse orderCancelRefund(id, refundId, acceptLanguage, xChildCompanyId)

Cancel Refund

A refunded order describes the items, amount, and reason an order is being refunded.

### Example

```java
// Import classes:
//import io.conekta.OrdersApi;

OrdersApi apiInstance = new OrdersApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String refundId = 6407b5bee1329a000175ba11; // String | refund identifier
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    OrderResponse result = apiInstance.orderCancelRefund(id, refundId, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#orderCancelRefund");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **refundId** | **String**| refund identifier | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## orderRefund

> OrderResponse orderRefund(id, orderRefundRequest, acceptLanguage, xChildCompanyId)

Refund Order

A refunded order describes the items, amount, and reason an order is being refunded.

### Example

```java
// Import classes:
//import io.conekta.OrdersApi;

OrdersApi apiInstance = new OrdersApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
OrderRefundRequest orderRefundRequest = new OrderRefundRequest(); // OrderRefundRequest | requested field for a refund
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    OrderResponse result = apiInstance.orderRefund(id, orderRefundRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#orderRefund");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **orderRefundRequest** | [**OrderRefundRequest**](OrderRefundRequest.md)| requested field for a refund |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## ordersCreateCapture

> OrderResponse ordersCreateCapture(id, acceptLanguage, xChildCompanyId, orderCaptureRequest)

Capture Order

Processes an order that has been previously authorized.

### Example

```java
// Import classes:
//import io.conekta.OrdersApi;

OrdersApi apiInstance = new OrdersApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
OrderCaptureRequest orderCaptureRequest = new OrderCaptureRequest(); // OrderCaptureRequest | requested fields for capture order
try {
    OrderResponse result = apiInstance.ordersCreateCapture(id, acceptLanguage, xChildCompanyId, orderCaptureRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#ordersCreateCapture");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]
 **orderCaptureRequest** | [**OrderCaptureRequest**](OrderCaptureRequest.md)| requested fields for capture order | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## updateOrder

> OrderResponse updateOrder(id, orderUpdateRequest, acceptLanguage)

Update Order

Update an existing Order.

### Example

```java
// Import classes:
//import io.conekta.OrdersApi;

OrdersApi apiInstance = new OrdersApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
OrderUpdateRequest orderUpdateRequest = new OrderUpdateRequest(); // OrderUpdateRequest | requested field for an order
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    OrderResponse result = apiInstance.updateOrder(id, orderUpdateRequest, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#updateOrder");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **orderUpdateRequest** | [**OrderUpdateRequest**](OrderUpdateRequest.md)| requested field for an order |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

