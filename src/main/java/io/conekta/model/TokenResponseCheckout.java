package io.conekta.model;

import io.conekta.model.OasAnyTypeNotMapped;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

@ApiModel(description = "")
public class TokenResponseCheckout  {

  private static final String MXN = "MXN";

  @SerializedName("allowed_payment_methods")
  private List<String> allowedPaymentMethods = null;
  @SerializedName("can_not_expire")
  private Boolean canNotExpire = null;
  @SerializedName("emails_sent")
  private Integer emailsSent = null;
  @SerializedName("exclude_card_networks")
  private List<String> excludeCardNetworks = null;
  @SerializedName("expires_at")
  private Long expiresAt = null;
  @SerializedName("failure_url")
  private String failureUrl = null;
  @SerializedName("force_3ds_flow")
  private Boolean force3dsFlow = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("metadata")
  private Map<String, OasAnyTypeNotMapped> metadata = null;
  @SerializedName("monthly_installments_enabled")
  private Boolean monthlyInstallmentsEnabled = null;
  @SerializedName("monthly_installments_options")
  private List<Integer> monthlyInstallmentsOptions = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("needs_shipping_contact")
  private Boolean needsShippingContact = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("on_demand_enabled")
  private Boolean onDemandEnabled = null;
  @SerializedName("paid_payments_count")
  private Integer paidPaymentsCount = null;
  @SerializedName("recurrent")
  private Boolean recurrent = null;
  @SerializedName("sms_sent")
  private Integer smsSent = null;
  @SerializedName("starts_at")
  private Long startsAt = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("success_url")
  private String successUrl = null;
  @SerializedName("type")
  private String type = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public List<String> getAllowedPaymentMethods() {
    return allowedPaymentMethods;
  }

  public void setAllowedPaymentMethods(List<String> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
  }
  /**
   * Indicates if the checkout can not expire.
   * 
   **/
  @ApiModelProperty(value = "Indicates if the checkout can not expire.")
  public Boolean getCanNotExpire() {
    return canNotExpire;
  }

  public void setCanNotExpire(Boolean canNotExpire) {
    this.canNotExpire = canNotExpire;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getEmailsSent() {
    return emailsSent;
  }

  public void setEmailsSent(Integer emailsSent) {
    this.emailsSent = emailsSent;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public List<String> getExcludeCardNetworks() {
    return excludeCardNetworks;
  }

  public void setExcludeCardNetworks(List<String> excludeCardNetworks) {
    this.excludeCardNetworks = excludeCardNetworks;
  }
  /**
   * Date and time when the checkout expires.
   * 
   **/
  @ApiModelProperty(value = "Date and time when the checkout expires.")
  public Long getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }
  /**
   * URL to redirect the customer to if the payment process fails.
   * 
   **/
  @ApiModelProperty(value = "URL to redirect the customer to if the payment process fails.")
  public String getFailureUrl() {
    return failureUrl;
  }

  public void setFailureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
  }
  /**
   * Indicates if the checkout forces the 3DS flow.
   * 
   **/
  @ApiModelProperty(value = "Indicates if the checkout forces the 3DS flow.")
  public Boolean getForce3dsFlow() {
    return force3dsFlow;
  }

  public void setForce3dsFlow(Boolean force3dsFlow) {
    this.force3dsFlow = force3dsFlow;
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
  public Map<String, OasAnyTypeNotMapped> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, OasAnyTypeNotMapped> metadata) {
    this.metadata = metadata;
  }
  /**
   * Indicates if the checkout allows monthly installments.
   * 
   **/
  @ApiModelProperty(value = "Indicates if the checkout allows monthly installments.")
  public Boolean getMonthlyInstallmentsEnabled() {
    return monthlyInstallmentsEnabled;
  }

  public void setMonthlyInstallmentsEnabled(Boolean monthlyInstallmentsEnabled) {
    this.monthlyInstallmentsEnabled = monthlyInstallmentsEnabled;
  }
  /**
   * List of monthly installments options.
   * 
   **/
  @ApiModelProperty(value = "List of monthly installments options.")
  public List<Integer> getMonthlyInstallmentsOptions() {
    return monthlyInstallmentsOptions;
  }

  public void setMonthlyInstallmentsOptions(List<Integer> monthlyInstallmentsOptions) {
    this.monthlyInstallmentsOptions = monthlyInstallmentsOptions;
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
  public Boolean getNeedsShippingContact() {
    return needsShippingContact;
  }

  public void setNeedsShippingContact(Boolean needsShippingContact) {
    this.needsShippingContact = needsShippingContact;
  }
  /**
   * Indicates the type of object, in this case checkout.
   * 
   **/
  @ApiModelProperty(value = "Indicates the type of object, in this case checkout.")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }
  /**
   * Indicates if the checkout allows on demand payments.
   * 
   **/
  @ApiModelProperty(value = "Indicates if the checkout allows on demand payments.")
  public Boolean getOnDemandEnabled() {
    return onDemandEnabled;
  }

