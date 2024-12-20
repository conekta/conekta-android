package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class ChargeResponseChannel  {

  private static final String MXN = "MXN";

  @SerializedName("segment")
  private String segment = null;
  @SerializedName("checkout_request_id")
  private String checkoutRequestId = null;
  @SerializedName("checkout_request_type")
  private String checkoutRequestType = null;
  @SerializedName("id")
  private String id = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getSegment() {
    return segment;
  }

  public void setSegment(String segment) {
    this.segment = segment;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCheckoutRequestId() {
    return checkoutRequestId;
  }

  public void setCheckoutRequestId(String checkoutRequestId) {
    this.checkoutRequestId = checkoutRequestId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCheckoutRequestType() {
    return checkoutRequestType;
  }

  public void setCheckoutRequestType(String checkoutRequestType) {
    this.checkoutRequestType = checkoutRequestType;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeResponseChannel chargeResponseChannel = (ChargeResponseChannel) o;
    return (this.segment == null ? chargeResponseChannel.segment == null : this.segment.equals(chargeResponseChannel.segment)) &&
        (this.checkoutRequestId == null ? chargeResponseChannel.checkoutRequestId == null : this.checkoutRequestId.equals(chargeResponseChannel.checkoutRequestId)) &&
        (this.checkoutRequestType == null ? chargeResponseChannel.checkoutRequestType == null : this.checkoutRequestType.equals(chargeResponseChannel.checkoutRequestType)) &&
        (this.id == null ? chargeResponseChannel.id == null : this.id.equals(chargeResponseChannel.id));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.segment == null ? 0 : this.segment.hashCode());
    result = 31 * result + (this.checkoutRequestId == null ? 0 : this.checkoutRequestId.hashCode());
    result = 31 * result + (this.checkoutRequestType == null ? 0 : this.checkoutRequestType.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeResponseChannel {\n");
    
    sb.append("  segment: ").append(segment).append("\n");
sb.append("  checkoutRequestId: ").append(checkoutRequestId).append("\n");
sb.append("  checkoutRequestType: ").append(checkoutRequestType).append("\n");
sb.append("  id: ").append(id).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
