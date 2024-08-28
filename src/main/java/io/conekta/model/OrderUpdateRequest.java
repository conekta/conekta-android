package io.conekta.model;

import io.conekta.model.ChargeRequest;
import io.conekta.model.CheckoutRequest;
import io.conekta.model.CustomerShippingContacts;
import io.conekta.model.OrderDiscountLinesRequest;
import io.conekta.model.OrderTaxRequest;
import io.conekta.model.OrderUpdateFiscalEntityRequest;
import io.conekta.model.OrderUpdateRequestCustomerInfo;
import io.conekta.model.Product;
import io.conekta.model.ShippingRequest;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * a order
 **/
@ApiModel(description = "a order")
public class OrderUpdateRequest  {
  
  @SerializedName("charges")
  private List<ChargeRequest> charges = null;
  @SerializedName("checkout")
  private CheckoutRequest checkout = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("customer_info")
  private OrderUpdateRequestCustomerInfo customerInfo = null;
  @SerializedName("discount_lines")
  private List<OrderDiscountLinesRequest> discountLines = null;
  @SerializedName("fiscal_entity")
  private OrderUpdateFiscalEntityRequest fiscalEntity = null;
  @SerializedName("line_items")
  private List<Product> lineItems = null;
  @SerializedName("metadata")
  private Map<String, String> metadata = null;
  @SerializedName("pre_authorize")
  private Boolean preAuthorize = false;
  @SerializedName("shipping_contact")
  private CustomerShippingContacts shippingContact = null;
  @SerializedName("shipping_lines")
  private List<ShippingRequest> shippingLines = null;
  @SerializedName("tax_lines")
  private List<OrderTaxRequest> taxLines = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ChargeRequest> getCharges() {
    return charges;
  }
  public void setCharges(List<ChargeRequest> charges) {
    this.charges = charges;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CheckoutRequest getCheckout() {
    return checkout;
  }
  public void setCheckout(CheckoutRequest checkout) {
    this.checkout = checkout;
  }

  /**
   * Currency with which the payment will be made. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217)
   **/
  @ApiModelProperty(value = "Currency with which the payment will be made. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217)")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrderUpdateRequestCustomerInfo getCustomerInfo() {
    return customerInfo;
  }
  public void setCustomerInfo(OrderUpdateRequestCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }

  /**
   * List of [discounts](https://developers.conekta.com/v2.1.0/reference/orderscreatediscountline) that are applied to the order. You must have at least one discount.
   **/
  @ApiModelProperty(value = "List of [discounts](https://developers.conekta.com/v2.1.0/reference/orderscreatediscountline) that are applied to the order. You must have at least one discount.")
  public List<OrderDiscountLinesRequest> getDiscountLines() {
    return discountLines;
  }
  public void setDiscountLines(List<OrderDiscountLinesRequest> discountLines) {
    this.discountLines = discountLines;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrderUpdateFiscalEntityRequest getFiscalEntity() {
    return fiscalEntity;
  }
  public void setFiscalEntity(OrderUpdateFiscalEntityRequest fiscalEntity) {
    this.fiscalEntity = fiscalEntity;
  }

  /**
   * List of [products](https://developers.conekta.com/v2.1.0/reference/orderscreateproduct) that are sold in the order. You must have at least one product.
   **/
  @ApiModelProperty(value = "List of [products](https://developers.conekta.com/v2.1.0/reference/orderscreateproduct) that are sold in the order. You must have at least one product.")
  public List<Product> getLineItems() {
    return lineItems;
  }
  public void setLineItems(List<Product> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  /**
   * Indicates whether the order charges must be preauthorized
   **/
  @ApiModelProperty(value = "Indicates whether the order charges must be preauthorized")
  public Boolean getPreAuthorize() {
    return preAuthorize;
  }
  public void setPreAuthorize(Boolean preAuthorize) {
    this.preAuthorize = preAuthorize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CustomerShippingContacts getShippingContact() {
    return shippingContact;
  }
  public void setShippingContact(CustomerShippingContacts shippingContact) {
    this.shippingContact = shippingContact;
  }

  /**
   * List of [shipping costs](https://developers.conekta.com/v2.1.0/reference/orderscreateshipping). If the online store offers digital products.
   **/
  @ApiModelProperty(value = "List of [shipping costs](https://developers.conekta.com/v2.1.0/reference/orderscreateshipping). If the online store offers digital products.")
  public List<ShippingRequest> getShippingLines() {
    return shippingLines;
  }
  public void setShippingLines(List<ShippingRequest> shippingLines) {
    this.shippingLines = shippingLines;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<OrderTaxRequest> getTaxLines() {
    return taxLines;
  }
  public void setTaxLines(List<OrderTaxRequest> taxLines) {
    this.taxLines = taxLines;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderUpdateRequest orderUpdateRequest = (OrderUpdateRequest) o;
    return (this.charges == null ? orderUpdateRequest.charges == null : this.charges.equals(orderUpdateRequest.charges)) &&
        (this.checkout == null ? orderUpdateRequest.checkout == null : this.checkout.equals(orderUpdateRequest.checkout)) &&
        (this.currency == null ? orderUpdateRequest.currency == null : this.currency.equals(orderUpdateRequest.currency)) &&
        (this.customerInfo == null ? orderUpdateRequest.customerInfo == null : this.customerInfo.equals(orderUpdateRequest.customerInfo)) &&
        (this.discountLines == null ? orderUpdateRequest.discountLines == null : this.discountLines.equals(orderUpdateRequest.discountLines)) &&
        (this.fiscalEntity == null ? orderUpdateRequest.fiscalEntity == null : this.fiscalEntity.equals(orderUpdateRequest.fiscalEntity)) &&
        (this.lineItems == null ? orderUpdateRequest.lineItems == null : this.lineItems.equals(orderUpdateRequest.lineItems)) &&
        (this.metadata == null ? orderUpdateRequest.metadata == null : this.metadata.equals(orderUpdateRequest.metadata)) &&
        (this.preAuthorize == null ? orderUpdateRequest.preAuthorize == null : this.preAuthorize.equals(orderUpdateRequest.preAuthorize)) &&
        (this.shippingContact == null ? orderUpdateRequest.shippingContact == null : this.shippingContact.equals(orderUpdateRequest.shippingContact)) &&
        (this.shippingLines == null ? orderUpdateRequest.shippingLines == null : this.shippingLines.equals(orderUpdateRequest.shippingLines)) &&
        (this.taxLines == null ? orderUpdateRequest.taxLines == null : this.taxLines.equals(orderUpdateRequest.taxLines));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.charges == null ? 0: this.charges.hashCode());
    result = 31 * result + (this.checkout == null ? 0: this.checkout.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.customerInfo == null ? 0: this.customerInfo.hashCode());
    result = 31 * result + (this.discountLines == null ? 0: this.discountLines.hashCode());
    result = 31 * result + (this.fiscalEntity == null ? 0: this.fiscalEntity.hashCode());
    result = 31 * result + (this.lineItems == null ? 0: this.lineItems.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this.preAuthorize == null ? 0: this.preAuthorize.hashCode());
    result = 31 * result + (this.shippingContact == null ? 0: this.shippingContact.hashCode());
    result = 31 * result + (this.shippingLines == null ? 0: this.shippingLines.hashCode());
    result = 31 * result + (this.taxLines == null ? 0: this.taxLines.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderUpdateRequest {\n");
    
    sb.append("  charges: ").append(charges).append("\n");
    sb.append("  checkout: ").append(checkout).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  customerInfo: ").append(customerInfo).append("\n");
    sb.append("  discountLines: ").append(discountLines).append("\n");
    sb.append("  fiscalEntity: ").append(fiscalEntity).append("\n");
    sb.append("  lineItems: ").append(lineItems).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  preAuthorize: ").append(preAuthorize).append("\n");
    sb.append("  shippingContact: ").append(shippingContact).append("\n");
    sb.append("  shippingLines: ").append(shippingLines).append("\n");
    sb.append("  taxLines: ").append(taxLines).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
