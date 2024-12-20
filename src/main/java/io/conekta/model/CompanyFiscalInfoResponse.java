package io.conekta.model;

import io.conekta.model.CompanyFiscalInfoAddressResponse;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * Company fiscal info model
 **/
@ApiModel(description = "Company fiscal info model")
public class CompanyFiscalInfoResponse  {

  private static final String MXN = "MXN";

  public enum _objectEnum {
    fiscal_info,
  }
  @SerializedName("object")
  private _objectEnum _object = null;
  @SerializedName("tax_id")
  private String taxId = null;
  @SerializedName("legal_entity_name")
  private String legalEntityName = null;
  @SerializedName("business_type")
  private String businessType = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("physical_person_business_type")
  private String physicalPersonBusinessType = null;
  @SerializedName("address")
  private CompanyFiscalInfoAddressResponse address = null;

  /**
   * The resource's type
   * 
   **/
  @ApiModelProperty(value = "The resource's type")
  public _objectEnum getObject() {
    return _object;
  }

  public void setObject(_objectEnum _object) {
    this._object = _object;
  }
  /**
   * Tax ID of the company
   * 
   **/
  @ApiModelProperty(value = "Tax ID of the company")
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }
  /**
   * Legal name of the company
   * 
   **/
  @ApiModelProperty(value = "Legal name of the company")
  public String getLegalEntityName() {
    return legalEntityName;
  }

  public void setLegalEntityName(String legalEntityName) {
    this.legalEntityName = legalEntityName;
  }
  /**
   * Business type of the company
   * 
   **/
  @ApiModelProperty(value = "Business type of the company")
  public String getBusinessType() {
    return businessType;
  }

  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }
  /**
   * Phone number of the company
   * 
   **/
  @ApiModelProperty(value = "Phone number of the company")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
  /**
   * Business type if 'persona_fisica'
   * 
   **/
  @ApiModelProperty(value = "Business type if 'persona_fisica'")
  public String getPhysicalPersonBusinessType() {
    return physicalPersonBusinessType;
  }

  public void setPhysicalPersonBusinessType(String physicalPersonBusinessType) {
    this.physicalPersonBusinessType = physicalPersonBusinessType;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public CompanyFiscalInfoAddressResponse getAddress() {
    return address;
  }

  public void setAddress(CompanyFiscalInfoAddressResponse address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyFiscalInfoResponse companyFiscalInfoResponse = (CompanyFiscalInfoResponse) o;
    return (this._object == null ? companyFiscalInfoResponse._object == null : this._object.equals(companyFiscalInfoResponse._object)) &&
        (this.taxId == null ? companyFiscalInfoResponse.taxId == null : this.taxId.equals(companyFiscalInfoResponse.taxId)) &&
        (this.legalEntityName == null ? companyFiscalInfoResponse.legalEntityName == null : this.legalEntityName.equals(companyFiscalInfoResponse.legalEntityName)) &&
        (this.businessType == null ? companyFiscalInfoResponse.businessType == null : this.businessType.equals(companyFiscalInfoResponse.businessType)) &&
        (this.phone == null ? companyFiscalInfoResponse.phone == null : this.phone.equals(companyFiscalInfoResponse.phone)) &&
        (this.physicalPersonBusinessType == null ? companyFiscalInfoResponse.physicalPersonBusinessType == null : this.physicalPersonBusinessType.equals(companyFiscalInfoResponse.physicalPersonBusinessType)) &&
        (this.address == null ? companyFiscalInfoResponse.address == null : this.address.equals(companyFiscalInfoResponse.address));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.taxId == null ? 0 : this.taxId.hashCode());
    result = 31 * result + (this.legalEntityName == null ? 0 : this.legalEntityName.hashCode());
    result = 31 * result + (this.businessType == null ? 0 : this.businessType.hashCode());
    result = 31 * result + (this.phone == null ? 0 : this.phone.hashCode());
    result = 31 * result + (this.physicalPersonBusinessType == null ? 0 : this.physicalPersonBusinessType.hashCode());
    result = 31 * result + (this.address == null ? 0 : this.address.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyFiscalInfoResponse {\n");
    
    sb.append("  _object: ").append(_object).append("\n");
sb.append("  taxId: ").append(taxId).append("\n");
sb.append("  legalEntityName: ").append(legalEntityName).append("\n");
sb.append("  businessType: ").append(businessType).append("\n");
sb.append("  phone: ").append(phone).append("\n");
sb.append("  physicalPersonBusinessType: ").append(physicalPersonBusinessType).append("\n");
sb.append("  address: ").append(address).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
