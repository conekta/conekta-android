package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * plans model
 **/
@ApiModel(description = "plans model")
public class PlanResponse  {

  private static final String MXN = "MXN";

  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("expiry_count")
  private Integer expiryCount = null;
  @SerializedName("frequency")
  private Integer frequency = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("interval")
  private String interval = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("trial_period_days")
  private Integer trialPeriodDays = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
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
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getExpiryCount() {
    return expiryCount;
  }

  public void setExpiryCount(Integer expiryCount) {
    this.expiryCount = expiryCount;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
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
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
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
  @ApiModelProperty(value = "")
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
    PlanResponse planResponse = (PlanResponse) o;
    return (this.amount == null ? planResponse.amount == null : this.amount.equals(planResponse.amount)) &&
        (this.createdAt == null ? planResponse.createdAt == null : this.createdAt.equals(planResponse.createdAt)) &&
        (this.currency == null ? planResponse.currency == null : this.currency.equals(planResponse.currency)) &&
        (this.expiryCount == null ? planResponse.expiryCount == null : this.expiryCount.equals(planResponse.expiryCount)) &&
        (this.frequency == null ? planResponse.frequency == null : this.frequency.equals(planResponse.frequency)) &&
        (this.id == null ? planResponse.id == null : this.id.equals(planResponse.id)) &&
        (this.interval == null ? planResponse.interval == null : this.interval.equals(planResponse.interval)) &&
        (this.livemode == null ? planResponse.livemode == null : this.livemode.equals(planResponse.livemode)) &&
        (this.name == null ? planResponse.name == null : this.name.equals(planResponse.name)) &&
        (this._object == null ? planResponse._object == null : this._object.equals(planResponse._object)) &&
        (this.trialPeriodDays == null ? planResponse.trialPeriodDays == null : this.trialPeriodDays.equals(planResponse.trialPeriodDays));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0 : this.amount.hashCode());
    result = 31 * result + (this.createdAt == null ? 0 : this.createdAt.hashCode());
    result = 31 * result + (this.currency == null ? 0 : this.currency.hashCode());
    result = 31 * result + (this.expiryCount == null ? 0 : this.expiryCount.hashCode());
    result = 31 * result + (this.frequency == null ? 0 : this.frequency.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this.interval == null ? 0 : this.interval.hashCode());
    result = 31 * result + (this.livemode == null ? 0 : this.livemode.hashCode());
    result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.trialPeriodDays == null ? 0 : this.trialPeriodDays.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanResponse {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
sb.append("  createdAt: ").append(createdAt).append("\n");
sb.append("  currency: ").append(currency).append("\n");
sb.append("  expiryCount: ").append(expiryCount).append("\n");
sb.append("  frequency: ").append(frequency).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  interval: ").append(interval).append("\n");
sb.append("  livemode: ").append(livemode).append("\n");
sb.append("  name: ").append(name).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  trialPeriodDays: ").append(trialPeriodDays).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
