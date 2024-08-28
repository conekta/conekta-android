package io.conekta.model;

import io.conekta.model.CompanyFiscalInfoResponse;
import io.conekta.model.CompanyPayoutDestinationResponse;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Company model
 **/
@ApiModel(description = "Company model")
public class CompanyResponse  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("name")
  private String name = null;
  public enum _objectEnum {
     company, 
  };
  @SerializedName("object")
  private _objectEnum _object = null;
  @SerializedName("parent_company_id")
  private String parentCompanyId = null;
  @SerializedName("use_parent_fiscal_data")
  private Boolean useParentFiscalData = null;
  @SerializedName("payout_destination")
  private CompanyPayoutDestinationResponse payoutDestination = null;
  @SerializedName("fiscal_info")
  private CompanyFiscalInfoResponse fiscalInfo = null;

  /**
   * The child company's unique identifier
   **/
  @ApiModelProperty(value = "The child company's unique identifier")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The resource's creation date (unix timestamp)
   **/
  @ApiModelProperty(value = "The resource's creation date (unix timestamp)")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The child company's name
   **/
  @ApiModelProperty(value = "The child company's name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The resource's type
   **/
  @ApiModelProperty(value = "The resource's type")
  public _objectEnum getObject() {
    return _object;
  }
  public void setObject(_objectEnum _object) {
    this._object = _object;
  }

  /**
   * Id of the parent company
   **/
  @ApiModelProperty(value = "Id of the parent company")
  public String getParentCompanyId() {
    return parentCompanyId;
  }
  public void setParentCompanyId(String parentCompanyId) {
    this.parentCompanyId = parentCompanyId;
  }

  /**
   * Whether the parent company's fiscal data is to be used for liquidation and tax purposes
   **/
  @ApiModelProperty(value = "Whether the parent company's fiscal data is to be used for liquidation and tax purposes")
  public Boolean getUseParentFiscalData() {
    return useParentFiscalData;
  }
  public void setUseParentFiscalData(Boolean useParentFiscalData) {
    this.useParentFiscalData = useParentFiscalData;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CompanyPayoutDestinationResponse getPayoutDestination() {
    return payoutDestination;
  }
  public void setPayoutDestination(CompanyPayoutDestinationResponse payoutDestination) {
    this.payoutDestination = payoutDestination;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CompanyFiscalInfoResponse getFiscalInfo() {
    return fiscalInfo;
  }
  public void setFiscalInfo(CompanyFiscalInfoResponse fiscalInfo) {
    this.fiscalInfo = fiscalInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyResponse companyResponse = (CompanyResponse) o;
    return (this.id == null ? companyResponse.id == null : this.id.equals(companyResponse.id)) &&
        (this.createdAt == null ? companyResponse.createdAt == null : this.createdAt.equals(companyResponse.createdAt)) &&
        (this.name == null ? companyResponse.name == null : this.name.equals(companyResponse.name)) &&
        (this._object == null ? companyResponse._object == null : this._object.equals(companyResponse._object)) &&
        (this.parentCompanyId == null ? companyResponse.parentCompanyId == null : this.parentCompanyId.equals(companyResponse.parentCompanyId)) &&
        (this.useParentFiscalData == null ? companyResponse.useParentFiscalData == null : this.useParentFiscalData.equals(companyResponse.useParentFiscalData)) &&
        (this.payoutDestination == null ? companyResponse.payoutDestination == null : this.payoutDestination.equals(companyResponse.payoutDestination)) &&
        (this.fiscalInfo == null ? companyResponse.fiscalInfo == null : this.fiscalInfo.equals(companyResponse.fiscalInfo));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.parentCompanyId == null ? 0: this.parentCompanyId.hashCode());
    result = 31 * result + (this.useParentFiscalData == null ? 0: this.useParentFiscalData.hashCode());
    result = 31 * result + (this.payoutDestination == null ? 0: this.payoutDestination.hashCode());
    result = 31 * result + (this.fiscalInfo == null ? 0: this.fiscalInfo.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  parentCompanyId: ").append(parentCompanyId).append("\n");
    sb.append("  useParentFiscalData: ").append(useParentFiscalData).append("\n");
    sb.append("  payoutDestination: ").append(payoutDestination).append("\n");
    sb.append("  fiscalInfo: ").append(fiscalInfo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
