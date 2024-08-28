package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CustomerAntifraudInfoResponse  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("first_paid_at")
  private Integer firstPaidAt = null;
  @SerializedName("account_created_at")
  private Long accountCreatedAt = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFirstPaidAt() {
    return firstPaidAt;
  }
  public void setFirstPaidAt(Integer firstPaidAt) {
    this.firstPaidAt = firstPaidAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getAccountCreatedAt() {
    return accountCreatedAt;
  }
  public void setAccountCreatedAt(Long accountCreatedAt) {
    this.accountCreatedAt = accountCreatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAntifraudInfoResponse customerAntifraudInfoResponse = (CustomerAntifraudInfoResponse) o;
    return (this.firstPaidAt == null ? customerAntifraudInfoResponse.firstPaidAt == null : this.firstPaidAt.equals(customerAntifraudInfoResponse.firstPaidAt)) &&
        (this.accountCreatedAt == null ? customerAntifraudInfoResponse.accountCreatedAt == null : this.accountCreatedAt.equals(customerAntifraudInfoResponse.accountCreatedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.firstPaidAt == null ? 0: this.firstPaidAt.hashCode());
    result = 31 * result + (this.accountCreatedAt == null ? 0: this.accountCreatedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAntifraudInfoResponse {\n");
    
    sb.append("  firstPaidAt: ").append(firstPaidAt).append("\n");
    sb.append("  accountCreatedAt: ").append(accountCreatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
