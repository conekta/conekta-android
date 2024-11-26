package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class PaymentMethodCardRequest  {

  private static final String MXN = "MXN";

  @SerializedName("type")
  private String type = null;
  @SerializedName("cvc")
  private String cvc = null;
  @SerializedName("exp_month")
  private String expMonth = null;
  @SerializedName("exp_year")
  private String expYear = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("number")
  private String number = null;
  @SerializedName("customer_ip_address")
  private String customerIpAddress = null;

  /**
   * Type of payment method
   * 
   **/
  @ApiModelProperty(required = true, value = "Type of payment method")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
  /**
   * Card security code
   * 
   **/
  @ApiModelProperty(required = true, value = "Card security code")
  public String getCvc() {
    return cvc;
  }

  public void setCvc(String cvc) {
    this.cvc = cvc;
  }
  /**
   * Card expiration month
   * 
   **/
  @ApiModelProperty(required = true, value = "Card expiration month")
  public String getExpMonth() {
    return expMonth;
  }

  public void setExpMonth(String expMonth) {
    this.expMonth = expMonth;
  }
  /**
   * Card expiration year
   * 
   **/
  @ApiModelProperty(required = true, value = "Card expiration year")
  public String getExpYear() {
    return expYear;
  }

  public void setExpYear(String expYear) {
    this.expYear = expYear;
  }
  /**
   * Cardholder name
   * 
   **/
  @ApiModelProperty(required = true, value = "Cardholder name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  /**
   * Card number
   * 
   **/
  @ApiModelProperty(required = true, value = "Card number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
  /**
   * Optional field used to capture the customer's IP address for fraud prevention and security monitoring purposes
   * 
   **/
  @ApiModelProperty(value = "Optional field used to capture the customer's IP address for fraud prevention and security monitoring purposes")
  public String getCustomerIpAddress() {
    return customerIpAddress;
  }

  public void setCustomerIpAddress(String customerIpAddress) {
    this.customerIpAddress = customerIpAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCardRequest paymentMethodCardRequest = (PaymentMethodCardRequest) o;
    return (this.type == null ? paymentMethodCardRequest.type == null : this.type.equals(paymentMethodCardRequest.type)) &&
        (this.cvc == null ? paymentMethodCardRequest.cvc == null : this.cvc.equals(paymentMethodCardRequest.cvc)) &&
        (this.expMonth == null ? paymentMethodCardRequest.expMonth == null : this.expMonth.equals(paymentMethodCardRequest.expMonth)) &&
        (this.expYear == null ? paymentMethodCardRequest.expYear == null : this.expYear.equals(paymentMethodCardRequest.expYear)) &&
        (this.name == null ? paymentMethodCardRequest.name == null : this.name.equals(paymentMethodCardRequest.name)) &&
        (this.number == null ? paymentMethodCardRequest.number == null : this.number.equals(paymentMethodCardRequest.number)) &&
        (this.customerIpAddress == null ? paymentMethodCardRequest.customerIpAddress == null : this.customerIpAddress.equals(paymentMethodCardRequest.customerIpAddress));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0 : this.type.hashCode());
    result = 31 * result + (this.cvc == null ? 0 : this.cvc.hashCode());
    result = 31 * result + (this.expMonth == null ? 0 : this.expMonth.hashCode());
    result = 31 * result + (this.expYear == null ? 0 : this.expYear.hashCode());
    result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
    result = 31 * result + (this.number == null ? 0 : this.number.hashCode());
    result = 31 * result + (this.customerIpAddress == null ? 0 : this.customerIpAddress.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCardRequest {\n");
    
    sb.append("  type: ").append(type).append("\n");
sb.append("  cvc: ").append(cvc).append("\n");
sb.append("  expMonth: ").append(expMonth).append("\n");
sb.append("  expYear: ").append(expYear).append("\n");
sb.append("  name: ").append(name).append("\n");
sb.append("  number: ").append(number).append("\n");
sb.append("  customerIpAddress: ").append(customerIpAddress).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
