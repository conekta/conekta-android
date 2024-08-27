

# TransactionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Long** | The amount of the transaction. | 
**charge** | **String** | Randomly assigned unique order identifier associated with the charge. | 
**createdAt** | **Long** | Date and time of creation of the transaction in Unix format. | 
**currency** | **String** | The currency of the transaction. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217) | 
**fee** | **Long** | The amount to be deducted for taxes and commissions. | 
**id** | **String** | Unique identifier of the transaction. | 
**livemode** | **Boolean** | Indicates whether the transaction was created in live mode or test mode. | 
**net** | **Long** | The net amount after deducting commissions and taxes. | 
**_object** | **String** | Object name, which is transaction. | 
**status** | **String** | Code indicating transaction status. | 
**type** | **String** | Transaction Type | 




