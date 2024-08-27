# ProductsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ordersCreateProduct**](ProductsApi.md#ordersCreateProduct) | **POST** /orders/{id}/line_items | Create Product
[**ordersDeleteProduct**](ProductsApi.md#ordersDeleteProduct) | **DELETE** /orders/{id}/line_items/{line_item_id} | Delete Product
[**ordersUpdateProduct**](ProductsApi.md#ordersUpdateProduct) | **PUT** /orders/{id}/line_items/{line_item_id} | Update Product



Create Product

Create a new product for an existing order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ProductsApi::class.java)
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val product : Product =  // Product | requested field for a product
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.

val result : ProductOrderResponse = webService.ordersCreateProduct(id, product, acceptLanguage, xChildCompanyId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **product** | [**Product**](Product.md)| requested field for a product |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**ProductOrderResponse**](ProductOrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json


Delete Product

Delete product for an existing orden

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ProductsApi::class.java)
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val lineItemId : kotlin.String = line_item_2tQ8HkkfbauaKP9Ho // kotlin.String | identifier
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.

val result : ProductOrderResponse = webService.ordersDeleteProduct(id, lineItemId, acceptLanguage, xChildCompanyId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **lineItemId** | **kotlin.String**| identifier |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**ProductOrderResponse**](ProductOrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json


Update Product

Update an existing product for an existing orden

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ProductsApi::class.java)
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val lineItemId : kotlin.String = line_item_2tQ8HkkfbauaKP9Ho // kotlin.String | identifier
val updateProduct : UpdateProduct =  // UpdateProduct | requested field for products
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.

val result : ProductOrderResponse = webService.ordersUpdateProduct(id, lineItemId, updateProduct, acceptLanguage, xChildCompanyId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **lineItemId** | **kotlin.String**| identifier |
 **updateProduct** | [**UpdateProduct**](UpdateProduct.md)| requested field for products |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**ProductOrderResponse**](ProductOrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

