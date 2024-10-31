package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class OrderCaptureRequest  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("amount")
  private Long amount = null;

  /**
   * Amount to capture
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "Amount to capture")
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCaptureRequest orderCaptureRequest = (OrderCaptureRequest) o;
    return (this.amount == null ? orderCaptureRequest.amount == null : this.amount.equals(orderCaptureRequest.amount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCaptureRequest {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
