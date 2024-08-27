# ApiKeysApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApiKey**](ApiKeysApi.md#createApiKey) | **POST** /api_keys | Create Api Key
[**deleteApiKey**](ApiKeysApi.md#deleteApiKey) | **DELETE** /api_keys/{id} | Delete Api Key
[**getApiKey**](ApiKeysApi.md#getApiKey) | **GET** /api_keys/{id} | Get Api Key
[**getApiKeys**](ApiKeysApi.md#getApiKeys) | **GET** /api_keys | Get list of Api Keys
[**updateApiKey**](ApiKeysApi.md#updateApiKey) | **PUT** /api_keys/{id} | Update Api Key


<a id="createApiKey"></a>
# **createApiKey**
> ApiKeyCreateResponse createApiKey(apiKeyRequest, acceptLanguage, xChildCompanyId)

Create Api Key

Create a api key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = ApiKeysApi()
val apiKeyRequest : ApiKeyRequest =  // ApiKeyRequest | requested field for a api keys
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : ApiKeyCreateResponse = apiInstance.createApiKey(apiKeyRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#createApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#createApiKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyRequest** | [**ApiKeyRequest**](ApiKeyRequest.md)| requested field for a api keys |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**ApiKeyCreateResponse**](ApiKeyCreateResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="deleteApiKey"></a>
# **deleteApiKey**
> DeleteApiKeysResponse deleteApiKey(id, acceptLanguage)

Delete Api Key

Deletes a api key that corresponds to a api key ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = ApiKeysApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : DeleteApiKeysResponse = apiInstance.deleteApiKey(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#deleteApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#deleteApiKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**DeleteApiKeysResponse**](DeleteApiKeysResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getApiKey"></a>
# **getApiKey**
> ApiKeyResponse getApiKey(id, acceptLanguage, xChildCompanyId)

Get Api Key

Gets a api key that corresponds to a api key ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = ApiKeysApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : ApiKeyResponse = apiInstance.getApiKey(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#getApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#getApiKey")
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

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getApiKeys"></a>
# **getApiKeys**
> GetApiKeysResponse getApiKeys(acceptLanguage, xChildCompanyId, limit, next, previous, search)

Get list of Api Keys

Consume the list of api keys you have

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = ApiKeysApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
val search : kotlin.String = search_example // kotlin.String | General search, e.g. by id, description, prefix
try {
    val result : GetApiKeysResponse = apiInstance.getApiKeys(acceptLanguage, xChildCompanyId, limit, next, previous, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#getApiKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#getApiKeys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]
 **limit** | **kotlin.Int**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **next** | **kotlin.String**| next page | [optional]
 **previous** | **kotlin.String**| previous page | [optional]
 **search** | **kotlin.String**| General search, e.g. by id, description, prefix | [optional]

### Return type

[**GetApiKeysResponse**](GetApiKeysResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="updateApiKey"></a>
# **updateApiKey**
> ApiKeyResponse updateApiKey(id, acceptLanguage, apiKeyUpdateRequest)

Update Api Key

Update an existing api key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = ApiKeysApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val apiKeyUpdateRequest : ApiKeyUpdateRequest =  // ApiKeyUpdateRequest | 
try {
    val result : ApiKeyResponse = apiInstance.updateApiKey(id, acceptLanguage, apiKeyUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApiKeysApi#updateApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApiKeysApi#updateApiKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **apiKeyUpdateRequest** | [**ApiKeyUpdateRequest**](ApiKeyUpdateRequest.md)|  | [optional]

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

