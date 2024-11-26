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



## createWebhook

> WebhookResponse createWebhook(webhookRequest, acceptLanguage)

Create Webhook

What we do at Conekta translates into events. For example, an event of interest to us occurs at the time a payment is successfully processed. At that moment we will be interested in doing several things: Send an email to the buyer, generate an invoice, start the process of shipping the product, etc.

### Example

```java
// Import classes:
//import io.conekta.WebhooksApi;

WebhooksApi apiInstance = new WebhooksApi();
WebhookRequest webhookRequest = new WebhookRequest(); // WebhookRequest | requested field for webhook
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    WebhookResponse result = apiInstance.createWebhook(webhookRequest, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#createWebhook");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRequest** | [**WebhookRequest**](WebhookRequest.md)| requested field for webhook |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## deleteWebhook

> WebhookResponse deleteWebhook(id, acceptLanguage)

Delete Webhook

### Example

```java
// Import classes:
//import io.conekta.WebhooksApi;

WebhooksApi apiInstance = new WebhooksApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    WebhookResponse result = apiInstance.deleteWebhook(id, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#deleteWebhook");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getWebhook

> WebhookResponse getWebhook(id, acceptLanguage, xChildCompanyId)

Get Webhook

### Example

```java
// Import classes:
//import io.conekta.WebhooksApi;

WebhooksApi apiInstance = new WebhooksApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    WebhookResponse result = apiInstance.getWebhook(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhook");
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

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getWebhooks

> GetWebhooksResponse getWebhooks(acceptLanguage, xChildCompanyId, limit, search, url, next, previous)

Get List of Webhooks

Consume the list of webhooks you have, each environment supports 10 webhooks (For production and testing)

### Example

```java
// Import classes:
//import io.conekta.WebhooksApi;

WebhooksApi apiInstance = new WebhooksApi();
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String search = null; // String | General order search, e.g. by mail, reference etc.
String url = null; // String | url for webhook filter
String next = null; // String | next page
String previous = null; // String | previous page
try {
    GetWebhooksResponse result = apiInstance.getWebhooks(acceptLanguage, xChildCompanyId, limit, search, url, next, previous);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhooks");
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
 **url** | **String**| url for webhook filter | [optional] [default to null]
 **next** | **String**| next page | [optional] [default to null]
 **previous** | **String**| previous page | [optional] [default to null]

### Return type

[**GetWebhooksResponse**](GetWebhooksResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## testWebhook

> WebhookResponse testWebhook(id, acceptLanguage)

Test Webhook

Send a webhook.ping event

### Example

```java
// Import classes:
//import io.conekta.WebhooksApi;

WebhooksApi apiInstance = new WebhooksApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    WebhookResponse result = apiInstance.testWebhook(id, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#testWebhook");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## updateWebhook

> WebhookResponse updateWebhook(id, webhookUpdateRequest, acceptLanguage, xChildCompanyId)

Update Webhook

updates an existing webhook

### Example

```java
// Import classes:
//import io.conekta.WebhooksApi;

WebhooksApi apiInstance = new WebhooksApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
WebhookUpdateRequest webhookUpdateRequest = new WebhookUpdateRequest(); // WebhookUpdateRequest | requested fields in order to update a webhook
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    WebhookResponse result = apiInstance.updateWebhook(id, webhookUpdateRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#updateWebhook");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **webhookUpdateRequest** | [**WebhookUpdateRequest**](WebhookUpdateRequest.md)| requested fields in order to update a webhook |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

