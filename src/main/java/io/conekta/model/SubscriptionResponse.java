package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * subscription model
 **/
@ApiModel(description = "subscription model")
public class SubscriptionResponse  {

  private static final String MXN = "MXN";

  @SerializedName("billing_cycle_start")
  private Long billingCycleStart = null;
  @SerializedName("billing_cycle_end")
  private Long billingCycleEnd = null;
  @SerializedName("canceled_at")
  private Long canceledAt = null;
  @SerializedName("canceled_reason")
  private String canceledReason = null;
  @SerializedName("card_id")
  private String cardId = null;
  @SerializedName("charge_id")
  private String chargeId = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("customer_custom_reference")
  private String customerCustomReference = null;
  @SerializedName("customer_id")
  private String customerId = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("last_billing_cycle_order_id")
  private String lastBillingCycleOrderId = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("paused_at")
  private Long pausedAt = null;
  @SerializedName("plan_id")
  private String planId = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("subscription_start")
  private Integer subscriptionStart = null;
  @SerializedName("trial_start")
  private Long trialStart = null;
  @SerializedName("trial_end")
  private Long trialEnd = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Long getBillingCycleStart() {
    return billingCycleStart;
  }

  public void setBillingCycleStart(Long billingCycleStart) {
    this.billingCycleStart = billingCycleStart;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Long getBillingCycleEnd() {
    return billingCycleEnd;
  }

  public void setBillingCycleEnd(Long billingCycleEnd) {
    this.billingCycleEnd = billingCycleEnd;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Long getCanceledAt() {
    return canceledAt;
  }

  public void setCanceledAt(Long canceledAt) {
    this.canceledAt = canceledAt;
  }
  /**
   * Reason for cancellation. This field appears when the subscription status is 'canceled'.
   * 
   **/
  @ApiModelProperty(value = "Reason for cancellation. This field appears when the subscription status is 'canceled'.")
  public String getCanceledReason() {
    return canceledReason;
  }

  public void setCanceledReason(String canceledReason) {
    this.canceledReason = canceledReason;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getChargeId() {
    return chargeId;
  }

  public void setChargeId(String chargeId) {
    this.chargeId = chargeId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCustomerCustomReference() {
    return customerCustomReference;
  }

  public void setCustomerCustomReference(String customerCustomReference) {
    this.customerCustomReference = customerCustomReference;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getLastBillingCycleOrderId() {
    return lastBillingCycleOrderId;
  }

  public void setLastBillingCycleOrderId(String lastBillingCycleOrderId) {
    this.lastBillingCycleOrderId = lastBillingCycleOrderId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Long getPausedAt() {
    return pausedAt;
  }

  public void setPausedAt(Long pausedAt) {
    this.pausedAt = pausedAt;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getSubscriptionStart() {
    return subscriptionStart;
  }

  public void setSubscriptionStart(Integer subscriptionStart) {
    this.subscriptionStart = subscriptionStart;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Long getTrialStart() {
    return trialStart;
  }

  public void setTrialStart(Long trialStart) {
    this.trialStart = trialStart;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Long getTrialEnd() {
    return trialEnd;
  }

  public void setTrialEnd(Long trialEnd) {
    this.trialEnd = trialEnd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionResponse subscriptionResponse = (SubscriptionResponse) o;
    return (this.billingCycleStart == null ? subscriptionResponse.billingCycleStart == null : this.billingCycleStart.equals(subscriptionResponse.billingCycleStart)) &&
        (this.billingCycleEnd == null ? subscriptionResponse.billingCycleEnd == null : this.billingCycleEnd.equals(subscriptionResponse.billingCycleEnd)) &&
        (this.canceledAt == null ? subscriptionResponse.canceledAt == null : this.canceledAt.equals(subscriptionResponse.canceledAt)) &&
        (this.canceledReason == null ? subscriptionResponse.canceledReason == null : this.canceledReason.equals(subscriptionResponse.canceledReason)) &&
        (this.cardId == null ? subscriptionResponse.cardId == null : this.cardId.equals(subscriptionResponse.cardId)) &&
        (this.chargeId == null ? subscriptionResponse.chargeId == null : this.chargeId.equals(subscriptionResponse.chargeId)) &&
        (this.createdAt == null ? subscriptionResponse.createdAt == null : this.createdAt.equals(subscriptionResponse.createdAt)) &&
        (this.customerCustomReference == null ? subscriptionResponse.customerCustomReference == null : this.customerCustomReference.equals(subscriptionResponse.customerCustomReference)) &&
        (this.customerId == null ? subscriptionResponse.customerId == null : this.customerId.equals(subscriptionResponse.customerId)) &&
        (this.id == null ? subscriptionResponse.id == null : this.id.equals(subscriptionResponse.id)) &&
        (this.lastBillingCycleOrderId == null ? subscriptionResponse.lastBillingCycleOrderId == null : this.lastBillingCycleOrderId.equals(subscriptionResponse.lastBillingCycleOrderId)) &&
        (this._object == null ? subscriptionResponse._object == null : this._object.equals(subscriptionResponse._object)) &&
        (this.pausedAt == null ? subscriptionResponse.pausedAt == null : this.pausedAt.equals(subscriptionResponse.pausedAt)) &&
        (this.planId == null ? subscriptionResponse.planId == null : this.planId.equals(subscriptionResponse.planId)) &&
        (this.status == null ? subscriptionResponse.status == null : this.status.equals(subscriptionResponse.status)) &&
        (this.subscriptionStart == null ? subscriptionResponse.subscriptionStart == null : this.subscriptionStart.equals(subscriptionResponse.subscriptionStart)) &&
        (this.trialStart == null ? subscriptionResponse.trialStart == null : this.trialStart.equals(subscriptionResponse.trialStart)) &&
        (this.trialEnd == null ? subscriptionResponse.trialEnd == null : this.trialEnd.equals(subscriptionResponse.trialEnd));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.billingCycleStart == null ? 0 : this.billingCycleStart.hashCode());
    result = 31 * result + (this.billingCycleEnd == null ? 0 : this.billingCycleEnd.hashCode());
    result = 31 * result + (this.canceledAt == null ? 0 : this.canceledAt.hashCode());
    result = 31 * result + (this.canceledReason == null ? 0 : this.canceledReason.hashCode());
    result = 31 * result + (this.cardId == null ? 0 : this.cardId.hashCode());
    result = 31 * result + (this.chargeId == null ? 0 : this.chargeId.hashCode());
    result = 31 * result + (this.createdAt == null ? 0 : this.createdAt.hashCode());
    result = 31 * result + (this.customerCustomReference == null ? 0 : this.customerCustomReference.hashCode());
    result = 31 * result + (this.customerId == null ? 0 : this.customerId.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this.lastBillingCycleOrderId == null ? 0 : this.lastBillingCycleOrderId.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.pausedAt == null ? 0 : this.pausedAt.hashCode());
    result = 31 * result + (this.planId == null ? 0 : this.planId.hashCode());
    result = 31 * result + (this.status == null ? 0 : this.status.hashCode());
    result = 31 * result + (this.subscriptionStart == null ? 0 : this.subscriptionStart.hashCode());
    result = 31 * result + (this.trialStart == null ? 0 : this.trialStart.hashCode());
    result = 31 * result + (this.trialEnd == null ? 0 : this.trialEnd.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResponse {\n");
    
    sb.append("  billingCycleStart: ").append(billingCycleStart).append("\n");
sb.append("  billingCycleEnd: ").append(billingCycleEnd).append("\n");
sb.append("  canceledAt: ").append(canceledAt).append("\n");
sb.append("  canceledReason: ").append(canceledReason).append("\n");
sb.append("  cardId: ").append(cardId).append("\n");
sb.append("  chargeId: ").append(chargeId).append("\n");
sb.append("  createdAt: ").append(createdAt).append("\n");
sb.append("  customerCustomReference: ").append(customerCustomReference).append("\n");
sb.append("  customerId: ").append(customerId).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  lastBillingCycleOrderId: ").append(lastBillingCycleOrderId).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  pausedAt: ").append(pausedAt).append("\n");
sb.append("  planId: ").append(planId).append("\n");
sb.append("  status: ").append(status).append("\n");
sb.append("  subscriptionStart: ").append(subscriptionStart).append("\n");
sb.append("  trialStart: ").append(trialStart).append("\n");
sb.append("  trialEnd: ").append(trialEnd).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
