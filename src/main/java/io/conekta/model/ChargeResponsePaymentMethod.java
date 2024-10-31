package io.conekta.model;

import io.conekta.model.PaymentMethodBankTransfer;
import io.conekta.model.PaymentMethodCard;
import io.conekta.model.PaymentMethodCash;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class ChargeResponsePaymentMethod  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("agreement")
  private String agreement = null;
  @SerializedName("auth_code")
  private String authCode = null;
  @SerializedName("cashier_id")
  private String cashierId = null;
  @SerializedName("reference")
  private String reference = null;
  @SerializedName("barcode_url")
  private String barcodeUrl = null;
  @SerializedName("expires_at")
  private Long expiresAt = null;
  @SerializedName("product_type")
  private String productType = null;
  @SerializedName("service_name")
  private String serviceName = null;
  @SerializedName("store")
  private String store = null;
  @SerializedName("store_name")
  private String storeName = null;
  @SerializedName("customer_ip_address")
  private String customerIpAddress = null;
  @SerializedName("account_type")
  private String accountType = null;
  @SerializedName("brand")
  private String brand = null;
  @SerializedName("contract_id")
  private String contractId = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("exp_month")
  private String expMonth = null;
  @SerializedName("exp_year")
  private String expYear = null;
  @SerializedName("fraud_indicators")
  private List<Object> fraudIndicators = null;
  @SerializedName("issuer")
  private String issuer = null;
  @SerializedName("last4")
  private String last4 = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("bank")
  private String bank = null;
  @SerializedName("clabe")
  private String clabe = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("executed_at")
  private Integer executedAt = null;
  @SerializedName("issuing_account_bank")
  private String issuingAccountBank = null;
  @SerializedName("issuing_account_number")
  private String issuingAccountNumber = null;
  @SerializedName("issuing_account_holder_name")
  private String issuingAccountHolderName = null;
  @SerializedName("issuing_account_tax_id")
  private String issuingAccountTaxId = null;
  @SerializedName("payment_attempts")
  private List<Object> paymentAttempts = null;
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
   * Agreement ID
   **/
  @ApiModelProperty(value = "Agreement ID")
  public String getAgreement() {
    return agreement;
  }
  public void setAgreement(String agreement) {
    this.agreement = agreement;
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
  @ApiModelProperty(value = "")
  public String getCashierId() {
    return cashierId;
  }
  public void setCashierId(String cashierId) {
    this.cashierId = cashierId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBarcodeUrl() {
    return barcodeUrl;
  }
  public void setBarcodeUrl(String barcodeUrl) {
    this.barcodeUrl = barcodeUrl;
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
   * Product type, e.g. bbva_cash_in, cash_in, pespay_cash_in, etc.
   **/
  @ApiModelProperty(value = "Product type, e.g. bbva_cash_in, cash_in, pespay_cash_in, etc.")
  public String getProductType() {
    return productType;
  }
  public void setProductType(String productType) {
    this.productType = productType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getServiceName() {
    return serviceName;
  }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStore() {
    return store;
  }
  public void setStore(String store) {
    this.store = store;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStoreName() {
    return storeName;
  }
  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCustomerIpAddress() {
    return customerIpAddress;
  }
  public void setCustomerIpAddress(String customerIpAddress) {
    this.customerIpAddress = customerIpAddress;
  }

  /**
   * Account type of the card
   **/
  @ApiModelProperty(value = "Account type of the card")
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  /**
   * Brand of the card
   **/
  @ApiModelProperty(value = "Brand of the card")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Id sent for recurrent charges.
   **/
  @ApiModelProperty(value = "Id sent for recurrent charges.")
  public String getContractId() {
    return contractId;
  }
  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  /**
   * Country of the card
   **/
  @ApiModelProperty(value = "Country of the card")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Expiration month of the card
   **/
  @ApiModelProperty(value = "Expiration month of the card")
  public String getExpMonth() {
    return expMonth;
  }
  public void setExpMonth(String expMonth) {
    this.expMonth = expMonth;
  }

  /**
   * Expiration year of the card
   **/
  @ApiModelProperty(value = "Expiration year of the card")
  public String getExpYear() {
    return expYear;
  }
  public void setExpYear(String expYear) {
    this.expYear = expYear;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Object> getFraudIndicators() {
    return fraudIndicators;
  }
  public void setFraudIndicators(List<Object> fraudIndicators) {
    this.fraudIndicators = fraudIndicators;
  }

  /**
   * Issuer of the card
   **/
  @ApiModelProperty(value = "Issuer of the card")
  public String getIssuer() {
    return issuer;
  }
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  /**
   * Last 4 digits of the card
   **/
  @ApiModelProperty(value = "Last 4 digits of the card")
  public String getLast4() {
    return last4;
  }
  public void setLast4(String last4) {
    this.last4 = last4;
  }

  /**
   * Name of the cardholder
   **/
  @ApiModelProperty(value = "Name of the cardholder")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
  public List<Object> getPaymentAttempts() {
    return paymentAttempts;
  }
  public void setPaymentAttempts(List<Object> paymentAttempts) {
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
    ChargeResponsePaymentMethod chargeResponsePaymentMethod = (ChargeResponsePaymentMethod) o;
    return (this.type == null ? chargeResponsePaymentMethod.type == null : this.type.equals(chargeResponsePaymentMethod.type)) &&
        (this._object == null ? chargeResponsePaymentMethod._object == null : this._object.equals(chargeResponsePaymentMethod._object)) &&
        (this.agreement == null ? chargeResponsePaymentMethod.agreement == null : this.agreement.equals(chargeResponsePaymentMethod.agreement)) &&
        (this.authCode == null ? chargeResponsePaymentMethod.authCode == null : this.authCode.equals(chargeResponsePaymentMethod.authCode)) &&
        (this.cashierId == null ? chargeResponsePaymentMethod.cashierId == null : this.cashierId.equals(chargeResponsePaymentMethod.cashierId)) &&
        (this.reference == null ? chargeResponsePaymentMethod.reference == null : this.reference.equals(chargeResponsePaymentMethod.reference)) &&
        (this.barcodeUrl == null ? chargeResponsePaymentMethod.barcodeUrl == null : this.barcodeUrl.equals(chargeResponsePaymentMethod.barcodeUrl)) &&
        (this.expiresAt == null ? chargeResponsePaymentMethod.expiresAt == null : this.expiresAt.equals(chargeResponsePaymentMethod.expiresAt)) &&
        (this.productType == null ? chargeResponsePaymentMethod.productType == null : this.productType.equals(chargeResponsePaymentMethod.productType)) &&
        (this.serviceName == null ? chargeResponsePaymentMethod.serviceName == null : this.serviceName.equals(chargeResponsePaymentMethod.serviceName)) &&
        (this.store == null ? chargeResponsePaymentMethod.store == null : this.store.equals(chargeResponsePaymentMethod.store)) &&
        (this.storeName == null ? chargeResponsePaymentMethod.storeName == null : this.storeName.equals(chargeResponsePaymentMethod.storeName)) &&
        (this.customerIpAddress == null ? chargeResponsePaymentMethod.customerIpAddress == null : this.customerIpAddress.equals(chargeResponsePaymentMethod.customerIpAddress)) &&
        (this.accountType == null ? chargeResponsePaymentMethod.accountType == null : this.accountType.equals(chargeResponsePaymentMethod.accountType)) &&
        (this.brand == null ? chargeResponsePaymentMethod.brand == null : this.brand.equals(chargeResponsePaymentMethod.brand)) &&
        (this.contractId == null ? chargeResponsePaymentMethod.contractId == null : this.contractId.equals(chargeResponsePaymentMethod.contractId)) &&
        (this.country == null ? chargeResponsePaymentMethod.country == null : this.country.equals(chargeResponsePaymentMethod.country)) &&
        (this.expMonth == null ? chargeResponsePaymentMethod.expMonth == null : this.expMonth.equals(chargeResponsePaymentMethod.expMonth)) &&
        (this.expYear == null ? chargeResponsePaymentMethod.expYear == null : this.expYear.equals(chargeResponsePaymentMethod.expYear)) &&
        (this.fraudIndicators == null ? chargeResponsePaymentMethod.fraudIndicators == null : this.fraudIndicators.equals(chargeResponsePaymentMethod.fraudIndicators)) &&
        (this.issuer == null ? chargeResponsePaymentMethod.issuer == null : this.issuer.equals(chargeResponsePaymentMethod.issuer)) &&
        (this.last4 == null ? chargeResponsePaymentMethod.last4 == null : this.last4.equals(chargeResponsePaymentMethod.last4)) &&
        (this.name == null ? chargeResponsePaymentMethod.name == null : this.name.equals(chargeResponsePaymentMethod.name)) &&
        (this.bank == null ? chargeResponsePaymentMethod.bank == null : this.bank.equals(chargeResponsePaymentMethod.bank)) &&
        (this.clabe == null ? chargeResponsePaymentMethod.clabe == null : this.clabe.equals(chargeResponsePaymentMethod.clabe)) &&
        (this.description == null ? chargeResponsePaymentMethod.description == null : this.description.equals(chargeResponsePaymentMethod.description)) &&
        (this.executedAt == null ? chargeResponsePaymentMethod.executedAt == null : this.executedAt.equals(chargeResponsePaymentMethod.executedAt)) &&
        (this.issuingAccountBank == null ? chargeResponsePaymentMethod.issuingAccountBank == null : this.issuingAccountBank.equals(chargeResponsePaymentMethod.issuingAccountBank)) &&
        (this.issuingAccountNumber == null ? chargeResponsePaymentMethod.issuingAccountNumber == null : this.issuingAccountNumber.equals(chargeResponsePaymentMethod.issuingAccountNumber)) &&
        (this.issuingAccountHolderName == null ? chargeResponsePaymentMethod.issuingAccountHolderName == null : this.issuingAccountHolderName.equals(chargeResponsePaymentMethod.issuingAccountHolderName)) &&
        (this.issuingAccountTaxId == null ? chargeResponsePaymentMethod.issuingAccountTaxId == null : this.issuingAccountTaxId.equals(chargeResponsePaymentMethod.issuingAccountTaxId)) &&
        (this.paymentAttempts == null ? chargeResponsePaymentMethod.paymentAttempts == null : this.paymentAttempts.equals(chargeResponsePaymentMethod.paymentAttempts)) &&
        (this.receivingAccountHolderName == null ? chargeResponsePaymentMethod.receivingAccountHolderName == null : this.receivingAccountHolderName.equals(chargeResponsePaymentMethod.receivingAccountHolderName)) &&
        (this.receivingAccountNumber == null ? chargeResponsePaymentMethod.receivingAccountNumber == null : this.receivingAccountNumber.equals(chargeResponsePaymentMethod.receivingAccountNumber)) &&
        (this.receivingAccountBank == null ? chargeResponsePaymentMethod.receivingAccountBank == null : this.receivingAccountBank.equals(chargeResponsePaymentMethod.receivingAccountBank)) &&
        (this.receivingAccountTaxId == null ? chargeResponsePaymentMethod.receivingAccountTaxId == null : this.receivingAccountTaxId.equals(chargeResponsePaymentMethod.receivingAccountTaxId)) &&
        (this.referenceNumber == null ? chargeResponsePaymentMethod.referenceNumber == null : this.referenceNumber.equals(chargeResponsePaymentMethod.referenceNumber)) &&
        (this.trackingCode == null ? chargeResponsePaymentMethod.trackingCode == null : this.trackingCode.equals(chargeResponsePaymentMethod.trackingCode));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.agreement == null ? 0: this.agreement.hashCode());
    result = 31 * result + (this.authCode == null ? 0: this.authCode.hashCode());
    result = 31 * result + (this.cashierId == null ? 0: this.cashierId.hashCode());
    result = 31 * result + (this.reference == null ? 0: this.reference.hashCode());
    result = 31 * result + (this.barcodeUrl == null ? 0: this.barcodeUrl.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    result = 31 * result + (this.productType == null ? 0: this.productType.hashCode());
    result = 31 * result + (this.serviceName == null ? 0: this.serviceName.hashCode());
    result = 31 * result + (this.store == null ? 0: this.store.hashCode());
    result = 31 * result + (this.storeName == null ? 0: this.storeName.hashCode());
    result = 31 * result + (this.customerIpAddress == null ? 0: this.customerIpAddress.hashCode());
    result = 31 * result + (this.accountType == null ? 0: this.accountType.hashCode());
    result = 31 * result + (this.brand == null ? 0: this.brand.hashCode());
    result = 31 * result + (this.contractId == null ? 0: this.contractId.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.expMonth == null ? 0: this.expMonth.hashCode());
    result = 31 * result + (this.expYear == null ? 0: this.expYear.hashCode());
    result = 31 * result + (this.fraudIndicators == null ? 0: this.fraudIndicators.hashCode());
    result = 31 * result + (this.issuer == null ? 0: this.issuer.hashCode());
    result = 31 * result + (this.last4 == null ? 0: this.last4.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.bank == null ? 0: this.bank.hashCode());
    result = 31 * result + (this.clabe == null ? 0: this.clabe.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.executedAt == null ? 0: this.executedAt.hashCode());
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
    sb.append("class ChargeResponsePaymentMethod {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  agreement: ").append(agreement).append("\n");
    sb.append("  authCode: ").append(authCode).append("\n");
    sb.append("  cashierId: ").append(cashierId).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  barcodeUrl: ").append(barcodeUrl).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("  productType: ").append(productType).append("\n");
    sb.append("  serviceName: ").append(serviceName).append("\n");
    sb.append("  store: ").append(store).append("\n");
    sb.append("  storeName: ").append(storeName).append("\n");
    sb.append("  customerIpAddress: ").append(customerIpAddress).append("\n");
    sb.append("  accountType: ").append(accountType).append("\n");
    sb.append("  brand: ").append(brand).append("\n");
    sb.append("  contractId: ").append(contractId).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  expMonth: ").append(expMonth).append("\n");
    sb.append("  expYear: ").append(expYear).append("\n");
    sb.append("  fraudIndicators: ").append(fraudIndicators).append("\n");
    sb.append("  issuer: ").append(issuer).append("\n");
    sb.append("  last4: ").append(last4).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  bank: ").append(bank).append("\n");
    sb.append("  clabe: ").append(clabe).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  executedAt: ").append(executedAt).append("\n");
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