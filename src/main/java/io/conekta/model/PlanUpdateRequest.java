package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * a plan
 **/
@ApiModel(description = "a plan")
public class PlanUpdateRequest  {
  
  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("expiry_count")
  private Integer expiryCount = null;
  @SerializedName("name")
  private String name = null;

  /**
   * The amount in cents that will be charged on the interval specified.
   * minimum: 1
   **/
  @ApiModelProperty(value = "The amount in cents that will be charged on the interval specified.")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  /**
   * ISO 4217 for currencies, for the Mexican peso it is MXN/USD
   **/
  @ApiModelProperty(value = "ISO 4217 for currencies, for the Mexican peso it is MXN/USD")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Number of repetitions of the frequency NUMBER OF CHARGES TO BE MADE, considering the interval and frequency, this evolves over time, but is subject to the expiration count.
   **/
  @ApiModelProperty(value = "Number of repetitions of the frequency NUMBER OF CHARGES TO BE MADE, considering the interval and frequency, this evolves over time, but is subject to the expiration count.")
  public Integer getExpiryCount() {
    return expiryCount;
  }
  public void setExpiryCount(Integer expiryCount) {
    this.expiryCount = expiryCount;
  }

  /**
   * The name of the plan.
   **/
  @ApiModelProperty(value = "The name of the plan.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanUpdateRequest planUpdateRequest = (PlanUpdateRequest) o;
    return (this.amount == null ? planUpdateRequest.amount == null : this.amount.equals(planUpdateRequest.amount)) &&
        (this.currency == null ? planUpdateRequest.currency == null : this.currency.equals(planUpdateRequest.currency)) &&
        (this.expiryCount == null ? planUpdateRequest.expiryCount == null : this.expiryCount.equals(planUpdateRequest.expiryCount)) &&
        (this.name == null ? planUpdateRequest.name == null : this.name.equals(planUpdateRequest.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.expiryCount == null ? 0: this.expiryCount.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanUpdateRequest {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  expiryCount: ").append(expiryCount).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
