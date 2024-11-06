package io.conekta.model;

import io.conekta.model.GetCustomerPaymentMethodDataResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class GetPaymentMethodResponse  {

  private static final String MXN = "MXN";

  @SerializedName("has_more")
  private Boolean hasMore = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("next_page_url")
  private String nextPageUrl = null;
  @SerializedName("previous_page_url")
  private String previousPageUrl = null;
  @SerializedName("data")
  private List<GetCustomerPaymentMethodDataResponse> data = null;

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
   * URL of the next page.
   * 
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
   * 
   **/
  @ApiModelProperty(value = "Url of the previous page.")
  public String getPreviousPageUrl() {
    return previousPageUrl;
  }

  public void setPreviousPageUrl(String previousPageUrl) {
    this.previousPageUrl = previousPageUrl;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public List<GetCustomerPaymentMethodDataResponse> getData() {
    return data;
  }

  public void setData(List<GetCustomerPaymentMethodDataResponse> data) {
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
    GetPaymentMethodResponse getPaymentMethodResponse = (GetPaymentMethodResponse) o;
    return (this.hasMore == null ? getPaymentMethodResponse.hasMore == null : this.hasMore.equals(getPaymentMethodResponse.hasMore)) &&
        (this._object == null ? getPaymentMethodResponse._object == null : this._object.equals(getPaymentMethodResponse._object)) &&
        (this.nextPageUrl == null ? getPaymentMethodResponse.nextPageUrl == null : this.nextPageUrl.equals(getPaymentMethodResponse.nextPageUrl)) &&
        (this.previousPageUrl == null ? getPaymentMethodResponse.previousPageUrl == null : this.previousPageUrl.equals(getPaymentMethodResponse.previousPageUrl)) &&
        (this.data == null ? getPaymentMethodResponse.data == null : this.data.equals(getPaymentMethodResponse.data));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.hasMore == null ? 0 : this.hasMore.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.nextPageUrl == null ? 0 : this.nextPageUrl.hashCode());
    result = 31 * result + (this.previousPageUrl == null ? 0 : this.previousPageUrl.hashCode());
    result = 31 * result + (this.data == null ? 0 : this.data.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPaymentMethodResponse {\n");
    
    sb.append("  hasMore: ").append(hasMore).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  nextPageUrl: ").append(nextPageUrl).append("\n");
sb.append("  previousPageUrl: ").append(previousPageUrl).append("\n");
sb.append("  data: ").append(data).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
