# TokensApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToken**](TokensApi.md#createToken) | **POST** /tokens | Create Token


<a id="createToken"></a>
# **createToken**
> TokenResponse createToken(token, acceptLanguage)

Create Token

Generate a payment token, to associate it with a card 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = TokensApi()
val token : Token =  // Token | requested field for token
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : TokenResponse = apiInstance.createToken(token, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokensApi#createToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokensApi#createToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | [**Token**](Token.md)| requested field for token |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

