# ShippingsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ordersCreateShipping**](ShippingsApi.md#ordersCreateShipping) | **POST** /orders/{id}/shipping_lines | Create Shipping
[**ordersDeleteShipping**](ShippingsApi.md#ordersDeleteShipping) | **DELETE** /orders/{id}/shipping_lines/{shipping_id} | Delete Shipping
[**ordersUpdateShipping**](ShippingsApi.md#ordersUpdateShipping) | **PUT** /orders/{id}/shipping_lines/{shipping_id} | Update Shipping



## ordersCreateShipping

> ShippingOrderResponse ordersCreateShipping(id, shippingRequest, acceptLanguage, xChildCompanyId)

Create Shipping

Create new shipping for an existing orden

### Example

```java
// Import classes:
//import io.conekta.ShippingsApi;

ShippingsApi apiInstance = new ShippingsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
ShippingRequest shippingRequest = new ShippingRequest(); // ShippingRequest | requested field for a shipping
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    ShippingOrderResponse result = apiInstance.ordersCreateShipping(id, shippingRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingsApi#ordersCreateShipping");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **shippingRequest** | [**ShippingRequest**](ShippingRequest.md)| requested field for a shipping |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**ShippingOrderResponse**](ShippingOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## ordersDeleteShipping

> ShippingOrderResponse ordersDeleteShipping(id, shippingId, acceptLanguage, xChildCompanyId)

Delete Shipping

Delete shipping

### Example

```java
// Import classes:
//import io.conekta.ShippingsApi;

ShippingsApi apiInstance = new ShippingsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String shippingId = ship_lin_2tQ974hSHcsdeSZHG; // String | identifier
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    ShippingOrderResponse result = apiInstance.ordersDeleteShipping(id, shippingId, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingsApi#ordersDeleteShipping");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **shippingId** | **String**| identifier | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**ShippingOrderResponse**](ShippingOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## ordersUpdateShipping

> ShippingOrderResponse ordersUpdateShipping(id, shippingId, shippingRequest, acceptLanguage, xChildCompanyId)

Update Shipping

Update existing shipping for an existing orden

### Example

```java
// Import classes:
//import io.conekta.ShippingsApi;

ShippingsApi apiInstance = new ShippingsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String shippingId = ship_lin_2tQ974hSHcsdeSZHG; // String | identifier
ShippingRequest shippingRequest = new ShippingRequest(); // ShippingRequest | requested field for a shipping
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    ShippingOrderResponse result = apiInstance.ordersUpdateShipping(id, shippingId, shippingRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingsApi#ordersUpdateShipping");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **shippingId** | **String**| identifier | [default to null]
 **shippingRequest** | [**ShippingRequest**](ShippingRequest.md)| requested field for a shipping |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**ShippingOrderResponse**](ShippingOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

