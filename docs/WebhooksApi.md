# WebhooksApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /webhooks | Create Webhook
[**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{id} | Delete Webhook
[**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /webhooks/{id} | Get Webhook
[**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /webhooks | Get List of Webhooks
[**testWebhook**](WebhooksApi.md#testWebhook) | **POST** /webhooks/{id}/test | Test Webhook
[**updateWebhook**](WebhooksApi.md#updateWebhook) | **PUT** /webhooks/{id} | Update Webhook


<a id="createWebhook"></a>
# **createWebhook**
> WebhookResponse createWebhook(webhookRequest, acceptLanguage)

Create Webhook

What we do at Conekta translates into events. For example, an event of interest to us occurs at the time a payment is successfully processed. At that moment we will be interested in doing several things: Send an email to the buyer, generate an invoice, start the process of shipping the product, etc.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = WebhooksApi()
val webhookRequest : WebhookRequest =  // WebhookRequest | requested field for webhook
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : WebhookResponse = apiInstance.createWebhook(webhookRequest, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#createWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#createWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRequest** | [**WebhookRequest**](WebhookRequest.md)| requested field for webhook |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="deleteWebhook"></a>
# **deleteWebhook**
> WebhookResponse deleteWebhook(id, acceptLanguage)

Delete Webhook

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = WebhooksApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : WebhookResponse = apiInstance.deleteWebhook(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#deleteWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#deleteWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getWebhook"></a>
# **getWebhook**
> WebhookResponse getWebhook(id, acceptLanguage, xChildCompanyId)

Get Webhook

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = WebhooksApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : WebhookResponse = apiInstance.getWebhook(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#getWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#getWebhook")
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

[**WebhookResponse**](WebhookResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getWebhooks"></a>
# **getWebhooks**
> GetWebhooksResponse getWebhooks(acceptLanguage, xChildCompanyId, limit, search, url, next, previous)

Get List of Webhooks

Consume the list of webhooks you have, each environment supports 10 webhooks (For production and testing)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = WebhooksApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
val url : kotlin.String = url_example // kotlin.String | url for webhook filter
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
try {
    val result : GetWebhooksResponse = apiInstance.getWebhooks(acceptLanguage, xChildCompanyId, limit, search, url, next, previous)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#getWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#getWebhooks")
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
 **url** | **kotlin.String**| url for webhook filter | [optional]
 **next** | **kotlin.String**| next page | [optional]
 **previous** | **kotlin.String**| previous page | [optional]

### Return type

[**GetWebhooksResponse**](GetWebhooksResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="testWebhook"></a>
# **testWebhook**
> WebhookResponse testWebhook(id, acceptLanguage)

Test Webhook

Send a webhook.ping event

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = WebhooksApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : WebhookResponse = apiInstance.testWebhook(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#testWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#testWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="updateWebhook"></a>
# **updateWebhook**
> WebhookResponse updateWebhook(id, webhookUpdateRequest, acceptLanguage, xChildCompanyId)

Update Webhook

updates an existing webhook

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = WebhooksApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val webhookUpdateRequest : WebhookUpdateRequest =  // WebhookUpdateRequest | requested fields in order to update a webhook
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : WebhookResponse = apiInstance.updateWebhook(id, webhookUpdateRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#updateWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#updateWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **webhookUpdateRequest** | [**WebhookUpdateRequest**](WebhookUpdateRequest.md)| requested fields in order to update a webhook |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

