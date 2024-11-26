

# TransferResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Long** | Amount in cents of the transfer. |  [optional]
**createdAt** | **Long** | Date and time of creation of the transfer in Unix format. |  [optional]
**currency** | **String** | The currency of the transfer. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217) |  [optional]
**id** | **String** | Unique identifier of the transfer. |  [optional]
**livemode** | **Boolean** | Indicates whether the transfer was created in live mode or test mode. |  [optional]
**destination** | [**TransferDestinationResponse**](TransferDestinationResponse.md) |  |  [optional]
**_object** | **String** | Object name, which is transfer. |  [optional]
**statementDescription** | **String** | Description of the transfer. |  [optional]
**statementReference** | **String** | Reference number of the transfer. |  [optional]
**status** | **String** | Code indicating transfer status. |  [optional]




