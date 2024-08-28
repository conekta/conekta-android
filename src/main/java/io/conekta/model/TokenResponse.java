package io.conekta.model;

import io.conekta.model.TokenResponseCheckout;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * token response
 **/
@ApiModel(description = "token response")
public class TokenResponse  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("checkout")
  private TokenResponseCheckout checkout = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("used")
  private Boolean used = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public TokenResponseCheckout getCheckout() {
    return checkout;
  }
  public void setCheckout(TokenResponseCheckout checkout) {
    this.checkout = checkout;
  }

  /**
   * Unique identifier for the token generated by Conekta.
   **/
  @ApiModelProperty(required = true, value = "Unique identifier for the token generated by Conekta.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Indicates whether the token is in live mode or test mode.
   **/
  @ApiModelProperty(required = true, value = "Indicates whether the token is in live mode or test mode.")
  public Boolean getLivemode() {
    return livemode;
  }
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  /**
   * Indicates the type of object, in this case token
   **/
  @ApiModelProperty(required = true, value = "Indicates the type of object, in this case token")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * Indicates if the token has been used
   **/
  @ApiModelProperty(required = true, value = "Indicates if the token has been used")
  public Boolean getUsed() {
    return used;
  }
  public void setUsed(Boolean used) {
    this.used = used;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenResponse tokenResponse = (TokenResponse) o;
    return (this.checkout == null ? tokenResponse.checkout == null : this.checkout.equals(tokenResponse.checkout)) &&
        (this.id == null ? tokenResponse.id == null : this.id.equals(tokenResponse.id)) &&
        (this.livemode == null ? tokenResponse.livemode == null : this.livemode.equals(tokenResponse.livemode)) &&
        (this._object == null ? tokenResponse._object == null : this._object.equals(tokenResponse._object)) &&
        (this.used == null ? tokenResponse.used == null : this.used.equals(tokenResponse.used));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.checkout == null ? 0: this.checkout.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0: this.livemode.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.used == null ? 0: this.used.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenResponse {\n");
    
    sb.append("  checkout: ").append(checkout).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  livemode: ").append(livemode).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  used: ").append(used).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
