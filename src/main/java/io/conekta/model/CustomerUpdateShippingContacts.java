package io.conekta.model;

import io.conekta.model.CustomerShippingContactsAddress;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * [Shipping](https://developers.conekta.com/v2.1.0/reference/createcustomershippingcontacts) details, required in case of sending a shipping. If we do not receive a shipping_contact on the order, the default shipping_contact of the customer will be used.
 **/
@ApiModel(description = "[Shipping](https://developers.conekta.com/v2.1.0/reference/createcustomershippingcontacts) details, required in case of sending a shipping. If we do not receive a shipping_contact on the order, the default shipping_contact of the customer will be used.")
public class CustomerUpdateShippingContacts  {

  private static final String MXN = "MXN";

  @SerializedName("phone")
  private String phone = null;
  @SerializedName("receiver")
  private String receiver = null;
  @SerializedName("between_streets")
  private String betweenStreets = null;
  @SerializedName("address")
  private CustomerShippingContactsAddress address = null;
  @SerializedName("parent_id")
  private String parentId = null;
  @SerializedName("default")
  private Boolean _default = null;
  @SerializedName("deleted")
  private Boolean deleted = null;

  /**
   * Phone contact
   * 
   **/
  @ApiModelProperty(value = "Phone contact")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
  /**
   * Name of the person who will receive the order
   * 
   **/
  @ApiModelProperty(value = "Name of the person who will receive the order")
  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }
  /**
   * The street names between which the order will be delivered.
   * 
   **/
  @ApiModelProperty(value = "The street names between which the order will be delivered.")
  public String getBetweenStreets() {
    return betweenStreets;
  }

  public void setBetweenStreets(String betweenStreets) {
    this.betweenStreets = betweenStreets;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public CustomerShippingContactsAddress getAddress() {
    return address;
  }

  public void setAddress(CustomerShippingContactsAddress address) {
    this.address = address;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerUpdateShippingContacts customerUpdateShippingContacts = (CustomerUpdateShippingContacts) o;
    return (this.phone == null ? customerUpdateShippingContacts.phone == null : this.phone.equals(customerUpdateShippingContacts.phone)) &&
        (this.receiver == null ? customerUpdateShippingContacts.receiver == null : this.receiver.equals(customerUpdateShippingContacts.receiver)) &&
        (this.betweenStreets == null ? customerUpdateShippingContacts.betweenStreets == null : this.betweenStreets.equals(customerUpdateShippingContacts.betweenStreets)) &&
        (this.address == null ? customerUpdateShippingContacts.address == null : this.address.equals(customerUpdateShippingContacts.address)) &&
        (this.parentId == null ? customerUpdateShippingContacts.parentId == null : this.parentId.equals(customerUpdateShippingContacts.parentId)) &&
        (this._default == null ? customerUpdateShippingContacts._default == null : this._default.equals(customerUpdateShippingContacts._default)) &&
        (this.deleted == null ? customerUpdateShippingContacts.deleted == null : this.deleted.equals(customerUpdateShippingContacts.deleted));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.phone == null ? 0 : this.phone.hashCode());
    result = 31 * result + (this.receiver == null ? 0 : this.receiver.hashCode());
    result = 31 * result + (this.betweenStreets == null ? 0 : this.betweenStreets.hashCode());
    result = 31 * result + (this.address == null ? 0 : this.address.hashCode());
    result = 31 * result + (this.parentId == null ? 0 : this.parentId.hashCode());
    result = 31 * result + (this._default == null ? 0 : this._default.hashCode());
    result = 31 * result + (this.deleted == null ? 0 : this.deleted.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUpdateShippingContacts {\n");
    
    sb.append("  phone: ").append(phone).append("\n");
sb.append("  receiver: ").append(receiver).append("\n");
sb.append("  betweenStreets: ").append(betweenStreets).append("\n");
sb.append("  address: ").append(address).append("\n");
sb.append("  parentId: ").append(parentId).append("\n");
sb.append("  _default: ").append(_default).append("\n");
sb.append("  deleted: ").append(deleted).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
