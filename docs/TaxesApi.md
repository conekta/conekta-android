# TaxesApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ordersCreateTaxes**](TaxesApi.md#ordersCreateTaxes) | **POST** /orders/{id}/tax_lines | Create Tax
[**ordersDeleteTaxes**](TaxesApi.md#ordersDeleteTaxes) | **DELETE** /orders/{id}/tax_lines/{tax_id} | Delete Tax
[**ordersUpdateTaxes**](TaxesApi.md#ordersUpdateTaxes) | **PUT** /orders/{id}/tax_lines/{tax_id} | Update Tax



## ordersCreateTaxes

> UpdateOrderTaxResponse ordersCreateTaxes(id, orderTaxRequest, acceptLanguage, xChildCompanyId)

Create Tax

Create new taxes for an existing orden

### Example

```java
// Import classes:
//import io.conekta.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
OrderTaxRequest orderTaxRequest = new OrderTaxRequest(); // OrderTaxRequest | requested field for a taxes
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    UpdateOrderTaxResponse result = apiInstance.ordersCreateTaxes(id, orderTaxRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#ordersCreateTaxes");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **orderTaxRequest** | [**OrderTaxRequest**](OrderTaxRequest.md)| requested field for a taxes |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**UpdateOrderTaxResponse**](UpdateOrderTaxResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## ordersDeleteTaxes

> UpdateOrderTaxResponse ordersDeleteTaxes(id, taxId, acceptLanguage, xChildCompanyId)

Delete Tax

Delete taxes for an existing orden

### Example

```java
// Import classes:
//import io.conekta.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String taxId = tax_lin_2tQ974hSHcsdeSZHG; // String | identifier
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    UpdateOrderTaxResponse result = apiInstance.ordersDeleteTaxes(id, taxId, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#ordersDeleteTaxes");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **taxId** | **String**| identifier | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**UpdateOrderTaxResponse**](UpdateOrderTaxResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## ordersUpdateTaxes

> UpdateOrderTaxResponse ordersUpdateTaxes(id, taxId, updateOrderTaxRequest, acceptLanguage, xChildCompanyId)

Update Tax

Update taxes for an existing orden

### Example

```java
// Import classes:
//import io.conekta.TaxesApi;

TaxesApi apiInstance = new TaxesApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String taxId = tax_lin_2tQ974hSHcsdeSZHG; // String | identifier
UpdateOrderTaxRequest updateOrderTaxRequest = new UpdateOrderTaxRequest(); // UpdateOrderTaxRequest | requested field for taxes
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    UpdateOrderTaxResponse result = apiInstance.ordersUpdateTaxes(id, taxId, updateOrderTaxRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxesApi#ordersUpdateTaxes");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **taxId** | **String**| identifier | [default to null]
 **updateOrderTaxRequest** | [**UpdateOrderTaxRequest**](UpdateOrderTaxRequest.md)| requested field for taxes |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**UpdateOrderTaxResponse**](UpdateOrderTaxResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

