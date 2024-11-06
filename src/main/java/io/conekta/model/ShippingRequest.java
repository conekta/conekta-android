package io.conekta.model;

import io.conekta.model.OasAnyTypeNotMapped;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class ShippingRequest  {

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
   * 
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
   * 
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
   * 
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
   * 
   **/
  @ApiModelProperty(value = "Hash where the user can send additional information for each 'shipping'.")
  public Map<String, OasAnyTypeNotMapped> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, OasAnyTypeNotMapped> metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingRequest shippingRequest = (ShippingRequest) o;
    return (this.amount == null ? shippingRequest.amount == null : this.amount.equals(shippingRequest.amount)) &&
        (this.carrier == null ? shippingRequest.carrier == null : this.carrier.equals(shippingRequest.carrier)) &&
        (this.trackingNumber == null ? shippingRequest.trackingNumber == null : this.trackingNumber.equals(shippingRequest.trackingNumber)) &&
        (this.method == null ? shippingRequest.method == null : this.method.equals(shippingRequest.method)) &&
        (this.metadata == null ? shippingRequest.metadata == null : this.metadata.equals(shippingRequest.metadata));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0 : this.amount.hashCode());
    result = 31 * result + (this.carrier == null ? 0 : this.carrier.hashCode());
    result = 31 * result + (this.trackingNumber == null ? 0 : this.trackingNumber.hashCode());
    result = 31 * result + (this.method == null ? 0 : this.method.hashCode());
    result = 31 * result + (this.metadata == null ? 0 : this.metadata.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingRequest {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
sb.append("  carrier: ").append(carrier).append("\n");
sb.append("  trackingNumber: ").append(trackingNumber).append("\n");
sb.append("  method: ").append(method).append("\n");
sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
