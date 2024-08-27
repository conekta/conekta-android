
# CompanyResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The child company&#39;s unique identifier |  [optional]
**createdAt** | **kotlin.Long** | The resource&#39;s creation date (unix timestamp) |  [optional]
**name** | **kotlin.String** | The child company&#39;s name |  [optional]
**&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The resource&#39;s type |  [optional]
**parentCompanyId** | **kotlin.String** | Id of the parent company |  [optional]
**useParentFiscalData** | **kotlin.Boolean** | Whether the parent company&#39;s fiscal data is to be used for liquidation and tax purposes |  [optional]
**payoutDestination** | [**CompanyPayoutDestinationResponse**](CompanyPayoutDestinationResponse.md) |  |  [optional]
**fiscalInfo** | [**CompanyFiscalInfoResponse**](CompanyFiscalInfoResponse.md) |  |  [optional]


<a id="`Object`"></a>
## Enum: object
Name | Value
---- | -----
&#x60;object&#x60; | company



