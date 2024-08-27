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


<a id="createCustomer"></a>
# **createCustomer**
> CustomerResponse createCustomer(customer, acceptLanguage, xChildCompanyId)

Create customer

The purpose of business is to create and keep a customer, you will learn what elements you need to create a customer. Remember the credit and debit card tokenization process: [https://developers.conekta.com/page/web-checkout-tokenizer](https://developers.conekta.com/page/web-checkout-tokenizer) 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = CustomersApi()
val customer : Customer =  // Customer | requested field for customer
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CustomerResponse = apiInstance.createCustomer(customer, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createCustomer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)| requested field for customer |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="createCustomerFiscalEntities"></a>
# **createCustomerFiscalEntities**
> CreateCustomerFiscalEntitiesResponse createCustomerFiscalEntities(id, customerFiscalEntitiesRequest, acceptLanguage, xChildCompanyId)

Create Fiscal Entity

Create Fiscal entity resource that corresponds to a customer ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = CustomersApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val customerFiscalEntitiesRequest : CustomerFiscalEntitiesRequest =  // CustomerFiscalEntitiesRequest | requested field for customer fiscal entities
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CreateCustomerFiscalEntitiesResponse = apiInstance.createCustomerFiscalEntities(id, customerFiscalEntitiesRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#createCustomerFiscalEntities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#createCustomerFiscalEntities")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **customerFiscalEntitiesRequest** | [**CustomerFiscalEntitiesRequest**](CustomerFiscalEntitiesRequest.md)| requested field for customer fiscal entities |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**CreateCustomerFiscalEntitiesResponse**](CreateCustomerFiscalEntitiesResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="deleteCustomerById"></a>
# **deleteCustomerById**
> CustomerResponse deleteCustomerById(id, acceptLanguage, xChildCompanyId)

Delete Customer

Deleted a customer resource that corresponds to a customer ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = CustomersApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CustomerResponse = apiInstance.deleteCustomerById(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#deleteCustomerById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#deleteCustomerById")
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

[**CustomerResponse**](CustomerResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getCustomerById"></a>
# **getCustomerById**
> CustomerResponse getCustomerById(id, acceptLanguage, xChildCompanyId)

Get Customer

Gets a customer resource that corresponds to a customer ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = CustomersApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CustomerResponse = apiInstance.getCustomerById(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#getCustomerById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#getCustomerById")
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

[**CustomerResponse**](CustomerResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getCustomers"></a>
# **getCustomers**
> CustomersResponse getCustomers(acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get a list of customers

The purpose of business is to create and maintain a client, you will learn what elements you need to obtain a list of clients, which can be paged.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = CustomersApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
try {
    val result : CustomersResponse = apiInstance.getCustomers(acceptLanguage, xChildCompanyId, limit, search, next, previous)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#getCustomers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#getCustomers")
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

[**CustomersResponse**](CustomersResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="updateCustomer"></a>
# **updateCustomer**
> CustomerResponse updateCustomer(id, updateCustomer, acceptLanguage, xChildCompanyId)

Update customer

You can update customer-related data

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = CustomersApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val updateCustomer : UpdateCustomer =  // UpdateCustomer | requested field for customer
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : CustomerResponse = apiInstance.updateCustomer(id, updateCustomer, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#updateCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#updateCustomer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **updateCustomer** | [**UpdateCustomer**](UpdateCustomer.md)| requested field for customer |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="updateCustomerFiscalEntities"></a>
# **updateCustomerFiscalEntities**
> UpdateCustomerFiscalEntitiesResponse updateCustomerFiscalEntities(id, fiscalEntitiesId, customerUpdateFiscalEntitiesRequest, acceptLanguage, xChildCompanyId)

Update  Fiscal Entity

Update Fiscal Entity resource that corresponds to a customer ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = CustomersApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val fiscalEntitiesId : kotlin.String = fis_ent_2tQ8HkkfbauaKP9Ho // kotlin.String | identifier
val customerUpdateFiscalEntitiesRequest : CustomerUpdateFiscalEntitiesRequest =  // CustomerUpdateFiscalEntitiesRequest | requested field for customer update fiscal entities
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : UpdateCustomerFiscalEntitiesResponse = apiInstance.updateCustomerFiscalEntities(id, fiscalEntitiesId, customerUpdateFiscalEntitiesRequest, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomersApi#updateCustomerFiscalEntities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomersApi#updateCustomerFiscalEntities")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **fiscalEntitiesId** | **kotlin.String**| identifier |
 **customerUpdateFiscalEntitiesRequest** | [**CustomerUpdateFiscalEntitiesRequest**](CustomerUpdateFiscalEntitiesRequest.md)| requested field for customer update fiscal entities |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**UpdateCustomerFiscalEntitiesResponse**](UpdateCustomerFiscalEntitiesResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

