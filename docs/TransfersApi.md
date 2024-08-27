# TransfersApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransfer**](TransfersApi.md#getTransfer) | **GET** /transfers/{id} | Get Transfer
[**getTransfers**](TransfersApi.md#getTransfers) | **GET** /transfers | Get a list of transfers


<a id="getTransfer"></a>
# **getTransfer**
> TransferResponse getTransfer(id, acceptLanguage, xChildCompanyId)

Get Transfer

Get the details of a Transfer

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = TransfersApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : TransferResponse = apiInstance.getTransfer(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransfersApi#getTransfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransfersApi#getTransfer")
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

[**TransferResponse**](TransferResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getTransfers"></a>
# **getTransfers**
> GetTransfersResponse getTransfers(acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get a list of transfers

Get transfers details in the form of a list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = TransfersApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
try {
    val result : GetTransfersResponse = apiInstance.getTransfers(acceptLanguage, xChildCompanyId, limit, search, next, previous)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransfersApi#getTransfers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransfersApi#getTransfers")
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

### Return type

[**GetTransfersResponse**](GetTransfersResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

