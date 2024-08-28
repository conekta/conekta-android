package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Method used to make the transfer.
 **/
@ApiModel(description = "Method used to make the transfer.")
public class TransferMethodResponse  {
  
  @SerializedName("account_holder")
  private String accountHolder = null;
  @SerializedName("account_number")
  private String accountNumber = null;
  @SerializedName("bank")
  private String bank = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("payee_id")
  private String payeeId = null;
  @SerializedName("type")
  private String type = null;

  /**
   * Name of the account holder.
   **/
  @ApiModelProperty(value = "Name of the account holder.")
  public String getAccountHolder() {
    return accountHolder;
  }
  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  /**
   * Account number of the bank account.
   **/
  @ApiModelProperty(value = "Account number of the bank account.")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   * Name of the bank.
   **/
  @ApiModelProperty(value = "Name of the bank.")
  public String getBank() {
    return bank;
  }
  public void setBank(String bank) {
    this.bank = bank;
  }

  /**
   * Date and time of creation of the transfer.
   **/
  @ApiModelProperty(value = "Date and time of creation of the transfer.")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Unique identifier of the transfer.
   **/
  @ApiModelProperty(value = "Unique identifier of the transfer.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Object name, which is bank_transfer_payout_method.
   **/
  @ApiModelProperty(value = "Object name, which is bank_transfer_payout_method.")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * Unique identifier of the payee.
   **/
  @ApiModelProperty(value = "Unique identifier of the payee.")
  public String getPayeeId() {
    return payeeId;
  }
  public void setPayeeId(String payeeId) {
    this.payeeId = payeeId;
  }

  /**
   * Type of the payee.
   **/
  @ApiModelProperty(value = "Type of the payee.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferMethodResponse transferMethodResponse = (TransferMethodResponse) o;
    return (this.accountHolder == null ? transferMethodResponse.accountHolder == null : this.accountHolder.equals(transferMethodResponse.accountHolder)) &&
        (this.accountNumber == null ? transferMethodResponse.accountNumber == null : this.accountNumber.equals(transferMethodResponse.accountNumber)) &&
        (this.bank == null ? transferMethodResponse.bank == null : this.bank.equals(transferMethodResponse.bank)) &&
        (this.createdAt == null ? transferMethodResponse.createdAt == null : this.createdAt.equals(transferMethodResponse.createdAt)) &&
        (this.id == null ? transferMethodResponse.id == null : this.id.equals(transferMethodResponse.id)) &&
        (this._object == null ? transferMethodResponse._object == null : this._object.equals(transferMethodResponse._object)) &&
        (this.payeeId == null ? transferMethodResponse.payeeId == null : this.payeeId.equals(transferMethodResponse.payeeId)) &&
        (this.type == null ? transferMethodResponse.type == null : this.type.equals(transferMethodResponse.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.accountHolder == null ? 0: this.accountHolder.hashCode());
    result = 31 * result + (this.accountNumber == null ? 0: this.accountNumber.hashCode());
    result = 31 * result + (this.bank == null ? 0: this.bank.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.payeeId == null ? 0: this.payeeId.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferMethodResponse {\n");
    
    sb.append("  accountHolder: ").append(accountHolder).append("\n");
    sb.append("  accountNumber: ").append(accountNumber).append("\n");
    sb.append("  bank: ").append(bank).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  payeeId: ").append(payeeId).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
