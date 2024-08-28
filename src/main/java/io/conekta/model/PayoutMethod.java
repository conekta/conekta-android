package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * The payout method of the payout order.
 **/
@ApiModel(description = "The payout method of the payout order.")
public class PayoutMethod  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("type")
  private String type = null;

  /**
   * The type of the payout method.
   **/
  @ApiModelProperty(required = true, value = "The type of the payout method.")
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
    PayoutMethod payoutMethod = (PayoutMethod) o;
    return (this.type == null ? payoutMethod.type == null : this.type.equals(payoutMethod.type));
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
    sb.append("class PayoutMethod {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
