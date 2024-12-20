package io.conekta.model;

import io.conekta.model.TransferMethodResponse;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * A transfer represents the action of sending an amount to a business bank account including the status, amount and method used to make the transfer.
 **/
@ApiModel(description = "A transfer represents the action of sending an amount to a business bank account including the status, amount and method used to make the transfer.")
public class TransfersResponse  {

  private static final String MXN = "MXN";

  @SerializedName("amount")
  private Long amount = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("method")
  private TransferMethodResponse method = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("statement_description")
  private String statementDescription = null;
  @SerializedName("statement_reference")
  private String statementReference = null;
  @SerializedName("status")
  private String status = null;

  /**
   * Amount in cents of the transfer.
   * 
   **/
  @ApiModelProperty(value = "Amount in cents of the transfer.")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }
  /**
   * Date and time of creation of the transfer.
   * 
   **/
  @ApiModelProperty(value = "Date and time of creation of the transfer.")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }
  /**
   * The currency of the transfer. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217)
   * 
   **/
  @ApiModelProperty(value = "The currency of the transfer. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217)")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }
  /**
   * Unique identifier of the transfer.
   * 
   **/
  @ApiModelProperty(value = "Unique identifier of the transfer.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  /**
   * Indicates whether the transfer was created in live mode or test mode.
   * 
   **/
  @ApiModelProperty(value = "Indicates whether the transfer was created in live mode or test mode.")
  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public TransferMethodResponse getMethod() {
    return method;
  }

  public void setMethod(TransferMethodResponse method) {
    this.method = method;
  }
  /**
   * Object name, which is transfer.
   * 
   **/
  @ApiModelProperty(value = "Object name, which is transfer.")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }
  /**
   * Description of the transfer.
   * 
   **/
  @ApiModelProperty(value = "Description of the transfer.")
  public String getStatementDescription() {
    return statementDescription;
  }

  public void setStatementDescription(String statementDescription) {
    this.statementDescription = statementDescription;
  }
  /**
   * Reference number of the transfer.
   * 
   **/
  @ApiModelProperty(value = "Reference number of the transfer.")
  public String getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(String statementReference) {
    this.statementReference = statementReference;
  }
  /**
   * Code indicating transfer status.
   * 
   **/
  @ApiModelProperty(value = "Code indicating transfer status.")
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
    TransfersResponse transfersResponse = (TransfersResponse) o;
    return (this.amount == null ? transfersResponse.amount == null : this.amount.equals(transfersResponse.amount)) &&
        (this.createdAt == null ? transfersResponse.createdAt == null : this.createdAt.equals(transfersResponse.createdAt)) &&
        (this.currency == null ? transfersResponse.currency == null : this.currency.equals(transfersResponse.currency)) &&
        (this.id == null ? transfersResponse.id == null : this.id.equals(transfersResponse.id)) &&
        (this.livemode == null ? transfersResponse.livemode == null : this.livemode.equals(transfersResponse.livemode)) &&
        (this.method == null ? transfersResponse.method == null : this.method.equals(transfersResponse.method)) &&
        (this._object == null ? transfersResponse._object == null : this._object.equals(transfersResponse._object)) &&
        (this.statementDescription == null ? transfersResponse.statementDescription == null : this.statementDescription.equals(transfersResponse.statementDescription)) &&
        (this.statementReference == null ? transfersResponse.statementReference == null : this.statementReference.equals(transfersResponse.statementReference)) &&
        (this.status == null ? transfersResponse.status == null : this.status.equals(transfersResponse.status));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0 : this.amount.hashCode());
    result = 31 * result + (this.createdAt == null ? 0 : this.createdAt.hashCode());
    result = 31 * result + (this.currency == null ? 0 : this.currency.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0 : this.livemode.hashCode());
    result = 31 * result + (this.method == null ? 0 : this.method.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.statementDescription == null ? 0 : this.statementDescription.hashCode());
    result = 31 * result + (this.statementReference == null ? 0 : this.statementReference.hashCode());
    result = 31 * result + (this.status == null ? 0 : this.status.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransfersResponse {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
sb.append("  createdAt: ").append(createdAt).append("\n");
sb.append("  currency: ").append(currency).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  livemode: ").append(livemode).append("\n");
sb.append("  method: ").append(method).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  statementDescription: ").append(statementDescription).append("\n");
sb.append("  statementReference: ").append(statementReference).append("\n");
sb.append("  status: ").append(status).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
