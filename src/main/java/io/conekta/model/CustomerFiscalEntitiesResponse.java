package io.conekta.model;

import io.conekta.model.CustomerFiscalEntitiesDataResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class CustomerFiscalEntitiesResponse  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("has_more")
  private Boolean hasMore = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("data")
  private List<CustomerFiscalEntitiesDataResponse> data = null;

  /**
   * Indicates if there are more pages to be requested
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
   **/
  @ApiModelProperty(required = true, value = "Object type, in this case is list")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CustomerFiscalEntitiesDataResponse> getData() {
    return data;
  }
  public void setData(List<CustomerFiscalEntitiesDataResponse> data) {
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
    CustomerFiscalEntitiesResponse customerFiscalEntitiesResponse = (CustomerFiscalEntitiesResponse) o;
    return (this.hasMore == null ? customerFiscalEntitiesResponse.hasMore == null : this.hasMore.equals(customerFiscalEntitiesResponse.hasMore)) &&
        (this._object == null ? customerFiscalEntitiesResponse._object == null : this._object.equals(customerFiscalEntitiesResponse._object)) &&
        (this.data == null ? customerFiscalEntitiesResponse.data == null : this.data.equals(customerFiscalEntitiesResponse.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.hasMore == null ? 0: this.hasMore.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerFiscalEntitiesResponse {\n");
    
    sb.append("  hasMore: ").append(hasMore).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
