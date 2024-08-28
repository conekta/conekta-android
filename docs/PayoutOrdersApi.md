# PayoutOrdersApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPayoutOrder**](PayoutOrdersApi.md#createPayoutOrder) | **POST** /payout_orders | Create payout order
[**getPayoutOrderById**](PayoutOrdersApi.md#getPayoutOrderById) | **GET** /payout_orders/{id} | Get Payout Order
[**getPayoutOrders**](PayoutOrdersApi.md#getPayoutOrders) | **GET** /payout_orders | Get a list of Payout Orders



## createPayoutOrder

> PayoutOrderResponse createPayoutOrder(payoutOrder, acceptLanguage)

Create payout order

Create a new payout order.

### Example

```java
// Import classes:
//import io.conekta.PayoutOrdersApi;

PayoutOrdersApi apiInstance = new PayoutOrdersApi();
PayoutOrder payoutOrder = new PayoutOrder(); // PayoutOrder | requested field for payout order
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    PayoutOrderResponse result = apiInstance.createPayoutOrder(payoutOrder, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutOrdersApi#createPayoutOrder");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payoutOrder** | [**PayoutOrder**](PayoutOrder.md)| requested field for payout order |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**PayoutOrderResponse**](PayoutOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## getPayoutOrderById

> PayoutOrderResponse getPayoutOrderById(id, acceptLanguage)

Get Payout Order

Gets a payout Order resource that corresponds to a payout order ID.

### Example

```java
// Import classes:
//import io.conekta.PayoutOrdersApi;

PayoutOrdersApi apiInstance = new PayoutOrdersApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    PayoutOrderResponse result = apiInstance.getPayoutOrderById(id, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutOrdersApi#getPayoutOrderById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**PayoutOrderResponse**](PayoutOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getPayoutOrders

> PayoutOrdersResponse getPayoutOrders(acceptLanguage, limit, search, next, previous)

Get a list of Payout Orders

Get Payout order details in the form of a list

### Example

```java
// Import classes:
//import io.conekta.PayoutOrdersApi;

PayoutOrdersApi apiInstance = new PayoutOrdersApi();
String acceptLanguage = es; // String | Use for knowing which language to use
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String search = null; // String | General order search, e.g. by mail, reference etc.
String next = null; // String | next page
String previous = null; // String | previous page
try {
    PayoutOrdersResponse result = apiInstance.getPayoutOrders(acceptLanguage, limit, search, next, previous);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutOrdersApi#getPayoutOrders");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **limit** | **Integer**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **search** | **String**| General order search, e.g. by mail, reference etc. | [optional] [default to null]
 **next** | **String**| next page | [optional] [default to null]
 **previous** | **String**| previous page | [optional] [default to null]

### Return type

[**PayoutOrdersResponse**](PayoutOrdersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json

