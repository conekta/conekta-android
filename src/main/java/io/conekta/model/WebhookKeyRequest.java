package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class WebhookKeyRequest  {

  private static final String MXN = "MXN";

  @SerializedName("active")
  private Boolean active = true;

  /**
   * Indicates if the webhook key is active
   * 
   **/
  @ApiModelProperty(value = "Indicates if the webhook key is active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookKeyRequest webhookKeyRequest = (WebhookKeyRequest) o;
    return (this.active == null ? webhookKeyRequest.active == null : this.active.equals(webhookKeyRequest.active));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0 : this.active.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookKeyRequest {\n");
    
    sb.append("  active: ").append(active).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
