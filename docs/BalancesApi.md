# BalancesApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBalance**](BalancesApi.md#getBalance) | **GET** /balance | Get a company&#39;s balance


<a id="getBalance"></a>
# **getBalance**
> BalanceResponse getBalance(acceptLanguage)

Get a company&#39;s balance

Get a company&#39;s balance

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = BalancesApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : BalanceResponse = apiInstance.getBalance(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BalancesApi#getBalance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BalancesApi#getBalance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**BalanceResponse**](BalanceResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

