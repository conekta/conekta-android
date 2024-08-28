package io.conekta.model;

import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class UpdateProduct  {
  
  @SerializedName("antifraud_info")
  private Map<String, Object> antifraudInfo = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("sku")
  private String sku = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("unit_price")
  private Long unitPrice = null;
  @SerializedName("quantity")
  private Integer quantity = null;
  @SerializedName("tags")
  private List<String> tags = null;
  @SerializedName("brand")
  private String brand = null;
  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getAntifraudInfo() {
    return antifraudInfo;
  }
  public void setAntifraudInfo(Map<String, Object> antifraudInfo) {
    this.antifraudInfo = antifraudInfo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * minimum: 0
   **/
  @ApiModelProperty(value = "")
  public Long getUnitPrice() {
    return unitPrice;
  }
  public void setUnitPrice(Long unitPrice) {
    this.unitPrice = unitPrice;
  }

  /**
   * minimum: 1
   **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
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
    UpdateProduct updateProduct = (UpdateProduct) o;
    return (this.antifraudInfo == null ? updateProduct.antifraudInfo == null : this.antifraudInfo.equals(updateProduct.antifraudInfo)) &&
        (this.description == null ? updateProduct.description == null : this.description.equals(updateProduct.description)) &&
        (this.sku == null ? updateProduct.sku == null : this.sku.equals(updateProduct.sku)) &&
        (this.name == null ? updateProduct.name == null : this.name.equals(updateProduct.name)) &&
        (this.unitPrice == null ? updateProduct.unitPrice == null : this.unitPrice.equals(updateProduct.unitPrice)) &&
        (this.quantity == null ? updateProduct.quantity == null : this.quantity.equals(updateProduct.quantity)) &&
        (this.tags == null ? updateProduct.tags == null : this.tags.equals(updateProduct.tags)) &&
        (this.brand == null ? updateProduct.brand == null : this.brand.equals(updateProduct.brand)) &&
        (this.metadata == null ? updateProduct.metadata == null : this.metadata.equals(updateProduct.metadata));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.antifraudInfo == null ? 0: this.antifraudInfo.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.sku == null ? 0: this.sku.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.unitPrice == null ? 0: this.unitPrice.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.brand == null ? 0: this.brand.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProduct {\n");
    
    sb.append("  antifraudInfo: ").append(antifraudInfo).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  unitPrice: ").append(unitPrice).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  brand: ").append(brand).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
