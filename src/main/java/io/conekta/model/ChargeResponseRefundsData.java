package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ChargeResponseRefundsData  {
  
  @SerializedName("amount")
  private Long amount = null;
  @SerializedName("auth_code")
  private String authCode = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("expires_at")
  private Long expiresAt = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("status")
  private String status = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAuthCode() {
    return authCode;
  }
  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * refund expiration date
   **/
  @ApiModelProperty(value = "refund expiration date")
  public Long getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * refund status
   **/
  @ApiModelProperty(value = "refund status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeResponseRefundsData chargeResponseRefundsData = (ChargeResponseRefundsData) o;
    return (this.amount == null ? chargeResponseRefundsData.amount == null : this.amount.equals(chargeResponseRefundsData.amount)) &&
        (this.authCode == null ? chargeResponseRefundsData.authCode == null : this.authCode.equals(chargeResponseRefundsData.authCode)) &&
        (this.createdAt == null ? chargeResponseRefundsData.createdAt == null : this.createdAt.equals(chargeResponseRefundsData.createdAt)) &&
        (this.expiresAt == null ? chargeResponseRefundsData.expiresAt == null : this.expiresAt.equals(chargeResponseRefundsData.expiresAt)) &&
        (this.id == null ? chargeResponseRefundsData.id == null : this.id.equals(chargeResponseRefundsData.id)) &&
        (this._object == null ? chargeResponseRefundsData._object == null : this._object.equals(chargeResponseRefundsData._object)) &&
        (this.status == null ? chargeResponseRefundsData.status == null : this.status.equals(chargeResponseRefundsData.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.authCode == null ? 0: this.authCode.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeResponseRefundsData {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  authCode: ").append(authCode).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
