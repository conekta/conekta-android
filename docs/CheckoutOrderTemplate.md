
# CheckoutOrderTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **kotlin.String** | It is the currency in which the order will be created. It must be a valid ISO 4217 currency code. | 
**lineItems** | [**kotlin.collections.List&lt;Product&gt;**](Product.md) | They are the products to buy. Each contains the \&quot;unit price\&quot; and \&quot;quantity\&quot; parameters that are used to calculate the total amount of the order. | 
**customerInfo** | [**CheckoutOrderTemplateCustomerInfo**](CheckoutOrderTemplateCustomerInfo.md) |  |  [optional]
**metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | It is a set of key-value pairs that you can attach to the order. It can be used to store additional information about the order in a structured format. |  [optional]



