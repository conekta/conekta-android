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



Create blacklisted rule

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AntifraudApi::class.java)
val createRiskRulesData : CreateRiskRulesData =  // CreateRiskRulesData | requested field for blacklist rule
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use

val result : BlacklistRuleResponse = webService.createRuleBlacklist(createRiskRulesData, acceptLanguage)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createRiskRulesData** | [**CreateRiskRulesData**](CreateRiskRulesData.md)| requested field for blacklist rule |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**BlacklistRuleResponse**](BlacklistRuleResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json


Create whitelisted rule

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AntifraudApi::class.java)
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val createRiskRulesData : CreateRiskRulesData =  // CreateRiskRulesData | 

val result : WhitelistlistRuleResponse = webService.createRuleWhitelist(acceptLanguage, createRiskRulesData)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **createRiskRulesData** | [**CreateRiskRulesData**](CreateRiskRulesData.md)|  | [optional]

### Return type

[**WhitelistlistRuleResponse**](WhitelistlistRuleResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json


Delete blacklisted rule

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AntifraudApi::class.java)
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.

val result : DeletedBlacklistRuleResponse = webService.deleteRuleBlacklist(id, acceptLanguage, xChildCompanyId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**DeletedBlacklistRuleResponse**](DeletedBlacklistRuleResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json


Delete whitelisted rule

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AntifraudApi::class.java)
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.

val result : DeletedWhitelistRuleResponse = webService.deleteRuleWhitelist(id, acceptLanguage, xChildCompanyId)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifier of the resource |
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]
 **xChildCompanyId** | **kotlin.String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional]

### Return type

[**DeletedWhitelistRuleResponse**](DeletedWhitelistRuleResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json


Get list of blacklisted rules

Return all rules

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AntifraudApi::class.java)
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use

val result : RiskRulesList = webService.getRuleBlacklist(acceptLanguage)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**RiskRulesList**](RiskRulesList.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json


Get a list of whitelisted rules

Return all rules

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(AntifraudApi::class.java)
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use

val result : RiskRulesList = webService.getRuleWhitelist(acceptLanguage)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**RiskRulesList**](RiskRulesList.md)

### Authorization


Configure bearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

