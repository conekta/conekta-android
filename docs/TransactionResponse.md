
# TransactionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **kotlin.Long** | The amount of the transaction. | 
**charge** | **kotlin.String** | Randomly assigned unique order identifier associated with the charge. | 
**createdAt** | **kotlin.Long** | Date and time of creation of the transaction in Unix format. | 
**currency** | **kotlin.String** | The currency of the transaction. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217) | 
**fee** | **kotlin.Long** | The amount to be deducted for taxes and commissions. | 
**id** | **kotlin.String** | Unique identifier of the transaction. | 
**livemode** | **kotlin.Boolean** | Indicates whether the transaction was created in live mode or test mode. | 
**net** | **kotlin.Long** | The net amount after deducting commissions and taxes. | 
**&#x60;object&#x60;** | **kotlin.String** | Object name, which is transaction. | 
**status** | **kotlin.String** | Code indicating transaction status. | 
**type** | **kotlin.String** | Transaction Type | 



