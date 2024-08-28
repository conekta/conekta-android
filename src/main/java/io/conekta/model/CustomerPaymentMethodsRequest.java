package io.conekta.model;

import io.conekta.model.PaymentMethodCashRequest;
import io.conekta.model.PaymentMethodSpeiRequest;
import io.conekta.model.PaymentMethodTokenRequest;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CustomerPaymentMethodsRequest  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("token_id")
  private String tokenId = null;
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
   * Token id that will be used to create a \"card\" type payment method. See the (subscriptions)[https://developers.conekta.com/v2.1.0/reference/createsubscription] tutorial for more information on how to tokenize cards.
   **/
  @ApiModelProperty(required = true, value = "Token id that will be used to create a \"card\" type payment method. See the (subscriptions)[https://developers.conekta.com/v2.1.0/reference/createsubscription] tutorial for more information on how to tokenize cards.")
  public String getTokenId() {
    return tokenId;
  }
  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
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
    CustomerPaymentMethodsRequest customerPaymentMethodsRequest = (CustomerPaymentMethodsRequest) o;
    return (this.type == null ? customerPaymentMethodsRequest.type == null : this.type.equals(customerPaymentMethodsRequest.type)) &&
        (this.tokenId == null ? customerPaymentMethodsRequest.tokenId == null : this.tokenId.equals(customerPaymentMethodsRequest.tokenId)) &&
        (this.expiresAt == null ? customerPaymentMethodsRequest.expiresAt == null : this.expiresAt.equals(customerPaymentMethodsRequest.expiresAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.tokenId == null ? 0: this.tokenId.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerPaymentMethodsRequest {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  tokenId: ").append(tokenId).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
