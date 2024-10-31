package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class TokenCard  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("cvc")
  @JsonAdapter(EncryptedTypeAdapter.class)
  private String cvc = null;
  @SerializedName("device_fingerprint")
  private String deviceFingerprint = null;
  @SerializedName("exp_month")
  private String expMonth = null;
  @SerializedName("exp_year")
  private String expYear = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("number")
  @JsonAdapter(EncryptedTypeAdapter.class)
  private String number = null;

  /**
   * It is a value that allows identifying the security code of the card.
   **/
  @ApiModelProperty(required = true, value = "It is a value that allows identifying the security code of the card.")
  public String getCvc() {
    return cvc;
  }
  public void setCvc(String cvc) {
    this.cvc = cvc;
  }

  /**
   * It is a value that allows identifying the device fingerprint.
   **/
  @ApiModelProperty(value = "It is a value that allows identifying the device fingerprint.")
  public String getDeviceFingerprint() {
    return deviceFingerprint;
  }
  public void setDeviceFingerprint(String deviceFingerprint) {
    this.deviceFingerprint = deviceFingerprint;
  }

  /**
   * It is a value that allows identifying the expiration month of the card.
   **/
  @ApiModelProperty(required = true, value = "It is a value that allows identifying the expiration month of the card.")
  public String getExpMonth() {
    return expMonth;
  }
  public void setExpMonth(String expMonth) {
    this.expMonth = expMonth;
  }

  /**
   * It is a value that allows identifying the expiration year of the card.
   **/
  @ApiModelProperty(required = true, value = "It is a value that allows identifying the expiration year of the card.")
  public String getExpYear() {
    return expYear;
  }
  public void setExpYear(String expYear) {
    this.expYear = expYear;
  }

  /**
   * It is a value that allows identifying the name of the cardholder.
   **/
  @ApiModelProperty(required = true, value = "It is a value that allows identifying the name of the cardholder.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * It is a value that allows identifying the number of the card.
   **/
  @ApiModelProperty(required = true, value = "It is a value that allows identifying the number of the card.")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenCard tokenCard = (TokenCard) o;
    return (this.cvc == null ? tokenCard.cvc == null : this.cvc.equals(tokenCard.cvc)) &&
        (this.deviceFingerprint == null ? tokenCard.deviceFingerprint == null : this.deviceFingerprint.equals(tokenCard.deviceFingerprint)) &&
        (this.expMonth == null ? tokenCard.expMonth == null : this.expMonth.equals(tokenCard.expMonth)) &&
        (this.expYear == null ? tokenCard.expYear == null : this.expYear.equals(tokenCard.expYear)) &&
        (this.name == null ? tokenCard.name == null : this.name.equals(tokenCard.name)) &&
        (this.number == null ? tokenCard.number == null : this.number.equals(tokenCard.number));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cvc == null ? 0: this.cvc.hashCode());
    result = 31 * result + (this.deviceFingerprint == null ? 0: this.deviceFingerprint.hashCode());
    result = 31 * result + (this.expMonth == null ? 0: this.expMonth.hashCode());
    result = 31 * result + (this.expYear == null ? 0: this.expYear.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.number == null ? 0: this.number.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCard {\n");
    
    sb.append("  cvc: ").append(cvc).append("\n");
    sb.append("  deviceFingerprint: ").append(deviceFingerprint).append("\n");
    sb.append("  expMonth: ").append(expMonth).append("\n");
    sb.append("  expYear: ").append(expYear).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
