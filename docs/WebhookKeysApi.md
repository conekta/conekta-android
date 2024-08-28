# WebhookKeysApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhookKey**](WebhookKeysApi.md#createWebhookKey) | **POST** /webhook_keys | Create Webhook Key
[**deleteWebhookKey**](WebhookKeysApi.md#deleteWebhookKey) | **DELETE** /webhook_keys/{id} | Delete Webhook key
[**getWebhookKey**](WebhookKeysApi.md#getWebhookKey) | **GET** /webhook_keys/{id} | Get Webhook Key
[**getWebhookKeys**](WebhookKeysApi.md#getWebhookKeys) | **GET** /webhook_keys | Get List of Webhook Keys
[**updateWebhookKey**](WebhookKeysApi.md#updateWebhookKey) | **PUT** /webhook_keys/{id} | Update Webhook Key



## createWebhookKey

> WebhookKeyCreateResponse createWebhookKey(acceptLanguage, webhookKeyRequest)

Create Webhook Key

Create a webhook key

### Example

```java
// Import classes:
//import io.conekta.WebhookKeysApi;

WebhookKeysApi apiInstance = new WebhookKeysApi();
String acceptLanguage = es; // String | Use for knowing which language to use
WebhookKeyRequest webhookKeyRequest = new WebhookKeyRequest(); // WebhookKeyRequest | 
try {
    WebhookKeyCreateResponse result = apiInstance.createWebhookKey(acceptLanguage, webhookKeyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookKeysApi#createWebhookKey");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **webhookKeyRequest** | [**WebhookKeyRequest**](WebhookKeyRequest.md)|  | [optional]

### Return type

[**WebhookKeyCreateResponse**](WebhookKeyCreateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## deleteWebhookKey

> WebhookKeyDeleteResponse deleteWebhookKey(id, acceptLanguage)

Delete Webhook key

### Example

```java
// Import classes:
//import io.conekta.WebhookKeysApi;

WebhookKeysApi apiInstance = new WebhookKeysApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    WebhookKeyDeleteResponse result = apiInstance.deleteWebhookKey(id, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookKeysApi#deleteWebhookKey");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**WebhookKeyDeleteResponse**](WebhookKeyDeleteResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getWebhookKey

> WebhookKeyResponse getWebhookKey(id, acceptLanguage, xChildCompanyId)

Get Webhook Key

### Example

```java
// Import classes:
//import io.conekta.WebhookKeysApi;

WebhookKeysApi apiInstance = new WebhookKeysApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    WebhookKeyResponse result = apiInstance.getWebhookKey(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookKeysApi#getWebhookKey");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**WebhookKeyResponse**](WebhookKeyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getWebhookKeys

> GetWebhookKeysResponse getWebhookKeys(acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get List of Webhook Keys

Consume the list of webhook keys you have

### Example

```java
// Import classes:
//import io.conekta.WebhookKeysApi;

WebhookKeysApi apiInstance = new WebhookKeysApi();
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String search = null; // String | General order search, e.g. by mail, reference etc.
String next = null; // String | next page
String previous = null; // String | previous page
try {
    GetWebhookKeysResponse result = apiInstance.getWebhookKeys(acceptLanguage, xChildCompanyId, limit, search, next, previous);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookKeysApi#getWebhookKeys");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]
 **limit** | **Integer**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **search** | **String**| General order search, e.g. by mail, reference etc. | [optional] [default to null]
 **next** | **String**| next page | [optional] [default to null]
 **previous** | **String**| previous page | [optional] [default to null]

### Return type

[**GetWebhookKeysResponse**](GetWebhookKeysResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## updateWebhookKey

> WebhookKeyResponse updateWebhookKey(id, acceptLanguage, webhookKeyUpdateRequest)

Update Webhook Key

updates an existing webhook key

### Example

```java
// Import classes:
//import io.conekta.WebhookKeysApi;

WebhookKeysApi apiInstance = new WebhookKeysApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
WebhookKeyUpdateRequest webhookKeyUpdateRequest = new WebhookKeyUpdateRequest(); // WebhookKeyUpdateRequest | 
try {
    WebhookKeyResponse result = apiInstance.updateWebhookKey(id, acceptLanguage, webhookKeyUpdateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookKeysApi#updateWebhookKey");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **webhookKeyUpdateRequest** | [**WebhookKeyUpdateRequest**](WebhookKeyUpdateRequest.md)|  | [optional]

### Return type

[**WebhookKeyResponse**](WebhookKeyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

