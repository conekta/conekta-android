# ChargesApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharges**](ChargesApi.md#getCharges) | **GET** /charges | Get A List of Charges
[**ordersCreateCharge**](ChargesApi.md#ordersCreateCharge) | **POST** /orders/{id}/charges | Create charge
[**updateCharge**](ChargesApi.md#updateCharge) | **PUT** /charges/{id} | Update a charge



## getCharges

> GetChargesResponse getCharges(acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get A List of Charges

### Example

```java
// Import classes:
//import io.conekta.ChargesApi;

ChargesApi apiInstance = new ChargesApi();
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
String search = null; // String | General order search, e.g. by mail, reference etc.
String next = null; // String | next page
String previous = null; // String | previous page
try {
    GetChargesResponse result = apiInstance.getCharges(acceptLanguage, xChildCompanyId, limit, search, next, previous);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargesApi#getCharges");
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

[**GetChargesResponse**](GetChargesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## ordersCreateCharge

> ChargeOrderResponse ordersCreateCharge(id, chargeRequest, acceptLanguage, xChildCompanyId)

Create charge

Create charge for an existing orden

### Example

```java
// Import classes:
//import io.conekta.ChargesApi;

ChargesApi apiInstance = new ChargesApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
ChargeRequest chargeRequest = new ChargeRequest(); // ChargeRequest | requested field for a charge
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    ChargeOrderResponse result = apiInstance.ordersCreateCharge(id, chargeRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargesApi#ordersCreateCharge");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **chargeRequest** | [**ChargeRequest**](ChargeRequest.md)| requested field for a charge |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**ChargeOrderResponse**](ChargeOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## updateCharge

> ChargeResponse updateCharge(id, chargeUpdateRequest, acceptLanguage, xChildCompanyId)

Update a charge

### Example

```java
// Import classes:
//import io.conekta.ChargesApi;

ChargesApi apiInstance = new ChargesApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
ChargeUpdateRequest chargeUpdateRequest = new ChargeUpdateRequest(); // ChargeUpdateRequest | requested field for update a charge
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    ChargeResponse result = apiInstance.updateCharge(id, chargeUpdateRequest, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargesApi#updateCharge");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the resource | [default to null]
 **chargeUpdateRequest** | [**ChargeUpdateRequest**](ChargeUpdateRequest.md)| requested field for update a charge |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] [default to null]

### Return type

[**ChargeResponse**](ChargeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json

