package io.conekta.model;

import io.conekta.model.CheckoutOrderTemplateCustomerInfo;
import io.conekta.model.OasAnyTypeNotMapped;
import io.conekta.model.Product;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


/**
 * It maintains the attributes with which the order will be created when receiving a new payment.
 **/
@ApiModel(description = "It maintains the attributes with which the order will be created when receiving a new payment.")
public class CheckoutOrderTemplate  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("customer_info")
  private CheckoutOrderTemplateCustomerInfo customerInfo = null;
  @SerializedName("line_items")
  private List<Product> lineItems = null;
  @SerializedName("metadata")
  private Map<String, OasAnyTypeNotMapped> metadata = null;

  /**
   * It is the currency in which the order will be created. It must be a valid ISO 4217 currency code.
   **/
  @ApiModelProperty(required = true, value = "It is the currency in which the order will be created. It must be a valid ISO 4217 currency code.")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CheckoutOrderTemplateCustomerInfo getCustomerInfo() {
    return customerInfo;
  }
  public void setCustomerInfo(CheckoutOrderTemplateCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }

  /**
   * They are the products to buy. Each contains the \"unit price\" and \"quantity\" parameters that are used to calculate the total amount of the order.
   **/
  @ApiModelProperty(required = true, value = "They are the products to buy. Each contains the \"unit price\" and \"quantity\" parameters that are used to calculate the total amount of the order.")
  public List<Product> getLineItems() {
    return lineItems;
  }
  public void setLineItems(List<Product> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * It is a set of key-value pairs that you can attach to the order. It can be used to store additional information about the order in a structured format.
   **/
  @ApiModelProperty(value = "It is a set of key-value pairs that you can attach to the order. It can be used to store additional information about the order in a structured format.")
  public Map<String, OasAnyTypeNotMapped> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, OasAnyTypeNotMapped> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutOrderTemplate checkoutOrderTemplate = (CheckoutOrderTemplate) o;
    return (this.currency == null ? checkoutOrderTemplate.currency == null : this.currency.equals(checkoutOrderTemplate.currency)) &&
        (this.customerInfo == null ? checkoutOrderTemplate.customerInfo == null : this.customerInfo.equals(checkoutOrderTemplate.customerInfo)) &&
        (this.lineItems == null ? checkoutOrderTemplate.lineItems == null : this.lineItems.equals(checkoutOrderTemplate.lineItems)) &&
        (this.metadata == null ? checkoutOrderTemplate.metadata == null : this.metadata.equals(checkoutOrderTemplate.metadata));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.customerInfo == null ? 0: this.customerInfo.hashCode());
    result = 31 * result + (this.lineItems == null ? 0: this.lineItems.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutOrderTemplate {\n");
    
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  customerInfo: ").append(customerInfo).append("\n");
    sb.append("  lineItems: ").append(lineItems).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
