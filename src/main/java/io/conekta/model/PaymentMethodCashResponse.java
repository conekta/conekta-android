package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class PaymentMethodCashResponse  {
  
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
  private Long expiresAt = null;
  @SerializedName("provider")
  private String provider = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
  @ApiModelProperty(required = true, value = "")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
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
  public String getBarcode() {
    return barcode;
  }
  public void setBarcode(String barcode) {
    this.barcode = barcode;
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
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCashResponse paymentMethodCashResponse = (PaymentMethodCashResponse) o;
    return (this.type == null ? paymentMethodCashResponse.type == null : this.type.equals(paymentMethodCashResponse.type)) &&
        (this.id == null ? paymentMethodCashResponse.id == null : this.id.equals(paymentMethodCashResponse.id)) &&
        (this._object == null ? paymentMethodCashResponse._object == null : this._object.equals(paymentMethodCashResponse._object)) &&
        (this.createdAt == null ? paymentMethodCashResponse.createdAt == null : this.createdAt.equals(paymentMethodCashResponse.createdAt)) &&
        (this.parentId == null ? paymentMethodCashResponse.parentId == null : this.parentId.equals(paymentMethodCashResponse.parentId)) &&
        (this.reference == null ? paymentMethodCashResponse.reference == null : this.reference.equals(paymentMethodCashResponse.reference)) &&
        (this.barcode == null ? paymentMethodCashResponse.barcode == null : this.barcode.equals(paymentMethodCashResponse.barcode)) &&
        (this.barcodeUrl == null ? paymentMethodCashResponse.barcodeUrl == null : this.barcodeUrl.equals(paymentMethodCashResponse.barcodeUrl)) &&
        (this.expiresAt == null ? paymentMethodCashResponse.expiresAt == null : this.expiresAt.equals(paymentMethodCashResponse.expiresAt)) &&
        (this.provider == null ? paymentMethodCashResponse.provider == null : this.provider.equals(paymentMethodCashResponse.provider));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.parentId == null ? 0: this.parentId.hashCode());
    result = 31 * result + (this.reference == null ? 0: this.reference.hashCode());
    result = 31 * result + (this.barcode == null ? 0: this.barcode.hashCode());
    result = 31 * result + (this.barcodeUrl == null ? 0: this.barcodeUrl.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    result = 31 * result + (this.provider == null ? 0: this.provider.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCashResponse {\n");
    
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
    sb.append("}\n");
    return sb.toString();
  }
}
