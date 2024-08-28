# DiscountsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ordersCreateDiscountLine**](DiscountsApi.md#ordersCreateDiscountLine) | **POST** /orders/{id}/discount_lines | Create Discount
[**ordersDeleteDiscountLines**](DiscountsApi.md#ordersDeleteDiscountLines) | **DELETE** /orders/{id}/discount_lines/{discount_lines_id} | Delete Discount
[**ordersGetDiscountLine**](DiscountsApi.md#ordersGetDiscountLine) | **GET** /orders/{id}/discount_lines/{discount_lines_id} | Get Discount
[**ordersGetDiscountLines**](DiscountsApi.md#ordersGetDiscountLines) | **GET** /orders/{id}/discount_lines | Get a List of Discount
[**ordersUpdateDiscountLines**](DiscountsApi.md#ordersUpdateDiscountLines) | **PUT** /orders/{id}/discount_lines/{discount_lines_id} | Update Discount



## ordersCreateDiscountLine

> DiscountLinesResponse ordersCreateDiscountLine(id, orderDiscountLinesRequest, acceptLanguage, xChildCompanyId)

Create Discount

Create discount lines for an existing orden

### Example

```java
// Import classes:
//import io.conekta.DiscountsApi;

DiscountsApi apiInstance = new DiscountsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
OrderDiscountLinesRequest orderDiscountLinesRequest = new OrderDiscountLinesRequest(); // OrderDiscountLinesRequest | requested field for a discount lines
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    DiscountLinesResponse result = apiInstance.ordersCreateDiscountLine(id, orderDiscountLinesRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscountsApi#ordersCreateDiscountLine");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **orderDiscountLinesRequest** | [**OrderDiscountLinesRequest**](OrderDiscountLinesRequest.md)| requested field for a discount lines |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**DiscountLinesResponse**](DiscountLinesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## ordersDeleteDiscountLines

> DiscountLinesResponse ordersDeleteDiscountLines(id, discountLinesId, acceptLanguage, xChildCompanyId)

Delete Discount

Delete an existing discount lines for an existing orden

### Example

```java
// Import classes:
//import io.conekta.DiscountsApi;

DiscountsApi apiInstance = new DiscountsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String discountLinesId = dis_lin_2tQ974hSHcsdeSZHG; // String | discount line id identifier
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    DiscountLinesResponse result = apiInstance.ordersDeleteDiscountLines(id, discountLinesId, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscountsApi#ordersDeleteDiscountLines");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **discountLinesId** | **String**| discount line id identifier | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**DiscountLinesResponse**](DiscountLinesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## ordersGetDiscountLine

> DiscountLinesResponse ordersGetDiscountLine(id, discountLinesId, acceptLanguage, xChildCompanyId)

Get Discount

Get an existing discount lines for an existing orden

### Example

```java
// Import classes:
//import io.conekta.DiscountsApi;

DiscountsApi apiInstance = new DiscountsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String discountLinesId = dis_lin_2tQ974hSHcsdeSZHG; // String | discount line id identifier
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    DiscountLinesResponse result = apiInstance.ordersGetDiscountLine(id, discountLinesId, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscountsApi#ordersGetDiscountLine");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **discountLinesId** | **String**| discount line id identifier | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**DiscountLinesResponse**](DiscountLinesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## ordersGetDiscountLines

> GetOrderDiscountLinesResponse ordersGetDiscountLines(id, acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get a List of Discount

Get discount lines for an existing orden

### Example

```java
// Import classes:
//import io.conekta.DiscountsApi;

DiscountsApi apiInstance = new DiscountsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String search = null; // String | General order search, e.g. by mail, reference etc.
String next = null; // String | next page
String previous = null; // String | previous page
try {
    GetOrderDiscountLinesResponse result = apiInstance.ordersGetDiscountLines(id, acceptLanguage, xChildCompanyId, limit, search, next, previous);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscountsApi#ordersGetDiscountLines");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]
 **limit** | **Integer**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **search** | **String**| General order search, e.g. by mail, reference etc. | [optional] [default to null]
 **next** | **String**| next page | [optional] [default to null]
 **previous** | **String**| previous page | [optional] [default to null]

### Return type

[**GetOrderDiscountLinesResponse**](GetOrderDiscountLinesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## ordersUpdateDiscountLines

> DiscountLinesResponse ordersUpdateDiscountLines(id, discountLinesId, updateOrderDiscountLinesRequest, acceptLanguage, xChildCompanyId)

Update Discount

Update an existing discount lines for an existing orden

### Example

```java
// Import classes:
//import io.conekta.DiscountsApi;

DiscountsApi apiInstance = new DiscountsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String discountLinesId = dis_lin_2tQ974hSHcsdeSZHG; // String | discount line id identifier
UpdateOrderDiscountLinesRequest updateOrderDiscountLinesRequest = new UpdateOrderDiscountLinesRequest(); // UpdateOrderDiscountLinesRequest | requested field for a discount lines
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    DiscountLinesResponse result = apiInstance.ordersUpdateDiscountLines(id, discountLinesId, updateOrderDiscountLinesRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscountsApi#ordersUpdateDiscountLines");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **discountLinesId** | **String**| discount line id identifier | [default to null]
 **updateOrderDiscountLinesRequest** | [**UpdateOrderDiscountLinesRequest**](UpdateOrderDiscountLinesRequest.md)| requested field for a discount lines |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**DiscountLinesResponse**](DiscountLinesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

