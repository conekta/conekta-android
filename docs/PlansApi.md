# PlansApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPlan**](PlansApi.md#createPlan) | **POST** /plans | Create Plan
[**deletePlan**](PlansApi.md#deletePlan) | **DELETE** /plans/{id} | Delete Plan
[**getPlan**](PlansApi.md#getPlan) | **GET** /plans/{id} | Get Plan
[**getPlans**](PlansApi.md#getPlans) | **GET** /plans | Get A List of Plans
[**updatePlan**](PlansApi.md#updatePlan) | **PUT** /plans/{id} | Update Plan


<a id="createPlan"></a>
# **createPlan**
> PlanResponse createPlan(planRequest, acceptLanguage, xChildCompanyId)

Create Plan

Create a new plan for an existing order

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PlansApi()
val planRequest : PlanRequest =  // PlanRequest | requested field for plan
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : PlanResponse = apiInstance.createPlan(planRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlansApi#createPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlansApi#createPlan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planRequest** | [**PlanRequest**](PlanRequest.md)| requested field for plan |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="deletePlan"></a>
# **deletePlan**
> PlanResponse deletePlan(id, acceptLanguage)

Delete Plan

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PlansApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : PlanResponse = apiInstance.deletePlan(id, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlansApi#deletePlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlansApi#deletePlan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getPlan"></a>
# **getPlan**
> PlanResponse getPlan(id, acceptLanguage, xChildCompanyId)

Get Plan

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PlansApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : PlanResponse = apiInstance.getPlan(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlansApi#getPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlansApi#getPlan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getPlans"></a>
# **getPlans**
> GetPlansResponse getPlans(acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get A List of Plans

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PlansApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
try {
    val result : GetPlansResponse = apiInstance.getPlans(acceptLanguage, xChildCompanyId, limit, search, next, previous)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlansApi#getPlans")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlansApi#getPlans")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]
 **limit** | **kotlin.Int**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **search** | **kotlin.String**| General order search, e.g. by mail, reference etc. | [optional]
 **next** | **kotlin.String**| next page | [optional]
 **previous** | **kotlin.String**| previous page | [optional]

### Return type

[**GetPlansResponse**](GetPlansResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="updatePlan"></a>
# **updatePlan**
> PlanResponse updatePlan(id, planUpdateRequest, acceptLanguage, xChildCompanyId)

Update Plan

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = PlansApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val planUpdateRequest : PlanUpdateRequest =  // PlanUpdateRequest | requested field for plan
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : PlanResponse = apiInstance.updatePlan(id, planUpdateRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlansApi#updatePlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlansApi#updatePlan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **planUpdateRequest** | [**PlanUpdateRequest**](PlanUpdateRequest.md)| requested field for plan |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

