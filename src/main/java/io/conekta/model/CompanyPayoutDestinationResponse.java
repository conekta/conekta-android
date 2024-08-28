package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Company payout destination model
 **/
@ApiModel(description = "Company payout destination model")
public class CompanyPayoutDestinationResponse  {
  
  private static final String MXN = "MXN";
  
  
  public enum _objectEnum {
     payout_destination, 
  };
  @SerializedName("object")
  private _objectEnum _object = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("account_holder_name")
  private String accountHolderName = null;
  @SerializedName("bank")
  private String bank = null;
  public enum TypeEnum {
     bank_account, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("account_number")
  private String accountNumber = null;

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
   * currency of the receiving account
   **/
  @ApiModelProperty(value = "currency of the receiving account")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Name of the account holder
   **/
  @ApiModelProperty(value = "Name of the account holder")
  public String getAccountHolderName() {
    return accountHolderName;
  }
  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  /**
   * Name of the bank
   **/
  @ApiModelProperty(value = "Name of the bank")
  public String getBank() {
    return bank;
  }
  public void setBank(String bank) {
    this.bank = bank;
  }

  /**
   * Type of the payout destination
   **/
  @ApiModelProperty(value = "Type of the payout destination")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Account number of the receiving account
   **/
  @ApiModelProperty(value = "Account number of the receiving account")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyPayoutDestinationResponse companyPayoutDestinationResponse = (CompanyPayoutDestinationResponse) o;
    return (this._object == null ? companyPayoutDestinationResponse._object == null : this._object.equals(companyPayoutDestinationResponse._object)) &&
        (this.currency == null ? companyPayoutDestinationResponse.currency == null : this.currency.equals(companyPayoutDestinationResponse.currency)) &&
        (this.accountHolderName == null ? companyPayoutDestinationResponse.accountHolderName == null : this.accountHolderName.equals(companyPayoutDestinationResponse.accountHolderName)) &&
        (this.bank == null ? companyPayoutDestinationResponse.bank == null : this.bank.equals(companyPayoutDestinationResponse.bank)) &&
        (this.type == null ? companyPayoutDestinationResponse.type == null : this.type.equals(companyPayoutDestinationResponse.type)) &&
        (this.accountNumber == null ? companyPayoutDestinationResponse.accountNumber == null : this.accountNumber.equals(companyPayoutDestinationResponse.accountNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.accountHolderName == null ? 0: this.accountHolderName.hashCode());
    result = 31 * result + (this.bank == null ? 0: this.bank.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.accountNumber == null ? 0: this.accountNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyPayoutDestinationResponse {\n");
    
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  accountHolderName: ").append(accountHolderName).append("\n");
    sb.append("  bank: ").append(bank).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  accountNumber: ").append(accountNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
