package io.conekta.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class PaymentMethodCard  {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("account_type")
  private String accountType = null;
  @SerializedName("auth_code")
  private String authCode = null;
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
   **/
  @ApiModelProperty(value = "")
  public String getAuthCode() {
    return authCode;
  }
  public void setAuthCode(String authCode) {
    this.authCode = authCode;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCard paymentMethodCard = (PaymentMethodCard) o;
    return (this.type == null ? paymentMethodCard.type == null : this.type.equals(paymentMethodCard.type)) &&
        (this._object == null ? paymentMethodCard._object == null : this._object.equals(paymentMethodCard._object)) &&
        (this.accountType == null ? paymentMethodCard.accountType == null : this.accountType.equals(paymentMethodCard.accountType)) &&
        (this.authCode == null ? paymentMethodCard.authCode == null : this.authCode.equals(paymentMethodCard.authCode)) &&
        (this.brand == null ? paymentMethodCard.brand == null : this.brand.equals(paymentMethodCard.brand)) &&
        (this.contractId == null ? paymentMethodCard.contractId == null : this.contractId.equals(paymentMethodCard.contractId)) &&
        (this.country == null ? paymentMethodCard.country == null : this.country.equals(paymentMethodCard.country)) &&
        (this.expMonth == null ? paymentMethodCard.expMonth == null : this.expMonth.equals(paymentMethodCard.expMonth)) &&
        (this.expYear == null ? paymentMethodCard.expYear == null : this.expYear.equals(paymentMethodCard.expYear)) &&
        (this.fraudIndicators == null ? paymentMethodCard.fraudIndicators == null : this.fraudIndicators.equals(paymentMethodCard.fraudIndicators)) &&
        (this.issuer == null ? paymentMethodCard.issuer == null : this.issuer.equals(paymentMethodCard.issuer)) &&
        (this.last4 == null ? paymentMethodCard.last4 == null : this.last4.equals(paymentMethodCard.last4)) &&
        (this.name == null ? paymentMethodCard.name == null : this.name.equals(paymentMethodCard.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.accountType == null ? 0: this.accountType.hashCode());
    result = 31 * result + (this.authCode == null ? 0: this.authCode.hashCode());
    result = 31 * result + (this.brand == null ? 0: this.brand.hashCode());
    result = 31 * result + (this.contractId == null ? 0: this.contractId.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.expMonth == null ? 0: this.expMonth.hashCode());
    result = 31 * result + (this.expYear == null ? 0: this.expYear.hashCode());
    result = 31 * result + (this.fraudIndicators == null ? 0: this.fraudIndicators.hashCode());
    result = 31 * result + (this.issuer == null ? 0: this.issuer.hashCode());
    result = 31 * result + (this.last4 == null ? 0: this.last4.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCard {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  accountType: ").append(accountType).append("\n");
    sb.append("  authCode: ").append(authCode).append("\n");
    sb.append("  brand: ").append(brand).append("\n");
    sb.append("  contractId: ").append(contractId).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  expMonth: ").append(expMonth).append("\n");
    sb.append("  expYear: ").append(expYear).append("\n");
    sb.append("  fraudIndicators: ").append(fraudIndicators).append("\n");
    sb.append("  issuer: ").append(issuer).append("\n");
    sb.append("  last4: ").append(last4).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
