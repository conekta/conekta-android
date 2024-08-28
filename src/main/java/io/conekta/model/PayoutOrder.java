package io.conekta.model;

import io.conekta.model.CustomerInfoJustCustomerId;
import io.conekta.model.OasAnyTypeNotMapped;
import io.conekta.model.Payout;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * a payout order
 **/
@ApiModel(description = "a payout order")
public class PayoutOrder  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("allowed_payout_methods")
  private List<String> allowedPayoutMethods = null;
  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("currency")
  private String currency = MXN;
  @SerializedName("customer_info")
  private CustomerInfoJustCustomerId customerInfo = null;
  @SerializedName("metadata")
  private Map<String, OasAnyTypeNotMapped> metadata = null;
  @SerializedName("payout")
  private Payout payout = null;
  @SerializedName("reason")
  private String reason = null;

  /**
   * The payout methods that are allowed for the payout order.
   **/
  @ApiModelProperty(required = true, value = "The payout methods that are allowed for the payout order.")
  public List<String> getAllowedPayoutMethods() {
    return allowedPayoutMethods;
  }
  public void setAllowedPayoutMethods(List<String> allowedPayoutMethods) {
    this.allowedPayoutMethods = allowedPayoutMethods;
  }

  /**
   * The amount of the payout order.
   **/
  @ApiModelProperty(required = true, value = "The amount of the payout order.")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  /**
   * The currency in which the payout order is made.
   **/
  @ApiModelProperty(required = true, value = "The currency in which the payout order is made.")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CustomerInfoJustCustomerId getCustomerInfo() {
    return customerInfo;
  }
  public void setCustomerInfo(CustomerInfoJustCustomerId customerInfo) {
    this.customerInfo = customerInfo;
  }

  /**
   * The metadata of the payout order.
   **/
  @ApiModelProperty(value = "The metadata of the payout order.")
  public Map<String, OasAnyTypeNotMapped> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, OasAnyTypeNotMapped> metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Payout getPayout() {
    return payout;
  }
  public void setPayout(Payout payout) {
    this.payout = payout;
  }

  /**
   * The reason for the payout order.
   **/
  @ApiModelProperty(required = true, value = "The reason for the payout order.")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutOrder payoutOrder = (PayoutOrder) o;
    return (this.allowedPayoutMethods == null ? payoutOrder.allowedPayoutMethods == null : this.allowedPayoutMethods.equals(payoutOrder.allowedPayoutMethods)) &&
        (this.amount == null ? payoutOrder.amount == null : this.amount.equals(payoutOrder.amount)) &&
        (this.currency == null ? payoutOrder.currency == null : this.currency.equals(payoutOrder.currency)) &&
        (this.customerInfo == null ? payoutOrder.customerInfo == null : this.customerInfo.equals(payoutOrder.customerInfo)) &&
        (this.metadata == null ? payoutOrder.metadata == null : this.metadata.equals(payoutOrder.metadata)) &&
        (this.payout == null ? payoutOrder.payout == null : this.payout.equals(payoutOrder.payout)) &&
        (this.reason == null ? payoutOrder.reason == null : this.reason.equals(payoutOrder.reason));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.allowedPayoutMethods == null ? 0: this.allowedPayoutMethods.hashCode());
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.customerInfo == null ? 0: this.customerInfo.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this.payout == null ? 0: this.payout.hashCode());
    result = 31 * result + (this.reason == null ? 0: this.reason.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutOrder {\n");
    
    sb.append("  allowedPayoutMethods: ").append(allowedPayoutMethods).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  customerInfo: ").append(customerInfo).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  payout: ").append(payout).append("\n");
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
