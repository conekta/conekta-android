# EventsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEvent**](EventsApi.md#getEvent) | **GET** /events/{id} | Get Event
[**getEvents**](EventsApi.md#getEvents) | **GET** /events | Get list of Events
[**resendEvent**](EventsApi.md#resendEvent) | **POST** /events/{event_id}/webhook_logs/{webhook_log_id}/resend | Resend Event


<a id="getEvent"></a>
# **getEvent**
> EventResponse getEvent(id, acceptLanguage, xChildCompanyId)

Get Event

Returns a single event

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = EventsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : EventResponse = apiInstance.getEvent(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#getEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#getEvent")
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

[**EventResponse**](EventResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getEvents"></a>
# **getEvents**
> GetEventsResponse getEvents(acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get list of Events

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = EventsApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
try {
    val result : GetEventsResponse = apiInstance.getEvents(acceptLanguage, xChildCompanyId, limit, search, next, previous)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#getEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#getEvents")
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

[**GetEventsResponse**](GetEventsResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="resendEvent"></a>
# **resendEvent**
> EventsResendResponse resendEvent(eventId, webhookLogId, acceptLanguage)

Resend Event

Try to send an event

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = EventsApi()
val eventId : kotlin.String = 6463d6e35a4c3e001819e760 // kotlin.String | event identifier
val webhookLogId : kotlin.String = webhl_2tsv6NzWJHBWCkqGt // kotlin.String | webhook log identifier
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : EventsResendResponse = apiInstance.resendEvent(eventId, webhookLogId, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#resendEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#resendEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **kotlin.String**| event identifier |
 **webhookLogId** | **kotlin.String**| webhook log identifier |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**EventsResendResponse**](EventsResendResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

