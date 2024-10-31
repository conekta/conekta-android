package io.conekta.model;

import io.conekta.model.LogsResponseData;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


/**
 * logs model
 **/
@ApiModel(description = "logs model")
public class LogsResponse  {
  
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
  private List<LogsResponseData> data = null;

  /**
   * True, if there are more pages.
   **/
  @ApiModelProperty(value = "True, if there are more pages.")
  public Boolean getHasMore() {
    return hasMore;
  }
  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  /**
   * The object type
   **/
  @ApiModelProperty(value = "The object type")
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

  /**
   * set to page results.
   **/
  @ApiModelProperty(value = "set to page results.")
  public List<LogsResponseData> getData() {
    return data;
  }
  public void setData(List<LogsResponseData> data) {
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
    LogsResponse logsResponse = (LogsResponse) o;
    return (this.hasMore == null ? logsResponse.hasMore == null : this.hasMore.equals(logsResponse.hasMore)) &&
        (this._object == null ? logsResponse._object == null : this._object.equals(logsResponse._object)) &&
        (this.nextPageUrl == null ? logsResponse.nextPageUrl == null : this.nextPageUrl.equals(logsResponse.nextPageUrl)) &&
        (this.previousPageUrl == null ? logsResponse.previousPageUrl == null : this.previousPageUrl.equals(logsResponse.previousPageUrl)) &&
        (this.data == null ? logsResponse.data == null : this.data.equals(logsResponse.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.hasMore == null ? 0: this.hasMore.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.nextPageUrl == null ? 0: this.nextPageUrl.hashCode());
    result = 31 * result + (this.previousPageUrl == null ? 0: this.previousPageUrl.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsResponse {\n");
    
    sb.append("  hasMore: ").append(hasMore).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  nextPageUrl: ").append(nextPageUrl).append("\n");
    sb.append("  previousPageUrl: ").append(previousPageUrl).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
