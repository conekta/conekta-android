package io.conekta.model;

import io.conekta.model.PayoutMethod;

import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


/**
 * The payout information of the payout order.
 **/
@ApiModel(description = "The payout information of the payout order.")
public class Payout  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("payout_method")
  private PayoutMethod payoutMethod = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public PayoutMethod getPayoutMethod() {
    return payoutMethod;
  }
  public void setPayoutMethod(PayoutMethod payoutMethod) {
    this.payoutMethod = payoutMethod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payout payout = (Payout) o;
    return (this.payoutMethod == null ? payout.payoutMethod == null : this.payoutMethod.equals(payout.payoutMethod));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.payoutMethod == null ? 0: this.payoutMethod.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payout {\n");
    
    sb.append("  payoutMethod: ").append(payoutMethod).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
