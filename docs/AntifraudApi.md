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


<a id="createRuleBlacklist"></a>
# **createRuleBlacklist**
> BlacklistRuleResponse createRuleBlacklist(createRiskRulesData, acceptLanguage)

Create blacklisted rule

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = AntifraudApi()
val createRiskRulesData : CreateRiskRulesData =  // CreateRiskRulesData | requested field for blacklist rule
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : BlacklistRuleResponse = apiInstance.createRuleBlacklist(createRiskRulesData, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AntifraudApi#createRuleBlacklist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AntifraudApi#createRuleBlacklist")
    e.printStackTrace()
}
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
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="createRuleWhitelist"></a>
# **createRuleWhitelist**
> WhitelistlistRuleResponse createRuleWhitelist(acceptLanguage, createRiskRulesData)

Create whitelisted rule

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = AntifraudApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val createRiskRulesData : CreateRiskRulesData =  // CreateRiskRulesData | 
try {
    val result : WhitelistlistRuleResponse = apiInstance.createRuleWhitelist(acceptLanguage, createRiskRulesData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AntifraudApi#createRuleWhitelist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AntifraudApi#createRuleWhitelist")
    e.printStackTrace()
}
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
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="deleteRuleBlacklist"></a>
# **deleteRuleBlacklist**
> DeletedBlacklistRuleResponse deleteRuleBlacklist(id, acceptLanguage, xChildCompanyId)

Delete blacklisted rule

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = AntifraudApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : DeletedBlacklistRuleResponse = apiInstance.deleteRuleBlacklist(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AntifraudApi#deleteRuleBlacklist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AntifraudApi#deleteRuleBlacklist")
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

[**DeletedBlacklistRuleResponse**](DeletedBlacklistRuleResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="deleteRuleWhitelist"></a>
# **deleteRuleWhitelist**
> DeletedWhitelistRuleResponse deleteRuleWhitelist(id, acceptLanguage, xChildCompanyId)

Delete whitelisted rule

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = AntifraudApi()
val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
try {
    val result : DeletedWhitelistRuleResponse = apiInstance.deleteRuleWhitelist(id, acceptLanguage, xChildCompanyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AntifraudApi#deleteRuleWhitelist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AntifraudApi#deleteRuleWhitelist")
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

[**DeletedWhitelistRuleResponse**](DeletedWhitelistRuleResponse.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getRuleBlacklist"></a>
# **getRuleBlacklist**
> RiskRulesList getRuleBlacklist(acceptLanguage)

Get list of blacklisted rules

Return all rules

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = AntifraudApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : RiskRulesList = apiInstance.getRuleBlacklist(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AntifraudApi#getRuleBlacklist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AntifraudApi#getRuleBlacklist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**RiskRulesList**](RiskRulesList.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

<a id="getRuleWhitelist"></a>
# **getRuleWhitelist**
> RiskRulesList getRuleWhitelist(acceptLanguage)

Get a list of whitelisted rules

Return all rules

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import io.conekta.model.*

val apiInstance = AntifraudApi()
val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
try {
    val result : RiskRulesList = apiInstance.getRuleWhitelist(acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AntifraudApi#getRuleWhitelist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AntifraudApi#getRuleWhitelist")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **kotlin.String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en]

### Return type

[**RiskRulesList**](RiskRulesList.md)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.conekta-v2.1.0+json

