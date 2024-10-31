package io.conekta.model;

import io.conekta.model.CustomerAddress;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class CustomerUpdateFiscalEntitiesRequest  {
  
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

  /**
   **/
  @ApiModelProperty(value = "")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerUpdateFiscalEntitiesRequest customerUpdateFiscalEntitiesRequest = (CustomerUpdateFiscalEntitiesRequest) o;
    return (this.address == null ? customerUpdateFiscalEntitiesRequest.address == null : this.address.equals(customerUpdateFiscalEntitiesRequest.address)) &&
        (this.taxId == null ? customerUpdateFiscalEntitiesRequest.taxId == null : this.taxId.equals(customerUpdateFiscalEntitiesRequest.taxId)) &&
        (this.email == null ? customerUpdateFiscalEntitiesRequest.email == null : this.email.equals(customerUpdateFiscalEntitiesRequest.email)) &&
        (this.phone == null ? customerUpdateFiscalEntitiesRequest.phone == null : this.phone.equals(customerUpdateFiscalEntitiesRequest.phone)) &&
        (this.metadata == null ? customerUpdateFiscalEntitiesRequest.metadata == null : this.metadata.equals(customerUpdateFiscalEntitiesRequest.metadata)) &&
        (this.companyName == null ? customerUpdateFiscalEntitiesRequest.companyName == null : this.companyName.equals(customerUpdateFiscalEntitiesRequest.companyName));
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
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUpdateFiscalEntitiesRequest {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  taxId: ").append(taxId).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  companyName: ").append(companyName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}