package io.conekta.model;

import io.conekta.model.ChargeRequest;
import io.conekta.model.CheckoutRequest;
import io.conekta.model.CustomerShippingContacts;
import io.conekta.model.OrderDiscountLinesRequest;
import io.conekta.model.OrderFiscalEntityRequest;
import io.conekta.model.OrderRequestCustomerInfo;
import io.conekta.model.OrderTaxRequest;
import io.conekta.model.Product;
import io.conekta.model.ShippingRequest;
import java.net.URI;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * a order
 **/
@ApiModel(description = "a order")
public class OrderRequest  {
  
  @SerializedName("charges")
  private List<ChargeRequest> charges = null;
  @SerializedName("checkout")
  private CheckoutRequest checkout = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("customer_info")
  private OrderRequestCustomerInfo customerInfo = null;
  @SerializedName("discount_lines")
  private List<OrderDiscountLinesRequest> discountLines = null;
  @SerializedName("fiscal_entity")
  private OrderFiscalEntityRequest fiscalEntity = null;
  @SerializedName("line_items")
  private List<Product> lineItems = null;
  @SerializedName("metadata")
  private Map<String, Object> metadata = null;
  @SerializedName("needs_shipping_contact")
  private Boolean needsShippingContact = null;
  @SerializedName("pre_authorize")
  private Boolean preAuthorize = false;
  @SerializedName("processing_mode")
  private String processingMode = null;
  @SerializedName("return_url")
  private URI returnUrl = null;
  @SerializedName("shipping_contact")
  private CustomerShippingContacts shippingContact = null;
  @SerializedName("shipping_lines")
  private List<ShippingRequest> shippingLines = null;
  @SerializedName("tax_lines")
  private List<OrderTaxRequest> taxLines = null;
  @SerializedName("three_ds_mode")
  private String threeDsMode = null;

