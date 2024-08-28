package io.conekta.model;

import io.conekta.model.OasAnyTypeNotMapped;
import java.net.URI;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * event model
 **/
@ApiModel(description = "event model")
public class EventsResendResponse  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("failed_attempts")
  private Integer failedAttempts = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("last_attempted_at")
  private Integer lastAttemptedAt = null;
  @SerializedName("last_http_response_status")
  private Integer lastHttpResponseStatus = null;
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
    EventsResendResponse eventsResendResponse = (EventsResendResponse) o;
    return (this.failedAttempts == null ? eventsResendResponse.failedAttempts == null : this.failedAttempts.equals(eventsResendResponse.failedAttempts)) &&
        (this.id == null ? eventsResendResponse.id == null : this.id.equals(eventsResendResponse.id)) &&
        (this.lastAttemptedAt == null ? eventsResendResponse.lastAttemptedAt == null : this.lastAttemptedAt.equals(eventsResendResponse.lastAttemptedAt)) &&
        (this.lastHttpResponseStatus == null ? eventsResendResponse.lastHttpResponseStatus == null : this.lastHttpResponseStatus.equals(eventsResendResponse.lastHttpResponseStatus)) &&
        (this.responseData == null ? eventsResendResponse.responseData == null : this.responseData.equals(eventsResendResponse.responseData)) &&
        (this.url == null ? eventsResendResponse.url == null : this.url.equals(eventsResendResponse.url));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.failedAttempts == null ? 0: this.failedAttempts.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.lastAttemptedAt == null ? 0: this.lastAttemptedAt.hashCode());
    result = 31 * result + (this.lastHttpResponseStatus == null ? 0: this.lastHttpResponseStatus.hashCode());
    result = 31 * result + (this.responseData == null ? 0: this.responseData.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsResendResponse {\n");
    
    sb.append("  failedAttempts: ").append(failedAttempts).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lastAttemptedAt: ").append(lastAttemptedAt).append("\n");
    sb.append("  lastHttpResponseStatus: ").append(lastHttpResponseStatus).append("\n");
    sb.append("  responseData: ").append(responseData).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
