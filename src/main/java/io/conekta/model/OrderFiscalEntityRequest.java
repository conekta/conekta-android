package io.conekta.model;

import io.conekta.model.FiscalEntityAddress;
import io.conekta.model.OasAnyTypeNotMapped;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * Fiscal entity of the order, Currently it is a purely informative field
 **/
@ApiModel(description = "Fiscal entity of the order, Currently it is a purely informative field")
public class OrderFiscalEntityRequest  {

  private static final String MXN = "MXN";

  @SerializedName("address")
  private FiscalEntityAddress address = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("metadata")
  private Map<String, OasAnyTypeNotMapped> metadata = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("tax_id")
  private String taxId = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public FiscalEntityAddress getAddress() {
    return address;
  }

  public void setAddress(FiscalEntityAddress address) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderFiscalEntityRequest orderFiscalEntityRequest = (OrderFiscalEntityRequest) o;
    return (this.address == null ? orderFiscalEntityRequest.address == null : this.address.equals(orderFiscalEntityRequest.address)) &&
        (this.email == null ? orderFiscalEntityRequest.email == null : this.email.equals(orderFiscalEntityRequest.email)) &&
        (this.metadata == null ? orderFiscalEntityRequest.metadata == null : this.metadata.equals(orderFiscalEntityRequest.metadata)) &&
        (this.name == null ? orderFiscalEntityRequest.name == null : this.name.equals(orderFiscalEntityRequest.name)) &&
        (this.phone == null ? orderFiscalEntityRequest.phone == null : this.phone.equals(orderFiscalEntityRequest.phone)) &&
        (this.taxId == null ? orderFiscalEntityRequest.taxId == null : this.taxId.equals(orderFiscalEntityRequest.taxId));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.address == null ? 0 : this.address.hashCode());
    result = 31 * result + (this.email == null ? 0 : this.email.hashCode());
    result = 31 * result + (this.metadata == null ? 0 : this.metadata.hashCode());
    result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
    result = 31 * result + (this.phone == null ? 0 : this.phone.hashCode());
    result = 31 * result + (this.taxId == null ? 0 : this.taxId.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFiscalEntityRequest {\n");
    
    sb.append("  address: ").append(address).append("\n");
sb.append("  email: ").append(email).append("\n");
sb.append("  metadata: ").append(metadata).append("\n");
sb.append("  name: ").append(name).append("\n");
sb.append("  phone: ").append(phone).append("\n");
sb.append("  taxId: ").append(taxId).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
