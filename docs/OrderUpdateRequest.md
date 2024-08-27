
# OrderUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**charges** | [**kotlin.collections.List&lt;ChargeRequest&gt;**](ChargeRequest.md) |  |  [optional]
**checkout** | [**CheckoutRequest**](CheckoutRequest.md) |  |  [optional]
**currency** | **kotlin.String** | Currency with which the payment will be made. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217) |  [optional]
**customerInfo** | [**OrderUpdateRequestCustomerInfo**](OrderUpdateRequestCustomerInfo.md) |  |  [optional]
**discountLines** | [**kotlin.collections.List&lt;OrderDiscountLinesRequest&gt;**](OrderDiscountLinesRequest.md) | List of [discounts](https://developers.conekta.com/v2.1.0/reference/orderscreatediscountline) that are applied to the order. You must have at least one discount. |  [optional]
**fiscalEntity** | [**OrderUpdateFiscalEntityRequest**](OrderUpdateFiscalEntityRequest.md) |  |  [optional]
**lineItems** | [**kotlin.collections.List&lt;Product&gt;**](Product.md) | List of [products](https://developers.conekta.com/v2.1.0/reference/orderscreateproduct) that are sold in the order. You must have at least one product. |  [optional]
**metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional]
**preAuthorize** | **kotlin.Boolean** | Indicates whether the order charges must be preauthorized |  [optional]
**shippingContact** | [**CustomerShippingContacts**](CustomerShippingContacts.md) |  |  [optional]
**shippingLines** | [**kotlin.collections.List&lt;ShippingRequest&gt;**](ShippingRequest.md) | List of [shipping costs](https://developers.conekta.com/v2.1.0/reference/orderscreateshipping). If the online store offers digital products. |  [optional]
**taxLines** | [**kotlin.collections.List&lt;OrderTaxRequest&gt;**](OrderTaxRequest.md) |  |  [optional]