  public void setOnDemandEnabled(Boolean onDemandEnabled) {
    this.onDemandEnabled = onDemandEnabled;
  }
  /**
   * Number of payments that have been paid.
   * 
   **/
  @ApiModelProperty(value = "Number of payments that have been paid.")
  public Integer getPaidPaymentsCount() {
    return paidPaymentsCount;
  }

  public void setPaidPaymentsCount(Integer paidPaymentsCount) {
    this.paidPaymentsCount = paidPaymentsCount;
  }
  /**
   * Indicates if the checkout is recurrent.
   * 
   **/
  @ApiModelProperty(value = "Indicates if the checkout is recurrent.")
  public Boolean getRecurrent() {
    return recurrent;
  }

  public void setRecurrent(Boolean recurrent) {
    this.recurrent = recurrent;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getSmsSent() {
    return smsSent;
  }

  public void setSmsSent(Integer smsSent) {
    this.smsSent = smsSent;
  }
  /**
   * Date and time when the checkout starts.
   * 
   **/
  @ApiModelProperty(value = "Date and time when the checkout starts.")
  public Long getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(Long startsAt) {
    this.startsAt = startsAt;
  }
  /**
   * Status of the checkout.
   * 
   **/
  @ApiModelProperty(value = "Status of the checkout.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
  /**
   * URL to redirect the customer to after the payment process is completed.
   * 
   **/
  @ApiModelProperty(value = "URL to redirect the customer to after the payment process is completed.")
  public String getSuccessUrl() {
    return successUrl;
  }

  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }
  /**
   * Type of checkout.
   * 
   **/
  @ApiModelProperty(value = "Type of checkout.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenResponseCheckout tokenResponseCheckout = (TokenResponseCheckout) o;
    return (this.allowedPaymentMethods == null ? tokenResponseCheckout.allowedPaymentMethods == null : this.allowedPaymentMethods.equals(tokenResponseCheckout.allowedPaymentMethods)) &&
        (this.canNotExpire == null ? tokenResponseCheckout.canNotExpire == null : this.canNotExpire.equals(tokenResponseCheckout.canNotExpire)) &&
        (this.emailsSent == null ? tokenResponseCheckout.emailsSent == null : this.emailsSent.equals(tokenResponseCheckout.emailsSent)) &&
        (this.excludeCardNetworks == null ? tokenResponseCheckout.excludeCardNetworks == null : this.excludeCardNetworks.equals(tokenResponseCheckout.excludeCardNetworks)) &&
        (this.expiresAt == null ? tokenResponseCheckout.expiresAt == null : this.expiresAt.equals(tokenResponseCheckout.expiresAt)) &&
        (this.failureUrl == null ? tokenResponseCheckout.failureUrl == null : this.failureUrl.equals(tokenResponseCheckout.failureUrl)) &&
        (this.force3dsFlow == null ? tokenResponseCheckout.force3dsFlow == null : this.force3dsFlow.equals(tokenResponseCheckout.force3dsFlow)) &&
        (this.id == null ? tokenResponseCheckout.id == null : this.id.equals(tokenResponseCheckout.id)) &&
        (this.livemode == null ? tokenResponseCheckout.livemode == null : this.livemode.equals(tokenResponseCheckout.livemode)) &&
        (this.metadata == null ? tokenResponseCheckout.metadata == null : this.metadata.equals(tokenResponseCheckout.metadata)) &&
        (this.monthlyInstallmentsEnabled == null ? tokenResponseCheckout.monthlyInstallmentsEnabled == null : this.monthlyInstallmentsEnabled.equals(tokenResponseCheckout.monthlyInstallmentsEnabled)) &&
        (this.monthlyInstallmentsOptions == null ? tokenResponseCheckout.monthlyInstallmentsOptions == null : this.monthlyInstallmentsOptions.equals(tokenResponseCheckout.monthlyInstallmentsOptions)) &&
        (this.name == null ? tokenResponseCheckout.name == null : this.name.equals(tokenResponseCheckout.name)) &&
        (this.needsShippingContact == null ? tokenResponseCheckout.needsShippingContact == null : this.needsShippingContact.equals(tokenResponseCheckout.needsShippingContact)) &&
        (this._object == null ? tokenResponseCheckout._object == null : this._object.equals(tokenResponseCheckout._object)) &&
        (this.onDemandEnabled == null ? tokenResponseCheckout.onDemandEnabled == null : this.onDemandEnabled.equals(tokenResponseCheckout.onDemandEnabled)) &&
        (this.paidPaymentsCount == null ? tokenResponseCheckout.paidPaymentsCount == null : this.paidPaymentsCount.equals(tokenResponseCheckout.paidPaymentsCount)) &&
        (this.recurrent == null ? tokenResponseCheckout.recurrent == null : this.recurrent.equals(tokenResponseCheckout.recurrent)) &&
        (this.smsSent == null ? tokenResponseCheckout.smsSent == null : this.smsSent.equals(tokenResponseCheckout.smsSent)) &&
        (this.startsAt == null ? tokenResponseCheckout.startsAt == null : this.startsAt.equals(tokenResponseCheckout.startsAt)) &&
        (this.status == null ? tokenResponseCheckout.status == null : this.status.equals(tokenResponseCheckout.status)) &&
        (this.successUrl == null ? tokenResponseCheckout.successUrl == null : this.successUrl.equals(tokenResponseCheckout.successUrl)) &&
        (this.type == null ? tokenResponseCheckout.type == null : this.type.equals(tokenResponseCheckout.type));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.allowedPaymentMethods == null ? 0 : this.allowedPaymentMethods.hashCode());
    result = 31 * result + (this.canNotExpire == null ? 0 : this.canNotExpire.hashCode());
    result = 31 * result + (this.emailsSent == null ? 0 : this.emailsSent.hashCode());
    result = 31 * result + (this.excludeCardNetworks == null ? 0 : this.excludeCardNetworks.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0 : this.expiresAt.hashCode());
    result = 31 * result + (this.failureUrl == null ? 0 : this.failureUrl.hashCode());
    result = 31 * result + (this.force3dsFlow == null ? 0 : this.force3dsFlow.hashCode());
    result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0 : this.livemode.hashCode());
    result = 31 * result + (this.metadata == null ? 0 : this.metadata.hashCode());
    result = 31 * result + (this.monthlyInstallmentsEnabled == null ? 0 : this.monthlyInstallmentsEnabled.hashCode());
    result = 31 * result + (this.monthlyInstallmentsOptions == null ? 0 : this.monthlyInstallmentsOptions.hashCode());
    result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
    result = 31 * result + (this.needsShippingContact == null ? 0 : this.needsShippingContact.hashCode());
    result = 31 * result + (this._object == null ? 0 : this._object.hashCode());
    result = 31 * result + (this.onDemandEnabled == null ? 0 : this.onDemandEnabled.hashCode());
    result = 31 * result + (this.paidPaymentsCount == null ? 0 : this.paidPaymentsCount.hashCode());
    result = 31 * result + (this.recurrent == null ? 0 : this.recurrent.hashCode());
    result = 31 * result + (this.smsSent == null ? 0 : this.smsSent.hashCode());
    result = 31 * result + (this.startsAt == null ? 0 : this.startsAt.hashCode());
    result = 31 * result + (this.status == null ? 0 : this.status.hashCode());
    result = 31 * result + (this.successUrl == null ? 0 : this.successUrl.hashCode());
    result = 31 * result + (this.type == null ? 0 : this.type.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenResponseCheckout {\n");
    
    sb.append("  allowedPaymentMethods: ").append(allowedPaymentMethods).append("\n");
sb.append("  canNotExpire: ").append(canNotExpire).append("\n");
sb.append("  emailsSent: ").append(emailsSent).append("\n");
sb.append("  excludeCardNetworks: ").append(excludeCardNetworks).append("\n");
sb.append("  expiresAt: ").append(expiresAt).append("\n");
sb.append("  failureUrl: ").append(failureUrl).append("\n");
sb.append("  force3dsFlow: ").append(force3dsFlow).append("\n");
sb.append("  id: ").append(id).append("\n");
sb.append("  livemode: ").append(livemode).append("\n");
sb.append("  metadata: ").append(metadata).append("\n");
sb.append("  monthlyInstallmentsEnabled: ").append(monthlyInstallmentsEnabled).append("\n");
sb.append("  monthlyInstallmentsOptions: ").append(monthlyInstallmentsOptions).append("\n");
sb.append("  name: ").append(name).append("\n");
sb.append("  needsShippingContact: ").append(needsShippingContact).append("\n");
sb.append("  _object: ").append(_object).append("\n");
sb.append("  onDemandEnabled: ").append(onDemandEnabled).append("\n");
sb.append("  paidPaymentsCount: ").append(paidPaymentsCount).append("\n");
sb.append("  recurrent: ").append(recurrent).append("\n");
sb.append("  smsSent: ").append(smsSent).append("\n");
sb.append("  startsAt: ").append(startsAt).append("\n");
sb.append("  status: ").append(status).append("\n");
sb.append("  successUrl: ").append(successUrl).append("\n");
sb.append("  type: ").append(type).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
