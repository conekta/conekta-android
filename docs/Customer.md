
# Customer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **kotlin.String** | An email address is a series of customizable characters followed by a universal Internet symbol, the at symbol (@), the name of a host server, and a web domain ending (.mx, .com, .org, . net, etc). | 
**name** | **kotlin.String** | Client&#39;s name | 
**phone** | **kotlin.String** | Is the customer&#39;s phone number | 
**antifraudInfo** | [**CustomerAntifraudInfo**](CustomerAntifraudInfo.md) |  |  [optional]
**corporate** | **kotlin.Boolean** | It is a value that allows identifying if the email is corporate or not. |  [optional]
**customReference** | **kotlin.String** | It is an undefined value. |  [optional]
**defaultPaymentSourceId** | **kotlin.String** | It is a parameter that allows to identify in the response, the Conekta ID of a payment method (payment_id) |  [optional]
**defaultShippingContactId** | **kotlin.String** | It is a parameter that allows to identify in the response, the Conekta ID of the shipping address (shipping_contact) |  [optional]
**fiscalEntities** | [**kotlin.collections.List&lt;CustomerFiscalEntitiesRequest&gt;**](CustomerFiscalEntitiesRequest.md) |  |  [optional]
**metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**paymentSources** | [**kotlin.collections.List&lt;CustomerPaymentMethodsRequest&gt;**](CustomerPaymentMethodsRequest.md) | Contains details of the payment methods that the customer has active or has used in Conekta |  [optional]
**planId** | **kotlin.String** | Contains the ID of a plan, which could together with name, email and phone create a client directly to a subscription |  [optional]
**shippingContacts** | [**kotlin.collections.List&lt;CustomerShippingContacts&gt;**](CustomerShippingContacts.md) | Contains the detail of the shipping addresses that the client has active or has used in Conekta |  [optional]
**subscription** | [**SubscriptionRequest**](SubscriptionRequest.md) |  |  [optional]



