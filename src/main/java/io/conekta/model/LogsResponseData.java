package io.conekta.model;

import io.conekta.model.OasAnyTypeNotMapped;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class LogsResponseData  {

  private static final String MXN = "MXN";

  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("ip_address")
  private String ipAddress = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("loggable_id")
  private String loggableId = null;
  @SerializedName("loggable_type")
  private String loggableType = null;
  @SerializedName("method")
  private String method = null;
  @SerializedName("oauth_token_id")
  private String oauthTokenId = null;
  @SerializedName("query_string")
  private Map<String, OasAnyTypeNotMapped> queryString = null;
  @SerializedName("related")
  private String related = null;
  @SerializedName("request_body")
  private Object requestBody = null;
  @SerializedName("request_headers")
  private Map<String, String> requestHeaders = null;
  @SerializedName("response_body")
  private Object responseBody = null;
  @SerializedName("response_headers")
  private Map<String, String> responseHeaders = null;
  @SerializedName("searchable_tags")
  private List<String> searchableTags = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("updated_at")
  private String updatedAt = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("user_account_id")
  private String userAccountId = null;
  @SerializedName("version")
  private String version = null;

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
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getLoggableId() {
    return loggableId;
  }

  public void setLoggableId(String loggableId) {
    this.loggableId = loggableId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getLoggableType() {
    return loggableType;
  }

  public void setLoggableType(String loggableType) {
    this.loggableType = loggableType;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getOauthTokenId() {
    return oauthTokenId;
  }

  public void setOauthTokenId(String oauthTokenId) {
    this.oauthTokenId = oauthTokenId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Map<String, OasAnyTypeNotMapped> getQueryString() {
    return queryString;
  }

  public void setQueryString(Map<String, OasAnyTypeNotMapped> queryString) {
    this.queryString = queryString;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getRelated() {
    return related;
  }

  public void setRelated(String related) {
    this.related = related;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Object getRequestBody() {
    return requestBody;
  }

  public void setRequestBody(Object requestBody) {
    this.requestBody = requestBody;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Map<String, String> getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Object getResponseBody() {
    return responseBody;
  }

  public void setResponseBody(Object responseBody) {
    this.responseBody = responseBody;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Map<String, String> getResponseHeaders() {
    return responseHeaders;
  }

  public void setResponseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public List<String> getSearchableTags() {
    return searchableTags;
  }

  public void setSearchableTags(List<String> searchableTags) {
    this.searchableTags = searchableTags;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getUserAccountId() {
    return userAccountId;
  }

  public void setUserAccountId(String userAccountId) {
    this.userAccountId = userAccountId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsResponseData logsResponseData = (LogsResponseData) o;
    return (this.createdAt == null ? logsResponseData.createdAt == null : this.createdAt.equals(logsResponseData.createdAt)) &&
        (this.id == null ? logsResponseData.id == null : this.id.equals(logsResponseData.id)) &&
        (this.ipAddress == null ? logsResponseData.ipAddress == null : this.ipAddress.equals(logsResponseData.ipAddress)) &&
        (this.livemode == null ? logsResponseData.livemode == null : this.livemode.equals(logsResponseData.livemode)) &&
        (this.loggableId == null ? logsResponseData.loggableId == null : this.loggableId.equals(logsResponseData.loggableId)) &&
        (this.loggableType == null ? logsResponseData.loggableType == null : this.loggableType.equals(logsResponseData.loggableType)) &&
        (this.method == null ? logsResponseData.method == null : this.method.equals(logsResponseData.method)) &&
        (this.oauthTokenId == null ? logsResponseData.oauthTokenId == null : this.oauthTokenId.equals(logsResponseData.oauthTokenId)) &&
        (this.queryString == null ? logsResponseData.queryString == null : this.queryString.equals(logsResponseData.queryString)) &&
        (this.related == null ? logsResponseData.related == null : this.related.equals(logsResponseData.related)) &&
        (this.requestBody == null ? logsResponseData.requestBody == null : this.requestBody.equals(logsResponseData.requestBody)) &&
        (this.requestHeaders == null ? logsResponseData.requestHeaders == null : this.requestHeaders.equals(logsResponseData.requestHeaders)) &&
        (this.responseBody == null ? logsResponseData.responseBody == null : this.responseBody.equals(logsResponseData.responseBody)) &&
        (this.responseHeaders == null ? logsResponseData.responseHeaders == null : this.responseHeaders.equals(logsResponseData.responseHeaders)) &&
        (this.searchableTags == null ? logsResponseData.searchableTags == null : this.searchableTags.equals(logsResponseData.searchableTags)) &&
        (this.status == null ? logsResponseData.status == null : this.status.equals(logsResponseData.status)) &&
        (this.updatedAt == null ? logsResponseData.updatedAt == null : this.updatedAt.equals(logsResponseData.updatedAt)) &&
        (this.url == null ? logsResponseData.url == null : this.url.equals(logsResponseData.url)) &&
        (this.userAccountId == null ? logsResponseData.userAccountId == null : this.userAccountId.equals(logsResponseData.userAccountId)) &&
        (this.version == null ? logsResponseData.version == null : this.version.equals(logsResponseData.version));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.createdAt == null ? 0 : this.createdAt.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this.ipAddress == null ? 0 : this.ipAddress.hashCode());
    result = 31 * result + (this.livemode == null ? 0 : this.livemode.hashCode());
    result = 31 * result + (this.loggableId == null ? 0 : this.loggableId.hashCode());
    result = 31 * result + (this.loggableType == null ? 0 : this.loggableType.hashCode());
    result = 31 * result + (this.method == null ? 0 : this.method.hashCode());
    result = 31 * result + (this.oauthTokenId == null ? 0 : this.oauthTokenId.hashCode());
    result = 31 * result + (this.queryString == null ? 0 : this.queryString.hashCode());
    result = 31 * result + (this.related == null ? 0 : this.related.hashCode());
    result = 31 * result + (this.requestBody == null ? 0 : this.requestBody.hashCode());
    result = 31 * result + (this.requestHeaders == null ? 0 : this.requestHeaders.hashCode());
    result = 31 * result + (this.responseBody == null ? 0 : this.responseBody.hashCode());
    result = 31 * result + (this.responseHeaders == null ? 0 : this.responseHeaders.hashCode());
    result = 31 * result + (this.searchableTags == null ? 0 : this.searchableTags.hashCode());
    result = 31 * result + (this.status == null ? 0 : this.status.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0 : this.updatedAt.hashCode());
    result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
    result = 31 * result + (this.userAccountId == null ? 0 : this.userAccountId.hashCode());
    result = 31 * result + (this.version == null ? 0 : this.version.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsResponseData {\n");
    
    sb.append("  createdAt: ").append(createdAt).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  ipAddress: ").append(ipAddress).append("\n");
sb.append("  livemode: ").append(livemode).append("\n");
sb.append("  loggableId: ").append(loggableId).append("\n");
sb.append("  loggableType: ").append(loggableType).append("\n");
sb.append("  method: ").append(method).append("\n");
sb.append("  oauthTokenId: ").append(oauthTokenId).append("\n");
sb.append("  queryString: ").append(queryString).append("\n");
sb.append("  related: ").append(related).append("\n");
sb.append("  requestBody: ").append(requestBody).append("\n");
sb.append("  requestHeaders: ").append(requestHeaders).append("\n");
sb.append("  responseBody: ").append(responseBody).append("\n");
sb.append("  responseHeaders: ").append(responseHeaders).append("\n");
sb.append("  searchableTags: ").append(searchableTags).append("\n");
sb.append("  status: ").append(status).append("\n");
sb.append("  updatedAt: ").append(updatedAt).append("\n");
sb.append("  url: ").append(url).append("\n");
sb.append("  userAccountId: ").append(userAccountId).append("\n");
sb.append("  version: ").append(version).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
