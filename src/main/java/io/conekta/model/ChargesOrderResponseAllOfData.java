package io.conekta.model;

import io.conekta.model.ChargeResponseChannel;
import io.conekta.model.ChargeResponsePaymentMethod;
import io.conekta.model.ChargeResponseRefunds;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class ChargesOrderResponseAllOfData  {

  private static final String MXN = "MXN";

  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("channel")
  private ChargeResponseChannel channel = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("customer_id")
  private String customerId = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("device_fingerprint")
  private String deviceFingerprint = null;
  @SerializedName("failure_code")
  private String failureCode = null;
  @SerializedName("failure_message")
  private String failureMessage = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("order_id")
  private String orderId = null;
  @SerializedName("paid_at")
  private Long paidAt = null;
  @SerializedName("payment_method")
  private ChargeResponsePaymentMethod paymentMethod = null;
  @SerializedName("reference_id")
  private String referenceId = null;
  @SerializedName("refunds")
  private ChargeResponseRefunds refunds = null;
  @SerializedName("status")
  private String status = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public ChargeResponseChannel getChannel() {
    return channel;
  }

  public void setChannel(ChargeResponseChannel channel) {
    this.channel = channel;
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
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
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
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getDeviceFingerprint() {
    return deviceFingerprint;
  }

  public void setDeviceFingerprint(String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getFailureCode() {
    return failureCode;
  }

  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getFailureMessage() {
    return failureMessage;
  }

  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }
  /**
   * Charge ID
   * 
   **/
  @ApiModelProperty(value = "Charge ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  /**
   * Whether the charge was made in live mode or not
   * 
   **/
  @ApiModelProperty(value = "Whether the charge was made in live mode or not")
  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
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
   * Order ID
   * 
   **/
  @ApiModelProperty(value = "Order ID")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }
  /**
   * Payment date
   * 
   **/
  @ApiModelProperty(value = "Payment date")
  public Long getPaidAt() {
    return paidAt;
  }

  public void setPaidAt(Long paidAt) {
    this.paidAt = paidAt;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public ChargeResponsePaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(ChargeResponsePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
  /**
   * Reference ID of the charge
   * 
   **/
  @ApiModelProperty(value = "Reference ID of the charge")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public ChargeResponseRefunds getRefunds() {
    return refunds;
  }

  public void setRefunds(ChargeResponseRefunds refunds) {
    this.refunds = refunds;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargesOrderResponseAllOfData chargesOrderResponseAllOfData = (ChargesOrderResponseAllOfData) o;
    return (this.amount == null ? chargesOrderResponseAllOfData.amount == null : this.amount.equals(chargesOrderResponseAllOfData.amount)) &&
        (this.channel == null ? chargesOrderResponseAllOfData.channel == null : this.channel.equals(chargesOrderResponseAllOfData.channel)) &&
        (this.createdAt == null ? chargesOrderResponseAllOfData.createdAt == null : this.createdAt.equals(chargesOrderResponseAllOfData.createdAt)) &&
        (this.currency == null ? chargesOrderResponseAllOfData.currency == null : this.currency.equals(chargesOrderResponseAllOfData.currency)) &&
        (this.customerId == null ? chargesOrderResponseAllOfData.customerId == null : this.customerId.equals(chargesOrderResponseAllOfData.customerId)) &&
        (this.description == null ? chargesOrderResponseAllOfData.description == null : this.description.equals(chargesOrderResponseAllOfData.description)) &&
        (this.deviceFingerprint == null ? chargesOrderResponseAllOfData.deviceFingerprint == null : this.deviceFingerprint.equals(chargesOrderResponseAllOfData.deviceFingerprint)) &&
        (this.failureCode == null ? chargesOrderResponseAllOfData.failureCode == null : this.failureCode.equals(chargesOrderResponseAllOfData.failureCode)) &&
        (this.failureMessage == null ? chargesOrderResponseAllOfData.failureMessage == null : this.failureMessage.equals(chargesOrderResponseAllOfData.failureMessage)) &&
        (this.id == null ? chargesOrderResponseAllOfData.id == null : this.id.equals(chargesOrderResponseAllOfData.id)) &&
        (this.livemode == null ? chargesOrderResponseAllOfData.livemode == null : this.livemode.equals(chargesOrderResponseAllOfData.livemode)) &&
        (this._object == null ? chargesOrderResponseAllOfData._object == null : this._object.equals(chargesOrderResponseAllOfData._object)) &&
        (this.orderId == null ? chargesOrderResponseAllOfData.orderId == null : this.orderId.equals(chargesOrderResponseAllOfData.orderId)) &&
        (this.paidAt == null ? chargesOrderResponseAllOfData.paidAt == null : this.paidAt.equals(chargesOrderResponseAllOfData.paidAt)) &&
        (this.paymentMethod == null ? chargesOrderResponseAllOfData.paymentMethod == null : this.paymentMethod.equals(chargesOrderResponseAllOfData.paymentMethod)) &&
        (this.referenceId == null ? chargesOrderResponseAllOfData.referenceId == null : this.referenceId.equals(chargesOrderResponseAllOfData.referenceId)) &&
        (this.refunds == null ? chargesOrderResponseAllOfData.refunds == null : this.refunds.equals(chargesOrderResponseAllOfData.refunds)) &&
        (this.status == null ? chargesOrderResponseAllOfData.status == null : this.status.equals(chargesOrderResponseAllOfData.status));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0 : this.amount.hashCode());
    result = 31 * result + (this.channel == null ? 0 : this.channel.hashCode());
    result = 31 * result + (this.createdAt == null ? 0 : this.createdAt.hashCode());
    result = 31 * result + (this.currency == null ? 0 : this.currency.hashCode());
    result = 31 * result + (this.customerId == null ? 0 : this.customerId.hashCode());
    result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
    result = 31 * result + (this.deviceFingerprint == null ? 0 : this.deviceFingerprint.hashCode());
    result = 31 * result + (this.failureCode == null ? 0 : this.failureCode.hashCode());
    result = 31 * result + (this.failureMessage == null ? 0 : this.failureMessage.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0 : this.livemode.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.orderId == null ? 0 : this.orderId.hashCode());
    result = 31 * result + (this.paidAt == null ? 0 : this.paidAt.hashCode());
    result = 31 * result + (this.paymentMethod == null ? 0 : this.paymentMethod.hashCode());
    result = 31 * result + (this.referenceId == null ? 0 : this.referenceId.hashCode());
    result = 31 * result + (this.refunds == null ? 0 : this.refunds.hashCode());
    result = 31 * result + (this.status == null ? 0 : this.status.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargesOrderResponseAllOfData {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
sb.append("  channel: ").append(channel).append("\n");
sb.append("  createdAt: ").append(createdAt).append("\n");
sb.append("  currency: ").append(currency).append("\n");
sb.append("  customerId: ").append(customerId).append("\n");
sb.append("  description: ").append(description).append("\n");
sb.append("  deviceFingerprint: ").append(deviceFingerprint).append("\n");
sb.append("  failureCode: ").append(failureCode).append("\n");
sb.append("  failureMessage: ").append(failureMessage).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  livemode: ").append(livemode).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  orderId: ").append(orderId).append("\n");
sb.append("  paidAt: ").append(paidAt).append("\n");
sb.append("  paymentMethod: ").append(paymentMethod).append("\n");
sb.append("  referenceId: ").append(referenceId).append("\n");
sb.append("  refunds: ").append(refunds).append("\n");
sb.append("  status: ").append(status).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
