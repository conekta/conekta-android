# PlansApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPlan**](PlansApi.md#createPlan) | **POST** /plans | Create Plan
[**deletePlan**](PlansApi.md#deletePlan) | **DELETE** /plans/{id} | Delete Plan
[**getPlan**](PlansApi.md#getPlan) | **GET** /plans/{id} | Get Plan
[**getPlans**](PlansApi.md#getPlans) | **GET** /plans | Get A List of Plans
[**updatePlan**](PlansApi.md#updatePlan) | **PUT** /plans/{id} | Update Plan



## createPlan

> PlanResponse createPlan(planRequest, acceptLanguage, xChildCompanyId)

Create Plan

Create a new plan for an existing order

### Example

```java
// Import classes:
//import io.conekta.PlansApi;

PlansApi apiInstance = new PlansApi();
PlanRequest planRequest = new PlanRequest(); // PlanRequest | requested field for plan
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    PlanResponse result = apiInstance.createPlan(planRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#createPlan");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planRequest** | [**PlanRequest**](PlanRequest.md)| requested field for plan |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## deletePlan

> PlanResponse deletePlan(id, acceptLanguage)

Delete Plan

### Example

```java
// Import classes:
//import io.conekta.PlansApi;

PlansApi apiInstance = new PlansApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    PlanResponse result = apiInstance.deletePlan(id, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#deletePlan");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getPlan

> PlanResponse getPlan(id, acceptLanguage, xChildCompanyId)

Get Plan

### Example

```java
// Import classes:
//import io.conekta.PlansApi;

PlansApi apiInstance = new PlansApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    PlanResponse result = apiInstance.getPlan(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#getPlan");
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

[**PlanResponse**](PlanResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getPlans

> GetPlansResponse getPlans(acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get A List of Plans

### Example

```java
// Import classes:
//import io.conekta.PlansApi;

PlansApi apiInstance = new PlansApi();
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String search = null; // String | General order search, e.g. by mail, reference etc.
String next = null; // String | next page
String previous = null; // String | previous page
try {
    GetPlansResponse result = apiInstance.getPlans(acceptLanguage, xChildCompanyId, limit, search, next, previous);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#getPlans");
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

[**GetPlansResponse**](GetPlansResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## updatePlan

> PlanResponse updatePlan(id, planUpdateRequest, acceptLanguage, xChildCompanyId)

Update Plan

### Example

```java
// Import classes:
//import io.conekta.PlansApi;

PlansApi apiInstance = new PlansApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
PlanUpdateRequest planUpdateRequest = new PlanUpdateRequest(); // PlanUpdateRequest | requested field for plan
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    PlanResponse result = apiInstance.updatePlan(id, planUpdateRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#updatePlan");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **planUpdateRequest** | [**PlanUpdateRequest**](PlanUpdateRequest.md)| requested field for plan |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

