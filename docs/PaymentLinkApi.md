# PaymentLinkApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCheckout**](PaymentLinkApi.md#cancelCheckout) | **PUT** /checkouts/{id}/cancel | Cancel Payment Link
[**createCheckout**](PaymentLinkApi.md#createCheckout) | **POST** /checkouts | Create Unique Payment Link
[**emailCheckout**](PaymentLinkApi.md#emailCheckout) | **POST** /checkouts/{id}/email | Send an email
[**getCheckout**](PaymentLinkApi.md#getCheckout) | **GET** /checkouts/{id} | Get a payment link by ID
[**getCheckouts**](PaymentLinkApi.md#getCheckouts) | **GET** /checkouts | Get a list of payment links
[**smsCheckout**](PaymentLinkApi.md#smsCheckout) | **POST** /checkouts/{id}/sms | Send an sms



## cancelCheckout

> CheckoutResponse cancelCheckout(id, acceptLanguage, xChildCompanyId)

Cancel Payment Link

### Example

```java
// Import classes:
//import io.conekta.PaymentLinkApi;

PaymentLinkApi apiInstance = new PaymentLinkApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CheckoutResponse result = apiInstance.cancelCheckout(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentLinkApi#cancelCheckout");
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

[**CheckoutResponse**](CheckoutResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## createCheckout

> CheckoutResponse createCheckout(checkout, acceptLanguage, xChildCompanyId)

Create Unique Payment Link

### Example

```java
// Import classes:
//import io.conekta.PaymentLinkApi;

PaymentLinkApi apiInstance = new PaymentLinkApi();
Checkout checkout = new Checkout(); // Checkout | requested field for checkout
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CheckoutResponse result = apiInstance.createCheckout(checkout, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentLinkApi#createCheckout");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkout** | [**Checkout**](Checkout.md)| requested field for checkout |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**CheckoutResponse**](CheckoutResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## emailCheckout

> CheckoutResponse emailCheckout(id, emailCheckoutRequest, acceptLanguage, xChildCompanyId)

Send an email

### Example

```java
// Import classes:
//import io.conekta.PaymentLinkApi;

PaymentLinkApi apiInstance = new PaymentLinkApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
EmailCheckoutRequest emailCheckoutRequest = new EmailCheckoutRequest(); // EmailCheckoutRequest | requested field for sms checkout
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CheckoutResponse result = apiInstance.emailCheckout(id, emailCheckoutRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentLinkApi#emailCheckout");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **emailCheckoutRequest** | [**EmailCheckoutRequest**](EmailCheckoutRequest.md)| requested field for sms checkout |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**CheckoutResponse**](CheckoutResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## getCheckout

> CheckoutResponse getCheckout(id, acceptLanguage, xChildCompanyId)

Get a payment link by ID

### Example

```java
// Import classes:
//import io.conekta.PaymentLinkApi;

PaymentLinkApi apiInstance = new PaymentLinkApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CheckoutResponse result = apiInstance.getCheckout(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentLinkApi#getCheckout");
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

[**CheckoutResponse**](CheckoutResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getCheckouts

> CheckoutsResponse getCheckouts(acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get a list of payment links

Returns a list of links generated by the merchant

### Example

```java
// Import classes:
//import io.conekta.PaymentLinkApi;

PaymentLinkApi apiInstance = new PaymentLinkApi();
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String search = null; // String | General order search, e.g. by mail, reference etc.
String next = null; // String | next page
String previous = null; // String | previous page
try {
    CheckoutsResponse result = apiInstance.getCheckouts(acceptLanguage, xChildCompanyId, limit, search, next, previous);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentLinkApi#getCheckouts");
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

[**CheckoutsResponse**](CheckoutsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## smsCheckout

> CheckoutResponse smsCheckout(id, smsCheckoutRequest, acceptLanguage, xChildCompanyId)

Send an sms

### Example

```java
// Import classes:
//import io.conekta.PaymentLinkApi;

PaymentLinkApi apiInstance = new PaymentLinkApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
SmsCheckoutRequest smsCheckoutRequest = new SmsCheckoutRequest(); // SmsCheckoutRequest | requested field for sms checkout
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CheckoutResponse result = apiInstance.smsCheckout(id, smsCheckoutRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentLinkApi#smsCheckout");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **smsCheckoutRequest** | [**SmsCheckoutRequest**](SmsCheckoutRequest.md)| requested field for sms checkout |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**CheckoutResponse**](CheckoutResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

