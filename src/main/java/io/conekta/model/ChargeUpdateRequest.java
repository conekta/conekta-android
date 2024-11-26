package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * requested field for update a charge
 **/
@ApiModel(description = "requested field for update a charge")
public class ChargeUpdateRequest  {

  private static final String MXN = "MXN";

  @SerializedName("reference_id")
  private String referenceId = null;

  /**
   * custom reference id
   * 
   **/
  @ApiModelProperty(value = "custom reference id")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeUpdateRequest chargeUpdateRequest = (ChargeUpdateRequest) o;
    return (this.referenceId == null ? chargeUpdateRequest.referenceId == null : this.referenceId.equals(chargeUpdateRequest.referenceId));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.referenceId == null ? 0 : this.referenceId.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeUpdateRequest {\n");
    
    sb.append("  referenceId: ").append(referenceId).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
