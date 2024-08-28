package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class RiskRulesData  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("field")
  private String field = null;
  @SerializedName("created_at")
  private String createdAt = null;
  @SerializedName("value")
  private String value = null;
  @SerializedName("is_global")
  private Boolean isGlobal = null;
  @SerializedName("is_test")
  private Boolean isTest = null;
  @SerializedName("description")
  private String description = null;

  /**
   * rule id
   **/
  @ApiModelProperty(value = "rule id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * field to be used for the rule
   **/
  @ApiModelProperty(value = "field to be used for the rule")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

  /**
   * rule creation date
   **/
  @ApiModelProperty(value = "rule creation date")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * value to be used for the rule
   **/
  @ApiModelProperty(value = "value to be used for the rule")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * if the rule is global
   **/
  @ApiModelProperty(value = "if the rule is global")
  public Boolean getIsGlobal() {
    return isGlobal;
  }
  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }

  /**
   * if the rule is test
   **/
  @ApiModelProperty(value = "if the rule is test")
  public Boolean getIsTest() {
    return isTest;
  }
  public void setIsTest(Boolean isTest) {
    this.isTest = isTest;
  }

  /**
   * description of the rule
   **/
  @ApiModelProperty(value = "description of the rule")
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
    RiskRulesData riskRulesData = (RiskRulesData) o;
    return (this.id == null ? riskRulesData.id == null : this.id.equals(riskRulesData.id)) &&
        (this.field == null ? riskRulesData.field == null : this.field.equals(riskRulesData.field)) &&
        (this.createdAt == null ? riskRulesData.createdAt == null : this.createdAt.equals(riskRulesData.createdAt)) &&
        (this.value == null ? riskRulesData.value == null : this.value.equals(riskRulesData.value)) &&
        (this.isGlobal == null ? riskRulesData.isGlobal == null : this.isGlobal.equals(riskRulesData.isGlobal)) &&
        (this.isTest == null ? riskRulesData.isTest == null : this.isTest.equals(riskRulesData.isTest)) &&
        (this.description == null ? riskRulesData.description == null : this.description.equals(riskRulesData.description));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.field == null ? 0: this.field.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    result = 31 * result + (this.isGlobal == null ? 0: this.isGlobal.hashCode());
    result = 31 * result + (this.isTest == null ? 0: this.isTest.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskRulesData {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  field: ").append(field).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  isGlobal: ").append(isGlobal).append("\n");
    sb.append("  isTest: ").append(isTest).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
