package io.conekta.model;

import io.conekta.model.OasAnyTypeNotMapped;
import io.conekta.model.WebhookLog;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * event model
 **/
@ApiModel(description = "event model")
public class EventResponse  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("data")
  private Map<String, OasAnyTypeNotMapped> data = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("webhook_logs")
  private List<WebhookLog> webhookLogs = null;
  @SerializedName("webhook_status")
  private String webhookStatus = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, OasAnyTypeNotMapped> getData() {
    return data;
  }
  public void setData(Map<String, OasAnyTypeNotMapped> data) {
    this.data = data;
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
  public Boolean getLivemode() {
    return livemode;
  }
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
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
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<WebhookLog> getWebhookLogs() {
    return webhookLogs;
  }
  public void setWebhookLogs(List<WebhookLog> webhookLogs) {
    this.webhookLogs = webhookLogs;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getWebhookStatus() {
    return webhookStatus;
  }
  public void setWebhookStatus(String webhookStatus) {
    this.webhookStatus = webhookStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventResponse eventResponse = (EventResponse) o;
    return (this.createdAt == null ? eventResponse.createdAt == null : this.createdAt.equals(eventResponse.createdAt)) &&
        (this.data == null ? eventResponse.data == null : this.data.equals(eventResponse.data)) &&
        (this.id == null ? eventResponse.id == null : this.id.equals(eventResponse.id)) &&
        (this.livemode == null ? eventResponse.livemode == null : this.livemode.equals(eventResponse.livemode)) &&
        (this._object == null ? eventResponse._object == null : this._object.equals(eventResponse._object)) &&
        (this.type == null ? eventResponse.type == null : this.type.equals(eventResponse.type)) &&
        (this.webhookLogs == null ? eventResponse.webhookLogs == null : this.webhookLogs.equals(eventResponse.webhookLogs)) &&
        (this.webhookStatus == null ? eventResponse.webhookStatus == null : this.webhookStatus.equals(eventResponse.webhookStatus));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0: this.livemode.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.webhookLogs == null ? 0: this.webhookLogs.hashCode());
    result = 31 * result + (this.webhookStatus == null ? 0: this.webhookStatus.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResponse {\n");
    
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  livemode: ").append(livemode).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  webhookLogs: ").append(webhookLogs).append("\n");
    sb.append("  webhookStatus: ").append(webhookStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
