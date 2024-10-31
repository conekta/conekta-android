package io.conekta.model;

import io.conekta.model.OasAnyTypeNotMapped;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class Product  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("antifraud_info")
  private Map<String, OasAnyTypeNotMapped> antifraudInfo = null;
  @SerializedName("brand")
  private String brand = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("metadata")
  private Map<String, OasAnyTypeNotMapped> metadata = {};
  @SerializedName("name")
  private String name = null;
  @SerializedName("quantity")
  private Integer quantity = null;
  @SerializedName("sku")
  private String sku = null;
  @SerializedName("tags")
  private List<String> tags = null;
  @SerializedName("unit_price")
  private Integer unitPrice = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, OasAnyTypeNotMapped> getAntifraudInfo() {
    return antifraudInfo;
  }
  public void setAntifraudInfo(Map<String, OasAnyTypeNotMapped> antifraudInfo) {
    this.antifraudInfo = antifraudInfo;
  }

  /**
   * The brand of the item.
   **/
  @ApiModelProperty(value = "The brand of the item.")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Short description of the item
   **/
  @ApiModelProperty(value = "Short description of the item")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * It is a key/value hash that can hold custom fields. Maximum 100 elements and allows special characters.
   **/
  @ApiModelProperty(value = "It is a key/value hash that can hold custom fields. Maximum 100 elements and allows special characters.")
  public Map<String, OasAnyTypeNotMapped> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, OasAnyTypeNotMapped> metadata) {
    this.metadata = metadata;
  }

  /**
   * The name of the item. It will be displayed in the order.
   **/
  @ApiModelProperty(required = true, value = "The name of the item. It will be displayed in the order.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The quantity of the item in the order.
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The quantity of the item in the order.")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * The stock keeping unit for the item. It is used to identify the item in the order.
   **/
  @ApiModelProperty(value = "The stock keeping unit for the item. It is used to identify the item in the order.")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  /**
   * List of tags for the item. It is used to identify the item in the order.
   **/
  @ApiModelProperty(value = "List of tags for the item. It is used to identify the item in the order.")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * The price of the item in cents.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The price of the item in cents.")
  public Integer getUnitPrice() {
    return unitPrice;
  }
  public void setUnitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return (this.antifraudInfo == null ? product.antifraudInfo == null : this.antifraudInfo.equals(product.antifraudInfo)) &&
        (this.brand == null ? product.brand == null : this.brand.equals(product.brand)) &&
        (this.description == null ? product.description == null : this.description.equals(product.description)) &&
        (this.metadata == null ? product.metadata == null : this.metadata.equals(product.metadata)) &&
        (this.name == null ? product.name == null : this.name.equals(product.name)) &&
        (this.quantity == null ? product.quantity == null : this.quantity.equals(product.quantity)) &&
        (this.sku == null ? product.sku == null : this.sku.equals(product.sku)) &&
        (this.tags == null ? product.tags == null : this.tags.equals(product.tags)) &&
        (this.unitPrice == null ? product.unitPrice == null : this.unitPrice.equals(product.unitPrice));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.antifraudInfo == null ? 0: this.antifraudInfo.hashCode());
    result = 31 * result + (this.brand == null ? 0: this.brand.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    result = 31 * result + (this.sku == null ? 0: this.sku.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.unitPrice == null ? 0: this.unitPrice.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("  antifraudInfo: ").append(antifraudInfo).append("\n");
    sb.append("  brand: ").append(brand).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  unitPrice: ").append(unitPrice).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
