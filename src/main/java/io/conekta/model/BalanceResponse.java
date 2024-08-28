package io.conekta.model;

import io.conekta.model.BalanceCommonField;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * balance model
 **/
@ApiModel(description = "balance model")
public class BalanceResponse  {
  
  @SerializedName("available")
  private List<BalanceCommonField> available = null;
  @SerializedName("cashout_retention_amount")
  private List<BalanceCommonField> cashoutRetentionAmount = null;
  @SerializedName("conekta_retention")
  private List<BalanceCommonField> conektaRetention = null;
  @SerializedName("gateway")
  private List<BalanceCommonField> gateway = null;
  @SerializedName("pending")
  private List<BalanceCommonField> pending = null;
  @SerializedName("retained")
  private List<BalanceCommonField> retained = null;
  @SerializedName("retention_amount")
  private List<BalanceCommonField> retentionAmount = null;
  @SerializedName("target_collateral_amount")
  private Object targetCollateralAmount = null;
  @SerializedName("target_retention_amount")
  private List<BalanceCommonField> targetRetentionAmount = null;
  @SerializedName("temporarily_retained")
  private List<BalanceCommonField> temporarilyRetained = null;

  /**
   * The balance's available
   **/
  @ApiModelProperty(value = "The balance's available")
  public List<BalanceCommonField> getAvailable() {
    return available;
  }
  public void setAvailable(List<BalanceCommonField> available) {
    this.available = available;
  }

  /**
   * The balance's cashout retention amount
   **/
  @ApiModelProperty(value = "The balance's cashout retention amount")
  public List<BalanceCommonField> getCashoutRetentionAmount() {
    return cashoutRetentionAmount;
  }
  public void setCashoutRetentionAmount(List<BalanceCommonField> cashoutRetentionAmount) {
    this.cashoutRetentionAmount = cashoutRetentionAmount;
  }

  /**
   * The balance's conekta retention
   **/
  @ApiModelProperty(value = "The balance's conekta retention")
  public List<BalanceCommonField> getConektaRetention() {
    return conektaRetention;
  }
  public void setConektaRetention(List<BalanceCommonField> conektaRetention) {
    this.conektaRetention = conektaRetention;
  }

  /**
   * The balance's gateway
   **/
  @ApiModelProperty(value = "The balance's gateway")
  public List<BalanceCommonField> getGateway() {
    return gateway;
  }
  public void setGateway(List<BalanceCommonField> gateway) {
    this.gateway = gateway;
  }

  /**
   * The balance's pending
   **/
  @ApiModelProperty(value = "The balance's pending")
  public List<BalanceCommonField> getPending() {
    return pending;
  }
  public void setPending(List<BalanceCommonField> pending) {
    this.pending = pending;
  }

  /**
   * The balance's retained
   **/
  @ApiModelProperty(value = "The balance's retained")
  public List<BalanceCommonField> getRetained() {
    return retained;
  }
  public void setRetained(List<BalanceCommonField> retained) {
    this.retained = retained;
  }

  /**
   * The balance's retention amount
   **/
  @ApiModelProperty(value = "The balance's retention amount")
  public List<BalanceCommonField> getRetentionAmount() {
    return retentionAmount;
  }
  public void setRetentionAmount(List<BalanceCommonField> retentionAmount) {
    this.retentionAmount = retentionAmount;
  }

  /**
   * The balance's target collateral amount
   **/
  @ApiModelProperty(value = "The balance's target collateral amount")
  public Object getTargetCollateralAmount() {
    return targetCollateralAmount;
  }
  public void setTargetCollateralAmount(Object targetCollateralAmount) {
    this.targetCollateralAmount = targetCollateralAmount;
  }

  /**
   * The balance's target retention amount
   **/
  @ApiModelProperty(value = "The balance's target retention amount")
  public List<BalanceCommonField> getTargetRetentionAmount() {
    return targetRetentionAmount;
  }
  public void setTargetRetentionAmount(List<BalanceCommonField> targetRetentionAmount) {
    this.targetRetentionAmount = targetRetentionAmount;
  }

  /**
   * The balance's temporarily retained
   **/
  @ApiModelProperty(value = "The balance's temporarily retained")
  public List<BalanceCommonField> getTemporarilyRetained() {
    return temporarilyRetained;
  }
  public void setTemporarilyRetained(List<BalanceCommonField> temporarilyRetained) {
    this.temporarilyRetained = temporarilyRetained;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceResponse balanceResponse = (BalanceResponse) o;
    return (this.available == null ? balanceResponse.available == null : this.available.equals(balanceResponse.available)) &&
        (this.cashoutRetentionAmount == null ? balanceResponse.cashoutRetentionAmount == null : this.cashoutRetentionAmount.equals(balanceResponse.cashoutRetentionAmount)) &&
        (this.conektaRetention == null ? balanceResponse.conektaRetention == null : this.conektaRetention.equals(balanceResponse.conektaRetention)) &&
        (this.gateway == null ? balanceResponse.gateway == null : this.gateway.equals(balanceResponse.gateway)) &&
        (this.pending == null ? balanceResponse.pending == null : this.pending.equals(balanceResponse.pending)) &&
        (this.retained == null ? balanceResponse.retained == null : this.retained.equals(balanceResponse.retained)) &&
        (this.retentionAmount == null ? balanceResponse.retentionAmount == null : this.retentionAmount.equals(balanceResponse.retentionAmount)) &&
        (this.targetCollateralAmount == null ? balanceResponse.targetCollateralAmount == null : this.targetCollateralAmount.equals(balanceResponse.targetCollateralAmount)) &&
        (this.targetRetentionAmount == null ? balanceResponse.targetRetentionAmount == null : this.targetRetentionAmount.equals(balanceResponse.targetRetentionAmount)) &&
        (this.temporarilyRetained == null ? balanceResponse.temporarilyRetained == null : this.temporarilyRetained.equals(balanceResponse.temporarilyRetained));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.available == null ? 0: this.available.hashCode());
    result = 31 * result + (this.cashoutRetentionAmount == null ? 0: this.cashoutRetentionAmount.hashCode());
    result = 31 * result + (this.conektaRetention == null ? 0: this.conektaRetention.hashCode());
    result = 31 * result + (this.gateway == null ? 0: this.gateway.hashCode());
    result = 31 * result + (this.pending == null ? 0: this.pending.hashCode());
    result = 31 * result + (this.retained == null ? 0: this.retained.hashCode());
    result = 31 * result + (this.retentionAmount == null ? 0: this.retentionAmount.hashCode());
    result = 31 * result + (this.targetCollateralAmount == null ? 0: this.targetCollateralAmount.hashCode());
    result = 31 * result + (this.targetRetentionAmount == null ? 0: this.targetRetentionAmount.hashCode());
    result = 31 * result + (this.temporarilyRetained == null ? 0: this.temporarilyRetained.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceResponse {\n");
    
    sb.append("  available: ").append(available).append("\n");
    sb.append("  cashoutRetentionAmount: ").append(cashoutRetentionAmount).append("\n");
    sb.append("  conektaRetention: ").append(conektaRetention).append("\n");
    sb.append("  gateway: ").append(gateway).append("\n");
    sb.append("  pending: ").append(pending).append("\n");
    sb.append("  retained: ").append(retained).append("\n");
    sb.append("  retentionAmount: ").append(retentionAmount).append("\n");
    sb.append("  targetCollateralAmount: ").append(targetCollateralAmount).append("\n");
    sb.append("  targetRetentionAmount: ").append(targetRetentionAmount).append("\n");
    sb.append("  temporarilyRetained: ").append(temporarilyRetained).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
