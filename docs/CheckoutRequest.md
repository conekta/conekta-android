

# CheckoutRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedPaymentMethods** | **List&lt;String&gt;** | Are the payment methods available for this link | 
**expiresAt** | **Long** | Unix timestamp of checkout expiration |  [optional]
**failureUrl** | **String** | Redirection url back to the site in case of failed payment, applies only to HostedPayment. |  [optional]
**monthlyInstallmentsEnabled** | **Boolean** |  |  [optional]
**monthlyInstallmentsOptions** | **List&lt;Integer&gt;** |  |  [optional]
**name** | **String** | Reason for payment |  [optional]
**onDemandEnabled** | **Boolean** |  |  [optional]
**redirectionTime** | **Integer** | number of seconds to wait before redirecting to the success_url |  [optional]
**successUrl** | **String** | Redirection url back to the site in case of successful payment, applies only to HostedPayment |  [optional]
**type** | **String** | This field represents the type of checkout |  [optional]




