package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CustomerAntifraudInfo  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("account_created_at")
  private Long accountCreatedAt = null;
  @SerializedName("first_paid_at")
  private Long firstPaidAt = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getAccountCreatedAt() {
    return accountCreatedAt;
  }
  public void setAccountCreatedAt(Long accountCreatedAt) {
    this.accountCreatedAt = accountCreatedAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getFirstPaidAt() {
    return firstPaidAt;
  }
  public void setFirstPaidAt(Long firstPaidAt) {
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
    CustomerAntifraudInfo customerAntifraudInfo = (CustomerAntifraudInfo) o;
    return (this.accountCreatedAt == null ? customerAntifraudInfo.accountCreatedAt == null : this.accountCreatedAt.equals(customerAntifraudInfo.accountCreatedAt)) &&
        (this.firstPaidAt == null ? customerAntifraudInfo.firstPaidAt == null : this.firstPaidAt.equals(customerAntifraudInfo.firstPaidAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.accountCreatedAt == null ? 0: this.accountCreatedAt.hashCode());
    result = 31 * result + (this.firstPaidAt == null ? 0: this.firstPaidAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAntifraudInfo {\n");
    
    sb.append("  accountCreatedAt: ").append(accountCreatedAt).append("\n");
    sb.append("  firstPaidAt: ").append(firstPaidAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
