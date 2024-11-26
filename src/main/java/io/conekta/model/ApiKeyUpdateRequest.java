package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class ApiKeyUpdateRequest  {

  private static final String MXN = "MXN";

  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("description")
  private String description = null;

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
  /**
   * A name or brief explanation of what this api key is used for
   * 
   **/
  @ApiModelProperty(value = "A name or brief explanation of what this api key is used for")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyUpdateRequest apiKeyUpdateRequest = (ApiKeyUpdateRequest) o;
    return (this.active == null ? apiKeyUpdateRequest.active == null : this.active.equals(apiKeyUpdateRequest.active)) &&
        (this.description == null ? apiKeyUpdateRequest.description == null : this.description.equals(apiKeyUpdateRequest.description));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0 : this.active.hashCode());
    result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyUpdateRequest {\n");
    
    sb.append("  active: ").append(active).append("\n");
sb.append("  description: ").append(description).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
