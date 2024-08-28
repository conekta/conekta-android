package io.conekta.model;

import io.conekta.model.TransferDestinationResponse;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * A transfer represents the action of sending an amount to a business bank account including the status, amount and method used to make the transfer.
 **/
@ApiModel(description = "A transfer represents the action of sending an amount to a business bank account including the status, amount and method used to make the transfer.")
public class TransferResponse  {
  
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
  @SerializedName("destination")
  private TransferDestinationResponse destination = null;
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
   **/
  @ApiModelProperty(value = "Amount in cents of the transfer.")
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  /**
   * Date and time of creation of the transfer in Unix format.
   **/
  @ApiModelProperty(value = "Date and time of creation of the transfer in Unix format.")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The currency of the transfer. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217)
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
   **/
  @ApiModelProperty(value = "Indicates whether the transfer was created in live mode or test mode.")
  public Boolean getLivemode() {
    return livemode;
  }
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TransferDestinationResponse getDestination() {
    return destination;
  }
  public void setDestination(TransferDestinationResponse destination) {
    this.destination = destination;
  }

  /**
   * Object name, which is transfer.
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
    TransferResponse transferResponse = (TransferResponse) o;
    return (this.amount == null ? transferResponse.amount == null : this.amount.equals(transferResponse.amount)) &&
        (this.createdAt == null ? transferResponse.createdAt == null : this.createdAt.equals(transferResponse.createdAt)) &&
        (this.currency == null ? transferResponse.currency == null : this.currency.equals(transferResponse.currency)) &&
        (this.id == null ? transferResponse.id == null : this.id.equals(transferResponse.id)) &&
        (this.livemode == null ? transferResponse.livemode == null : this.livemode.equals(transferResponse.livemode)) &&
        (this.destination == null ? transferResponse.destination == null : this.destination.equals(transferResponse.destination)) &&
        (this._object == null ? transferResponse._object == null : this._object.equals(transferResponse._object)) &&
        (this.statementDescription == null ? transferResponse.statementDescription == null : this.statementDescription.equals(transferResponse.statementDescription)) &&
        (this.statementReference == null ? transferResponse.statementReference == null : this.statementReference.equals(transferResponse.statementReference)) &&
        (this.status == null ? transferResponse.status == null : this.status.equals(transferResponse.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0: this.livemode.hashCode());
    result = 31 * result + (this.destination == null ? 0: this.destination.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.statementDescription == null ? 0: this.statementDescription.hashCode());
    result = 31 * result + (this.statementReference == null ? 0: this.statementReference.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferResponse {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  livemode: ").append(livemode).append("\n");
    sb.append("  destination: ").append(destination).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  statementDescription: ").append(statementDescription).append("\n");
    sb.append("  statementReference: ").append(statementReference).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
