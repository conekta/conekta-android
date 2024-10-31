package io.conekta.model;

import io.conekta.model.CustomerAddress;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class UpdateCustomerFiscalEntitiesResponse  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("address")
  private CustomerAddress address = null;
  @SerializedName("tax_id")
  private String taxId = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("metadata")
  private Map<String, Object> metadata = null;
  @SerializedName("company_name")
  private String companyName = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("parent_id")
  private String parentId = null;
  @SerializedName("default")
  private Boolean _default = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CustomerAddress getAddress() {
    return address;
  }
  public void setAddress(CustomerAddress address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTaxId() {
    return taxId;
  }
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
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
  public Boolean getDefault() {
    return _default;
  }
  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerFiscalEntitiesResponse updateCustomerFiscalEntitiesResponse = (UpdateCustomerFiscalEntitiesResponse) o;
    return (this.address == null ? updateCustomerFiscalEntitiesResponse.address == null : this.address.equals(updateCustomerFiscalEntitiesResponse.address)) &&
        (this.taxId == null ? updateCustomerFiscalEntitiesResponse.taxId == null : this.taxId.equals(updateCustomerFiscalEntitiesResponse.taxId)) &&
        (this.email == null ? updateCustomerFiscalEntitiesResponse.email == null : this.email.equals(updateCustomerFiscalEntitiesResponse.email)) &&
        (this.phone == null ? updateCustomerFiscalEntitiesResponse.phone == null : this.phone.equals(updateCustomerFiscalEntitiesResponse.phone)) &&
        (this.metadata == null ? updateCustomerFiscalEntitiesResponse.metadata == null : this.metadata.equals(updateCustomerFiscalEntitiesResponse.metadata)) &&
        (this.companyName == null ? updateCustomerFiscalEntitiesResponse.companyName == null : this.companyName.equals(updateCustomerFiscalEntitiesResponse.companyName)) &&
        (this.id == null ? updateCustomerFiscalEntitiesResponse.id == null : this.id.equals(updateCustomerFiscalEntitiesResponse.id)) &&
        (this._object == null ? updateCustomerFiscalEntitiesResponse._object == null : this._object.equals(updateCustomerFiscalEntitiesResponse._object)) &&
        (this.createdAt == null ? updateCustomerFiscalEntitiesResponse.createdAt == null : this.createdAt.equals(updateCustomerFiscalEntitiesResponse.createdAt)) &&
        (this.parentId == null ? updateCustomerFiscalEntitiesResponse.parentId == null : this.parentId.equals(updateCustomerFiscalEntitiesResponse.parentId)) &&
        (this._default == null ? updateCustomerFiscalEntitiesResponse._default == null : this._default.equals(updateCustomerFiscalEntitiesResponse._default));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.taxId == null ? 0: this.taxId.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this.companyName == null ? 0: this.companyName.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.parentId == null ? 0: this.parentId.hashCode());
    result = 31 * result + (this._default == null ? 0: this._default.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerFiscalEntitiesResponse {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  taxId: ").append(taxId).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  companyName: ").append(companyName).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  parentId: ").append(parentId).append("\n");
    sb.append("  _default: ").append(_default).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}