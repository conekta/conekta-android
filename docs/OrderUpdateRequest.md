

# OrderUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**charges** | [**List&lt;ChargeRequest&gt;**](ChargeRequest.md) |  |  [optional]
**checkout** | [**CheckoutRequest**](CheckoutRequest.md) |  |  [optional]
**currency** | **String** | Currency with which the payment will be made. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217) |  [optional]
**customerInfo** | [**OrderUpdateRequestCustomerInfo**](OrderUpdateRequestCustomerInfo.md) |  |  [optional]
**discountLines** | [**List&lt;OrderDiscountLinesRequest&gt;**](OrderDiscountLinesRequest.md) | List of [discounts](https://developers.conekta.com/v2.1.0/reference/orderscreatediscountline) that are applied to the order. You must have at least one discount. |  [optional]
**fiscalEntity** | [**OrderUpdateFiscalEntityRequest**](OrderUpdateFiscalEntityRequest.md) |  |  [optional]
**lineItems** | [**List&lt;Product&gt;**](Product.md) | List of [products](https://developers.conekta.com/v2.1.0/reference/orderscreateproduct) that are sold in the order. You must have at least one product. |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**preAuthorize** | **Boolean** | Indicates whether the order charges must be preauthorized |  [optional]
**shippingContact** | [**CustomerShippingContacts**](CustomerShippingContacts.md) |  |  [optional]
**shippingLines** | [**List&lt;ShippingRequest&gt;**](ShippingRequest.md) | List of [shipping costs](https://developers.conekta.com/v2.1.0/reference/orderscreateshipping). If the online store offers digital products. |  [optional]
**taxLines** | [**List&lt;OrderTaxRequest&gt;**](OrderTaxRequest.md) |  |  [optional]




