package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class EmailCheckoutRequest  {
  
  @SerializedName("email")
  private String email = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailCheckoutRequest emailCheckoutRequest = (EmailCheckoutRequest) o;
    return (this.email == null ? emailCheckoutRequest.email == null : this.email.equals(emailCheckoutRequest.email));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailCheckoutRequest {\n");
    
    sb.append("  email: ").append(email).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
