package io.conekta.model;

import io.conekta.model.OasAnyTypeNotMapped;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class PaymentMethodBankTransfer  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("bank")
  private String bank = null;
  @SerializedName("clabe")
  private String clabe = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("executed_at")
  private Integer executedAt = null;
  @SerializedName("expires_at")
  private Long expiresAt = null;
  @SerializedName("issuing_account_bank")
  private String issuingAccountBank = null;
  @SerializedName("issuing_account_number")
  private String issuingAccountNumber = null;
  @SerializedName("issuing_account_holder_name")
  private String issuingAccountHolderName = null;
  @SerializedName("issuing_account_tax_id")
  private String issuingAccountTaxId = null;
  @SerializedName("payment_attempts")
  private List<OasAnyTypeNotMapped> paymentAttempts = null;
  @SerializedName("receiving_account_holder_name")
  private String receivingAccountHolderName = null;
  @SerializedName("receiving_account_number")
  private String receivingAccountNumber = null;
  @SerializedName("receiving_account_bank")
  private String receivingAccountBank = null;
  @SerializedName("receiving_account_tax_id")
  private String receivingAccountTaxId = null;
  @SerializedName("reference_number")
  private String referenceNumber = null;
  @SerializedName("tracking_code")
  private String trackingCode = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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
   **/
  @ApiModelProperty(value = "")
  public String getBank() {
    return bank;
  }
  public void setBank(String bank) {
    this.bank = bank;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClabe() {
    return clabe;
  }
  public void setClabe(String clabe) {
    this.clabe = clabe;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getExecutedAt() {
    return executedAt;
  }
  public void setExecutedAt(Integer executedAt) {
    this.executedAt = executedAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIssuingAccountBank() {
    return issuingAccountBank;
  }
  public void setIssuingAccountBank(String issuingAccountBank) {
    this.issuingAccountBank = issuingAccountBank;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIssuingAccountNumber() {
    return issuingAccountNumber;
  }
  public void setIssuingAccountNumber(String issuingAccountNumber) {
    this.issuingAccountNumber = issuingAccountNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIssuingAccountHolderName() {
    return issuingAccountHolderName;
  }
  public void setIssuingAccountHolderName(String issuingAccountHolderName) {
    this.issuingAccountHolderName = issuingAccountHolderName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIssuingAccountTaxId() {
    return issuingAccountTaxId;
  }
  public void setIssuingAccountTaxId(String issuingAccountTaxId) {
    this.issuingAccountTaxId = issuingAccountTaxId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<OasAnyTypeNotMapped> getPaymentAttempts() {
    return paymentAttempts;
  }
  public void setPaymentAttempts(List<OasAnyTypeNotMapped> paymentAttempts) {
    this.paymentAttempts = paymentAttempts;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReceivingAccountHolderName() {
    return receivingAccountHolderName;
  }
  public void setReceivingAccountHolderName(String receivingAccountHolderName) {
    this.receivingAccountHolderName = receivingAccountHolderName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReceivingAccountNumber() {
    return receivingAccountNumber;
  }
  public void setReceivingAccountNumber(String receivingAccountNumber) {
    this.receivingAccountNumber = receivingAccountNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReceivingAccountBank() {
    return receivingAccountBank;
  }
  public void setReceivingAccountBank(String receivingAccountBank) {
    this.receivingAccountBank = receivingAccountBank;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReceivingAccountTaxId() {
    return receivingAccountTaxId;
  }
  public void setReceivingAccountTaxId(String receivingAccountTaxId) {
    this.receivingAccountTaxId = receivingAccountTaxId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReferenceNumber() {
    return referenceNumber;
  }
  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTrackingCode() {
    return trackingCode;
  }
  public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodBankTransfer paymentMethodBankTransfer = (PaymentMethodBankTransfer) o;
    return (this.type == null ? paymentMethodBankTransfer.type == null : this.type.equals(paymentMethodBankTransfer.type)) &&
        (this._object == null ? paymentMethodBankTransfer._object == null : this._object.equals(paymentMethodBankTransfer._object)) &&
        (this.bank == null ? paymentMethodBankTransfer.bank == null : this.bank.equals(paymentMethodBankTransfer.bank)) &&
        (this.clabe == null ? paymentMethodBankTransfer.clabe == null : this.clabe.equals(paymentMethodBankTransfer.clabe)) &&
        (this.description == null ? paymentMethodBankTransfer.description == null : this.description.equals(paymentMethodBankTransfer.description)) &&
        (this.executedAt == null ? paymentMethodBankTransfer.executedAt == null : this.executedAt.equals(paymentMethodBankTransfer.executedAt)) &&
        (this.expiresAt == null ? paymentMethodBankTransfer.expiresAt == null : this.expiresAt.equals(paymentMethodBankTransfer.expiresAt)) &&
        (this.issuingAccountBank == null ? paymentMethodBankTransfer.issuingAccountBank == null : this.issuingAccountBank.equals(paymentMethodBankTransfer.issuingAccountBank)) &&
        (this.issuingAccountNumber == null ? paymentMethodBankTransfer.issuingAccountNumber == null : this.issuingAccountNumber.equals(paymentMethodBankTransfer.issuingAccountNumber)) &&
        (this.issuingAccountHolderName == null ? paymentMethodBankTransfer.issuingAccountHolderName == null : this.issuingAccountHolderName.equals(paymentMethodBankTransfer.issuingAccountHolderName)) &&
        (this.issuingAccountTaxId == null ? paymentMethodBankTransfer.issuingAccountTaxId == null : this.issuingAccountTaxId.equals(paymentMethodBankTransfer.issuingAccountTaxId)) &&
        (this.paymentAttempts == null ? paymentMethodBankTransfer.paymentAttempts == null : this.paymentAttempts.equals(paymentMethodBankTransfer.paymentAttempts)) &&
        (this.receivingAccountHolderName == null ? paymentMethodBankTransfer.receivingAccountHolderName == null : this.receivingAccountHolderName.equals(paymentMethodBankTransfer.receivingAccountHolderName)) &&
        (this.receivingAccountNumber == null ? paymentMethodBankTransfer.receivingAccountNumber == null : this.receivingAccountNumber.equals(paymentMethodBankTransfer.receivingAccountNumber)) &&
        (this.receivingAccountBank == null ? paymentMethodBankTransfer.receivingAccountBank == null : this.receivingAccountBank.equals(paymentMethodBankTransfer.receivingAccountBank)) &&
        (this.receivingAccountTaxId == null ? paymentMethodBankTransfer.receivingAccountTaxId == null : this.receivingAccountTaxId.equals(paymentMethodBankTransfer.receivingAccountTaxId)) &&
        (this.referenceNumber == null ? paymentMethodBankTransfer.referenceNumber == null : this.referenceNumber.equals(paymentMethodBankTransfer.referenceNumber)) &&
        (this.trackingCode == null ? paymentMethodBankTransfer.trackingCode == null : this.trackingCode.equals(paymentMethodBankTransfer.trackingCode));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.bank == null ? 0: this.bank.hashCode());
    result = 31 * result + (this.clabe == null ? 0: this.clabe.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.executedAt == null ? 0: this.executedAt.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    result = 31 * result + (this.issuingAccountBank == null ? 0: this.issuingAccountBank.hashCode());
    result = 31 * result + (this.issuingAccountNumber == null ? 0: this.issuingAccountNumber.hashCode());
    result = 31 * result + (this.issuingAccountHolderName == null ? 0: this.issuingAccountHolderName.hashCode());
    result = 31 * result + (this.issuingAccountTaxId == null ? 0: this.issuingAccountTaxId.hashCode());
    result = 31 * result + (this.paymentAttempts == null ? 0: this.paymentAttempts.hashCode());
    result = 31 * result + (this.receivingAccountHolderName == null ? 0: this.receivingAccountHolderName.hashCode());
    result = 31 * result + (this.receivingAccountNumber == null ? 0: this.receivingAccountNumber.hashCode());
    result = 31 * result + (this.receivingAccountBank == null ? 0: this.receivingAccountBank.hashCode());
    result = 31 * result + (this.receivingAccountTaxId == null ? 0: this.receivingAccountTaxId.hashCode());
    result = 31 * result + (this.referenceNumber == null ? 0: this.referenceNumber.hashCode());
    result = 31 * result + (this.trackingCode == null ? 0: this.trackingCode.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodBankTransfer {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  bank: ").append(bank).append("\n");
    sb.append("  clabe: ").append(clabe).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  executedAt: ").append(executedAt).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("  issuingAccountBank: ").append(issuingAccountBank).append("\n");
    sb.append("  issuingAccountNumber: ").append(issuingAccountNumber).append("\n");
    sb.append("  issuingAccountHolderName: ").append(issuingAccountHolderName).append("\n");
    sb.append("  issuingAccountTaxId: ").append(issuingAccountTaxId).append("\n");
    sb.append("  paymentAttempts: ").append(paymentAttempts).append("\n");
    sb.append("  receivingAccountHolderName: ").append(receivingAccountHolderName).append("\n");
    sb.append("  receivingAccountNumber: ").append(receivingAccountNumber).append("\n");
    sb.append("  receivingAccountBank: ").append(receivingAccountBank).append("\n");
    sb.append("  receivingAccountTaxId: ").append(receivingAccountTaxId).append("\n");
    sb.append("  referenceNumber: ").append(referenceNumber).append("\n");
    sb.append("  trackingCode: ").append(trackingCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
