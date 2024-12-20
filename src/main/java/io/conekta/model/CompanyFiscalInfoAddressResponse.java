package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * Company fiscal info address model
 **/
@ApiModel(description = "Company fiscal info address model")
public class CompanyFiscalInfoAddressResponse  {

  private static final String MXN = "MXN";

  public enum _objectEnum {
    address,
  }
  @SerializedName("object")
  private _objectEnum _object = null;
  @SerializedName("street1")
  private String street1 = null;
  @SerializedName("street2")
  private String street2 = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("postal_code")
  private String postalCode = null;
  @SerializedName("external_number")
  private String externalNumber = null;
  @SerializedName("internal_number")
  private String internalNumber = null;

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
   * Street Address
   * 
   **/
  @ApiModelProperty(value = "Street Address")
  public String getStreet1() {
    return street1;
  }

  public void setStreet1(String street1) {
    this.street1 = street1;
  }
  /**
   * Colonia
   * 
   **/
  @ApiModelProperty(value = "Colonia")
  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }
  /**
   * City
   * 
   **/
  @ApiModelProperty(value = "City")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
  /**
   * State
   * 
   **/
  @ApiModelProperty(value = "State")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
  /**
   * Country
   * 
   **/
  @ApiModelProperty(value = "Country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
  /**
   * Postal code
   * 
   **/
  @ApiModelProperty(value = "Postal code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }
  /**
   * Street number
   * 
   **/
  @ApiModelProperty(value = "Street number")
  public String getExternalNumber() {
    return externalNumber;
  }

  public void setExternalNumber(String externalNumber) {
    this.externalNumber = externalNumber;
  }
  /**
   * Unit / apartment number
   * 
   **/
  @ApiModelProperty(value = "Unit / apartment number")
  public String getInternalNumber() {
    return internalNumber;
  }

  public void setInternalNumber(String internalNumber) {
    this.internalNumber = internalNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyFiscalInfoAddressResponse companyFiscalInfoAddressResponse = (CompanyFiscalInfoAddressResponse) o;
    return (this._object == null ? companyFiscalInfoAddressResponse._object == null : this._object.equals(companyFiscalInfoAddressResponse._object)) &&
        (this.street1 == null ? companyFiscalInfoAddressResponse.street1 == null : this.street1.equals(companyFiscalInfoAddressResponse.street1)) &&
        (this.street2 == null ? companyFiscalInfoAddressResponse.street2 == null : this.street2.equals(companyFiscalInfoAddressResponse.street2)) &&
        (this.city == null ? companyFiscalInfoAddressResponse.city == null : this.city.equals(companyFiscalInfoAddressResponse.city)) &&
        (this.state == null ? companyFiscalInfoAddressResponse.state == null : this.state.equals(companyFiscalInfoAddressResponse.state)) &&
        (this.country == null ? companyFiscalInfoAddressResponse.country == null : this.country.equals(companyFiscalInfoAddressResponse.country)) &&
        (this.postalCode == null ? companyFiscalInfoAddressResponse.postalCode == null : this.postalCode.equals(companyFiscalInfoAddressResponse.postalCode)) &&
        (this.externalNumber == null ? companyFiscalInfoAddressResponse.externalNumber == null : this.externalNumber.equals(companyFiscalInfoAddressResponse.externalNumber)) &&
        (this.internalNumber == null ? companyFiscalInfoAddressResponse.internalNumber == null : this.internalNumber.equals(companyFiscalInfoAddressResponse.internalNumber));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.street1 == null ? 0 : this.street1.hashCode());
    result = 31 * result + (this.street2 == null ? 0 : this.street2.hashCode());
    result = 31 * result + (this.city == null ? 0 : this.city.hashCode());
    result = 31 * result + (this.state == null ? 0 : this.state.hashCode());
    result = 31 * result + (this.country == null ? 0 : this.country.hashCode());
    result = 31 * result + (this.postalCode == null ? 0 : this.postalCode.hashCode());
    result = 31 * result + (this.externalNumber == null ? 0 : this.externalNumber.hashCode());
    result = 31 * result + (this.internalNumber == null ? 0 : this.internalNumber.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyFiscalInfoAddressResponse {\n");
    
    sb.append("  _object: ").append(_object).append("\n");
sb.append("  street1: ").append(street1).append("\n");
sb.append("  street2: ").append(street2).append("\n");
sb.append("  city: ").append(city).append("\n");
sb.append("  state: ").append(state).append("\n");
sb.append("  country: ").append(country).append("\n");
sb.append("  postalCode: ").append(postalCode).append("\n");
sb.append("  externalNumber: ").append(externalNumber).append("\n");
sb.append("  internalNumber: ").append(internalNumber).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
