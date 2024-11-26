# ApiKeysApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApiKey**](ApiKeysApi.md#createApiKey) | **POST** /api_keys | Create Api Key
[**deleteApiKey**](ApiKeysApi.md#deleteApiKey) | **DELETE** /api_keys/{id} | Delete Api Key
[**getApiKey**](ApiKeysApi.md#getApiKey) | **GET** /api_keys/{id} | Get Api Key
[**getApiKeys**](ApiKeysApi.md#getApiKeys) | **GET** /api_keys | Get list of Api Keys
[**updateApiKey**](ApiKeysApi.md#updateApiKey) | **PUT** /api_keys/{id} | Update Api Key



## createApiKey

> ApiKeyCreateResponse createApiKey(apiKeyRequest, acceptLanguage, xChildCompanyId)

Create Api Key

Create a api key

### Example

```java
// Import classes:
//import io.conekta.ApiKeysApi;

ApiKeysApi apiInstance = new ApiKeysApi();
ApiKeyRequest apiKeyRequest = new ApiKeyRequest(); // ApiKeyRequest | requested field for a api keys
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    ApiKeyCreateResponse result = apiInstance.createApiKey(apiKeyRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#createApiKey");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyRequest** | [**ApiKeyRequest**](ApiKeyRequest.md)| requested field for a api keys |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**ApiKeyCreateResponse**](ApiKeyCreateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## deleteApiKey

> DeleteApiKeysResponse deleteApiKey(id, acceptLanguage)

Delete Api Key

Deletes a api key that corresponds to a api key ID

### Example

```java
// Import classes:
//import io.conekta.ApiKeysApi;

ApiKeysApi apiInstance = new ApiKeysApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    DeleteApiKeysResponse result = apiInstance.deleteApiKey(id, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#deleteApiKey");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**DeleteApiKeysResponse**](DeleteApiKeysResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getApiKey

> ApiKeyResponse getApiKey(id, acceptLanguage, xChildCompanyId)

Get Api Key

Gets a api key that corresponds to a api key ID

### Example

```java
// Import classes:
//import io.conekta.ApiKeysApi;

ApiKeysApi apiInstance = new ApiKeysApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    ApiKeyResponse result = apiInstance.getApiKey(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#getApiKey");
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

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getApiKeys

> GetApiKeysResponse getApiKeys(acceptLanguage, xChildCompanyId, limit, next, previous, search)

Get list of Api Keys

Consume the list of api keys you have

### Example

```java
// Import classes:
//import io.conekta.ApiKeysApi;

ApiKeysApi apiInstance = new ApiKeysApi();
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String next = null; // String | next page
String previous = null; // String | previous page
String search = null; // String | General search, e.g. by id, description, prefix
try {
    GetApiKeysResponse result = apiInstance.getApiKeys(acceptLanguage, xChildCompanyId, limit, next, previous, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#getApiKeys");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]
 **limit** | **Integer**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **next** | **String**| next page | [optional] [default to null]
 **previous** | **String**| previous page | [optional] [default to null]
 **search** | **String**| General search, e.g. by id, description, prefix | [optional] [default to null]

### Return type

[**GetApiKeysResponse**](GetApiKeysResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## updateApiKey

> ApiKeyResponse updateApiKey(id, acceptLanguage, apiKeyUpdateRequest)

Update Api Key

Update an existing api key

### Example

```java
// Import classes:
//import io.conekta.ApiKeysApi;

ApiKeysApi apiInstance = new ApiKeysApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
ApiKeyUpdateRequest apiKeyUpdateRequest = new ApiKeyUpdateRequest(); // ApiKeyUpdateRequest | 
try {
    ApiKeyResponse result = apiInstance.updateApiKey(id, acceptLanguage, apiKeyUpdateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiKeysApi#updateApiKey");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **apiKeyUpdateRequest** | [**ApiKeyUpdateRequest**](ApiKeyUpdateRequest.md)|  | [optional]

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

