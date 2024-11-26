package io.conekta.model;

import io.conekta.model.ChargeRequestPaymentMethod;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * The charges to be made
 **/
@ApiModel(description = "The charges to be made")
public class ChargeRequest  {

  private static final String MXN = "MXN";

  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("payment_method")
  private ChargeRequestPaymentMethod paymentMethod = null;
  @SerializedName("reference_id")
  private String referenceId = null;

  /**
   * Amount to be charged in cents
   * 
   **/
  @ApiModelProperty(value = "Amount to be charged in cents")
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
  @ApiModelProperty(required = true, value = "")
  public ChargeRequestPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(ChargeRequestPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
  /**
   * Custom reference to add to the charge
   * 
   **/
  @ApiModelProperty(value = "Custom reference to add to the charge")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeRequest chargeRequest = (ChargeRequest) o;
    return (this.amount == null ? chargeRequest.amount == null : this.amount.equals(chargeRequest.amount)) &&
        (this.paymentMethod == null ? chargeRequest.paymentMethod == null : this.paymentMethod.equals(chargeRequest.paymentMethod)) &&
        (this.referenceId == null ? chargeRequest.referenceId == null : this.referenceId.equals(chargeRequest.referenceId));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0 : this.amount.hashCode());
    result = 31 * result + (this.paymentMethod == null ? 0 : this.paymentMethod.hashCode());
    result = 31 * result + (this.referenceId == null ? 0 : this.referenceId.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeRequest {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
sb.append("  paymentMethod: ").append(paymentMethod).append("\n");
sb.append("  referenceId: ").append(referenceId).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
