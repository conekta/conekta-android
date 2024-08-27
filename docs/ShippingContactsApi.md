# ShippingContactsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerShippingContacts**](ShippingContactsApi.md#createCustomerShippingContacts) | **POST** /customers/{id}/shipping_contacts | Create a shipping contacts
[**deleteCustomerShippingContacts**](ShippingContactsApi.md#deleteCustomerShippingContacts) | **DELETE** /customers/{id}/shipping_contacts/{shipping_contacts_id} | Delete shipping contacts
[**updateCustomerShippingContacts**](ShippingContactsApi.md#updateCustomerShippingContacts) | **PUT** /customers/{id}/shipping_contacts/{shipping_contacts_id} | Update shipping contacts



## createCustomerShippingContacts

> CustomerShippingContactsResponse createCustomerShippingContacts(id, customerShippingContacts, acceptLanguage, xChildCompanyId)

Create a shipping contacts

Create a shipping contacts for a customer.

### Example

```java
// Import classes:
//import io.conekta.ShippingContactsApi;

ShippingContactsApi apiInstance = new ShippingContactsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
CustomerShippingContacts customerShippingContacts = new CustomerShippingContacts(); // CustomerShippingContacts | requested field for customer shippings contacts
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CustomerShippingContactsResponse result = apiInstance.createCustomerShippingContacts(id, customerShippingContacts, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingContactsApi#createCustomerShippingContacts");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **customerShippingContacts** | [**CustomerShippingContacts**](CustomerShippingContacts.md)| requested field for customer shippings contacts |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**CustomerShippingContactsResponse**](CustomerShippingContactsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## deleteCustomerShippingContacts

> CustomerShippingContactsResponse deleteCustomerShippingContacts(id, shippingContactsId, acceptLanguage, xChildCompanyId)

Delete shipping contacts

Delete shipping contact that corresponds to a customer ID.

### Example

```java
// Import classes:
//import io.conekta.ShippingContactsApi;

ShippingContactsApi apiInstance = new ShippingContactsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String shippingContactsId = 6307a60c41de27127515a575; // String | identifier
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CustomerShippingContactsResponse result = apiInstance.deleteCustomerShippingContacts(id, shippingContactsId, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingContactsApi#deleteCustomerShippingContacts");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **shippingContactsId** | **String**| identifier | [default to null]
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**CustomerShippingContactsResponse**](CustomerShippingContactsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## updateCustomerShippingContacts

> CustomerShippingContactsResponse updateCustomerShippingContacts(id, shippingContactsId, customerUpdateShippingContacts, acceptLanguage, xChildCompanyId)

Update shipping contacts

Update shipping contact that corresponds to a customer ID.

### Example

```java
// Import classes:
//import io.conekta.ShippingContactsApi;

ShippingContactsApi apiInstance = new ShippingContactsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String shippingContactsId = 6307a60c41de27127515a575; // String | identifier
CustomerUpdateShippingContacts customerUpdateShippingContacts = new CustomerUpdateShippingContacts(); // CustomerUpdateShippingContacts | requested field for customer update shippings contacts
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CustomerShippingContactsResponse result = apiInstance.updateCustomerShippingContacts(id, shippingContactsId, customerUpdateShippingContacts, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShippingContactsApi#updateCustomerShippingContacts");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **shippingContactsId** | **String**| identifier | [default to null]
 **customerUpdateShippingContacts** | [**CustomerUpdateShippingContacts**](CustomerUpdateShippingContacts.md)| requested field for customer update shippings contacts |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**CustomerShippingContactsResponse**](CustomerShippingContactsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

