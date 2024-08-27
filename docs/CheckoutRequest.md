
# CheckoutRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedPaymentMethods** | **kotlin.collections.List&lt;kotlin.String&gt;** | Are the payment methods available for this link | 
**expiresAt** | **kotlin.Long** | Unix timestamp of checkout expiration |  [optional]
**failureUrl** | **kotlin.String** | Redirection url back to the site in case of failed payment, applies only to HostedPayment. |  [optional]
**monthlyInstallmentsEnabled** | **kotlin.Boolean** |  |  [optional]
**monthlyInstallmentsOptions** | **kotlin.collections.List&lt;kotlin.Int&gt;** |  |  [optional]
**name** | **kotlin.String** | Reason for payment |  [optional]
**onDemandEnabled** | **kotlin.Boolean** |  |  [optional]
**redirectionTime** | **kotlin.Int** | number of seconds to wait before redirecting to the success_url |  [optional]
**successUrl** | **kotlin.String** | Redirection url back to the site in case of successful payment, applies only to HostedPayment |  [optional]
**type** | **kotlin.String** | This field represents the type of checkout |  [optional]



