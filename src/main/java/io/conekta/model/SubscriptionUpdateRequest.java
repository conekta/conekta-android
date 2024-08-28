package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * You can modify the subscription to change the plan used by your customers.
 **/
@ApiModel(description = "You can modify the subscription to change the plan used by your customers.")
public class SubscriptionUpdateRequest  {
  
  @SerializedName("plan_id")
  private String planId = null;
  @SerializedName("card_id")
  private String cardId = null;
  @SerializedName("trial_end")
  private Integer trialEnd = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPlanId() {
    return planId;
  }
  public void setPlanId(String planId) {
    this.planId = planId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCardId() {
    return cardId;
  }
  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTrialEnd() {
    return trialEnd;
  }
  public void setTrialEnd(Integer trialEnd) {
    this.trialEnd = trialEnd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionUpdateRequest subscriptionUpdateRequest = (SubscriptionUpdateRequest) o;
    return (this.planId == null ? subscriptionUpdateRequest.planId == null : this.planId.equals(subscriptionUpdateRequest.planId)) &&
        (this.cardId == null ? subscriptionUpdateRequest.cardId == null : this.cardId.equals(subscriptionUpdateRequest.cardId)) &&
        (this.trialEnd == null ? subscriptionUpdateRequest.trialEnd == null : this.trialEnd.equals(subscriptionUpdateRequest.trialEnd));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.planId == null ? 0: this.planId.hashCode());
    result = 31 * result + (this.cardId == null ? 0: this.cardId.hashCode());
    result = 31 * result + (this.trialEnd == null ? 0: this.trialEnd.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionUpdateRequest {\n");
    
    sb.append("  planId: ").append(planId).append("\n");
    sb.append("  cardId: ").append(cardId).append("\n");
    sb.append("  trialEnd: ").append(trialEnd).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
