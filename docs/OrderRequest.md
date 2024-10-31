

# OrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**charges** | [**List&lt;ChargeRequest&gt;**](ChargeRequest.md) | List of [charges](https://developers.conekta.com/v2.1.0/reference/orderscreatecharge) that are applied to the order |  [optional]
**checkout** | [**CheckoutRequest**](CheckoutRequest.md) |  |  [optional]
**currency** | **String** | Currency with which the payment will be made. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217) | 
**customerInfo** | [**OrderRequestCustomerInfo**](OrderRequestCustomerInfo.md) |  | 
**discountLines** | [**List&lt;OrderDiscountLinesRequest&gt;**](OrderDiscountLinesRequest.md) | List of [discounts](https://developers.conekta.com/v2.1.0/reference/orderscreatediscountline) that are applied to the order. You must have at least one discount. |  [optional]
**fiscalEntity** | [**OrderFiscalEntityRequest**](OrderFiscalEntityRequest.md) |  |  [optional]
**lineItems** | [**List&lt;Product&gt;**](Product.md) | List of [products](https://developers.conekta.com/v2.1.0/reference/orderscreateproduct) that are sold in the order. You must have at least one product. | 
**metadata** | [**Map&lt;String, OasAnyTypeNotMapped&gt;**](OasAnyTypeNotMapped.md) | Metadata associated with the order |  [optional]
**needsShippingContact** | **Boolean** | Allows you to fill out the shipping information at checkout |  [optional]
**preAuthorize** | **Boolean** | Indicates whether the order charges must be preauthorized |  [optional]
**processingMode** | **String** | Indicates the processing mode for the order, either ecommerce, recurrent or validation. |  [optional]
**returnUrl** | [**URI**](URI.md) | Indicates the redirection callback upon completion of the 3DS2 flow. Do not use this parameter if your order has a checkout parameter |  [optional]
**shippingContact** | [**CustomerShippingContacts**](CustomerShippingContacts.md) |  |  [optional]
**shippingLines** | [**List&lt;ShippingRequest&gt;**](ShippingRequest.md) | List of [shipping costs](https://developers.conekta.com/v2.1.0/reference/orderscreateshipping). If the online store offers digital products. |  [optional]
**taxLines** | [**List&lt;OrderTaxRequest&gt;**](OrderTaxRequest.md) | List of [taxes](https://developers.conekta.com/v2.1.0/reference/orderscreatetaxes) that are applied to the order. |  [optional]
**threeDsMode** | **String** | Indicates the 3DS2 mode for the order, either smart or strict. |  [optional]




