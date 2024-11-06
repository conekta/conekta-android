package io.conekta.model;

import io.conekta.model.CustomerShippingContactsAddress;
import io.conekta.model.OasAnyTypeNotMapped;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class CustomerShippingContactsDataResponse  {

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
  @SerializedName("metadata")
  private Map<String, OasAnyTypeNotMapped> metadata = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("created_at")
  private Long createdAt = null;

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
  @ApiModelProperty(required = true, value = "")
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
  /**
   * Metadata associated with the shipping contact
   * 
   **/
  @ApiModelProperty(value = "Metadata associated with the shipping contact")
  public Map<String, OasAnyTypeNotMapped> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, OasAnyTypeNotMapped> metadata) {
    this.metadata = metadata;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
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
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerShippingContactsDataResponse customerShippingContactsDataResponse = (CustomerShippingContactsDataResponse) o;
    return (this.phone == null ? customerShippingContactsDataResponse.phone == null : this.phone.equals(customerShippingContactsDataResponse.phone)) &&
        (this.receiver == null ? customerShippingContactsDataResponse.receiver == null : this.receiver.equals(customerShippingContactsDataResponse.receiver)) &&
        (this.betweenStreets == null ? customerShippingContactsDataResponse.betweenStreets == null : this.betweenStreets.equals(customerShippingContactsDataResponse.betweenStreets)) &&
        (this.address == null ? customerShippingContactsDataResponse.address == null : this.address.equals(customerShippingContactsDataResponse.address)) &&
        (this.parentId == null ? customerShippingContactsDataResponse.parentId == null : this.parentId.equals(customerShippingContactsDataResponse.parentId)) &&
        (this._default == null ? customerShippingContactsDataResponse._default == null : this._default.equals(customerShippingContactsDataResponse._default)) &&
        (this.deleted == null ? customerShippingContactsDataResponse.deleted == null : this.deleted.equals(customerShippingContactsDataResponse.deleted)) &&
        (this.metadata == null ? customerShippingContactsDataResponse.metadata == null : this.metadata.equals(customerShippingContactsDataResponse.metadata)) &&
        (this.id == null ? customerShippingContactsDataResponse.id == null : this.id.equals(customerShippingContactsDataResponse.id)) &&
        (this._object == null ? customerShippingContactsDataResponse._object == null : this._object.equals(customerShippingContactsDataResponse._object)) &&
        (this.createdAt == null ? customerShippingContactsDataResponse.createdAt == null : this.createdAt.equals(customerShippingContactsDataResponse.createdAt));
    
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
    result = 31 * result + (this.metadata == null ? 0 : this.metadata.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.createdAt == null ? 0 : this.createdAt.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerShippingContactsDataResponse {\n");
    
    sb.append("  phone: ").append(phone).append("\n");
sb.append("  receiver: ").append(receiver).append("\n");
sb.append("  betweenStreets: ").append(betweenStreets).append("\n");
sb.append("  address: ").append(address).append("\n");
sb.append("  parentId: ").append(parentId).append("\n");
sb.append("  _default: ").append(_default).append("\n");
sb.append("  deleted: ").append(deleted).append("\n");
sb.append("  metadata: ").append(metadata).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
