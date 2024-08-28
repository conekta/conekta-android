package io.conekta.model;

import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * create new taxes for an existing order
 **/
@ApiModel(description = "create new taxes for an existing order")
public class OrderTaxRequest  {
  
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
  @ApiModelProperty(required = true, value = "The amount to be collected for tax in cents")
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  /**
   * description or tax's name
   **/
  @ApiModelProperty(required = true, value = "description or tax's name")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
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
    OrderTaxRequest orderTaxRequest = (OrderTaxRequest) o;
    return (this.amount == null ? orderTaxRequest.amount == null : this.amount.equals(orderTaxRequest.amount)) &&
        (this.description == null ? orderTaxRequest.description == null : this.description.equals(orderTaxRequest.description)) &&
        (this.metadata == null ? orderTaxRequest.metadata == null : this.metadata.equals(orderTaxRequest.metadata));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderTaxRequest {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
