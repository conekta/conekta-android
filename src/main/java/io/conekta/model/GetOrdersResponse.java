package io.conekta.model;

import io.conekta.model.OrderResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class GetOrdersResponse  {
  
  @SerializedName("data")
  private List<OrderResponse> data = null;
  @SerializedName("has_more")
  private Boolean hasMore = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("next_page_url")
  private String nextPageUrl = null;
  @SerializedName("previous_page_url")
  private String previousPageUrl = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<OrderResponse> getData() {
    return data;
  }
  public void setData(List<OrderResponse> data) {
    this.data = data;
  }

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
   * URL of the next page.
   **/
  @ApiModelProperty(value = "URL of the next page.")
  public String getNextPageUrl() {
    return nextPageUrl;
  }
  public void setNextPageUrl(String nextPageUrl) {
    this.nextPageUrl = nextPageUrl;
  }

  /**
   * Url of the previous page.
   **/
  @ApiModelProperty(value = "Url of the previous page.")
  public String getPreviousPageUrl() {
    return previousPageUrl;
  }
  public void setPreviousPageUrl(String previousPageUrl) {
    this.previousPageUrl = previousPageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrdersResponse getOrdersResponse = (GetOrdersResponse) o;
    return (this.data == null ? getOrdersResponse.data == null : this.data.equals(getOrdersResponse.data)) &&
        (this.hasMore == null ? getOrdersResponse.hasMore == null : this.hasMore.equals(getOrdersResponse.hasMore)) &&
        (this._object == null ? getOrdersResponse._object == null : this._object.equals(getOrdersResponse._object)) &&
        (this.nextPageUrl == null ? getOrdersResponse.nextPageUrl == null : this.nextPageUrl.equals(getOrdersResponse.nextPageUrl)) &&
        (this.previousPageUrl == null ? getOrdersResponse.previousPageUrl == null : this.previousPageUrl.equals(getOrdersResponse.previousPageUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.hasMore == null ? 0: this.hasMore.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.nextPageUrl == null ? 0: this.nextPageUrl.hashCode());
    result = 31 * result + (this.previousPageUrl == null ? 0: this.previousPageUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrdersResponse {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("  hasMore: ").append(hasMore).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  nextPageUrl: ").append(nextPageUrl).append("\n");
    sb.append("  previousPageUrl: ").append(previousPageUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
