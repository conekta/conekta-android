package io.conekta.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


/**
 * an updated webhook
 **/
@ApiModel(description = "an updated webhook")
public class WebhookUpdateRequest  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("url")
  private String url = null;
  @SerializedName("synchronous")
  private Boolean synchronous = false;
  @SerializedName("events")
  private List<String> events = null;

  /**
   * Here you must place the URL of your Webhook remember that you must program what you will do with the events received. Also do not forget to handle the HTTPS protocol for greater security.
   **/
  @ApiModelProperty(required = true, value = "Here you must place the URL of your Webhook remember that you must program what you will do with the events received. Also do not forget to handle the HTTPS protocol for greater security.")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * It is a value that allows to decide if the events will be synchronous or asynchronous. We recommend asynchronous = false
   **/
  @ApiModelProperty(value = "It is a value that allows to decide if the events will be synchronous or asynchronous. We recommend asynchronous = false")
  public Boolean getSynchronous() {
    return synchronous;
  }
  public void setSynchronous(Boolean synchronous) {
    this.synchronous = synchronous;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getEvents() {
    return events;
  }
  public void setEvents(List<String> events) {
    this.events = events;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookUpdateRequest webhookUpdateRequest = (WebhookUpdateRequest) o;
    return (this.url == null ? webhookUpdateRequest.url == null : this.url.equals(webhookUpdateRequest.url)) &&
        (this.synchronous == null ? webhookUpdateRequest.synchronous == null : this.synchronous.equals(webhookUpdateRequest.synchronous)) &&
        (this.events == null ? webhookUpdateRequest.events == null : this.events.equals(webhookUpdateRequest.events));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.synchronous == null ? 0: this.synchronous.hashCode());
    result = 31 * result + (this.events == null ? 0: this.events.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUpdateRequest {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  synchronous: ").append(synchronous).append("\n");
    sb.append("  events: ").append(events).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
