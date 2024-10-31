package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class TokenCheckout  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("returns_control_on")
  private String returnsControlOn = null;

  /**
   * It is a value that allows identifying the returns control on.
   **/
  @ApiModelProperty(value = "It is a value that allows identifying the returns control on.")
  public String getReturnsControlOn() {
    return returnsControlOn;
  }
  public void setReturnsControlOn(String returnsControlOn) {
    this.returnsControlOn = returnsControlOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenCheckout tokenCheckout = (TokenCheckout) o;
    return (this.returnsControlOn == null ? tokenCheckout.returnsControlOn == null : this.returnsControlOn.equals(tokenCheckout.returnsControlOn));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.returnsControlOn == null ? 0: this.returnsControlOn.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCheckout {\n");
    
    sb.append("  returnsControlOn: ").append(returnsControlOn).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
