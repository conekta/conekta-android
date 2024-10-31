package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class BlacklistRuleResponse  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("field")
  private String field = null;
  @SerializedName("value")
  private String value = null;
  @SerializedName("description")
  private String description = null;

  /**
   * Blacklist rule id
   **/
  @ApiModelProperty(value = "Blacklist rule id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * field used for blacklists rule
   **/
  @ApiModelProperty(value = "field used for blacklists rule")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

  /**
   * value used for blacklists rule
   **/
  @ApiModelProperty(value = "value used for blacklists rule")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * use an description for blacklisted rule
   **/
  @ApiModelProperty(value = "use an description for blacklisted rule")
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
    BlacklistRuleResponse blacklistRuleResponse = (BlacklistRuleResponse) o;
    return (this.id == null ? blacklistRuleResponse.id == null : this.id.equals(blacklistRuleResponse.id)) &&
        (this.field == null ? blacklistRuleResponse.field == null : this.field.equals(blacklistRuleResponse.field)) &&
        (this.value == null ? blacklistRuleResponse.value == null : this.value.equals(blacklistRuleResponse.value)) &&
        (this.description == null ? blacklistRuleResponse.description == null : this.description.equals(blacklistRuleResponse.description));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.field == null ? 0: this.field.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlacklistRuleResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  field: ").append(field).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
