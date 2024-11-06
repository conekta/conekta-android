package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * a plan
 **/
@ApiModel(description = "a plan")
public class PlanRequest  {

  private static final String MXN = "MXN";

  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("expiry_count")
  private Integer expiryCount = null;
  @SerializedName("frequency")
  private Integer frequency = null;
  @SerializedName("id")
  private String id = null;
  public enum IntervalEnum {
    week,half_month,month,year,
  }
  @SerializedName("interval")
  private IntervalEnum interval = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("trial_period_days")
  private Integer trialPeriodDays = null;

  /**
   * The amount in cents that will be charged on the interval specified.
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The amount in cents that will be charged on the interval specified.")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  /**
   * ISO 4217 for currencies, for the Mexican peso it is MXN/USD
   * 
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
   * 
   **/
  @ApiModelProperty(value = "Number of repetitions of the frequency NUMBER OF CHARGES TO BE MADE, considering the interval and frequency, this evolves over time, but is subject to the expiration count.")
  public Integer getExpiryCount() {
    return expiryCount;
  }

  public void setExpiryCount(Integer expiryCount) {
    this.expiryCount = expiryCount;
  }
  /**
   * Frequency of the charge, which together with the interval, can be every 3 weeks, every 4 months, every 2 years, every 5 fortnights
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "Frequency of the charge, which together with the interval, can be every 3 weeks, every 4 months, every 2 years, every 5 fortnights")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }
  /**
   * internal reference id
   * 
   **/
  @ApiModelProperty(value = "internal reference id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  /**
   * The interval of time between each charge.
   * 
   **/
  @ApiModelProperty(required = true, value = "The interval of time between each charge.")
  public IntervalEnum getInterval() {
    return interval;
  }

  public void setInterval(IntervalEnum interval) {
    this.interval = interval;
  }
  /**
   * The name of the plan.
   * 
   **/
  @ApiModelProperty(required = true, value = "The name of the plan.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  /**
   * The number of days the customer will have a free trial.
   * 
   **/
  @ApiModelProperty(value = "The number of days the customer will have a free trial.")
  public Integer getTrialPeriodDays() {
    return trialPeriodDays;
  }

  public void setTrialPeriodDays(Integer trialPeriodDays) {
    this.trialPeriodDays = trialPeriodDays;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanRequest planRequest = (PlanRequest) o;
    return (this.amount == null ? planRequest.amount == null : this.amount.equals(planRequest.amount)) &&
        (this.currency == null ? planRequest.currency == null : this.currency.equals(planRequest.currency)) &&
        (this.expiryCount == null ? planRequest.expiryCount == null : this.expiryCount.equals(planRequest.expiryCount)) &&
        (this.frequency == null ? planRequest.frequency == null : this.frequency.equals(planRequest.frequency)) &&
        (this.id == null ? planRequest.id == null : this.id.equals(planRequest.id)) &&
        (this.interval == null ? planRequest.interval == null : this.interval.equals(planRequest.interval)) &&
        (this.name == null ? planRequest.name == null : this.name.equals(planRequest.name)) &&
        (this.trialPeriodDays == null ? planRequest.trialPeriodDays == null : this.trialPeriodDays.equals(planRequest.trialPeriodDays));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0 : this.amount.hashCode());
    result = 31 * result + (this.currency == null ? 0 : this.currency.hashCode());
    result = 31 * result + (this.expiryCount == null ? 0 : this.expiryCount.hashCode());
    result = 31 * result + (this.frequency == null ? 0 : this.frequency.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this.interval == null ? 0 : this.interval.hashCode());
    result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
    result = 31 * result + (this.trialPeriodDays == null ? 0 : this.trialPeriodDays.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanRequest {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
sb.append("  currency: ").append(currency).append("\n");
sb.append("  expiryCount: ").append(expiryCount).append("\n");
sb.append("  frequency: ").append(frequency).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  interval: ").append(interval).append("\n");
sb.append("  name: ").append(name).append("\n");
sb.append("  trialPeriodDays: ").append(trialPeriodDays).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
