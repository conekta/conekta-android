package io.conekta.model;

import io.conekta.model.TokenCard;
import io.conekta.model.TokenCheckout;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * a token
 **/
@ApiModel(description = "a token")
public class Token  {
  
  @SerializedName("card")
  private TokenCard card = null;
  @SerializedName("checkout")
  private TokenCheckout checkout = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public TokenCard getCard() {
    return card;
  }
  public void setCard(TokenCard card) {
    this.card = card;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TokenCheckout getCheckout() {
    return checkout;
  }
  public void setCheckout(TokenCheckout checkout) {
    this.checkout = checkout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Token token = (Token) o;
    return (this.card == null ? token.card == null : this.card.equals(token.card)) &&
        (this.checkout == null ? token.checkout == null : this.checkout.equals(token.checkout));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.card == null ? 0: this.card.hashCode());
    result = 31 * result + (this.checkout == null ? 0: this.checkout.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Token {\n");
    
    sb.append("  card: ").append(card).append("\n");
    sb.append("  checkout: ").append(checkout).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
