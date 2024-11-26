

# CompanyResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The child company&#39;s unique identifier |  [optional]
**createdAt** | **Long** | The resource&#39;s creation date (unix timestamp) |  [optional]
**name** | **String** | The child company&#39;s name |  [optional]
**_object** | [**_objectEnum**](#_objectEnum) | The resource&#39;s type |  [optional]
**parentCompanyId** | **String** | Id of the parent company |  [optional]
**useParentFiscalData** | **Boolean** | Whether the parent company&#39;s fiscal data is to be used for liquidation and tax purposes |  [optional]
**payoutDestination** | [**CompanyPayoutDestinationResponse**](CompanyPayoutDestinationResponse.md) |  |  [optional]
**fiscalInfo** | [**CompanyFiscalInfoResponse**](CompanyFiscalInfoResponse.md) |  |  [optional]


## Enum: _objectEnum

Name | Value
---- | -----




