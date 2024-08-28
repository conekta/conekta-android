package io.conekta.model;

import io.conekta.model.OasAnyTypeNotMapped;
import java.net.URI;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class WebhookLog  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("failed_attempts")
  private Integer failedAttempts = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("last_attempted_at")
  private Integer lastAttemptedAt = null;
  @SerializedName("last_http_response_status")
  private Integer lastHttpResponseStatus = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("response_data")
  private Map<String, OasAnyTypeNotMapped> responseData = null;
  @SerializedName("url")
  private URI url = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFailedAttempts() {
    return failedAttempts;
  }
  public void setFailedAttempts(Integer failedAttempts) {
    this.failedAttempts = failedAttempts;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLastAttemptedAt() {
    return lastAttemptedAt;
  }
  public void setLastAttemptedAt(Integer lastAttemptedAt) {
    this.lastAttemptedAt = lastAttemptedAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLastHttpResponseStatus() {
    return lastHttpResponseStatus;
  }
  public void setLastHttpResponseStatus(Integer lastHttpResponseStatus) {
    this.lastHttpResponseStatus = lastHttpResponseStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, OasAnyTypeNotMapped> getResponseData() {
    return responseData;
  }
  public void setResponseData(Map<String, OasAnyTypeNotMapped> responseData) {
    this.responseData = responseData;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public URI getUrl() {
    return url;
  }
  public void setUrl(URI url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookLog webhookLog = (WebhookLog) o;
    return (this.failedAttempts == null ? webhookLog.failedAttempts == null : this.failedAttempts.equals(webhookLog.failedAttempts)) &&
        (this.id == null ? webhookLog.id == null : this.id.equals(webhookLog.id)) &&
        (this.lastAttemptedAt == null ? webhookLog.lastAttemptedAt == null : this.lastAttemptedAt.equals(webhookLog.lastAttemptedAt)) &&
        (this.lastHttpResponseStatus == null ? webhookLog.lastHttpResponseStatus == null : this.lastHttpResponseStatus.equals(webhookLog.lastHttpResponseStatus)) &&
        (this._object == null ? webhookLog._object == null : this._object.equals(webhookLog._object)) &&
        (this.responseData == null ? webhookLog.responseData == null : this.responseData.equals(webhookLog.responseData)) &&
        (this.url == null ? webhookLog.url == null : this.url.equals(webhookLog.url));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.failedAttempts == null ? 0: this.failedAttempts.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.lastAttemptedAt == null ? 0: this.lastAttemptedAt.hashCode());
    result = 31 * result + (this.lastHttpResponseStatus == null ? 0: this.lastHttpResponseStatus.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.responseData == null ? 0: this.responseData.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookLog {\n");
    
    sb.append("  failedAttempts: ").append(failedAttempts).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lastAttemptedAt: ").append(lastAttemptedAt).append("\n");
    sb.append("  lastHttpResponseStatus: ").append(lastHttpResponseStatus).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  responseData: ").append(responseData).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
