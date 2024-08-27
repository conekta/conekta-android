

# Checkout

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedPaymentMethods** | **List&lt;String&gt;** | Those are the payment methods that will be available for the link | 
**expiresAt** | **Long** | It is the time when the link will expire. It is expressed in seconds since the Unix epoch. The valid range is from 2 to 365 days (the valid range will be taken from the next day of the creation date at 00:01 hrs)  | 
**monthlyInstallmentsEnabled** | **Boolean** | This flag allows you to specify if months without interest will be active. |  [optional]
**monthlyInstallmentsOptions** | **List&lt;Integer&gt;** | This field allows you to specify the number of months without interest. |  [optional]
**name** | **String** | Reason for charge | 
**needsShippingContact** | **Boolean** | This flag allows you to fill in the shipping information at checkout. |  [optional]
**onDemandEnabled** | **Boolean** | This flag allows you to specify if the link will be on demand. |  [optional]
**orderTemplate** | [**CheckoutOrderTemplate**](CheckoutOrderTemplate.md) |  | 
**paymentsLimitCount** | **Integer** | It is the number of payments that can be made through the link. |  [optional]
**recurrent** | **Boolean** | false: single use. true: multiple payments | 
**type** | **String** | It is the type of link that will be created. It must be a valid type. | 




