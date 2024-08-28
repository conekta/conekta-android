package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Contains details of the payment methods that the customer has active or has used in Conekta
 **/
@ApiModel(description = "Contains details of the payment methods that the customer has active or has used in Conekta")
public class CustomerPaymentMethodRequest  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("type")
  private String type = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerPaymentMethodRequest customerPaymentMethodRequest = (CustomerPaymentMethodRequest) o;
    return (this.type == null ? customerPaymentMethodRequest.type == null : this.type.equals(customerPaymentMethodRequest.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerPaymentMethodRequest {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
