package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class ApiKeyRequest  {

  private static final String MXN = "MXN";

  @SerializedName("description")
  private String description = null;
  @SerializedName("role")
  private String role = null;

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
  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyRequest apiKeyRequest = (ApiKeyRequest) o;
    return (this.description == null ? apiKeyRequest.description == null : this.description.equals(apiKeyRequest.description)) &&
        (this.role == null ? apiKeyRequest.role == null : this.role.equals(apiKeyRequest.role));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
    result = 31 * result + (this.role == null ? 0 : this.role.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyRequest {\n");
    
    sb.append("  description: ").append(description).append("\n");
sb.append("  role: ").append(role).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
