package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class PaymentMethodTokenRequest  {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("token_id")
  private String tokenId = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodTokenRequest paymentMethodTokenRequest = (PaymentMethodTokenRequest) o;
    return (this.type == null ? paymentMethodTokenRequest.type == null : this.type.equals(paymentMethodTokenRequest.type)) &&
        (this.tokenId == null ? paymentMethodTokenRequest.tokenId == null : this.tokenId.equals(paymentMethodTokenRequest.tokenId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.tokenId == null ? 0: this.tokenId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodTokenRequest {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  tokenId: ").append(tokenId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
