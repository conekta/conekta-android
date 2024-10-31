package io.conekta.model;

import io.conekta.model.PaymentMethodCardRequest;
import io.conekta.model.PaymentMethodGeneralRequest;

import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class ChargeRequestPaymentMethod  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("cvc")
  private String cvc = null;
  @SerializedName("exp_month")
  private String expMonth = null;
  @SerializedName("exp_year")
  private String expYear = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("number")
  private String number = null;
  @SerializedName("customer_ip_address")
  private String customerIpAddress = null;
  @SerializedName("expires_at")
  private Long expiresAt = null;
  @SerializedName("monthly_installments")
  private Integer monthlyInstallments = null;
  @SerializedName("token_id")
  private String tokenId = null;
  @SerializedName("payment_source_id")
  private String paymentSourceId = null;
  @SerializedName("contract_id")
  private String contractId = null;

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
   * Optional, It is a value that allows identifying the security code of the card. Only for PCI merchants
   **/
  @ApiModelProperty(required = true, value = "Optional, It is a value that allows identifying the security code of the card. Only for PCI merchants")
  public String getCvc() {
    return cvc;
  }
  public void setCvc(String cvc) {
    this.cvc = cvc;
  }

  /**
   * Card expiration month
   **/
  @ApiModelProperty(required = true, value = "Card expiration month")
  public String getExpMonth() {
    return expMonth;
  }
  public void setExpMonth(String expMonth) {
    this.expMonth = expMonth;
  }

  /**
   * Card expiration year
   **/
  @ApiModelProperty(required = true, value = "Card expiration year")
  public String getExpYear() {
    return expYear;
  }
  public void setExpYear(String expYear) {
    this.expYear = expYear;
  }

  /**
   * Cardholder name
   **/
  @ApiModelProperty(required = true, value = "Cardholder name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Card number
   **/
  @ApiModelProperty(required = true, value = "Card number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Optional field used to capture the customer's IP address for fraud prevention and security monitoring purposes
   **/
  @ApiModelProperty(value = "Optional field used to capture the customer's IP address for fraud prevention and security monitoring purposes")
  public String getCustomerIpAddress() {
    return customerIpAddress;
  }
  public void setCustomerIpAddress(String customerIpAddress) {
    this.customerIpAddress = customerIpAddress;
  }

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
    ChargeRequestPaymentMethod chargeRequestPaymentMethod = (ChargeRequestPaymentMethod) o;
    return (this.type == null ? chargeRequestPaymentMethod.type == null : this.type.equals(chargeRequestPaymentMethod.type)) &&
        (this.cvc == null ? chargeRequestPaymentMethod.cvc == null : this.cvc.equals(chargeRequestPaymentMethod.cvc)) &&
        (this.expMonth == null ? chargeRequestPaymentMethod.expMonth == null : this.expMonth.equals(chargeRequestPaymentMethod.expMonth)) &&
        (this.expYear == null ? chargeRequestPaymentMethod.expYear == null : this.expYear.equals(chargeRequestPaymentMethod.expYear)) &&
        (this.name == null ? chargeRequestPaymentMethod.name == null : this.name.equals(chargeRequestPaymentMethod.name)) &&
        (this.number == null ? chargeRequestPaymentMethod.number == null : this.number.equals(chargeRequestPaymentMethod.number)) &&
        (this.customerIpAddress == null ? chargeRequestPaymentMethod.customerIpAddress == null : this.customerIpAddress.equals(chargeRequestPaymentMethod.customerIpAddress)) &&
        (this.expiresAt == null ? chargeRequestPaymentMethod.expiresAt == null : this.expiresAt.equals(chargeRequestPaymentMethod.expiresAt)) &&
        (this.monthlyInstallments == null ? chargeRequestPaymentMethod.monthlyInstallments == null : this.monthlyInstallments.equals(chargeRequestPaymentMethod.monthlyInstallments)) &&
        (this.tokenId == null ? chargeRequestPaymentMethod.tokenId == null : this.tokenId.equals(chargeRequestPaymentMethod.tokenId)) &&
        (this.paymentSourceId == null ? chargeRequestPaymentMethod.paymentSourceId == null : this.paymentSourceId.equals(chargeRequestPaymentMethod.paymentSourceId)) &&
        (this.contractId == null ? chargeRequestPaymentMethod.contractId == null : this.contractId.equals(chargeRequestPaymentMethod.contractId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.cvc == null ? 0: this.cvc.hashCode());
    result = 31 * result + (this.expMonth == null ? 0: this.expMonth.hashCode());
    result = 31 * result + (this.expYear == null ? 0: this.expYear.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.number == null ? 0: this.number.hashCode());
    result = 31 * result + (this.customerIpAddress == null ? 0: this.customerIpAddress.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    result = 31 * result + (this.monthlyInstallments == null ? 0: this.monthlyInstallments.hashCode());
    result = 31 * result + (this.tokenId == null ? 0: this.tokenId.hashCode());
    result = 31 * result + (this.paymentSourceId == null ? 0: this.paymentSourceId.hashCode());
    result = 31 * result + (this.contractId == null ? 0: this.contractId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeRequestPaymentMethod {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  cvc: ").append(cvc).append("\n");
    sb.append("  expMonth: ").append(expMonth).append("\n");
    sb.append("  expYear: ").append(expYear).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  customerIpAddress: ").append(customerIpAddress).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("  monthlyInstallments: ").append(monthlyInstallments).append("\n");
    sb.append("  tokenId: ").append(tokenId).append("\n");
    sb.append("  paymentSourceId: ").append(paymentSourceId).append("\n");
    sb.append("  contractId: ").append(contractId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
