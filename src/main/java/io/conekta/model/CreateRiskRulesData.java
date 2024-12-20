package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class CreateRiskRulesData  {

  private static final String MXN = "MXN";

  @SerializedName("description")
  private String description = null;
  @SerializedName("field")
  private String field = null;
  @SerializedName("value")
  private String value = null;

  /**
   * Description of the rule
   * 
   **/
  @ApiModelProperty(required = true, value = "Description of the rule")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  /**
   * Field to be used for the rule
   * 
   **/
  @ApiModelProperty(required = true, value = "Field to be used for the rule")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }
  /**
   * Value to be used for the rule
   * 
   **/
  @ApiModelProperty(required = true, value = "Value to be used for the rule")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRiskRulesData createRiskRulesData = (CreateRiskRulesData) o;
    return (this.description == null ? createRiskRulesData.description == null : this.description.equals(createRiskRulesData.description)) &&
        (this.field == null ? createRiskRulesData.field == null : this.field.equals(createRiskRulesData.field)) &&
        (this.value == null ? createRiskRulesData.value == null : this.value.equals(createRiskRulesData.value));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.description == null ? 0 : this.description.hashCode());
    result = 31 * result + (this.field == null ? 0 : this.field.hashCode());
    result = 31 * result + (this.value == null ? 0 : this.value.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRiskRulesData {\n");
    
    sb.append("  description: ").append(description).append("\n");
sb.append("  field: ").append(field).append("\n");
sb.append("  value: ").append(value).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
