
# WebhookUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **kotlin.String** | Here you must place the URL of your Webhook remember that you must program what you will do with the events received. Also do not forget to handle the HTTPS protocol for greater security. | 
**synchronous** | **kotlin.Boolean** | It is a value that allows to decide if the events will be synchronous or asynchronous. We recommend asynchronous &#x3D; false |  [optional]
**events** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]



