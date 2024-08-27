# TaxesApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ordersCreateTaxes**](TaxesApi.md#ordersCreateTaxes) | **POST** /orders/{id}/tax_lines | Create Tax
[**ordersDeleteTaxes**](TaxesApi.md#ordersDeleteTaxes) | **DELETE** /orders/{id}/tax_lines/{tax_id} | Delete Tax
[**ordersUpdateTaxes**](TaxesApi.md#ordersUpdateTaxes) | **PUT** /orders/{id}/tax_lines/{tax_id} | Update Tax



Create Tax

Create new taxes for an existing orden

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(TaxesApi::class.java)
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val orderTaxRequest : OrderTaxRequest =  // OrderTaxRequest | requested field for a taxes
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.

val result : UpdateOrderTaxResponse = webService.ordersCreateTaxes(id, orderTaxRequest, acceptLanguage, xChildCompanyId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **orderTaxRequest** | [**OrderTaxRequest**](OrderTaxRequest.md)| requested field for a taxes |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**UpdateOrderTaxResponse**](UpdateOrderTaxResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json


Delete Tax

Delete taxes for an existing orden

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(TaxesApi::class.java)
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val taxId : kotlin.String = tax_lin_2tQ974hSHcsdeSZHG // kotlin.String | identifier
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.

val result : UpdateOrderTaxResponse = webService.ordersDeleteTaxes(id, taxId, acceptLanguage, xChildCompanyId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **taxId** | **kotlin.String**| identifier |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**UpdateOrderTaxResponse**](UpdateOrderTaxResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json


Update Tax

Update taxes for an existing orden

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(TaxesApi::class.java)
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val taxId : kotlin.String = tax_lin_2tQ974hSHcsdeSZHG // kotlin.String | identifier
val updateOrderTaxRequest : UpdateOrderTaxRequest =  // UpdateOrderTaxRequest | requested field for taxes
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.

val result : UpdateOrderTaxResponse = webService.ordersUpdateTaxes(id, taxId, updateOrderTaxRequest, acceptLanguage, xChildCompanyId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **taxId** | **kotlin.String**| identifier |
 **updateOrderTaxRequest** | [**UpdateOrderTaxRequest**](UpdateOrderTaxRequest.md)| requested field for taxes |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**UpdateOrderTaxResponse**](UpdateOrderTaxResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

