package io.conekta.model;

import io.conekta.model.PayoutOrderPayoutsItem;
import io.conekta.model.PayoutOrderResponseCustomerInfo;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * payout order model response
 **/
@ApiModel(description = "payout order model response")
public class PayoutOrderResponse  {
  
  @SerializedName("allowed_payout_methods")
  private List<String> allowedPayoutMethods = null;
  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("currency")
  private String currency = "MXN";
  @SerializedName("customer_info")
  private PayoutOrderResponseCustomerInfo customerInfo = null;
  @SerializedName("expires_at")
  private Long expiresAt = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("metadata")
  private Map<String, Object> metadata = null;
  @SerializedName("payouts")
  private List<PayoutOrderPayoutsItem> payouts = null;
  @SerializedName("reason")
  private String reason = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("updated_at")
  private Long updatedAt = null;

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
   * The creation date of the payout order.
   **/
  @ApiModelProperty(required = true, value = "The creation date of the payout order.")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
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
  public PayoutOrderResponseCustomerInfo getCustomerInfo() {
    return customerInfo;
  }
  public void setCustomerInfo(PayoutOrderResponseCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }

  /**
   * The expiration date of the payout order.
   **/
  @ApiModelProperty(value = "The expiration date of the payout order.")
  public Long getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The id of the payout order.
   **/
  @ApiModelProperty(required = true, value = "The id of the payout order.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The live mode of the payout order.
   **/
  @ApiModelProperty(required = true, value = "The live mode of the payout order.")
  public Boolean getLivemode() {
    return livemode;
  }
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  /**
   * The object of the payout order.
   **/
  @ApiModelProperty(required = true, value = "The object of the payout order.")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * The metadata of the payout order.
   **/
  @ApiModelProperty(value = "The metadata of the payout order.")
  public Map<String, Object> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  /**
   * The payout information of the payout order.
   **/
  @ApiModelProperty(required = true, value = "The payout information of the payout order.")
  public List<PayoutOrderPayoutsItem> getPayouts() {
    return payouts;
  }
  public void setPayouts(List<PayoutOrderPayoutsItem> payouts) {
    this.payouts = payouts;
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

  /**
   * The status of the payout order.
   **/
  @ApiModelProperty(value = "The status of the payout order.")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The update date of the payout order.
   **/
  @ApiModelProperty(required = true, value = "The update date of the payout order.")
  public Long getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutOrderResponse payoutOrderResponse = (PayoutOrderResponse) o;
    return (this.allowedPayoutMethods == null ? payoutOrderResponse.allowedPayoutMethods == null : this.allowedPayoutMethods.equals(payoutOrderResponse.allowedPayoutMethods)) &&
        (this.amount == null ? payoutOrderResponse.amount == null : this.amount.equals(payoutOrderResponse.amount)) &&
        (this.createdAt == null ? payoutOrderResponse.createdAt == null : this.createdAt.equals(payoutOrderResponse.createdAt)) &&
        (this.currency == null ? payoutOrderResponse.currency == null : this.currency.equals(payoutOrderResponse.currency)) &&
        (this.customerInfo == null ? payoutOrderResponse.customerInfo == null : this.customerInfo.equals(payoutOrderResponse.customerInfo)) &&
        (this.expiresAt == null ? payoutOrderResponse.expiresAt == null : this.expiresAt.equals(payoutOrderResponse.expiresAt)) &&
        (this.id == null ? payoutOrderResponse.id == null : this.id.equals(payoutOrderResponse.id)) &&
        (this.livemode == null ? payoutOrderResponse.livemode == null : this.livemode.equals(payoutOrderResponse.livemode)) &&
        (this._object == null ? payoutOrderResponse._object == null : this._object.equals(payoutOrderResponse._object)) &&
        (this.metadata == null ? payoutOrderResponse.metadata == null : this.metadata.equals(payoutOrderResponse.metadata)) &&
        (this.payouts == null ? payoutOrderResponse.payouts == null : this.payouts.equals(payoutOrderResponse.payouts)) &&
        (this.reason == null ? payoutOrderResponse.reason == null : this.reason.equals(payoutOrderResponse.reason)) &&
        (this.status == null ? payoutOrderResponse.status == null : this.status.equals(payoutOrderResponse.status)) &&
        (this.updatedAt == null ? payoutOrderResponse.updatedAt == null : this.updatedAt.equals(payoutOrderResponse.updatedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.allowedPayoutMethods == null ? 0: this.allowedPayoutMethods.hashCode());
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.customerInfo == null ? 0: this.customerInfo.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0: this.livemode.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this.payouts == null ? 0: this.payouts.hashCode());
    result = 31 * result + (this.reason == null ? 0: this.reason.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutOrderResponse {\n");
    
    sb.append("  allowedPayoutMethods: ").append(allowedPayoutMethods).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  customerInfo: ").append(customerInfo).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  livemode: ").append(livemode).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  payouts: ").append(payouts).append("\n");
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
