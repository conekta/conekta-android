# TransactionsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransaction**](TransactionsApi.md#getTransaction) | **GET** /transactions/{id} | Get transaction
[**getTransactions**](TransactionsApi.md#getTransactions) | **GET** /transactions | Get List transactions



## getTransaction

> TransactionResponse getTransaction(id, acceptLanguage, xChildCompanyId)

Get transaction

Get the details of a transaction

### Example

```java
// Import classes:
//import io.conekta.TransactionsApi;

TransactionsApi apiInstance = new TransactionsApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    TransactionResponse result = apiInstance.getTransaction(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransaction");
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

[**TransactionResponse**](TransactionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getTransactions

> GetTransactionsResponse getTransactions(acceptLanguage, xChildCompanyId, limit, next, previous, id, chargeId, type, currency)

Get List transactions

Get transaction details in the form of a list

### Example

```java
// Import classes:
//import io.conekta.TransactionsApi;

TransactionsApi apiInstance = new TransactionsApi();
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String next = null; // String | next page
String previous = null; // String | previous page
String id = 65412a893cd69a0001c25892; // String | id of the object to be retrieved
String chargeId = 65412a893cd69a0001c25892; // String | id of the charge used for filtering
String type = capture; // String | type of the object to be retrieved
String currency = "MXN"; // String | currency of the object to be retrieved
try {
    GetTransactionsResponse result = apiInstance.getTransactions(acceptLanguage, xChildCompanyId, limit, next, previous, id, chargeId, type, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransactions");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]
 **limit** | **Integer**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **next** | **String**| next page | [optional] [default to null]
 **previous** | **String**| previous page | [optional] [default to null]
 **id** | **String**| id of the object to be retrieved | [optional] [default to null]
 **chargeId** | **String**| id of the charge used for filtering | [optional] [default to null]
 **type** | **String**| type of the object to be retrieved | [optional] [default to null]
 **currency** | **String**| currency of the object to be retrieved | [optional] [default to null]

### Return type

[**GetTransactionsResponse**](GetTransactionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json

