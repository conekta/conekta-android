
# Checkout

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedPaymentMethods** | **kotlin.collections.List&lt;kotlin.String&gt;** | Those are the payment methods that will be available for the link | 
**expiresAt** | **kotlin.Long** | It is the time when the link will expire. It is expressed in seconds since the Unix epoch. The valid range is from 2 to 365 days (the valid range will be taken from the next day of the creation date at 00:01 hrs)  | 
**name** | **kotlin.String** | Reason for charge | 
**orderTemplate** | [**CheckoutOrderTemplate**](CheckoutOrderTemplate.md) |  | 
**recurrent** | **kotlin.Boolean** | false: single use. true: multiple payments | 
**type** | **kotlin.String** | It is the type of link that will be created. It must be a valid type. | 
**monthlyInstallmentsEnabled** | **kotlin.Boolean** | This flag allows you to specify if months without interest will be active. |  [optional]
**monthlyInstallmentsOptions** | **kotlin.collections.List&lt;kotlin.Int&gt;** | This field allows you to specify the number of months without interest. |  [optional]
**needsShippingContact** | **kotlin.Boolean** | This flag allows you to fill in the shipping information at checkout. |  [optional]
**onDemandEnabled** | **kotlin.Boolean** | This flag allows you to specify if the link will be on demand. |  [optional]
**paymentsLimitCount** | **kotlin.Int** | It is the number of payments that can be made through the link. |  [optional]



