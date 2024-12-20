package io.conekta.model;

import io.conekta.model.CustomerShippingContactsResponseAddress;
import io.conekta.model.OasAnyTypeNotMapped;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class OrderResponseShippingContact  {

  private static final String MXN = "MXN";

  @SerializedName("phone")
  private String phone = null;
  @SerializedName("receiver")
  private String receiver = null;
  @SerializedName("between_streets")
  private String betweenStreets = null;
  @SerializedName("address")
  private CustomerShippingContactsResponseAddress address = null;
  @SerializedName("parent_id")
  private String parentId = null;
  @SerializedName("default")
  private Boolean _default = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("metadata")
  private Map<String, OasAnyTypeNotMapped> metadata = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("deleted")
  private Boolean deleted = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
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
  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
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
  public CustomerShippingContactsResponseAddress getAddress() {
    return address;
  }

  public void setAddress(CustomerShippingContactsResponseAddress address) {
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
  @ApiModelProperty(value = "")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
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
    OrderResponseShippingContact orderResponseShippingContact = (OrderResponseShippingContact) o;
    return (this.phone == null ? orderResponseShippingContact.phone == null : this.phone.equals(orderResponseShippingContact.phone)) &&
        (this.receiver == null ? orderResponseShippingContact.receiver == null : this.receiver.equals(orderResponseShippingContact.receiver)) &&
        (this.betweenStreets == null ? orderResponseShippingContact.betweenStreets == null : this.betweenStreets.equals(orderResponseShippingContact.betweenStreets)) &&
        (this.address == null ? orderResponseShippingContact.address == null : this.address.equals(orderResponseShippingContact.address)) &&
        (this.parentId == null ? orderResponseShippingContact.parentId == null : this.parentId.equals(orderResponseShippingContact.parentId)) &&
        (this._default == null ? orderResponseShippingContact._default == null : this._default.equals(orderResponseShippingContact._default)) &&
        (this.id == null ? orderResponseShippingContact.id == null : this.id.equals(orderResponseShippingContact.id)) &&
        (this.createdAt == null ? orderResponseShippingContact.createdAt == null : this.createdAt.equals(orderResponseShippingContact.createdAt)) &&
        (this.metadata == null ? orderResponseShippingContact.metadata == null : this.metadata.equals(orderResponseShippingContact.metadata)) &&
        (this._object == null ? orderResponseShippingContact._object == null : this._object.equals(orderResponseShippingContact._object)) &&
        (this.deleted == null ? orderResponseShippingContact.deleted == null : this.deleted.equals(orderResponseShippingContact.deleted));
    
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
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this.createdAt == null ? 0 : this.createdAt.hashCode());
    result = 31 * result + (this.metadata == null ? 0 : this.metadata.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.deleted == null ? 0 : this.deleted.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponseShippingContact {\n");
    
    sb.append("  phone: ").append(phone).append("\n");
sb.append("  receiver: ").append(receiver).append("\n");
sb.append("  betweenStreets: ").append(betweenStreets).append("\n");
sb.append("  address: ").append(address).append("\n");
sb.append("  parentId: ").append(parentId).append("\n");
sb.append("  _default: ").append(_default).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  createdAt: ").append(createdAt).append("\n");
sb.append("  metadata: ").append(metadata).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  deleted: ").append(deleted).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
