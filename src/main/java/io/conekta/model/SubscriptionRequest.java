package io.conekta.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


/**
 * It is a parameter that allows to identify in the response, the detailed content of the plans to which the client has subscribed
 **/
@ApiModel(description = "It is a parameter that allows to identify in the response, the detailed content of the plans to which the client has subscribed")
public class SubscriptionRequest  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("plan_id")
  private String planId = null;
  @SerializedName("card_id")
  private String cardId = null;
  @SerializedName("trial_end")
  private Integer trialEnd = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    SubscriptionRequest subscriptionRequest = (SubscriptionRequest) o;
    return (this.planId == null ? subscriptionRequest.planId == null : this.planId.equals(subscriptionRequest.planId)) &&
        (this.cardId == null ? subscriptionRequest.cardId == null : this.cardId.equals(subscriptionRequest.cardId)) &&
        (this.trialEnd == null ? subscriptionRequest.trialEnd == null : this.trialEnd.equals(subscriptionRequest.trialEnd));
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
    sb.append("class SubscriptionRequest {\n");
    
    sb.append("  planId: ").append(planId).append("\n");
    sb.append("  cardId: ").append(cardId).append("\n");
    sb.append("  trialEnd: ").append(trialEnd).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
