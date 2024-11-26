# TokensApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToken**](TokensApi.md#createToken) | **POST** /tokens | Create Token



## createToken

> TokenResponse createToken(token, acceptLanguage)

Create Token

Generate a payment token, to associate it with a card 

### Example

```java
// Import classes:
//import io.conekta.TokensApi;

TokensApi apiInstance = new TokensApi();
Token token = new Token(); // Token | requested field for token
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    TokenResponse result = apiInstance.createToken(token, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#createToken");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | [**Token**](Token.md)| requested field for token |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

