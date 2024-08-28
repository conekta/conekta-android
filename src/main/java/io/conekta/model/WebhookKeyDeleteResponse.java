package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * webhook keys model
 **/
@ApiModel(description = "webhook keys model")
public class WebhookKeyDeleteResponse  {
  
  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("deleted")
  private Boolean deleted = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("object")
  private String _object = null;

  /**
   * Indicates if the webhook key is active
   **/
  @ApiModelProperty(value = "Indicates if the webhook key is active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * Unix timestamp in seconds with the creation date of the webhook key
   **/
  @ApiModelProperty(value = "Unix timestamp in seconds with the creation date of the webhook key")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Indicates if the webhook key is deleted
   **/
  @ApiModelProperty(value = "Indicates if the webhook key is deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  /**
   * Unique identifier of the webhook key
   **/
  @ApiModelProperty(value = "Unique identifier of the webhook key")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Indicates if the webhook key is in live mode
   **/
  @ApiModelProperty(value = "Indicates if the webhook key is in live mode")
  public Boolean getLivemode() {
    return livemode;
  }
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  /**
   * Object name, value is webhook_key
   **/
  @ApiModelProperty(value = "Object name, value is webhook_key")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookKeyDeleteResponse webhookKeyDeleteResponse = (WebhookKeyDeleteResponse) o;
    return (this.active == null ? webhookKeyDeleteResponse.active == null : this.active.equals(webhookKeyDeleteResponse.active)) &&
        (this.createdAt == null ? webhookKeyDeleteResponse.createdAt == null : this.createdAt.equals(webhookKeyDeleteResponse.createdAt)) &&
        (this.deleted == null ? webhookKeyDeleteResponse.deleted == null : this.deleted.equals(webhookKeyDeleteResponse.deleted)) &&
        (this.id == null ? webhookKeyDeleteResponse.id == null : this.id.equals(webhookKeyDeleteResponse.id)) &&
        (this.livemode == null ? webhookKeyDeleteResponse.livemode == null : this.livemode.equals(webhookKeyDeleteResponse.livemode)) &&
        (this._object == null ? webhookKeyDeleteResponse._object == null : this._object.equals(webhookKeyDeleteResponse._object));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.deleted == null ? 0: this.deleted.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0: this.livemode.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookKeyDeleteResponse {\n");
    
    sb.append("  active: ").append(active).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  deleted: ").append(deleted).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  livemode: ").append(livemode).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
