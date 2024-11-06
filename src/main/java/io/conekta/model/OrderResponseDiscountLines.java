package io.conekta.model;

import io.conekta.model.DiscountLinesDataResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class OrderResponseDiscountLines  {

  private static final String MXN = "MXN";

  @SerializedName("has_more")
  private Boolean hasMore = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("data")
  private List<DiscountLinesDataResponse> data = null;

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
  public List<DiscountLinesDataResponse> getData() {
    return data;
  }

  public void setData(List<DiscountLinesDataResponse> data) {
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
    OrderResponseDiscountLines orderResponseDiscountLines = (OrderResponseDiscountLines) o;
    return (this.hasMore == null ? orderResponseDiscountLines.hasMore == null : this.hasMore.equals(orderResponseDiscountLines.hasMore)) &&
        (this._object == null ? orderResponseDiscountLines._object == null : this._object.equals(orderResponseDiscountLines._object)) &&
        (this.data == null ? orderResponseDiscountLines.data == null : this.data.equals(orderResponseDiscountLines.data));
    
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
    sb.append("class OrderResponseDiscountLines {\n");
    
    sb.append("  hasMore: ").append(hasMore).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  data: ").append(data).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
