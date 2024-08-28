package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SmsCheckoutRequest  {
  
  @SerializedName("phonenumber")
  private String phonenumber = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPhonenumber() {
    return phonenumber;
  }
  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsCheckoutRequest smsCheckoutRequest = (SmsCheckoutRequest) o;
    return (this.phonenumber == null ? smsCheckoutRequest.phonenumber == null : this.phonenumber.equals(smsCheckoutRequest.phonenumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.phonenumber == null ? 0: this.phonenumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsCheckoutRequest {\n");
    
    sb.append("  phonenumber: ").append(phonenumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
