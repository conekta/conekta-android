package io.conekta.model;

import io.conekta.model.CustomerShippingContactsDataResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class CustomerResponseShippingContacts  {

  private static final String MXN = "MXN";

  @SerializedName("has_more")
  private Boolean hasMore = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("data")
  private List<CustomerShippingContactsDataResponse> data = null;

  /**
   * Indicates if there are more pages to be requested
   * 
   **/
  @ApiModelProperty(required = true, value = "Indicates if there are more pages to be requested")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }
  /**
   * Object type, in this case is list
   * 
   **/
  @ApiModelProperty(required = true, value = "Object type, in this case is list")
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
  public List<CustomerShippingContactsDataResponse> getData() {
    return data;
  }

  public void setData(List<CustomerShippingContactsDataResponse> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerResponseShippingContacts customerResponseShippingContacts = (CustomerResponseShippingContacts) o;
    return (this.hasMore == null ? customerResponseShippingContacts.hasMore == null : this.hasMore.equals(customerResponseShippingContacts.hasMore)) &&
        (this._object == null ? customerResponseShippingContacts._object == null : this._object.equals(customerResponseShippingContacts._object)) &&
        (this.data == null ? customerResponseShippingContacts.data == null : this.data.equals(customerResponseShippingContacts.data));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.hasMore == null ? 0 : this.hasMore.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.data == null ? 0 : this.data.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerResponseShippingContacts {\n");
    
    sb.append("  hasMore: ").append(hasMore).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  data: ").append(data).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
