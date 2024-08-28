package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CustomerInfoJustCustomerId  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("customer_id")
  private String customerId = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerInfoJustCustomerId customerInfoJustCustomerId = (CustomerInfoJustCustomerId) o;
    return (this.customerId == null ? customerInfoJustCustomerId.customerId == null : this.customerId.equals(customerInfoJustCustomerId.customerId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.customerId == null ? 0: this.customerId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerInfoJustCustomerId {\n");
    
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
