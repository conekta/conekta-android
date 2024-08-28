package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Payment method used in the charge. Go to the [payment methods](https://developers.conekta.com/reference/m%C3%A9todos-de-pago) section for more details 
 **/
@ApiModel(description = "Payment method used in the charge. Go to the [payment methods](https://developers.conekta.com/reference/m%C3%A9todos-de-pago) section for more details ")
public class PaymentMethodGeneralRequest  {
  
  @SerializedName("expires_at")
  private Long expiresAt = null;
  @SerializedName("monthly_installments")
  private Integer monthlyInstallments = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("token_id")
  private String tokenId = null;
  @SerializedName("payment_source_id")
  private String paymentSourceId = null;
  @SerializedName("contract_id")
  private String contractId = null;

  /**
   * Method expiration date as unix timestamp
   **/
  @ApiModelProperty(value = "Method expiration date as unix timestamp")
  public Long getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * How many months without interest to apply, it can be 3, 6, 9, 12 or 18
   **/
  @ApiModelProperty(value = "How many months without interest to apply, it can be 3, 6, 9, 12 or 18")
  public Integer getMonthlyInstallments() {
    return monthlyInstallments;
  }
  public void setMonthlyInstallments(Integer monthlyInstallments) {
    this.monthlyInstallments = monthlyInstallments;
  }

  /**
   * Type of payment method
   **/
  @ApiModelProperty(required = true, value = "Type of payment method")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTokenId() {
    return tokenId;
  }
  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPaymentSourceId() {
    return paymentSourceId;
  }
  public void setPaymentSourceId(String paymentSourceId) {
    this.paymentSourceId = paymentSourceId;
  }

  /**
   * Optional id sent to indicate the bank contract for recurrent card charges.
   **/
  @ApiModelProperty(value = "Optional id sent to indicate the bank contract for recurrent card charges.")
  public String getContractId() {
    return contractId;
  }
  public void setContractId(String contractId) {
    this.contractId = contractId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodGeneralRequest paymentMethodGeneralRequest = (PaymentMethodGeneralRequest) o;
    return (this.expiresAt == null ? paymentMethodGeneralRequest.expiresAt == null : this.expiresAt.equals(paymentMethodGeneralRequest.expiresAt)) &&
        (this.monthlyInstallments == null ? paymentMethodGeneralRequest.monthlyInstallments == null : this.monthlyInstallments.equals(paymentMethodGeneralRequest.monthlyInstallments)) &&
        (this.type == null ? paymentMethodGeneralRequest.type == null : this.type.equals(paymentMethodGeneralRequest.type)) &&
        (this.tokenId == null ? paymentMethodGeneralRequest.tokenId == null : this.tokenId.equals(paymentMethodGeneralRequest.tokenId)) &&
        (this.paymentSourceId == null ? paymentMethodGeneralRequest.paymentSourceId == null : this.paymentSourceId.equals(paymentMethodGeneralRequest.paymentSourceId)) &&
        (this.contractId == null ? paymentMethodGeneralRequest.contractId == null : this.contractId.equals(paymentMethodGeneralRequest.contractId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    result = 31 * result + (this.monthlyInstallments == null ? 0: this.monthlyInstallments.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.tokenId == null ? 0: this.tokenId.hashCode());
    result = 31 * result + (this.paymentSourceId == null ? 0: this.paymentSourceId.hashCode());
    result = 31 * result + (this.contractId == null ? 0: this.contractId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodGeneralRequest {\n");
    
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("  monthlyInstallments: ").append(monthlyInstallments).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  tokenId: ").append(tokenId).append("\n");
    sb.append("  paymentSourceId: ").append(paymentSourceId).append("\n");
    sb.append("  contractId: ").append(contractId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
