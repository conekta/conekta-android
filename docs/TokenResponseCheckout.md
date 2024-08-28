

# TokenResponseCheckout

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedPaymentMethods** | **List&lt;String&gt;** |  |  [optional]
**canNotExpire** | **Boolean** | Indicates if the checkout can not expire. |  [optional]
**emailsSent** | **Integer** |  |  [optional]
**excludeCardNetworks** | **List&lt;String&gt;** |  |  [optional]
**expiresAt** | **Long** | Date and time when the checkout expires. |  [optional]
**failureUrl** | **String** | URL to redirect the customer to if the payment process fails. |  [optional]
**force3dsFlow** | **Boolean** | Indicates if the checkout forces the 3DS flow. |  [optional]
**id** | **String** |  |  [optional]
**livemode** | **Boolean** |  |  [optional]
**metadata** | [**Map&lt;String, OasAnyTypeNotMapped&gt;**](OasAnyTypeNotMapped.md) |  |  [optional]
**monthlyInstallmentsEnabled** | **Boolean** | Indicates if the checkout allows monthly installments. |  [optional]
**monthlyInstallmentsOptions** | **List&lt;Integer&gt;** | List of monthly installments options. |  [optional]
**name** | **String** |  |  [optional]
**needsShippingContact** | **Boolean** |  |  [optional]
**_object** | **String** | Indicates the type of object, in this case checkout. |  [optional]
**onDemandEnabled** | **Boolean** | Indicates if the checkout allows on demand payments. |  [optional]
**paidPaymentsCount** | **Integer** | Number of payments that have been paid. |  [optional]
**recurrent** | **Boolean** | Indicates if the checkout is recurrent. |  [optional]
**smsSent** | **Integer** |  |  [optional]
**startsAt** | **Long** | Date and time when the checkout starts. |  [optional]
**status** | **String** | Status of the checkout. |  [optional]
**successUrl** | **String** | URL to redirect the customer to after the payment process is completed. |  [optional]
**type** | **String** | Type of checkout. |  [optional]




