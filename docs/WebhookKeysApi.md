# WebhookKeysApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhookKey**](WebhookKeysApi.md#createWebhookKey) | **POST** /webhook_keys | Create Webhook Key
[**deleteWebhookKey**](WebhookKeysApi.md#deleteWebhookKey) | **DELETE** /webhook_keys/{id} | Delete Webhook key
[**getWebhookKey**](WebhookKeysApi.md#getWebhookKey) | **GET** /webhook_keys/{id} | Get Webhook Key
[**getWebhookKeys**](WebhookKeysApi.md#getWebhookKeys) | **GET** /webhook_keys | Get List of Webhook Keys
[**updateWebhookKey**](WebhookKeysApi.md#updateWebhookKey) | **PUT** /webhook_keys/{id} | Update Webhook Key


<a id="createWebhookKey"></a>
# **createWebhookKey**
> WebhookKeyCreateResponse createWebhookKey(acceptLanguage, webhookKeyRequest)

Create Webhook Key

Create a webhook key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = WebhookKeysApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val webhookKeyRequest : WebhookKeyRequest =  // WebhookKeyRequest | 
try {
    val result : WebhookKeyCreateResponse = apiInstance.createWebhookKey(acceptLanguage, webhookKeyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookKeysApi#createWebhookKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookKeysApi#createWebhookKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **webhookKeyRequest** | [**WebhookKeyRequest**](WebhookKeyRequest.md)|  | [optional]

### Return type

[**WebhookKeyCreateResponse**](WebhookKeyCreateResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="deleteWebhookKey"></a>
# **deleteWebhookKey**
> WebhookKeyDeleteResponse deleteWebhookKey(id, acceptLanguage)

Delete Webhook key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = WebhookKeysApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : WebhookKeyDeleteResponse = apiInstance.deleteWebhookKey(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookKeysApi#deleteWebhookKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookKeysApi#deleteWebhookKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**WebhookKeyDeleteResponse**](WebhookKeyDeleteResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getWebhookKey"></a>
# **getWebhookKey**
> WebhookKeyResponse getWebhookKey(id, acceptLanguage, xChildCompanyId)

Get Webhook Key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = WebhookKeysApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : WebhookKeyResponse = apiInstance.getWebhookKey(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookKeysApi#getWebhookKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookKeysApi#getWebhookKey")
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

[**WebhookKeyResponse**](WebhookKeyResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getWebhookKeys"></a>
# **getWebhookKeys**
> GetWebhookKeysResponse getWebhookKeys(acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get List of Webhook Keys

Consume the list of webhook keys you have

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = WebhookKeysApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
try {
    val result : GetWebhookKeysResponse = apiInstance.getWebhookKeys(acceptLanguage, xChildCompanyId, limit, search, next, previous)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookKeysApi#getWebhookKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookKeysApi#getWebhookKeys")
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

[**GetWebhookKeysResponse**](GetWebhookKeysResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="updateWebhookKey"></a>
# **updateWebhookKey**
> WebhookKeyResponse updateWebhookKey(id, acceptLanguage, webhookKeyUpdateRequest)

Update Webhook Key

updates an existing webhook key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = WebhookKeysApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val webhookKeyUpdateRequest : WebhookKeyUpdateRequest =  // WebhookKeyUpdateRequest | 
try {
    val result : WebhookKeyResponse = apiInstance.updateWebhookKey(id, acceptLanguage, webhookKeyUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookKeysApi#updateWebhookKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookKeysApi#updateWebhookKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **webhookKeyUpdateRequest** | [**WebhookKeyUpdateRequest**](WebhookKeyUpdateRequest.md)|  | [optional]

### Return type

[**WebhookKeyResponse**](WebhookKeyResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json
