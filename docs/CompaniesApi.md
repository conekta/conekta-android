# CompaniesApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanies**](CompaniesApi.md#getCompanies) | **GET** /companies | Get List of Companies
[**getCompany**](CompaniesApi.md#getCompany) | **GET** /companies/{id} | Get Company



## getCompanies

> GetCompaniesResponse getCompanies(acceptLanguage, limit, search, next, previous)

Get List of Companies

Consume the list of child companies.  This is used for holding companies with several child entities.

### Example

```java
// Import classes:
//import io.conekta.CompaniesApi;

CompaniesApi apiInstance = new CompaniesApi();
String acceptLanguage = es; // String | Use for knowing which language to use
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String search = null; // String | General order search, e.g. by mail, reference etc.
String next = null; // String | next page
String previous = null; // String | previous page
try {
    GetCompaniesResponse result = apiInstance.getCompanies(acceptLanguage, limit, search, next, previous);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompaniesApi#getCompanies");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **limit** | **Integer**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **search** | **String**| General order search, e.g. by mail, reference etc. | [optional] [default to null]
 **next** | **String**| next page | [optional] [default to null]
 **previous** | **String**| previous page | [optional] [default to null]

### Return type

[**GetCompaniesResponse**](GetCompaniesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getCompany

> CompanyResponse getCompany(id, acceptLanguage)

Get Company

### Example

```java
// Import classes:
//import io.conekta.CompaniesApi;

CompaniesApi apiInstance = new CompaniesApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    CompanyResponse result = apiInstance.getCompany(id, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompaniesApi#getCompany");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**CompanyResponse**](CompanyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json

