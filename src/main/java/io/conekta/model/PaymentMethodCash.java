package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class PaymentMethodCash  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("auth_code")
  private Integer authCode = null;
  @SerializedName("cashier_id")
  private String cashierId = null;
  @SerializedName("reference")
  private String reference = null;
  @SerializedName("barcode_url")
  private String barcodeUrl = null;
  @SerializedName("expires_at")
  private Long expiresAt = null;
  @SerializedName("service_name")
  private String serviceName = null;
  @SerializedName("store")
  private String store = null;
  @SerializedName("store_name")
  private String storeName = null;
  @SerializedName("customer_ip_address")
  private String customerIpAddress = null;

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
   **/
  @ApiModelProperty(value = "")
  public Integer getAuthCode() {
    return authCode;
  }
  public void setAuthCode(Integer authCode) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCash paymentMethodCash = (PaymentMethodCash) o;
    return (this.type == null ? paymentMethodCash.type == null : this.type.equals(paymentMethodCash.type)) &&
        (this._object == null ? paymentMethodCash._object == null : this._object.equals(paymentMethodCash._object)) &&
        (this.authCode == null ? paymentMethodCash.authCode == null : this.authCode.equals(paymentMethodCash.authCode)) &&
        (this.cashierId == null ? paymentMethodCash.cashierId == null : this.cashierId.equals(paymentMethodCash.cashierId)) &&
        (this.reference == null ? paymentMethodCash.reference == null : this.reference.equals(paymentMethodCash.reference)) &&
        (this.barcodeUrl == null ? paymentMethodCash.barcodeUrl == null : this.barcodeUrl.equals(paymentMethodCash.barcodeUrl)) &&
        (this.expiresAt == null ? paymentMethodCash.expiresAt == null : this.expiresAt.equals(paymentMethodCash.expiresAt)) &&
        (this.serviceName == null ? paymentMethodCash.serviceName == null : this.serviceName.equals(paymentMethodCash.serviceName)) &&
        (this.store == null ? paymentMethodCash.store == null : this.store.equals(paymentMethodCash.store)) &&
        (this.storeName == null ? paymentMethodCash.storeName == null : this.storeName.equals(paymentMethodCash.storeName)) &&
        (this.customerIpAddress == null ? paymentMethodCash.customerIpAddress == null : this.customerIpAddress.equals(paymentMethodCash.customerIpAddress));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.authCode == null ? 0: this.authCode.hashCode());
    result = 31 * result + (this.cashierId == null ? 0: this.cashierId.hashCode());
    result = 31 * result + (this.reference == null ? 0: this.reference.hashCode());
    result = 31 * result + (this.barcodeUrl == null ? 0: this.barcodeUrl.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    result = 31 * result + (this.serviceName == null ? 0: this.serviceName.hashCode());
    result = 31 * result + (this.store == null ? 0: this.store.hashCode());
    result = 31 * result + (this.storeName == null ? 0: this.storeName.hashCode());
    result = 31 * result + (this.customerIpAddress == null ? 0: this.customerIpAddress.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCash {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  authCode: ").append(authCode).append("\n");
    sb.append("  cashierId: ").append(cashierId).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  barcodeUrl: ").append(barcodeUrl).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("  serviceName: ").append(serviceName).append("\n");
    sb.append("  store: ").append(store).append("\n");
    sb.append("  storeName: ").append(storeName).append("\n");
    sb.append("  customerIpAddress: ").append(customerIpAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
