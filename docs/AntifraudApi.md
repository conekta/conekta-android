# AntifraudApi

All URIs are relative to *https://api.conekta.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRuleBlacklist**](AntifraudApi.md#createRuleBlacklist) | **POST** /antifraud/blacklists | Create blacklisted rule
[**createRuleWhitelist**](AntifraudApi.md#createRuleWhitelist) | **POST** /antifraud/whitelists | Create whitelisted rule
[**deleteRuleBlacklist**](AntifraudApi.md#deleteRuleBlacklist) | **DELETE** /antifraud/blacklists/{id} | Delete blacklisted rule
[**deleteRuleWhitelist**](AntifraudApi.md#deleteRuleWhitelist) | **DELETE** /antifraud/whitelists/{id} | Delete whitelisted rule
[**getRuleBlacklist**](AntifraudApi.md#getRuleBlacklist) | **GET** /antifraud/blacklists | Get list of blacklisted rules
[**getRuleWhitelist**](AntifraudApi.md#getRuleWhitelist) | **GET** /antifraud/whitelists | Get a list of whitelisted rules



## createRuleBlacklist

> BlacklistRuleResponse createRuleBlacklist(createRiskRulesData, acceptLanguage)

Create blacklisted rule

### Example

```java
// Import classes:
//import io.conekta.AntifraudApi;

AntifraudApi apiInstance = new AntifraudApi();
CreateRiskRulesData createRiskRulesData = new CreateRiskRulesData(); // CreateRiskRulesData | requested field for blacklist rule
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    BlacklistRuleResponse result = apiInstance.createRuleBlacklist(createRiskRulesData, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntifraudApi#createRuleBlacklist");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createRiskRulesData** | [**CreateRiskRulesData**](CreateRiskRulesData.md)| requested field for blacklist rule |
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**BlacklistRuleResponse**](BlacklistRuleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## createRuleWhitelist

> WhitelistlistRuleResponse createRuleWhitelist(acceptLanguage, createRiskRulesData)

Create whitelisted rule

### Example

```java
// Import classes:
//import io.conekta.AntifraudApi;

AntifraudApi apiInstance = new AntifraudApi();
String acceptLanguage = es; // String | Use for knowing which language to use
CreateRiskRulesData createRiskRulesData = new CreateRiskRulesData(); // CreateRiskRulesData | 
try {
    WhitelistlistRuleResponse result = apiInstance.createRuleWhitelist(acceptLanguage, createRiskRulesData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntifraudApi#createRuleWhitelist");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **createRiskRulesData** | [**CreateRiskRulesData**](CreateRiskRulesData.md)|  | [optional]

### Return type

[**WhitelistlistRuleResponse**](WhitelistlistRuleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.conekta-v2.1.0+json


## deleteRuleBlacklist

> DeletedBlacklistRuleResponse deleteRuleBlacklist(id, acceptLanguage, xChildCompanyId)

Delete blacklisted rule

### Example

```java
// Import classes:
//import io.conekta.AntifraudApi;

AntifraudApi apiInstance = new AntifraudApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    DeletedBlacklistRuleResponse result = apiInstance.deleteRuleBlacklist(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntifraudApi#deleteRuleBlacklist");
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

[**DeletedBlacklistRuleResponse**](DeletedBlacklistRuleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## deleteRuleWhitelist

> DeletedWhitelistRuleResponse deleteRuleWhitelist(id, acceptLanguage, xChildCompanyId)

Delete whitelisted rule

### Example

```java
// Import classes:
//import io.conekta.AntifraudApi;

AntifraudApi apiInstance = new AntifraudApi();
String id = 6307a60c41de27127515a575; // String | Identifier of the resource
String acceptLanguage = es; // String | Use for knowing which language to use
String xChildCompanyId = 6441b6376b60c3a638da80af; // String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    DeletedWhitelistRuleResponse result = apiInstance.deleteRuleWhitelist(id, acceptLanguage, xChildCompanyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntifraudApi#deleteRuleWhitelist");
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

[**DeletedWhitelistRuleResponse**](DeletedWhitelistRuleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getRuleBlacklist

> RiskRulesList getRuleBlacklist(acceptLanguage)

Get list of blacklisted rules

Return all rules

### Example

```java
// Import classes:
//import io.conekta.AntifraudApi;

AntifraudApi apiInstance = new AntifraudApi();
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    RiskRulesList result = apiInstance.getRuleBlacklist(acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntifraudApi#getRuleBlacklist");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**RiskRulesList**](RiskRulesList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json


## getRuleWhitelist

> RiskRulesList getRuleWhitelist(acceptLanguage)

Get a list of whitelisted rules

Return all rules

### Example

```java
// Import classes:
//import io.conekta.AntifraudApi;

AntifraudApi apiInstance = new AntifraudApi();
String acceptLanguage = es; // String | Use for knowing which language to use
try {
    RiskRulesList result = apiInstance.getRuleWhitelist(acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntifraudApi#getRuleWhitelist");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**RiskRulesList**](RiskRulesList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.conekta-v2.1.0+json

