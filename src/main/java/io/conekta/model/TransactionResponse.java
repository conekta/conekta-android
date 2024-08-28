package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * The Transaction object represents the actions or steps of an order. Statuses can be: unprocessed, pending, available, owen, paid_out, voided, capture, capture_reversal, liquidation, liquidation_reversal, payout, payout_reversal, refund, refund_reversal, chargeback, chargeback_reversal, rounding_adjustment, won_chargeback, transferred, and transferred.
 **/
@ApiModel(description = "The Transaction object represents the actions or steps of an order. Statuses can be: unprocessed, pending, available, owen, paid_out, voided, capture, capture_reversal, liquidation, liquidation_reversal, payout, payout_reversal, refund, refund_reversal, chargeback, chargeback_reversal, rounding_adjustment, won_chargeback, transferred, and transferred.")
public class TransactionResponse  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("amount")
  private Long amount = null;
  @SerializedName("charge")
  private String charge = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("fee")
  private Long fee = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("net")
  private Long net = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("type")
  private String type = null;

  /**
   * The amount of the transaction.
   **/
  @ApiModelProperty(required = true, value = "The amount of the transaction.")
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  /**
   * Randomly assigned unique order identifier associated with the charge.
   **/
  @ApiModelProperty(required = true, value = "Randomly assigned unique order identifier associated with the charge.")
  public String getCharge() {
    return charge;
  }
  public void setCharge(String charge) {
    this.charge = charge;
  }

  /**
   * Date and time of creation of the transaction in Unix format.
   **/
  @ApiModelProperty(required = true, value = "Date and time of creation of the transaction in Unix format.")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The currency of the transaction. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217)
   **/
  @ApiModelProperty(required = true, value = "The currency of the transaction. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217)")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The amount to be deducted for taxes and commissions.
   **/
  @ApiModelProperty(required = true, value = "The amount to be deducted for taxes and commissions.")
  public Long getFee() {
    return fee;
  }
  public void setFee(Long fee) {
    this.fee = fee;
  }

  /**
   * Unique identifier of the transaction.
   **/
  @ApiModelProperty(required = true, value = "Unique identifier of the transaction.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Indicates whether the transaction was created in live mode or test mode.
   **/
  @ApiModelProperty(required = true, value = "Indicates whether the transaction was created in live mode or test mode.")
  public Boolean getLivemode() {
    return livemode;
  }
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  /**
   * The net amount after deducting commissions and taxes.
   **/
  @ApiModelProperty(required = true, value = "The net amount after deducting commissions and taxes.")
  public Long getNet() {
    return net;
  }
  public void setNet(Long net) {
    this.net = net;
  }

  /**
   * Object name, which is transaction.
   **/
  @ApiModelProperty(required = true, value = "Object name, which is transaction.")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * Code indicating transaction status.
   **/
  @ApiModelProperty(required = true, value = "Code indicating transaction status.")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Transaction Type
   **/
  @ApiModelProperty(required = true, value = "Transaction Type")
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
    TransactionResponse transactionResponse = (TransactionResponse) o;
    return (this.amount == null ? transactionResponse.amount == null : this.amount.equals(transactionResponse.amount)) &&
        (this.charge == null ? transactionResponse.charge == null : this.charge.equals(transactionResponse.charge)) &&
        (this.createdAt == null ? transactionResponse.createdAt == null : this.createdAt.equals(transactionResponse.createdAt)) &&
        (this.currency == null ? transactionResponse.currency == null : this.currency.equals(transactionResponse.currency)) &&
        (this.fee == null ? transactionResponse.fee == null : this.fee.equals(transactionResponse.fee)) &&
        (this.id == null ? transactionResponse.id == null : this.id.equals(transactionResponse.id)) &&
        (this.livemode == null ? transactionResponse.livemode == null : this.livemode.equals(transactionResponse.livemode)) &&
        (this.net == null ? transactionResponse.net == null : this.net.equals(transactionResponse.net)) &&
        (this._object == null ? transactionResponse._object == null : this._object.equals(transactionResponse._object)) &&
        (this.status == null ? transactionResponse.status == null : this.status.equals(transactionResponse.status)) &&
        (this.type == null ? transactionResponse.type == null : this.type.equals(transactionResponse.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.charge == null ? 0: this.charge.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.fee == null ? 0: this.fee.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0: this.livemode.hashCode());
    result = 31 * result + (this.net == null ? 0: this.net.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponse {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  charge: ").append(charge).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  fee: ").append(fee).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  livemode: ").append(livemode).append("\n");
    sb.append("  net: ").append(net).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
