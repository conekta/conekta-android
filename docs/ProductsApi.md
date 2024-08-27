# ProductsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ordersCreateProduct**](ProductsApi.md#ordersCreateProduct) | **POST** /orders/{id}/line_items | Create Product
[**ordersDeleteProduct**](ProductsApi.md#ordersDeleteProduct) | **DELETE** /orders/{id}/line_items/{line_item_id} | Delete Product
[**ordersUpdateProduct**](ProductsApi.md#ordersUpdateProduct) | **PUT** /orders/{id}/line_items/{line_item_id} | Update Product



## ordersCreateProduct

> ProductOrderResponse ordersCreateProduct(id, product, acceptLanguage, xChildCompanyId)

Create Product

Create a new product for an existing order.

### Example

```java
// Import classes:
//import io.conekta.ProductsApi;

ProductsApi apiInstance = new ProductsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
Product product = new Product(); // Product | requested field for a product
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    ProductOrderResponse result = apiInstance.ordersCreateProduct(id, product, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#ordersCreateProduct");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **product** | [**Product**](Product.md)| requested field for a product |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**ProductOrderResponse**](ProductOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## ordersDeleteProduct

> ProductOrderResponse ordersDeleteProduct(id, lineItemId, acceptLanguage, xChildCompanyId)

Delete Product

Delete product for an existing orden

### Example

```java
// Import classes:
//import io.conekta.ProductsApi;

ProductsApi apiInstance = new ProductsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String lineItemId = line_item_2tQ8HkkfbauaKP9Ho; // String | identifier
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    ProductOrderResponse result = apiInstance.ordersDeleteProduct(id, lineItemId, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#ordersDeleteProduct");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **lineItemId** | **String**| identifier | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**ProductOrderResponse**](ProductOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## ordersUpdateProduct

> ProductOrderResponse ordersUpdateProduct(id, lineItemId, updateProduct, acceptLanguage, xChildCompanyId)

Update Product

Update an existing product for an existing orden

### Example

```java
// Import classes:
//import io.conekta.ProductsApi;

ProductsApi apiInstance = new ProductsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String lineItemId = line_item_2tQ8HkkfbauaKP9Ho; // String | identifier
UpdateProduct updateProduct = new UpdateProduct(); // UpdateProduct | requested field for products
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    ProductOrderResponse result = apiInstance.ordersUpdateProduct(id, lineItemId, updateProduct, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#ordersUpdateProduct");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **lineItemId** | **String**| identifier | [default to null]
 **updateProduct** | [**UpdateProduct**](UpdateProduct.md)| requested field for products |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**ProductOrderResponse**](ProductOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