  /**
   * List of [charges](https://developers.conekta.com/v2.1.0/reference/orderscreatecharge) that are applied to the order
   **/
  @ApiModelProperty(value = "List of [charges](https://developers.conekta.com/v2.1.0/reference/orderscreatecharge) that are applied to the order")
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
  @ApiModelProperty(required = true, value = "Currency with which the payment will be made. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217)")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OrderRequestCustomerInfo getCustomerInfo() {
    return customerInfo;
  }
  public void setCustomerInfo(OrderRequestCustomerInfo customerInfo) {
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
  public OrderFiscalEntityRequest getFiscalEntity() {
    return fiscalEntity;
  }
  public void setFiscalEntity(OrderFiscalEntityRequest fiscalEntity) {
    this.fiscalEntity = fiscalEntity;
  }

  /**
   * List of [products](https://developers.conekta.com/v2.1.0/reference/orderscreateproduct) that are sold in the order. You must have at least one product.
   **/
  @ApiModelProperty(required = true, value = "List of [products](https://developers.conekta.com/v2.1.0/reference/orderscreateproduct) that are sold in the order. You must have at least one product.")
  public List<Product> getLineItems() {
    return lineItems;
  }
  public void setLineItems(List<Product> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * Metadata associated with the order
   **/
  @ApiModelProperty(value = "Metadata associated with the order")
  public Map<String, Object> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  /**
   * Allows you to fill out the shipping information at checkout
   **/
  @ApiModelProperty(value = "Allows you to fill out the shipping information at checkout")
  public Boolean getNeedsShippingContact() {
    return needsShippingContact;
  }
  public void setNeedsShippingContact(Boolean needsShippingContact) {
    this.needsShippingContact = needsShippingContact;
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
   * Indicates the processing mode for the order, either ecommerce, recurrent or validation.
   **/
  @ApiModelProperty(value = "Indicates the processing mode for the order, either ecommerce, recurrent or validation.")
  public String getProcessingMode() {
    return processingMode;
  }
  public void setProcessingMode(String processingMode) {
    this.processingMode = processingMode;
  }

  /**
   * Indicates the redirection callback upon completion of the 3DS2 flow.
   **/
  @ApiModelProperty(value = "Indicates the redirection callback upon completion of the 3DS2 flow.")
  public URI getReturnUrl() {
    return returnUrl;
  }
  public void setReturnUrl(URI returnUrl) {
    this.returnUrl = returnUrl;
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
   * List of [taxes](https://developers.conekta.com/v2.1.0/reference/orderscreatetaxes) that are applied to the order.
   **/
  @ApiModelProperty(value = "List of [taxes](https://developers.conekta.com/v2.1.0/reference/orderscreatetaxes) that are applied to the order.")
  public List<OrderTaxRequest> getTaxLines() {
    return taxLines;
  }
  public void setTaxLines(List<OrderTaxRequest> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * Indicates the 3DS2 mode for the order, either smart or strict.
   **/
  @ApiModelProperty(value = "Indicates the 3DS2 mode for the order, either smart or strict.")
  public String getThreeDsMode() {
    return threeDsMode;
  }
  public void setThreeDsMode(String threeDsMode) {
    this.threeDsMode = threeDsMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRequest orderRequest = (OrderRequest) o;
    return (this.charges == null ? orderRequest.charges == null : this.charges.equals(orderRequest.charges)) &&
        (this.checkout == null ? orderRequest.checkout == null : this.checkout.equals(orderRequest.checkout)) &&
        (this.currency == null ? orderRequest.currency == null : this.currency.equals(orderRequest.currency)) &&
        (this.customerInfo == null ? orderRequest.customerInfo == null : this.customerInfo.equals(orderRequest.customerInfo)) &&
        (this.discountLines == null ? orderRequest.discountLines == null : this.discountLines.equals(orderRequest.discountLines)) &&
        (this.fiscalEntity == null ? orderRequest.fiscalEntity == null : this.fiscalEntity.equals(orderRequest.fiscalEntity)) &&
        (this.lineItems == null ? orderRequest.lineItems == null : this.lineItems.equals(orderRequest.lineItems)) &&
        (this.metadata == null ? orderRequest.metadata == null : this.metadata.equals(orderRequest.metadata)) &&
        (this.needsShippingContact == null ? orderRequest.needsShippingContact == null : this.needsShippingContact.equals(orderRequest.needsShippingContact)) &&
        (this.preAuthorize == null ? orderRequest.preAuthorize == null : this.preAuthorize.equals(orderRequest.preAuthorize)) &&
        (this.processingMode == null ? orderRequest.processingMode == null : this.processingMode.equals(orderRequest.processingMode)) &&
        (this.returnUrl == null ? orderRequest.returnUrl == null : this.returnUrl.equals(orderRequest.returnUrl)) &&
        (this.shippingContact == null ? orderRequest.shippingContact == null : this.shippingContact.equals(orderRequest.shippingContact)) &&
        (this.shippingLines == null ? orderRequest.shippingLines == null : this.shippingLines.equals(orderRequest.shippingLines)) &&
        (this.taxLines == null ? orderRequest.taxLines == null : this.taxLines.equals(orderRequest.taxLines)) &&
        (this.threeDsMode == null ? orderRequest.threeDsMode == null : this.threeDsMode.equals(orderRequest.threeDsMode));
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
    result = 31 * result + (this.needsShippingContact == null ? 0: this.needsShippingContact.hashCode());
    result = 31 * result + (this.preAuthorize == null ? 0: this.preAuthorize.hashCode());
    result = 31 * result + (this.processingMode == null ? 0: this.processingMode.hashCode());
    result = 31 * result + (this.returnUrl == null ? 0: this.returnUrl.hashCode());
    result = 31 * result + (this.shippingContact == null ? 0: this.shippingContact.hashCode());
    result = 31 * result + (this.shippingLines == null ? 0: this.shippingLines.hashCode());
    result = 31 * result + (this.taxLines == null ? 0: this.taxLines.hashCode());
    result = 31 * result + (this.threeDsMode == null ? 0: this.threeDsMode.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRequest {\n");
    
    sb.append("  charges: ").append(charges).append("\n");
    sb.append("  checkout: ").append(checkout).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  customerInfo: ").append(customerInfo).append("\n");
    sb.append("  discountLines: ").append(discountLines).append("\n");
    sb.append("  fiscalEntity: ").append(fiscalEntity).append("\n");
    sb.append("  lineItems: ").append(lineItems).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  needsShippingContact: ").append(needsShippingContact).append("\n");
    sb.append("  preAuthorize: ").append(preAuthorize).append("\n");
    sb.append("  processingMode: ").append(processingMode).append("\n");
    sb.append("  returnUrl: ").append(returnUrl).append("\n");
    sb.append("  shippingContact: ").append(shippingContact).append("\n");
    sb.append("  shippingLines: ").append(shippingLines).append("\n");
    sb.append("  taxLines: ").append(taxLines).append("\n");
    sb.append("  threeDsMode: ").append(threeDsMode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
