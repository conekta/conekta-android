
# OrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **kotlin.String** | Currency with which the payment will be made. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217) | 
**customerInfo** | [**OrderRequestCustomerInfo**](OrderRequestCustomerInfo.md) |  | 
**lineItems** | [**kotlin.collections.List&lt;Product&gt;**](Product.md) | List of [products](https://developers.conekta.com/v2.1.0/reference/orderscreateproduct) that are sold in the order. You must have at least one product. | 
**charges** | [**kotlin.collections.List&lt;ChargeRequest&gt;**](ChargeRequest.md) | List of [charges](https://developers.conekta.com/v2.1.0/reference/orderscreatecharge) that are applied to the order |  [optional]
**checkout** | [**CheckoutRequest**](CheckoutRequest.md) |  |  [optional]
**discountLines** | [**kotlin.collections.List&lt;OrderDiscountLinesRequest&gt;**](OrderDiscountLinesRequest.md) | List of [discounts](https://developers.conekta.com/v2.1.0/reference/orderscreatediscountline) that are applied to the order. You must have at least one discount. |  [optional]
**fiscalEntity** | [**OrderFiscalEntityRequest**](OrderFiscalEntityRequest.md) |  |  [optional]
**metadata** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Metadata associated with the order |  [optional]
**needsShippingContact** | **kotlin.Boolean** | Allows you to fill out the shipping information at checkout |  [optional]
**preAuthorize** | **kotlin.Boolean** | Indicates whether the order charges must be preauthorized |  [optional]
**processingMode** | **kotlin.String** | Indicates the processing mode for the order, either ecommerce, recurrent or validation. |  [optional]
**returnUrl** | [**java.net.URI**](java.net.URI.md) | Indicates the redirection callback upon completion of the 3DS2 flow. |  [optional]
**shippingContact** | [**CustomerShippingContacts**](CustomerShippingContacts.md) |  |  [optional]
**shippingLines** | [**kotlin.collections.List&lt;ShippingRequest&gt;**](ShippingRequest.md) | List of [shipping costs](https://developers.conekta.com/v2.1.0/reference/orderscreateshipping). If the online store offers digital products. |  [optional]
**taxLines** | [**kotlin.collections.List&lt;OrderTaxRequest&gt;**](OrderTaxRequest.md) | List of [taxes](https://developers.conekta.com/v2.1.0/reference/orderscreatetaxes) that are applied to the order. |  [optional]
**threeDsMode** | **kotlin.String** | Indicates the 3DS2 mode for the order, either smart or strict. |  [optional]


