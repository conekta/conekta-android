package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * The customer information of the payout order.
 **/
@ApiModel(description = "The customer information of the payout order.")
public class PayoutOrderResponseCustomerInfo  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("customer_custom_reference")
  private String customerCustomReference = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("corporate")
  private Boolean corporate = false;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("id")
  private String id = null;

  /**
   * Custom reference
   **/
  @ApiModelProperty(value = "Custom reference")
  public String getCustomerCustomReference() {
    return customerCustomReference;
  }
  public void setCustomerCustomReference(String customerCustomReference) {
    this.customerCustomReference = customerCustomReference;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
  public Boolean getCorporate() {
    return corporate;
  }
  public void setCorporate(Boolean corporate) {
    this.corporate = corporate;
  }

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
   * The id of the customer.
   **/
  @ApiModelProperty(required = true, value = "The id of the customer.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutOrderResponseCustomerInfo payoutOrderResponseCustomerInfo = (PayoutOrderResponseCustomerInfo) o;
    return (this.customerCustomReference == null ? payoutOrderResponseCustomerInfo.customerCustomReference == null : this.customerCustomReference.equals(payoutOrderResponseCustomerInfo.customerCustomReference)) &&
        (this.name == null ? payoutOrderResponseCustomerInfo.name == null : this.name.equals(payoutOrderResponseCustomerInfo.name)) &&
        (this.email == null ? payoutOrderResponseCustomerInfo.email == null : this.email.equals(payoutOrderResponseCustomerInfo.email)) &&
        (this.phone == null ? payoutOrderResponseCustomerInfo.phone == null : this.phone.equals(payoutOrderResponseCustomerInfo.phone)) &&
        (this.corporate == null ? payoutOrderResponseCustomerInfo.corporate == null : this.corporate.equals(payoutOrderResponseCustomerInfo.corporate)) &&
        (this._object == null ? payoutOrderResponseCustomerInfo._object == null : this._object.equals(payoutOrderResponseCustomerInfo._object)) &&
        (this.id == null ? payoutOrderResponseCustomerInfo.id == null : this.id.equals(payoutOrderResponseCustomerInfo.id));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.customerCustomReference == null ? 0: this.customerCustomReference.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.corporate == null ? 0: this.corporate.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutOrderResponseCustomerInfo {\n");
    
    sb.append("  customerCustomReference: ").append(customerCustomReference).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  corporate: ").append(corporate).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
