# BalancesApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBalance**](BalancesApi.md#getBalance) | **GET** /balance | Get a company&#39;s balance



## getBalance

> BalanceResponse getBalance(acceptLanguage)

Get a company&#39;s balance

Get a company&#39;s balance

### Example

```java
// Import classes:
//import io.conekta.BalancesApi;

BalancesApi apiInstance = new BalancesApi();
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    BalanceResponse result = apiInstance.getBalance(acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BalancesApi#getBalance");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**BalanceResponse**](BalanceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json

