# PaymentMethodsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerPaymentMethods**](PaymentMethodsApi.md#createCustomerPaymentMethods) | **POST** /customers/{id}/payment_sources | Create Payment Method
[**deleteCustomerPaymentMethods**](PaymentMethodsApi.md#deleteCustomerPaymentMethods) | **DELETE** /customers/{id}/payment_sources/{payment_method_id} | Delete Payment Method
[**getCustomerPaymentMethods**](PaymentMethodsApi.md#getCustomerPaymentMethods) | **GET** /customers/{id}/payment_sources | Get Payment Methods
[**updateCustomerPaymentMethods**](PaymentMethodsApi.md#updateCustomerPaymentMethods) | **PUT** /customers/{id}/payment_sources/{payment_method_id} | Update Payment Method



## createCustomerPaymentMethods

> CreateCustomerPaymentMethodsResponse createCustomerPaymentMethods(id, createCustomerPaymentMethodsRequest, acceptLanguage, xChildCompanyId)

Create Payment Method

Create a payment method for a customer.

### Example

```java
// Import classes:
//import io.conekta.PaymentMethodsApi;

PaymentMethodsApi apiInstance = new PaymentMethodsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
CreateCustomerPaymentMethodsRequest createCustomerPaymentMethodsRequest = {"type":"card","token_id":"tok_test_visa_4242"}; // CreateCustomerPaymentMethodsRequest | requested field for customer payment methods
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CreateCustomerPaymentMethodsResponse result = apiInstance.createCustomerPaymentMethods(id, createCustomerPaymentMethodsRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#createCustomerPaymentMethods");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **createCustomerPaymentMethodsRequest** | [**CreateCustomerPaymentMethodsRequest**](CreateCustomerPaymentMethodsRequest.md)| requested field for customer payment methods |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**CreateCustomerPaymentMethodsResponse**](CreateCustomerPaymentMethodsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## deleteCustomerPaymentMethods

> UpdateCustomerPaymentMethodsResponse deleteCustomerPaymentMethods(id, paymentMethodId, acceptLanguage, xChildCompanyId)

Delete Payment Method

Delete an existing payment method

### Example

```java
// Import classes:
//import io.conekta.PaymentMethodsApi;

PaymentMethodsApi apiInstance = new PaymentMethodsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String paymentMethodId = src_2tQ974hSHcsdeSZHG; // String | Identifier of the payment method
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    UpdateCustomerPaymentMethodsResponse result = apiInstance.deleteCustomerPaymentMethods(id, paymentMethodId, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#deleteCustomerPaymentMethods");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **paymentMethodId** | **String**| Identifier of the payment method | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**UpdateCustomerPaymentMethodsResponse**](UpdateCustomerPaymentMethodsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getCustomerPaymentMethods

> GetPaymentMethodResponse getCustomerPaymentMethods(id, acceptLanguage, xChildCompanyId, limit, next, previous, search)

Get Payment Methods

Get a list of Payment Methods

### Example

```java
// Import classes:
//import io.conekta.PaymentMethodsApi;

PaymentMethodsApi apiInstance = new PaymentMethodsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String next = null; // String | next page
String previous = null; // String | previous page
String search = null; // String | General order search, e.g. by mail, reference etc.
try {
    GetPaymentMethodResponse result = apiInstance.getCustomerPaymentMethods(id, acceptLanguage, xChildCompanyId, limit, next, previous, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#getCustomerPaymentMethods");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]
 **limit** | **Integer**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **next** | **String**| next page | [optional] [default to null]
 **previous** | **String**| previous page | [optional] [default to null]
 **search** | **String**| General order search, e.g. by mail, reference etc. | [optional] [default to null]

### Return type

[**GetPaymentMethodResponse**](GetPaymentMethodResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## updateCustomerPaymentMethods

> UpdateCustomerPaymentMethodsResponse updateCustomerPaymentMethods(id, paymentMethodId, updatePaymentMethods, acceptLanguage, xChildCompanyId)

Update Payment Method

Gets a payment Method that corresponds to a customer ID.

### Example

```java
// Import classes:
//import io.conekta.PaymentMethodsApi;

PaymentMethodsApi apiInstance = new PaymentMethodsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String paymentMethodId = src_2tQ974hSHcsdeSZHG; // String | Identifier of the payment method
UpdatePaymentMethods updatePaymentMethods = new UpdatePaymentMethods(); // UpdatePaymentMethods | requested field for customer payment methods
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    UpdateCustomerPaymentMethodsResponse result = apiInstance.updateCustomerPaymentMethods(id, paymentMethodId, updatePaymentMethods, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentMethodsApi#updateCustomerPaymentMethods");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **paymentMethodId** | **String**| Identifier of the payment method | [default to null]
 **updatePaymentMethods** | [**UpdatePaymentMethods**](UpdatePaymentMethods.md)| requested field for customer payment methods |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**UpdateCustomerPaymentMethodsResponse**](UpdateCustomerPaymentMethodsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

