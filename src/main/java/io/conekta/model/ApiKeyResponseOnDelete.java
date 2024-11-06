package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * api keys model
 **/
@ApiModel(description = "api keys model")
public class ApiKeyResponseOnDelete  {

  private static final String MXN = "MXN";

  @SerializedName("active")
  private Boolean active = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("prefix")
  private String prefix = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("deleted")
  private Boolean deleted = null;
  @SerializedName("role")
  private String role = null;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyResponseOnDelete apiKeyResponseOnDelete = (ApiKeyResponseOnDelete) o;
    return (this.active == null ? apiKeyResponseOnDelete.active == null : this.active.equals(apiKeyResponseOnDelete.active)) &&
        (this.createdAt == null ? apiKeyResponseOnDelete.createdAt == null : this.createdAt.equals(apiKeyResponseOnDelete.createdAt)) &&
        (this.description == null ? apiKeyResponseOnDelete.description == null : this.description.equals(apiKeyResponseOnDelete.description)) &&
        (this.livemode == null ? apiKeyResponseOnDelete.livemode == null : this.livemode.equals(apiKeyResponseOnDelete.livemode)) &&
        (this.prefix == null ? apiKeyResponseOnDelete.prefix == null : this.prefix.equals(apiKeyResponseOnDelete.prefix)) &&
        (this.id == null ? apiKeyResponseOnDelete.id == null : this.id.equals(apiKeyResponseOnDelete.id)) &&
        (this._object == null ? apiKeyResponseOnDelete._object == null : this._object.equals(apiKeyResponseOnDelete._object)) &&
        (this.deleted == null ? apiKeyResponseOnDelete.deleted == null : this.deleted.equals(apiKeyResponseOnDelete.deleted)) &&
        (this.role == null ? apiKeyResponseOnDelete.role == null : this.role.equals(apiKeyResponseOnDelete.role));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0 : this.active.hashCode());
    result = 31 * result + (this.createdAt == null ? 0 : this.createdAt.hashCode());
    result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
    result = 31 * result + (this.livemode == null ? 0 : this.livemode.hashCode());
    result = 31 * result + (this.prefix == null ? 0 : this.prefix.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.deleted == null ? 0 : this.deleted.hashCode());
    result = 31 * result + (this.role == null ? 0 : this.role.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyResponseOnDelete {\n");
    
    sb.append("  active: ").append(active).append("\n");
sb.append("  createdAt: ").append(createdAt).append("\n");
sb.append("  description: ").append(description).append("\n");
sb.append("  livemode: ").append(livemode).append("\n");
sb.append("  prefix: ").append(prefix).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  deleted: ").append(deleted).append("\n");
sb.append("  role: ").append(role).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
