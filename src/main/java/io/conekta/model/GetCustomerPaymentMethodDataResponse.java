package io.conekta.model;

import io.conekta.model.PaymentMethodCardResponse;
import io.conekta.model.PaymentMethodCashResponse;
import io.conekta.model.PaymentMethodSpeiRecurrent;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class GetCustomerPaymentMethodDataResponse  {

  private static final String MXN = "MXN";

  @SerializedName("type")
  private String type = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("parent_id")
  private String parentId = null;
  @SerializedName("reference")
  private String reference = null;
  @SerializedName("barcode")
  private String barcode = null;
  @SerializedName("barcode_url")
  private String barcodeUrl = null;
  @SerializedName("expires_at")
  private String expiresAt = null;
  @SerializedName("provider")
  private String provider = null;
  @SerializedName("last4")
  private String last4 = null;
  @SerializedName("bin")
  private String bin = null;
  @SerializedName("card_type")
  private String cardType = null;
  @SerializedName("exp_month")
  private String expMonth = null;
  @SerializedName("exp_year")
  private String expYear = null;
  @SerializedName("brand")
  private String brand = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("default")
  private Boolean _default = null;
  @SerializedName("visible_on_checkout")
  private Boolean visibleOnCheckout = null;
  @SerializedName("payment_source_status")
  private String paymentSourceStatus = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getBarcodeUrl() {
    return barcodeUrl;
  }

  public void setBarcodeUrl(String barcodeUrl) {
    this.barcodeUrl = barcodeUrl;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getLast4() {
    return last4;
  }

  public void setLast4(String last4) {
    this.last4 = last4;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getBin() {
    return bin;
  }

  public void setBin(String bin) {
    this.bin = bin;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getExpMonth() {
    return expMonth;
  }

  public void setExpMonth(String expMonth) {
    this.expMonth = expMonth;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getExpYear() {
    return expYear;
  }

  public void setExpYear(String expYear) {
    this.expYear = expYear;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Boolean getVisibleOnCheckout() {
    return visibleOnCheckout;
  }

  public void setVisibleOnCheckout(Boolean visibleOnCheckout) {
    this.visibleOnCheckout = visibleOnCheckout;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getPaymentSourceStatus() {
    return paymentSourceStatus;
  }

  public void setPaymentSourceStatus(String paymentSourceStatus) {
    this.paymentSourceStatus = paymentSourceStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerPaymentMethodDataResponse getCustomerPaymentMethodDataResponse = (GetCustomerPaymentMethodDataResponse) o;
    return (this.type == null ? getCustomerPaymentMethodDataResponse.type == null : this.type.equals(getCustomerPaymentMethodDataResponse.type)) &&
        (this.id == null ? getCustomerPaymentMethodDataResponse.id == null : this.id.equals(getCustomerPaymentMethodDataResponse.id)) &&
        (this._object == null ? getCustomerPaymentMethodDataResponse._object == null : this._object.equals(getCustomerPaymentMethodDataResponse._object)) &&
        (this.createdAt == null ? getCustomerPaymentMethodDataResponse.createdAt == null : this.createdAt.equals(getCustomerPaymentMethodDataResponse.createdAt)) &&
        (this.parentId == null ? getCustomerPaymentMethodDataResponse.parentId == null : this.parentId.equals(getCustomerPaymentMethodDataResponse.parentId)) &&
        (this.reference == null ? getCustomerPaymentMethodDataResponse.reference == null : this.reference.equals(getCustomerPaymentMethodDataResponse.reference)) &&
        (this.barcode == null ? getCustomerPaymentMethodDataResponse.barcode == null : this.barcode.equals(getCustomerPaymentMethodDataResponse.barcode)) &&
        (this.barcodeUrl == null ? getCustomerPaymentMethodDataResponse.barcodeUrl == null : this.barcodeUrl.equals(getCustomerPaymentMethodDataResponse.barcodeUrl)) &&
        (this.expiresAt == null ? getCustomerPaymentMethodDataResponse.expiresAt == null : this.expiresAt.equals(getCustomerPaymentMethodDataResponse.expiresAt)) &&
        (this.provider == null ? getCustomerPaymentMethodDataResponse.provider == null : this.provider.equals(getCustomerPaymentMethodDataResponse.provider)) &&
        (this.last4 == null ? getCustomerPaymentMethodDataResponse.last4 == null : this.last4.equals(getCustomerPaymentMethodDataResponse.last4)) &&
        (this.bin == null ? getCustomerPaymentMethodDataResponse.bin == null : this.bin.equals(getCustomerPaymentMethodDataResponse.bin)) &&
        (this.cardType == null ? getCustomerPaymentMethodDataResponse.cardType == null : this.cardType.equals(getCustomerPaymentMethodDataResponse.cardType)) &&
        (this.expMonth == null ? getCustomerPaymentMethodDataResponse.expMonth == null : this.expMonth.equals(getCustomerPaymentMethodDataResponse.expMonth)) &&
        (this.expYear == null ? getCustomerPaymentMethodDataResponse.expYear == null : this.expYear.equals(getCustomerPaymentMethodDataResponse.expYear)) &&
        (this.brand == null ? getCustomerPaymentMethodDataResponse.brand == null : this.brand.equals(getCustomerPaymentMethodDataResponse.brand)) &&
        (this.name == null ? getCustomerPaymentMethodDataResponse.name == null : this.name.equals(getCustomerPaymentMethodDataResponse.name)) &&
        (this._default == null ? getCustomerPaymentMethodDataResponse._default == null : this._default.equals(getCustomerPaymentMethodDataResponse._default)) &&
        (this.visibleOnCheckout == null ? getCustomerPaymentMethodDataResponse.visibleOnCheckout == null : this.visibleOnCheckout.equals(getCustomerPaymentMethodDataResponse.visibleOnCheckout)) &&
        (this.paymentSourceStatus == null ? getCustomerPaymentMethodDataResponse.paymentSourceStatus == null : this.paymentSourceStatus.equals(getCustomerPaymentMethodDataResponse.paymentSourceStatus));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0 : this.type.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.createdAt == null ? 0 : this.createdAt.hashCode());
    result = 31 * result + (this.parentId == null ? 0 : this.parentId.hashCode());
    result = 31 * result + (this.reference == null ? 0 : this.reference.hashCode());
    result = 31 * result + (this.barcode == null ? 0 : this.barcode.hashCode());
    result = 31 * result + (this.barcodeUrl == null ? 0 : this.barcodeUrl.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0 : this.expiresAt.hashCode());
    result = 31 * result + (this.provider == null ? 0 : this.provider.hashCode());
    result = 31 * result + (this.last4 == null ? 0 : this.last4.hashCode());
    result = 31 * result + (this.bin == null ? 0 : this.bin.hashCode());
    result = 31 * result + (this.cardType == null ? 0 : this.cardType.hashCode());
    result = 31 * result + (this.expMonth == null ? 0 : this.expMonth.hashCode());
    result = 31 * result + (this.expYear == null ? 0 : this.expYear.hashCode());
    result = 31 * result + (this.brand == null ? 0 : this.brand.hashCode());
    result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
    result = 31 * result + (this._default == null ? 0 : this._default.hashCode());
    result = 31 * result + (this.visibleOnCheckout == null ? 0 : this.visibleOnCheckout.hashCode());
    result = 31 * result + (this.paymentSourceStatus == null ? 0 : this.paymentSourceStatus.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerPaymentMethodDataResponse {\n");
    
    sb.append("  type: ").append(type).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  createdAt: ").append(createdAt).append("\n");
sb.append("  parentId: ").append(parentId).append("\n");
sb.append("  reference: ").append(reference).append("\n");
sb.append("  barcode: ").append(barcode).append("\n");
sb.append("  barcodeUrl: ").append(barcodeUrl).append("\n");
sb.append("  expiresAt: ").append(expiresAt).append("\n");
sb.append("  provider: ").append(provider).append("\n");
sb.append("  last4: ").append(last4).append("\n");
sb.append("  bin: ").append(bin).append("\n");
sb.append("  cardType: ").append(cardType).append("\n");
sb.append("  expMonth: ").append(expMonth).append("\n");
sb.append("  expYear: ").append(expYear).append("\n");
sb.append("  brand: ").append(brand).append("\n");
sb.append("  name: ").append(name).append("\n");
sb.append("  _default: ").append(_default).append("\n");
sb.append("  visibleOnCheckout: ").append(visibleOnCheckout).append("\n");
sb.append("  paymentSourceStatus: ").append(paymentSourceStatus).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
