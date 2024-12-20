package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class ApiKeyCreateResponse  {

  private static final String MXN = "MXN";

  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("updated_at")
  private Long updatedAt = null;
  @SerializedName("deactivated_at")
  private Long deactivatedAt = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("deleted")
  private Boolean deleted = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("prefix")
  private String prefix = null;
  @SerializedName("role")
  private String role = null;
  @SerializedName("authentication_token")
  private String authenticationToken = null;

  /**
   * Indicates if the api key is active
   * 
   **/
  @ApiModelProperty(value = "Indicates if the api key is active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }
  /**
   * Unix timestamp in seconds of when the api key was created
   * 
   **/
  @ApiModelProperty(value = "Unix timestamp in seconds of when the api key was created")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }
  /**
   * Unix timestamp in seconds of when the api key was last updated
   * 
   **/
  @ApiModelProperty(value = "Unix timestamp in seconds of when the api key was last updated")
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }
  /**
   * Unix timestamp in seconds of when the api key was deleted
   * 
   **/
  @ApiModelProperty(value = "Unix timestamp in seconds of when the api key was deleted")
  public Long getDeactivatedAt() {
    return deactivatedAt;
  }

  public void setDeactivatedAt(Long deactivatedAt) {
    this.deactivatedAt = deactivatedAt;
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
  /**
   * Unique identifier of the api key
   * 
   **/
  @ApiModelProperty(value = "Unique identifier of the api key")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  /**
   * Indicates if the api key is in production
   * 
   **/
  @ApiModelProperty(value = "Indicates if the api key is in production")
  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }
  /**
   * Indicates if the api key was deleted
   * 
   **/
  @ApiModelProperty(value = "Indicates if the api key was deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }
  /**
   * Object name, value is 'api_key'
   * 
   **/
  @ApiModelProperty(value = "Object name, value is 'api_key'")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }
  /**
   * The first few characters of the authentication_token
   * 
   **/
  @ApiModelProperty(value = "The first few characters of the authentication_token")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }
  /**
   * Indicates if the api key is private or public
   * 
   **/
  @ApiModelProperty(value = "Indicates if the api key is private or public")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }
  /**
   * It is occupied as a user when authenticated with basic authentication, with a blank password. This value will only appear once, in the request to create a new key. Copy and save it in a safe place.
   * 
   **/
  @ApiModelProperty(value = "It is occupied as a user when authenticated with basic authentication, with a blank password. This value will only appear once, in the request to create a new key. Copy and save it in a safe place.")
  public String getAuthenticationToken() {
    return authenticationToken;
  }

  public void setAuthenticationToken(String authenticationToken) {
    this.authenticationToken = authenticationToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyCreateResponse apiKeyCreateResponse = (ApiKeyCreateResponse) o;
    return (this.active == null ? apiKeyCreateResponse.active == null : this.active.equals(apiKeyCreateResponse.active)) &&
        (this.createdAt == null ? apiKeyCreateResponse.createdAt == null : this.createdAt.equals(apiKeyCreateResponse.createdAt)) &&
        (this.updatedAt == null ? apiKeyCreateResponse.updatedAt == null : this.updatedAt.equals(apiKeyCreateResponse.updatedAt)) &&
        (this.deactivatedAt == null ? apiKeyCreateResponse.deactivatedAt == null : this.deactivatedAt.equals(apiKeyCreateResponse.deactivatedAt)) &&
        (this.description == null ? apiKeyCreateResponse.description == null : this.description.equals(apiKeyCreateResponse.description)) &&
        (this.id == null ? apiKeyCreateResponse.id == null : this.id.equals(apiKeyCreateResponse.id)) &&
        (this.livemode == null ? apiKeyCreateResponse.livemode == null : this.livemode.equals(apiKeyCreateResponse.livemode)) &&
        (this.deleted == null ? apiKeyCreateResponse.deleted == null : this.deleted.equals(apiKeyCreateResponse.deleted)) &&
        (this._object == null ? apiKeyCreateResponse._object == null : this._object.equals(apiKeyCreateResponse._object)) &&
        (this.prefix == null ? apiKeyCreateResponse.prefix == null : this.prefix.equals(apiKeyCreateResponse.prefix)) &&
        (this.role == null ? apiKeyCreateResponse.role == null : this.role.equals(apiKeyCreateResponse.role)) &&
        (this.authenticationToken == null ? apiKeyCreateResponse.authenticationToken == null : this.authenticationToken.equals(apiKeyCreateResponse.authenticationToken));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0 : this.active.hashCode());
    result = 31 * result + (this.createdAt == null ? 0 : this.createdAt.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0 : this.updatedAt.hashCode());
    result = 31 * result + (this.deactivatedAt == null ? 0 : this.deactivatedAt.hashCode());
    result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0 : this.livemode.hashCode());
    result = 31 * result + (this.deleted == null ? 0 : this.deleted.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.prefix == null ? 0 : this.prefix.hashCode());
    result = 31 * result + (this.role == null ? 0 : this.role.hashCode());
    result = 31 * result + (this.authenticationToken == null ? 0 : this.authenticationToken.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyCreateResponse {\n");
    
    sb.append("  active: ").append(active).append("\n");
sb.append("  createdAt: ").append(createdAt).append("\n");
sb.append("  updatedAt: ").append(updatedAt).append("\n");
sb.append("  deactivatedAt: ").append(deactivatedAt).append("\n");
sb.append("  description: ").append(description).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  livemode: ").append(livemode).append("\n");
sb.append("  deleted: ").append(deleted).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  prefix: ").append(prefix).append("\n");
sb.append("  role: ").append(role).append("\n");
sb.append("  authenticationToken: ").append(authenticationToken).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
