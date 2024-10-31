

# ChargeRequestPaymentMethod

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type of payment method | 
**cvc** | **String** | Optional, It is a value that allows identifying the security code of the card. Only for PCI merchants | 
**expMonth** | **String** | Card expiration month | 
**expYear** | **String** | Card expiration year | 
**name** | **String** | Cardholder name | 
**number** | **String** | Card number | 
**customerIpAddress** | **String** | Optional field used to capture the customer&#39;s IP address for fraud prevention and security monitoring purposes |  [optional]
**expiresAt** | **Long** | Method expiration date as unix timestamp |  [optional]
**monthlyInstallments** | **Integer** | How many months without interest to apply, it can be 3, 6, 9, 12 or 18 |  [optional]
**tokenId** | **String** |  |  [optional]
**paymentSourceId** | **String** |  |  [optional]
**contractId** | **String** | Optional id sent to indicate the bank contract for recurrent card charges. |  [optional]




