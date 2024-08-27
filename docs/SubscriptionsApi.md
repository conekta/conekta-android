# SubscriptionsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelSubscription**](SubscriptionsApi.md#cancelSubscription) | **POST** /customers/{id}/subscription/cancel | Cancel Subscription
[**createSubscription**](SubscriptionsApi.md#createSubscription) | **POST** /customers/{id}/subscription | Create Subscription
[**getAllEventsFromSubscription**](SubscriptionsApi.md#getAllEventsFromSubscription) | **GET** /customers/{id}/subscription/events | Get Events By Subscription
[**getSubscription**](SubscriptionsApi.md#getSubscription) | **GET** /customers/{id}/subscription | Get Subscription
[**pauseSubscription**](SubscriptionsApi.md#pauseSubscription) | **POST** /customers/{id}/subscription/pause | Pause Subscription
[**resumeSubscription**](SubscriptionsApi.md#resumeSubscription) | **POST** /customers/{id}/subscription/resume | Resume Subscription
[**updateSubscription**](SubscriptionsApi.md#updateSubscription) | **PUT** /customers/{id}/subscription | Update Subscription



## cancelSubscription

> SubscriptionResponse cancelSubscription(id, acceptLanguage, xChildCompanyId)

Cancel Subscription

You can cancel the subscription to stop the plans that your customers consume

### Example

```java
// Import classes:
//import io.conekta.SubscriptionsApi;

SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    SubscriptionResponse result = apiInstance.cancelSubscription(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#cancelSubscription");
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

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## createSubscription

> SubscriptionResponse createSubscription(id, subscriptionRequest, acceptLanguage, xChildCompanyId)

Create Subscription

You can create the subscription to include the plans that your customers consume

### Example

```java
// Import classes:
//import io.conekta.SubscriptionsApi;

SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
SubscriptionRequest subscriptionRequest = new SubscriptionRequest(); // SubscriptionRequest | requested field for subscriptions
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    SubscriptionResponse result = apiInstance.createSubscription(id, subscriptionRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#createSubscription");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **subscriptionRequest** | [**SubscriptionRequest**](SubscriptionRequest.md)| requested field for subscriptions |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## getAllEventsFromSubscription

> SubscriptionEventsResponse getAllEventsFromSubscription(id, acceptLanguage, xChildCompanyId)

Get Events By Subscription

You can get the events of the subscription(s) of a client, with the customer id

### Example

```java
// Import classes:
//import io.conekta.SubscriptionsApi;

SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    SubscriptionEventsResponse result = apiInstance.getAllEventsFromSubscription(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getAllEventsFromSubscription");
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

[**SubscriptionEventsResponse**](SubscriptionEventsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getSubscription

> SubscriptionResponse getSubscription(id, acceptLanguage)

Get Subscription

### Example

```java
// Import classes:
//import io.conekta.SubscriptionsApi;

SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    SubscriptionResponse result = apiInstance.getSubscription(id, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getSubscription");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## pauseSubscription

> SubscriptionResponse pauseSubscription(id, acceptLanguage, xChildCompanyId)

Pause Subscription

You can pause the subscription to stop the plans that your customers consume

### Example

```java
// Import classes:
//import io.conekta.SubscriptionsApi;

SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    SubscriptionResponse result = apiInstance.pauseSubscription(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#pauseSubscription");
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

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## resumeSubscription

> SubscriptionResponse resumeSubscription(id, acceptLanguage, xChildCompanyId)

Resume Subscription

You can resume the subscription to start the plans that your customers consume

### Example

```java
// Import classes:
//import io.conekta.SubscriptionsApi;

SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    SubscriptionResponse result = apiInstance.resumeSubscription(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#resumeSubscription");
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

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## updateSubscription

> SubscriptionResponse updateSubscription(id, subscriptionUpdateRequest, acceptLanguage, xChildCompanyId)

Update Subscription

You can modify the subscription to change the plans that your customers consume

### Example

```java
// Import classes:
//import io.conekta.SubscriptionsApi;

SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
SubscriptionUpdateRequest subscriptionUpdateRequest = new SubscriptionUpdateRequest(); // SubscriptionUpdateRequest | requested field for update a subscription
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    SubscriptionResponse result = apiInstance.updateSubscription(id, subscriptionUpdateRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#updateSubscription");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **subscriptionUpdateRequest** | [**SubscriptionUpdateRequest**](SubscriptionUpdateRequest.md)| requested field for update a subscription |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

