package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class WhitelistlistRuleResponse  {

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
   * Whitelist rule id
   * 
   **/
  @ApiModelProperty(value = "Whitelist rule id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  /**
   * field used for whitelists rule
   * 
   **/
  @ApiModelProperty(value = "field used for whitelists rule")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }
  /**
   * value used for whitelists rule
   * 
   **/
  @ApiModelProperty(value = "value used for whitelists rule")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
  /**
   * use an description for whitelisted rule
   * 
   **/
  @ApiModelProperty(value = "use an description for whitelisted rule")
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
    WhitelistlistRuleResponse whitelistlistRuleResponse = (WhitelistlistRuleResponse) o;
    return (this.id == null ? whitelistlistRuleResponse.id == null : this.id.equals(whitelistlistRuleResponse.id)) &&
        (this.field == null ? whitelistlistRuleResponse.field == null : this.field.equals(whitelistlistRuleResponse.field)) &&
        (this.value == null ? whitelistlistRuleResponse.value == null : this.value.equals(whitelistlistRuleResponse.value)) &&
        (this.description == null ? whitelistlistRuleResponse.description == null : this.description.equals(whitelistlistRuleResponse.description));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this.field == null ? 0 : this.field.hashCode());
    result = 31 * result + (this.value == null ? 0 : this.value.hashCode());
    result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhitelistlistRuleResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
sb.append("  field: ").append(field).append("\n");
sb.append("  value: ").append(value).append("\n");
sb.append("  description: ").append(description).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
