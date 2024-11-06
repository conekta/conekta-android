package io.conekta.model;

import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * create new taxes for an existing order
 **/
@ApiModel(description = "create new taxes for an existing order")
public class UpdateOrderTaxRequest  {

  private static final String MXN = "MXN";

  @SerializedName("amount")
  private Long amount = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("metadata")
  private Map<String, Object> metadata = null;

  /**
   * The amount to be collected for tax in cents
   * minimum: 0
   **/
  @ApiModelProperty(value = "The amount to be collected for tax in cents")
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
  @ApiModelProperty(value = "description or tax's name")
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
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderTaxRequest updateOrderTaxRequest = (UpdateOrderTaxRequest) o;
    return (this.amount == null ? updateOrderTaxRequest.amount == null : this.amount.equals(updateOrderTaxRequest.amount)) &&
        (this.description == null ? updateOrderTaxRequest.description == null : this.description.equals(updateOrderTaxRequest.description)) &&
        (this.metadata == null ? updateOrderTaxRequest.metadata == null : this.metadata.equals(updateOrderTaxRequest.metadata));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0 : this.amount.hashCode());
    result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
    result = 31 * result + (this.metadata == null ? 0 : this.metadata.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderTaxRequest {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
sb.append("  description: ").append(description).append("\n");
sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
