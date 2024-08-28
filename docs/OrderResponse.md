

# OrderResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Integer** | The total amount to be collected in cents |  [optional]
**amountRefunded** | **Integer** | The total amount refunded in cents |  [optional]
**channel** | [**ChargeResponseChannel**](ChargeResponseChannel.md) |  |  [optional]
**charges** | [**OrderResponseCharges**](OrderResponseCharges.md) |  |  [optional]
**checkout** | [**OrderResponseCheckout**](OrderResponseCheckout.md) |  |  [optional]
**createdAt** | **Long** | The time at which the object was created in seconds since the Unix epoch |  [optional]
**currency** | **String** | The three-letter ISO 4217 currency code. The currency of the order. |  [optional]
**customerInfo** | [**OrderResponseCustomerInfo**](OrderResponseCustomerInfo.md) |  |  [optional]
**discountLines** | [**OrderResponseDiscountLines**](OrderResponseDiscountLines.md) |  |  [optional]
**fiscalEntity** | [**OrderFiscalEntityResponse**](OrderFiscalEntityResponse.md) |  |  [optional]
**id** | **String** |  |  [optional]
**isRefundable** | **Boolean** |  |  [optional]
**lineItems** | [**OrderResponseProducts**](OrderResponseProducts.md) |  |  [optional]
**livemode** | **Boolean** | Whether the object exists in live mode or test mode |  [optional]
**metadata** | [**Map&lt;String, OasAnyTypeNotMapped&gt;**](OasAnyTypeNotMapped.md) | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional]
**nextAction** | [**OrderNextActionResponse**](OrderNextActionResponse.md) |  |  [optional]
**_object** | **String** | String representing the object’s type. Objects of the same type share the same value. |  [optional]
**paymentStatus** | **String** | The payment status of the order. |  [optional]
**processingMode** | **String** | Indicates the processing mode for the order, either ecommerce, recurrent or validation. |  [optional]
**shippingContact** | [**OrderResponseShippingContact**](OrderResponseShippingContact.md) |  |  [optional]
**updatedAt** | **Long** | The time at which the object was last updated in seconds since the Unix epoch |  [optional]




