
# PayoutOrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedPayoutMethods** | **kotlin.collections.List&lt;kotlin.String&gt;** | The payout methods that are allowed for the payout order. | 
**amount** | **kotlin.Int** | The amount of the payout order. | 
**createdAt** | **kotlin.Long** | The creation date of the payout order. | 
**currency** | **kotlin.String** | The currency in which the payout order is made. | 
**customerInfo** | [**PayoutOrderResponseCustomerInfo**](PayoutOrderResponseCustomerInfo.md) |  | 
**id** | **kotlin.String** | The id of the payout order. | 
**livemode** | **kotlin.Boolean** | The live mode of the payout order. | 
**&#x60;object&#x60;** | **kotlin.String** | The object of the payout order. | 
**payouts** | [**kotlin.collections.List&lt;PayoutOrderPayoutsItem&gt;**](PayoutOrderPayoutsItem.md) | The payout information of the payout order. | 
**reason** | **kotlin.String** | The reason for the payout order. | 
**updatedAt** | **kotlin.Long** | The update date of the payout order. | 
**expiresAt** | **kotlin.Long** | The expiration date of the payout order. |  [optional]
**metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | The metadata of the payout order. |  [optional]
**status** | **kotlin.String** | The status of the payout order. |  [optional]



