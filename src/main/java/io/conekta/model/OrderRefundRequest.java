package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class OrderRefundRequest  {
  
  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("expires_at")
  private Long expiresAt = null;
  @SerializedName("reason")
  private String reason = null;

  /**
   * Amount to be refunded in cents
   **/
  @ApiModelProperty(required = true, value = "Amount to be refunded in cents")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * Reason for the refund
   **/
  @ApiModelProperty(required = true, value = "Reason for the refund")
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
    OrderRefundRequest orderRefundRequest = (OrderRefundRequest) o;
    return (this.amount == null ? orderRefundRequest.amount == null : this.amount.equals(orderRefundRequest.amount)) &&
        (this.expiresAt == null ? orderRefundRequest.expiresAt == null : this.expiresAt.equals(orderRefundRequest.expiresAt)) &&
        (this.reason == null ? orderRefundRequest.reason == null : this.reason.equals(orderRefundRequest.reason));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    result = 31 * result + (this.reason == null ? 0: this.reason.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRefundRequest {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
