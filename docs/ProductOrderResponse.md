
# ProductOrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the item. It will be displayed in the order. | 
**quantity** | **kotlin.Int** | The quantity of the item in the order. | 
**unitPrice** | **kotlin.Int** | The price of the item in cents. | 
**antifraudInfo** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**brand** | **kotlin.String** | The brand of the item. |  [optional]
**description** | **kotlin.String** | Short description of the item |  [optional]
**metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | It is a key/value hash that can hold custom fields. Maximum 100 elements and allows special characters. |  [optional]
**sku** | **kotlin.String** | The stock keeping unit for the item. It is used to identify the item in the order. |  [optional]
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of tags for the item. It is used to identify the item in the order. |  [optional]
**id** | **kotlin.String** |  |  [optional]
**&#x60;object&#x60;** | **kotlin.String** |  |  [optional]
**parentId** | **kotlin.String** |  |  [optional]



