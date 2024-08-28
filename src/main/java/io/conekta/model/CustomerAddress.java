package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CustomerAddress  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("street1")
  private String street1 = null;
  @SerializedName("street2")
  private String street2 = null;
  @SerializedName("postal_code")
  private String postalCode = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("residential")
  private Boolean residential = false;
  @SerializedName("external_number")
  private String externalNumber = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getStreet1() {
    return street1;
  }
  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStreet2() {
    return street2;
  }
  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   * this field follows the [ISO 3166-1 alpha-2 standard](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
   **/
  @ApiModelProperty(value = "this field follows the [ISO 3166-1 alpha-2 standard](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getResidential() {
    return residential;
  }
  public void setResidential(Boolean residential) {
    this.residential = residential;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExternalNumber() {
    return externalNumber;
  }
  public void setExternalNumber(String externalNumber) {
    this.externalNumber = externalNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAddress customerAddress = (CustomerAddress) o;
    return (this.street1 == null ? customerAddress.street1 == null : this.street1.equals(customerAddress.street1)) &&
        (this.street2 == null ? customerAddress.street2 == null : this.street2.equals(customerAddress.street2)) &&
        (this.postalCode == null ? customerAddress.postalCode == null : this.postalCode.equals(customerAddress.postalCode)) &&
        (this.city == null ? customerAddress.city == null : this.city.equals(customerAddress.city)) &&
        (this.state == null ? customerAddress.state == null : this.state.equals(customerAddress.state)) &&
        (this.country == null ? customerAddress.country == null : this.country.equals(customerAddress.country)) &&
        (this.residential == null ? customerAddress.residential == null : this.residential.equals(customerAddress.residential)) &&
        (this.externalNumber == null ? customerAddress.externalNumber == null : this.externalNumber.equals(customerAddress.externalNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.street1 == null ? 0: this.street1.hashCode());
    result = 31 * result + (this.street2 == null ? 0: this.street2.hashCode());
    result = 31 * result + (this.postalCode == null ? 0: this.postalCode.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.residential == null ? 0: this.residential.hashCode());
    result = 31 * result + (this.externalNumber == null ? 0: this.externalNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAddress {\n");
    
    sb.append("  street1: ").append(street1).append("\n");
    sb.append("  street2: ").append(street2).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  residential: ").append(residential).append("\n");
    sb.append("  externalNumber: ").append(externalNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
