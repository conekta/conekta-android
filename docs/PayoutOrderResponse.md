

# PayoutOrderResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedPayoutMethods** | **List&lt;String&gt;** | The payout methods that are allowed for the payout order. | 
**amount** | **Integer** | The amount of the payout order. | 
**createdAt** | **Long** | The creation date of the payout order. | 
**currency** | **String** | The currency in which the payout order is made. | 
**customerInfo** | [**PayoutOrderResponseCustomerInfo**](PayoutOrderResponseCustomerInfo.md) |  | 
**expiresAt** | **Long** | The expiration date of the payout order. |  [optional]
**id** | **String** | The id of the payout order. | 
**livemode** | **Boolean** | The live mode of the payout order. | 
**_object** | **String** | The object of the payout order. | 
**metadata** | [**Map&lt;String, OasAnyTypeNotMapped&gt;**](OasAnyTypeNotMapped.md) | The metadata of the payout order. |  [optional]
**payouts** | [**List&lt;PayoutOrderPayoutsItem&gt;**](PayoutOrderPayoutsItem.md) | The payout information of the payout order. | 
**reason** | **String** | The reason for the payout order. | 
**status** | **String** | The status of the payout order. |  [optional]
**updatedAt** | **Long** | The update date of the payout order. | 




