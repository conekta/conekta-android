package io.conekta.model;

import io.conekta.model.CustomerInfo;
import io.conekta.model.CustomerInfoJustCustomerId;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * It is the information of the customer who will be created when receiving a new payment.
 **/
@ApiModel(description = "It is the information of the customer who will be created when receiving a new payment.")
public class CheckoutOrderTemplateCustomerInfo  {

  private static final String MXN = "MXN";

  @SerializedName("name")
  private String name = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("corporate")
  private Boolean corporate = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("customer_id")
  private String customerId = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Boolean getCorporate() {
    return corporate;
  }

  public void setCorporate(Boolean corporate) {
    this.corporate = corporate;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutOrderTemplateCustomerInfo checkoutOrderTemplateCustomerInfo = (CheckoutOrderTemplateCustomerInfo) o;
    return (this.name == null ? checkoutOrderTemplateCustomerInfo.name == null : this.name.equals(checkoutOrderTemplateCustomerInfo.name)) &&
        (this.email == null ? checkoutOrderTemplateCustomerInfo.email == null : this.email.equals(checkoutOrderTemplateCustomerInfo.email)) &&
        (this.phone == null ? checkoutOrderTemplateCustomerInfo.phone == null : this.phone.equals(checkoutOrderTemplateCustomerInfo.phone)) &&
        (this.corporate == null ? checkoutOrderTemplateCustomerInfo.corporate == null : this.corporate.equals(checkoutOrderTemplateCustomerInfo.corporate)) &&
        (this._object == null ? checkoutOrderTemplateCustomerInfo._object == null : this._object.equals(checkoutOrderTemplateCustomerInfo._object)) &&
        (this.customerId == null ? checkoutOrderTemplateCustomerInfo.customerId == null : this.customerId.equals(checkoutOrderTemplateCustomerInfo.customerId));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
    result = 31 * result + (this.email == null ? 0 : this.email.hashCode());
    result = 31 * result + (this.phone == null ? 0 : this.phone.hashCode());
    result = 31 * result + (this.corporate == null ? 0 : this.corporate.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.customerId == null ? 0 : this.customerId.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutOrderTemplateCustomerInfo {\n");
    
    sb.append("  name: ").append(name).append("\n");
sb.append("  email: ").append(email).append("\n");
sb.append("  phone: ").append(phone).append("\n");
sb.append("  corporate: ").append(corporate).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
