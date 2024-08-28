package io.conekta.model;

import io.conekta.model.OasAnyTypeNotMapped;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ShippingOrderResponse  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("amount")
  private Long amount = null;
  @SerializedName("carrier")
  private String carrier = null;
  @SerializedName("tracking_number")
  private String trackingNumber = null;
  @SerializedName("method")
  private String method = null;
  @SerializedName("metadata")
  private Map<String, OasAnyTypeNotMapped> metadata = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("parent_id")
  private String parentId = null;

  /**
   * Shipping amount in cents
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "Shipping amount in cents")
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  /**
   * Carrier name for the shipment
   **/
  @ApiModelProperty(value = "Carrier name for the shipment")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  /**
   * Tracking number can be used to track the shipment
   **/
  @ApiModelProperty(value = "Tracking number can be used to track the shipment")
  public String getTrackingNumber() {
    return trackingNumber;
  }
  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  /**
   * Method of shipment
   **/
  @ApiModelProperty(value = "Method of shipment")
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }

  /**
   * Hash where the user can send additional information for each 'shipping'.
   **/
  @ApiModelProperty(value = "Hash where the user can send additional information for each 'shipping'.")
  public Map<String, OasAnyTypeNotMapped> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, OasAnyTypeNotMapped> metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingOrderResponse shippingOrderResponse = (ShippingOrderResponse) o;
    return (this.amount == null ? shippingOrderResponse.amount == null : this.amount.equals(shippingOrderResponse.amount)) &&
        (this.carrier == null ? shippingOrderResponse.carrier == null : this.carrier.equals(shippingOrderResponse.carrier)) &&
        (this.trackingNumber == null ? shippingOrderResponse.trackingNumber == null : this.trackingNumber.equals(shippingOrderResponse.trackingNumber)) &&
        (this.method == null ? shippingOrderResponse.method == null : this.method.equals(shippingOrderResponse.method)) &&
        (this.metadata == null ? shippingOrderResponse.metadata == null : this.metadata.equals(shippingOrderResponse.metadata)) &&
        (this.id == null ? shippingOrderResponse.id == null : this.id.equals(shippingOrderResponse.id)) &&
        (this._object == null ? shippingOrderResponse._object == null : this._object.equals(shippingOrderResponse._object)) &&
        (this.parentId == null ? shippingOrderResponse.parentId == null : this.parentId.equals(shippingOrderResponse.parentId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.carrier == null ? 0: this.carrier.hashCode());
    result = 31 * result + (this.trackingNumber == null ? 0: this.trackingNumber.hashCode());
    result = 31 * result + (this.method == null ? 0: this.method.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.parentId == null ? 0: this.parentId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingOrderResponse {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  carrier: ").append(carrier).append("\n");
    sb.append("  trackingNumber: ").append(trackingNumber).append("\n");
    sb.append("  method: ").append(method).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  parentId: ").append(parentId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
