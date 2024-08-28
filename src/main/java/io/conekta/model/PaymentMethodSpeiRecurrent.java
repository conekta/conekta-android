package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class PaymentMethodSpeiRecurrent  {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("parent_id")
  private String parentId = null;
  @SerializedName("reference")
  private String reference = null;
  @SerializedName("expires_at")
  private String expiresAt = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodSpeiRecurrent paymentMethodSpeiRecurrent = (PaymentMethodSpeiRecurrent) o;
    return (this.type == null ? paymentMethodSpeiRecurrent.type == null : this.type.equals(paymentMethodSpeiRecurrent.type)) &&
        (this.id == null ? paymentMethodSpeiRecurrent.id == null : this.id.equals(paymentMethodSpeiRecurrent.id)) &&
        (this._object == null ? paymentMethodSpeiRecurrent._object == null : this._object.equals(paymentMethodSpeiRecurrent._object)) &&
        (this.createdAt == null ? paymentMethodSpeiRecurrent.createdAt == null : this.createdAt.equals(paymentMethodSpeiRecurrent.createdAt)) &&
        (this.parentId == null ? paymentMethodSpeiRecurrent.parentId == null : this.parentId.equals(paymentMethodSpeiRecurrent.parentId)) &&
        (this.reference == null ? paymentMethodSpeiRecurrent.reference == null : this.reference.equals(paymentMethodSpeiRecurrent.reference)) &&
        (this.expiresAt == null ? paymentMethodSpeiRecurrent.expiresAt == null : this.expiresAt.equals(paymentMethodSpeiRecurrent.expiresAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.parentId == null ? 0: this.parentId.hashCode());
    result = 31 * result + (this.reference == null ? 0: this.reference.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodSpeiRecurrent {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  parentId: ").append(parentId).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
