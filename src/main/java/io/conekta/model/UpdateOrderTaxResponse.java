package io.conekta.model;

import io.conekta.model.OasAnyTypeNotMapped;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * create new taxes for an existing order response
 **/
@ApiModel(description = "create new taxes for an existing order response")
public class UpdateOrderTaxResponse  {

  private static final String MXN = "MXN";

  @SerializedName("amount")
  private Long amount = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("metadata")
  private Map<String, OasAnyTypeNotMapped> metadata = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("parent_id")
  private String parentId = null;

  /**
   * The amount to be collected for tax in cents
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The amount to be collected for tax in cents")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }
  /**
   * description or tax's name
   * 
   **/
  @ApiModelProperty(required = true, value = "description or tax's name")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Map<String, OasAnyTypeNotMapped> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, OasAnyTypeNotMapped> metadata) {
    this.metadata = metadata;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
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
    UpdateOrderTaxResponse updateOrderTaxResponse = (UpdateOrderTaxResponse) o;
    return (this.amount == null ? updateOrderTaxResponse.amount == null : this.amount.equals(updateOrderTaxResponse.amount)) &&
        (this.description == null ? updateOrderTaxResponse.description == null : this.description.equals(updateOrderTaxResponse.description)) &&
        (this.metadata == null ? updateOrderTaxResponse.metadata == null : this.metadata.equals(updateOrderTaxResponse.metadata)) &&
        (this.id == null ? updateOrderTaxResponse.id == null : this.id.equals(updateOrderTaxResponse.id)) &&
        (this._object == null ? updateOrderTaxResponse._object == null : this._object.equals(updateOrderTaxResponse._object)) &&
        (this.parentId == null ? updateOrderTaxResponse.parentId == null : this.parentId.equals(updateOrderTaxResponse.parentId));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0 : this.amount.hashCode());
    result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
    result = 31 * result + (this.metadata == null ? 0 : this.metadata.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.parentId == null ? 0 : this.parentId.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderTaxResponse {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
sb.append("  description: ").append(description).append("\n");
sb.append("  metadata: ").append(metadata).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  parentId: ").append(parentId).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
