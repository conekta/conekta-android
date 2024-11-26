package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class UpdateCustomerAntifraudInfo  {

  private static final String MXN = "MXN";

  @SerializedName("account_created_at")
  private Long accountCreatedAt = null;
  @SerializedName("first_paid_at")
  private Integer firstPaidAt = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Long getAccountCreatedAt() {
    return accountCreatedAt;
  }

  public void setAccountCreatedAt(Long accountCreatedAt) {
    this.accountCreatedAt = accountCreatedAt;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getFirstPaidAt() {
    return firstPaidAt;
  }

  public void setFirstPaidAt(Integer firstPaidAt) {
    this.firstPaidAt = firstPaidAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerAntifraudInfo updateCustomerAntifraudInfo = (UpdateCustomerAntifraudInfo) o;
    return (this.accountCreatedAt == null ? updateCustomerAntifraudInfo.accountCreatedAt == null : this.accountCreatedAt.equals(updateCustomerAntifraudInfo.accountCreatedAt)) &&
        (this.firstPaidAt == null ? updateCustomerAntifraudInfo.firstPaidAt == null : this.firstPaidAt.equals(updateCustomerAntifraudInfo.firstPaidAt));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.accountCreatedAt == null ? 0 : this.accountCreatedAt.hashCode());
    result = 31 * result + (this.firstPaidAt == null ? 0 : this.firstPaidAt.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerAntifraudInfo {\n");
    
    sb.append("  accountCreatedAt: ").append(accountCreatedAt).append("\n");
sb.append("  firstPaidAt: ").append(firstPaidAt).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
