package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class PayoutOrderPayoutsItem  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("expires_at")
  private Long expiresAt = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("payout_order_id")
  private String payoutOrderId = null;
  @SerializedName("status")
  private String status = null;

  /**
   * The amount of the payout.
   **/
  @ApiModelProperty(required = true, value = "The amount of the payout.")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  /**
   * The currency in which the payout is made.
   **/
  @ApiModelProperty(required = true, value = "The currency in which the payout is made.")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The expiration date of the payout.
   **/
  @ApiModelProperty(value = "The expiration date of the payout.")
  public Long getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The id of the payout.
   **/
  @ApiModelProperty(required = true, value = "The id of the payout.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The live mode of the payout.
   **/
  @ApiModelProperty(required = true, value = "The live mode of the payout.")
  public Boolean getLivemode() {
    return livemode;
  }
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  /**
   * The object of the payout.
   **/
  @ApiModelProperty(required = true, value = "The object of the payout.")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * The id of the payout order.
   **/
  @ApiModelProperty(value = "The id of the payout order.")
  public String getPayoutOrderId() {
    return payoutOrderId;
  }
  public void setPayoutOrderId(String payoutOrderId) {
    this.payoutOrderId = payoutOrderId;
  }

  /**
   * The status of the payout.
   **/
  @ApiModelProperty(value = "The status of the payout.")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutOrderPayoutsItem payoutOrderPayoutsItem = (PayoutOrderPayoutsItem) o;
    return (this.amount == null ? payoutOrderPayoutsItem.amount == null : this.amount.equals(payoutOrderPayoutsItem.amount)) &&
        (this.currency == null ? payoutOrderPayoutsItem.currency == null : this.currency.equals(payoutOrderPayoutsItem.currency)) &&
        (this.expiresAt == null ? payoutOrderPayoutsItem.expiresAt == null : this.expiresAt.equals(payoutOrderPayoutsItem.expiresAt)) &&
        (this.id == null ? payoutOrderPayoutsItem.id == null : this.id.equals(payoutOrderPayoutsItem.id)) &&
        (this.livemode == null ? payoutOrderPayoutsItem.livemode == null : this.livemode.equals(payoutOrderPayoutsItem.livemode)) &&
        (this._object == null ? payoutOrderPayoutsItem._object == null : this._object.equals(payoutOrderPayoutsItem._object)) &&
        (this.payoutOrderId == null ? payoutOrderPayoutsItem.payoutOrderId == null : this.payoutOrderId.equals(payoutOrderPayoutsItem.payoutOrderId)) &&
        (this.status == null ? payoutOrderPayoutsItem.status == null : this.status.equals(payoutOrderPayoutsItem.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0: this.livemode.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.payoutOrderId == null ? 0: this.payoutOrderId.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutOrderPayoutsItem {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  livemode: ").append(livemode).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  payoutOrderId: ").append(payoutOrderId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
