package io.conekta.model;

import io.conekta.model.OasAnyTypeNotMapped;
import io.conekta.model.OrderFiscalEntityAddressResponse;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * Fiscal entity of the order, Currently it is a purely informative field
 **/
@ApiModel(description = "Fiscal entity of the order, Currently it is a purely informative field")
public class OrderFiscalEntityResponse  {

  private static final String MXN = "MXN";

  @SerializedName("address")
  private OrderFiscalEntityAddressResponse address = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("metadata")
  private Map<String, OasAnyTypeNotMapped> metadata = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("tax_id")
  private String taxId = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("phone")
  private String phone = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public OrderFiscalEntityAddressResponse getAddress() {
    return address;
  }

  public void setAddress(OrderFiscalEntityAddressResponse address) {
    this.address = address;
  }
  /**
   * Email of the fiscal entity
   * 
   **/
  @ApiModelProperty(value = "Email of the fiscal entity")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  /**
   * Metadata associated with the fiscal entity
   * 
   **/
  @ApiModelProperty(value = "Metadata associated with the fiscal entity")
  public Map<String, OasAnyTypeNotMapped> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, OasAnyTypeNotMapped> metadata) {
    this.metadata = metadata;
  }
  /**
   * Name of the fiscal entity
   * 
   **/
  @ApiModelProperty(value = "Name of the fiscal entity")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  /**
   * Tax ID of the fiscal entity
   * 
   **/
  @ApiModelProperty(value = "Tax ID of the fiscal entity")
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }
  /**
   * ID of the fiscal entity
   * 
   **/
  @ApiModelProperty(required = true, value = "ID of the fiscal entity")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  /**
   * The time at which the object was created in seconds since the Unix epoch
   * 
   **/
  @ApiModelProperty(required = true, value = "The time at which the object was created in seconds since the Unix epoch")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }
  /**
   * Phone of the fiscal entity
   * 
   **/
  @ApiModelProperty(value = "Phone of the fiscal entity")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderFiscalEntityResponse orderFiscalEntityResponse = (OrderFiscalEntityResponse) o;
    return (this.address == null ? orderFiscalEntityResponse.address == null : this.address.equals(orderFiscalEntityResponse.address)) &&
        (this.email == null ? orderFiscalEntityResponse.email == null : this.email.equals(orderFiscalEntityResponse.email)) &&
        (this.metadata == null ? orderFiscalEntityResponse.metadata == null : this.metadata.equals(orderFiscalEntityResponse.metadata)) &&
        (this.name == null ? orderFiscalEntityResponse.name == null : this.name.equals(orderFiscalEntityResponse.name)) &&
        (this.taxId == null ? orderFiscalEntityResponse.taxId == null : this.taxId.equals(orderFiscalEntityResponse.taxId)) &&
        (this.id == null ? orderFiscalEntityResponse.id == null : this.id.equals(orderFiscalEntityResponse.id)) &&
        (this.createdAt == null ? orderFiscalEntityResponse.createdAt == null : this.createdAt.equals(orderFiscalEntityResponse.createdAt)) &&
        (this._object == null ? orderFiscalEntityResponse._object == null : this._object.equals(orderFiscalEntityResponse._object)) &&
        (this.phone == null ? orderFiscalEntityResponse.phone == null : this.phone.equals(orderFiscalEntityResponse.phone));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.address == null ? 0 : this.address.hashCode());
    result = 31 * result + (this.email == null ? 0 : this.email.hashCode());
    result = 31 * result + (this.metadata == null ? 0 : this.metadata.hashCode());
    result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
    result = 31 * result + (this.taxId == null ? 0 : this.taxId.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this.createdAt == null ? 0 : this.createdAt.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.phone == null ? 0 : this.phone.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFiscalEntityResponse {\n");
    
    sb.append("  address: ").append(address).append("\n");
sb.append("  email: ").append(email).append("\n");
sb.append("  metadata: ").append(metadata).append("\n");
sb.append("  name: ").append(name).append("\n");
sb.append("  taxId: ").append(taxId).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  createdAt: ").append(createdAt).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  phone: ").append(phone).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
