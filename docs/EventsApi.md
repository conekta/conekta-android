# EventsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEvent**](EventsApi.md#getEvent) | **GET** /events/{id} | Get Event
[**getEvents**](EventsApi.md#getEvents) | **GET** /events | Get list of Events
[**resendEvent**](EventsApi.md#resendEvent) | **POST** /events/{event_id}/webhook_logs/{webhook_log_id}/resend | Resend Event



## getEvent

> EventResponse getEvent(id, acceptLanguage, xChildCompanyId)

Get Event

Returns a single event

### Example

```java
// Import classes:
//import io.conekta.EventsApi;

EventsApi apiInstance = new EventsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    EventResponse result = apiInstance.getEvent(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEvent");
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

[**EventResponse**](EventResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getEvents

> GetEventsResponse getEvents(acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get list of Events

### Example

```java
// Import classes:
//import io.conekta.EventsApi;

EventsApi apiInstance = new EventsApi();
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String search = null; // String | General order search, e.g. by mail, reference etc.
String next = null; // String | next page
String previous = null; // String | previous page
try {
    GetEventsResponse result = apiInstance.getEvents(acceptLanguage, xChildCompanyId, limit, search, next, previous);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEvents");
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

[**GetEventsResponse**](GetEventsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## resendEvent

> EventsResendResponse resendEvent(eventId, webhookLogId, acceptLanguage)

Resend Event

Try to send an event

### Example

```java
// Import classes:
//import io.conekta.EventsApi;

EventsApi apiInstance = new EventsApi();
String eventId = 6463d6e35a4c3e001819e760; // String | event identifier
String webhookLogId = webhl_2tsv6NzWJHBWCkqGt; // String | webhook log identifier
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    EventsResendResponse result = apiInstance.resendEvent(eventId, webhookLogId, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#resendEvent");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| event identifier | [default to null]
 **webhookLogId** | **String**| webhook log identifier | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**EventsResendResponse**](EventsResendResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json

