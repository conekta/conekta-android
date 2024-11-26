# CustomersApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomer**](CustomersApi.md#createCustomer) | **POST** /customers | Create customer
[**createCustomerFiscalEntities**](CustomersApi.md#createCustomerFiscalEntities) | **POST** /customers/{id}/fiscal_entities | Create Fiscal Entity
[**deleteCustomerById**](CustomersApi.md#deleteCustomerById) | **DELETE** /customers/{id} | Delete Customer
[**getCustomerById**](CustomersApi.md#getCustomerById) | **GET** /customers/{id} | Get Customer
[**getCustomers**](CustomersApi.md#getCustomers) | **GET** /customers | Get a list of customers
[**updateCustomer**](CustomersApi.md#updateCustomer) | **PUT** /customers/{id} | Update customer
[**updateCustomerFiscalEntities**](CustomersApi.md#updateCustomerFiscalEntities) | **PUT** /customers/{id}/fiscal_entities/{fiscal_entities_id} | Update  Fiscal Entity



## createCustomer

> CustomerResponse createCustomer(customer, acceptLanguage, xChildCompanyId)

Create customer

The purpose of business is to create and keep a customer, you will learn what elements you need to create a customer. Remember the credit and debit card tokenization process: [https://developers.conekta.com/page/web-checkout-tokenizer](https://developers.conekta.com/page/web-checkout-tokenizer) 

### Example

```java
// Import classes:
//import io.conekta.CustomersApi;

CustomersApi apiInstance = new CustomersApi();
Customer customer = new Customer(); // Customer | requested field for customer
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CustomerResponse result = apiInstance.createCustomer(customer, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#createCustomer");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)| requested field for customer |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## createCustomerFiscalEntities

> CreateCustomerFiscalEntitiesResponse createCustomerFiscalEntities(id, customerFiscalEntitiesRequest, acceptLanguage, xChildCompanyId)

Create Fiscal Entity

Create Fiscal entity resource that corresponds to a customer ID.

### Example

```java
// Import classes:
//import io.conekta.CustomersApi;

CustomersApi apiInstance = new CustomersApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
CustomerFiscalEntitiesRequest customerFiscalEntitiesRequest = new CustomerFiscalEntitiesRequest(); // CustomerFiscalEntitiesRequest | requested field for customer fiscal entities
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CreateCustomerFiscalEntitiesResponse result = apiInstance.createCustomerFiscalEntities(id, customerFiscalEntitiesRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#createCustomerFiscalEntities");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **customerFiscalEntitiesRequest** | [**CustomerFiscalEntitiesRequest**](CustomerFiscalEntitiesRequest.md)| requested field for customer fiscal entities |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**CreateCustomerFiscalEntitiesResponse**](CreateCustomerFiscalEntitiesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## deleteCustomerById

> CustomerResponse deleteCustomerById(id, acceptLanguage, xChildCompanyId)

Delete Customer

Deleted a customer resource that corresponds to a customer ID.

### Example

```java
// Import classes:
//import io.conekta.CustomersApi;

CustomersApi apiInstance = new CustomersApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CustomerResponse result = apiInstance.deleteCustomerById(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#deleteCustomerById");
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

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getCustomerById

> CustomerResponse getCustomerById(id, acceptLanguage, xChildCompanyId)

Get Customer

Gets a customer resource that corresponds to a customer ID.

### Example

```java
// Import classes:
//import io.conekta.CustomersApi;

CustomersApi apiInstance = new CustomersApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CustomerResponse result = apiInstance.getCustomerById(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getCustomerById");
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

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getCustomers

> CustomersResponse getCustomers(acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get a list of customers

The purpose of business is to create and maintain a client, you will learn what elements you need to obtain a list of clients, which can be paged.

### Example

```java
// Import classes:
//import io.conekta.CustomersApi;

CustomersApi apiInstance = new CustomersApi();
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String search = null; // String | General order search, e.g. by mail, reference etc.
String next = null; // String | next page
String previous = null; // String | previous page
try {
    CustomersResponse result = apiInstance.getCustomers(acceptLanguage, xChildCompanyId, limit, search, next, previous);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getCustomers");
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

[**CustomersResponse**](CustomersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## updateCustomer

> CustomerResponse updateCustomer(id, updateCustomer, acceptLanguage, xChildCompanyId)

Update customer

You can update customer-related data

### Example

```java
// Import classes:
//import io.conekta.CustomersApi;

CustomersApi apiInstance = new CustomersApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
UpdateCustomer updateCustomer = new UpdateCustomer(); // UpdateCustomer | requested field for customer
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    CustomerResponse result = apiInstance.updateCustomer(id, updateCustomer, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **updateCustomer** | [**UpdateCustomer**](UpdateCustomer.md)| requested field for customer |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## updateCustomerFiscalEntities

> UpdateCustomerFiscalEntitiesResponse updateCustomerFiscalEntities(id, fiscalEntitiesId, customerUpdateFiscalEntitiesRequest, acceptLanguage, xChildCompanyId)

Update  Fiscal Entity

Update Fiscal Entity resource that corresponds to a customer ID.

### Example

```java
// Import classes:
//import io.conekta.CustomersApi;

CustomersApi apiInstance = new CustomersApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String fiscalEntitiesId = fis_ent_2tQ8HkkfbauaKP9Ho; // String | identifier
CustomerUpdateFiscalEntitiesRequest customerUpdateFiscalEntitiesRequest = new CustomerUpdateFiscalEntitiesRequest(); // CustomerUpdateFiscalEntitiesRequest | requested field for customer update fiscal entities
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    UpdateCustomerFiscalEntitiesResponse result = apiInstance.updateCustomerFiscalEntities(id, fiscalEntitiesId, customerUpdateFiscalEntitiesRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#updateCustomerFiscalEntities");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **fiscalEntitiesId** | **String**| identifier | [default to null]
 **customerUpdateFiscalEntitiesRequest** | [**CustomerUpdateFiscalEntitiesRequest**](CustomerUpdateFiscalEntitiesRequest.md)| requested field for customer update fiscal entities |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**UpdateCustomerFiscalEntitiesResponse**](UpdateCustomerFiscalEntitiesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

