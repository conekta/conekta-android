
# TokenResponseCheckout

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedPaymentMethods** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**canNotExpire** | **kotlin.Boolean** | Indicates if the checkout can not expire. |  [optional]
**emailsSent** | **kotlin.Int** |  |  [optional]
**excludeCardNetworks** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**expiresAt** | **kotlin.Long** | Date and time when the checkout expires. |  [optional]
**failureUrl** | **kotlin.String** | URL to redirect the customer to if the payment process fails. |  [optional]
**force3dsFlow** | **kotlin.Boolean** | Indicates if the checkout forces the 3DS flow. |  [optional]
**id** | **kotlin.String** |  |  [optional]
**livemode** | **kotlin.Boolean** |  |  [optional]
**metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**monthlyInstallmentsEnabled** | **kotlin.Boolean** | Indicates if the checkout allows monthly installments. |  [optional]
**monthlyInstallmentsOptions** | **kotlin.collections.List&lt;kotlin.Int&gt;** | List of monthly installments options. |  [optional]
**name** | **kotlin.String** |  |  [optional]
**needsShippingContact** | **kotlin.Boolean** |  |  [optional]
**&#x60;object&#x60;** | **kotlin.String** | Indicates the type of object, in this case checkout. |  [optional]
**onDemandEnabled** | **kotlin.Boolean** | Indicates if the checkout allows on demand payments. |  [optional]
**paidPaymentsCount** | **kotlin.Int** | Number of payments that have been paid. |  [optional]
**recurrent** | **kotlin.Boolean** | Indicates if the checkout is recurrent. |  [optional]
**smsSent** | **kotlin.Int** |  |  [optional]
**startsAt** | **kotlin.Long** | Date and time when the checkout starts. |  [optional]
**status** | **kotlin.String** | Status of the checkout. |  [optional]
**successUrl** | **kotlin.String** | URL to redirect the customer to after the payment process is completed. |  [optional]
**type** | **kotlin.String** | Type of checkout. |  [optional]



