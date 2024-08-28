package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * webhook keys model
 **/
@ApiModel(description = "webhook keys model")
public class WebhookKeyCreateResponse  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("public_key")
  private String publicKey = null;

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

  /**
   * Public key to be used in the webhook
   **/
  @ApiModelProperty(value = "Public key to be used in the webhook")
  public String getPublicKey() {
    return publicKey;
  }
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookKeyCreateResponse webhookKeyCreateResponse = (WebhookKeyCreateResponse) o;
    return (this.active == null ? webhookKeyCreateResponse.active == null : this.active.equals(webhookKeyCreateResponse.active)) &&
        (this.createdAt == null ? webhookKeyCreateResponse.createdAt == null : this.createdAt.equals(webhookKeyCreateResponse.createdAt)) &&
        (this.id == null ? webhookKeyCreateResponse.id == null : this.id.equals(webhookKeyCreateResponse.id)) &&
        (this.livemode == null ? webhookKeyCreateResponse.livemode == null : this.livemode.equals(webhookKeyCreateResponse.livemode)) &&
        (this._object == null ? webhookKeyCreateResponse._object == null : this._object.equals(webhookKeyCreateResponse._object)) &&
        (this.publicKey == null ? webhookKeyCreateResponse.publicKey == null : this.publicKey.equals(webhookKeyCreateResponse.publicKey));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0: this.livemode.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.publicKey == null ? 0: this.publicKey.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookKeyCreateResponse {\n");
    
    sb.append("  active: ").append(active).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  livemode: ").append(livemode).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  publicKey: ").append(publicKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
