package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * List of discounts that apply to the order.
 **/
@ApiModel(description = "List of discounts that apply to the order.")
public class UpdateOrderDiscountLinesRequest  {

  private static final String MXN = "MXN";

  @SerializedName("amount")
  private Long amount = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("type")
  private String type = null;

  /**
   * 
   * minimum: 0
   **/
  @ApiModelProperty(value = "")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }
  /**
   * Discount code.
   * 
   **/
  @ApiModelProperty(value = "Discount code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
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
    UpdateOrderDiscountLinesRequest updateOrderDiscountLinesRequest = (UpdateOrderDiscountLinesRequest) o;
    return (this.amount == null ? updateOrderDiscountLinesRequest.amount == null : this.amount.equals(updateOrderDiscountLinesRequest.amount)) &&
        (this.code == null ? updateOrderDiscountLinesRequest.code == null : this.code.equals(updateOrderDiscountLinesRequest.code)) &&
        (this.type == null ? updateOrderDiscountLinesRequest.type == null : this.type.equals(updateOrderDiscountLinesRequest.type));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0 : this.amount.hashCode());
    result = 31 * result + (this.code == null ? 0 : this.code.hashCode());
    result = 31 * result + (this.type == null ? 0 : this.type.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderDiscountLinesRequest {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
sb.append("  code: ").append(code).append("\n");
sb.append("  type: ").append(type).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
