# TransactionsApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransaction**](TransactionsApi.md#getTransaction) | **GET** /transactions/{id} | Get transaction
[**getTransactions**](TransactionsApi.md#getTransactions) | **GET** /transactions | Get List transactions


<a id="getTransaction"></a>
# **getTransaction**
> TransactionResponse getTransaction(id, acceptLanguage, xChildCompanyId)

Get transaction

Get the details of a transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = TransactionsApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : TransactionResponse = apiInstance.getTransaction(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#getTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#getTransaction")
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

[**TransactionResponse**](TransactionResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getTransactions"></a>
# **getTransactions**
> GetTransactionsResponse getTransactions(acceptLanguage, xChildCompanyId, limit, next, previous, id, chargeId, type, currency)

Get List transactions

Get transaction details in the form of a list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = TransactionsApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
val next : kotlin.String = next_example // kotlin.String | next page
val previous : kotlin.String = previous_example // kotlin.String | previous page
val id : kotlin.String = 65412a893cd69a0001c25892 // kotlin.String | id of the object to be retrieved
val chargeId : kotlin.String = 65412a893cd69a0001c25892 // kotlin.String | id of the charge used for filtering
val type : kotlin.String = capture // kotlin.String | type of the object to be retrieved
val currency : kotlin.String = MXN // kotlin.String | currency of the object to be retrieved
try {
    val result : GetTransactionsResponse = apiInstance.getTransactions(acceptLanguage, xChildCompanyId, limit, next, previous, id, chargeId, type, currency)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#getTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#getTransactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]
 **limit** | **kotlin.Int**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20]
 **next** | **kotlin.String**| next page | [optional]
 **previous** | **kotlin.String**| previous page | [optional]
 **id** | **kotlin.String**| id of the object to be retrieved | [optional]
 **chargeId** | **kotlin.String**| id of the charge used for filtering | [optional]
 **type** | **kotlin.String**| type of the object to be retrieved | [optional]
 **currency** | **kotlin.String**| currency of the object to be retrieved | [optional]

### Return type

[**GetTransactionsResponse**](GetTransactionsResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

