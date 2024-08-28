package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class PaymentMethodSpeiRequest  {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("expires_at")
  private Long expiresAt = null;

  /**
   * Type of payment method
   **/
  @ApiModelProperty(required = true, value = "Type of payment method")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodSpeiRequest paymentMethodSpeiRequest = (PaymentMethodSpeiRequest) o;
    return (this.type == null ? paymentMethodSpeiRequest.type == null : this.type.equals(paymentMethodSpeiRequest.type)) &&
        (this.expiresAt == null ? paymentMethodSpeiRequest.expiresAt == null : this.expiresAt.equals(paymentMethodSpeiRequest.expiresAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodSpeiRequest {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
