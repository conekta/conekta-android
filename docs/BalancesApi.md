# BalancesApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBalance**](BalancesApi.md#getBalance) | **GET** /balance | Get a company&#39;s balance



Get a company&#39;s balance

Get a company&#39;s balance

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(BalancesApi::class.java)
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use

val result : BalanceResponse = webService.getBalance(acceptLanguage)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**BalanceResponse**](BalanceResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

