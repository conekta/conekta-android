# ChargesApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharges**](ChargesApi.md#getCharges) | **GET** /charges | Get A List of Charges
[**ordersCreateCharge**](ChargesApi.md#ordersCreateCharge) | **POST** /orders/{id}/charges | Create charge
[**updateCharge**](ChargesApi.md#updateCharge) | **PUT** /charges/{id} | Update a charge



Get A List of Charges

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ChargesApi::class.java)
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page

val result : GetChargesResponse = webService.getCharges(acceptLanguage, xChildCompanyId, limit, search, next, previous)
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

### Return type

[**GetChargesResponse**](GetChargesResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json


Create charge

Create charge for an existing orden

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ChargesApi::class.java)
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val chargeRequest : ChargeRequest =  // ChargeRequest | requested field for a charge
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.

val result : ChargeOrderResponse = webService.ordersCreateCharge(id, chargeRequest, acceptLanguage, xChildCompanyId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **chargeRequest** | [**ChargeRequest**](ChargeRequest.md)| requested field for a charge |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**ChargeOrderResponse**](ChargeOrderResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json


Update a charge

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ChargesApi::class.java)
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val chargeUpdateRequest : ChargeUpdateRequest =  // ChargeUpdateRequest | requested field for update a charge
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.

val result : ChargeResponse = webService.updateCharge(id, chargeUpdateRequest, acceptLanguage, xChildCompanyId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **chargeUpdateRequest** | [**ChargeUpdateRequest**](ChargeUpdateRequest.md)| requested field for update a charge |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**ChargeResponse**](ChargeResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

