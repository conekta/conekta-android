package io.conekta.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * webhooks model
 **/
@ApiModel(description = "webhooks model")
public class WebhookResponse  {

  private static final String MXN = "MXN";

  @SerializedName("deleted")
  private Boolean deleted = null;
  @SerializedName("development_enabled")
  private Boolean developmentEnabled = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("production_enabled")
  private Boolean productionEnabled = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("subscribed_events")
  private List<String> subscribedEvents = null;
  @SerializedName("synchronous")
  private Boolean synchronous = null;
  @SerializedName("url")
  private String url = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Boolean getDevelopmentEnabled() {
    return developmentEnabled;
  }

  public void setDevelopmentEnabled(Boolean developmentEnabled) {
    this.developmentEnabled = developmentEnabled;
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
  public Boolean getProductionEnabled() {
    return productionEnabled;
  }

  public void setProductionEnabled(Boolean productionEnabled) {
    this.productionEnabled = productionEnabled;
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
  public List<String> getSubscribedEvents() {
    return subscribedEvents;
  }

  public void setSubscribedEvents(List<String> subscribedEvents) {
    this.subscribedEvents = subscribedEvents;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Boolean getSynchronous() {
    return synchronous;
  }

  public void setSynchronous(Boolean synchronous) {
    this.synchronous = synchronous;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponse webhookResponse = (WebhookResponse) o;
    return (this.deleted == null ? webhookResponse.deleted == null : this.deleted.equals(webhookResponse.deleted)) &&
        (this.developmentEnabled == null ? webhookResponse.developmentEnabled == null : this.developmentEnabled.equals(webhookResponse.developmentEnabled)) &&
        (this.id == null ? webhookResponse.id == null : this.id.equals(webhookResponse.id)) &&
        (this.livemode == null ? webhookResponse.livemode == null : this.livemode.equals(webhookResponse.livemode)) &&
        (this._object == null ? webhookResponse._object == null : this._object.equals(webhookResponse._object)) &&
        (this.productionEnabled == null ? webhookResponse.productionEnabled == null : this.productionEnabled.equals(webhookResponse.productionEnabled)) &&
        (this.status == null ? webhookResponse.status == null : this.status.equals(webhookResponse.status)) &&
        (this.subscribedEvents == null ? webhookResponse.subscribedEvents == null : this.subscribedEvents.equals(webhookResponse.subscribedEvents)) &&
        (this.synchronous == null ? webhookResponse.synchronous == null : this.synchronous.equals(webhookResponse.synchronous)) &&
        (this.url == null ? webhookResponse.url == null : this.url.equals(webhookResponse.url));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.deleted == null ? 0 : this.deleted.hashCode());
    result = 31 * result + (this.developmentEnabled == null ? 0 : this.developmentEnabled.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0 : this.livemode.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.productionEnabled == null ? 0 : this.productionEnabled.hashCode());
    result = 31 * result + (this.status == null ? 0 : this.status.hashCode());
    result = 31 * result + (this.subscribedEvents == null ? 0 : this.subscribedEvents.hashCode());
    result = 31 * result + (this.synchronous == null ? 0 : this.synchronous.hashCode());
    result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResponse {\n");
    
    sb.append("  deleted: ").append(deleted).append("\n");
sb.append("  developmentEnabled: ").append(developmentEnabled).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  livemode: ").append(livemode).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  productionEnabled: ").append(productionEnabled).append("\n");
sb.append("  status: ").append(status).append("\n");
sb.append("  subscribedEvents: ").append(subscribedEvents).append("\n");
sb.append("  synchronous: ").append(synchronous).append("\n");
sb.append("  url: ").append(url).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
