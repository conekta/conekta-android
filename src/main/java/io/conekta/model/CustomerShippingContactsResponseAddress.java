package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CustomerShippingContactsResponseAddress  {
  
  @SerializedName("object")
  private String _object = null;
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
  private Boolean residential = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
   **/
  @ApiModelProperty(value = "")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerShippingContactsResponseAddress customerShippingContactsResponseAddress = (CustomerShippingContactsResponseAddress) o;
    return (this._object == null ? customerShippingContactsResponseAddress._object == null : this._object.equals(customerShippingContactsResponseAddress._object)) &&
        (this.street1 == null ? customerShippingContactsResponseAddress.street1 == null : this.street1.equals(customerShippingContactsResponseAddress.street1)) &&
        (this.street2 == null ? customerShippingContactsResponseAddress.street2 == null : this.street2.equals(customerShippingContactsResponseAddress.street2)) &&
        (this.postalCode == null ? customerShippingContactsResponseAddress.postalCode == null : this.postalCode.equals(customerShippingContactsResponseAddress.postalCode)) &&
        (this.city == null ? customerShippingContactsResponseAddress.city == null : this.city.equals(customerShippingContactsResponseAddress.city)) &&
        (this.state == null ? customerShippingContactsResponseAddress.state == null : this.state.equals(customerShippingContactsResponseAddress.state)) &&
        (this.country == null ? customerShippingContactsResponseAddress.country == null : this.country.equals(customerShippingContactsResponseAddress.country)) &&
        (this.residential == null ? customerShippingContactsResponseAddress.residential == null : this.residential.equals(customerShippingContactsResponseAddress.residential));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.street1 == null ? 0: this.street1.hashCode());
    result = 31 * result + (this.street2 == null ? 0: this.street2.hashCode());
    result = 31 * result + (this.postalCode == null ? 0: this.postalCode.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.residential == null ? 0: this.residential.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerShippingContactsResponseAddress {\n");
    
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  street1: ").append(street1).append("\n");
    sb.append("  street2: ").append(street2).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  residential: ").append(residential).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
