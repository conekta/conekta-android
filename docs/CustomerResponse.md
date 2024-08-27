
# CustomerResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **kotlin.Long** | Creation date of the object | 
**id** | **kotlin.String** | Customer&#39;s ID | 
**livemode** | **kotlin.Boolean** | true if the object exists in live mode or the value false if the object exists in test mode | 
**name** | **kotlin.String** | Customer&#39;s name | 
**&#x60;object&#x60;** | **kotlin.String** |  | 
**antifraudInfo** | [**CustomerAntifraudInfoResponse**](CustomerAntifraudInfoResponse.md) |  |  [optional]
**corporate** | **kotlin.Boolean** | true if the customer is a company |  [optional]
**customReference** | **kotlin.String** | Custom reference |  [optional]
**defaultFiscalEntityId** | **kotlin.String** |  |  [optional]
**defaultShippingContactId** | **kotlin.String** |  |  [optional]
**defaultPaymentSourceId** | **kotlin.String** |  |  [optional]
**email** | **kotlin.String** |  |  [optional]
**fiscalEntities** | [**CustomerFiscalEntitiesResponse**](CustomerFiscalEntitiesResponse.md) |  |  [optional]
**metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**paymentSources** | [**CustomerPaymentMethodsResponse**](CustomerPaymentMethodsResponse.md) |  |  [optional]
**phone** | **kotlin.String** | Customer&#39;s phone number |  [optional]
**shippingContacts** | [**CustomerResponseShippingContacts**](CustomerResponseShippingContacts.md) |  |  [optional]
**subscription** | [**SubscriptionResponse**](SubscriptionResponse.md) |  |  [optional]



