
# PaymentMethodGeneralRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **kotlin.String** | Type of payment method | 
**expiresAt** | **kotlin.Long** | Method expiration date as unix timestamp |  [optional]
**monthlyInstallments** | **kotlin.Int** | How many months without interest to apply, it can be 3, 6, 9, 12 or 18 |  [optional]
**tokenId** | **kotlin.String** |  |  [optional]
**paymentSourceId** | **kotlin.String** |  |  [optional]
**contractId** | **kotlin.String** | Optional id sent to indicate the bank contract for recurrent card charges. |  [optional]


