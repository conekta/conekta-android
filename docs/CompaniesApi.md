# CompaniesApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanies**](CompaniesApi.md#getCompanies) | **GET** /companies | Get List of Companies
[**getCompany**](CompaniesApi.md#getCompany) | **GET** /companies/{id} | Get Company


<a id="getCompanies"></a>
# **getCompanies**
> GetCompaniesResponse getCompanies(acceptLanguage, limit, search, next, previous)

Get List of Companies

Consume the list of child companies.  This is used for holding companies with several child entities.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = CompaniesApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
try {
    val result : GetCompaniesResponse = apiInstance.getCompanies(acceptLanguage, limit, search, next, previous)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompaniesApi#getCompanies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompaniesApi#getCompanies")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **limit** | **kotlin.Int**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **search** | **kotlin.String**| General order search, e.g. by mail, reference etc. | [optional]
 **next** | **kotlin.String**| next page | [optional]
 **previous** | **kotlin.String**| previous page | [optional]

### Return type

[**GetCompaniesResponse**](GetCompaniesResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getCompany"></a>
# **getCompany**
> CompanyResponse getCompany(id, acceptLanguage)

Get Company

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = CompaniesApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : CompanyResponse = apiInstance.getCompany(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompaniesApi#getCompany")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompaniesApi#getCompany")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**CompanyResponse**](CompanyResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

