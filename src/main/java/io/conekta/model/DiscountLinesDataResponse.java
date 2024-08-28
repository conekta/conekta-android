package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class DiscountLinesDataResponse  {
  
  @SerializedName("amount")
  private Long amount = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("parent_id")
  private String parentId = null;

  /**
   * The amount to be deducted from the total sum of all payments, in cents.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The amount to be deducted from the total sum of all payments, in cents.")
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  /**
   * Discount code.
   **/
  @ApiModelProperty(required = true, value = "Discount code.")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * It can be 'loyalty', 'campaign', 'coupon' o 'sign'
   **/
  @ApiModelProperty(required = true, value = "It can be 'loyalty', 'campaign', 'coupon' o 'sign'")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * The discount line id
   **/
  @ApiModelProperty(required = true, value = "The discount line id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object name
   **/
  @ApiModelProperty(required = true, value = "The object name")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * The order id
   **/
  @ApiModelProperty(required = true, value = "The order id")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountLinesDataResponse discountLinesDataResponse = (DiscountLinesDataResponse) o;
    return (this.amount == null ? discountLinesDataResponse.amount == null : this.amount.equals(discountLinesDataResponse.amount)) &&
        (this.code == null ? discountLinesDataResponse.code == null : this.code.equals(discountLinesDataResponse.code)) &&
        (this.type == null ? discountLinesDataResponse.type == null : this.type.equals(discountLinesDataResponse.type)) &&
        (this.id == null ? discountLinesDataResponse.id == null : this.id.equals(discountLinesDataResponse.id)) &&
        (this._object == null ? discountLinesDataResponse._object == null : this._object.equals(discountLinesDataResponse._object)) &&
        (this.parentId == null ? discountLinesDataResponse.parentId == null : this.parentId.equals(discountLinesDataResponse.parentId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.parentId == null ? 0: this.parentId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountLinesDataResponse {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  parentId: ").append(parentId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
