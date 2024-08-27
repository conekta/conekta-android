
# OrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **kotlin.Int** | The total amount to be collected in cents |  [optional]
**amountRefunded** | **kotlin.Int** | The total amount refunded in cents |  [optional]
**channel** | [**ChargeResponseChannel**](ChargeResponseChannel.md) |  |  [optional]
**charges** | [**OrderResponseCharges**](OrderResponseCharges.md) |  |  [optional]
**checkout** | [**OrderResponseCheckout**](OrderResponseCheckout.md) |  |  [optional]
**createdAt** | **kotlin.Long** | The time at which the object was created in seconds since the Unix epoch |  [optional]
**currency** | **kotlin.String** | The three-letter ISO 4217 currency code. The currency of the order. |  [optional]
**customerInfo** | [**OrderResponseCustomerInfo**](OrderResponseCustomerInfo.md) |  |  [optional]
**discountLines** | [**OrderResponseDiscountLines**](OrderResponseDiscountLines.md) |  |  [optional]
**fiscalEntity** | [**OrderFiscalEntityResponse**](OrderFiscalEntityResponse.md) |  |  [optional]
**id** | **kotlin.String** |  |  [optional]
**isRefundable** | **kotlin.Boolean** |  |  [optional]
**lineItems** | [**OrderResponseProducts**](OrderResponseProducts.md) |  |  [optional]
**livemode** | **kotlin.Boolean** | Whether the object exists in live mode or test mode |  [optional]
**metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional]
**nextAction** | [**OrderNextActionResponse**](OrderNextActionResponse.md) |  |  [optional]
**&#x60;object&#x60;** | **kotlin.String** | String representing the object’s type. Objects of the same type share the same value. |  [optional]
**paymentStatus** | **kotlin.String** | The payment status of the order. |  [optional]
**processingMode** | **kotlin.String** | Indicates the processing mode for the order, either ecommerce, recurrent or validation. |  [optional]
**shippingContact** | [**OrderResponseShippingContact**](OrderResponseShippingContact.md) |  |  [optional]
**updatedAt** | **kotlin.Long** | The time at which the object was last updated in seconds since the Unix epoch |  [optional]



