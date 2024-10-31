package io.conekta.model;

import io.conekta.model.OasAnyTypeNotMapped;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


@ApiModel(description = "")
public class OrderResponseCheckout  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("allowed_payment_methods")
  private List<String> allowedPaymentMethods = null;
  @SerializedName("can_not_expire")
  private Boolean canNotExpire = null;
  @SerializedName("emails_sent")
  private Integer emailsSent = null;
  @SerializedName("exclude_card_networks")
  private List<Object> excludeCardNetworks = null;
  @SerializedName("expires_at")
  private Long expiresAt = null;
  @SerializedName("failure_url")
  private String failureUrl = null;
  @SerializedName("force_3ds_flow")
  private Boolean force3dsFlow = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("is_redirect_on_failure")
  private Boolean isRedirectOnFailure = null;
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
  @SerializedName("redirection_time")
  private Integer redirectionTime = null;
  @SerializedName("slug")
  private String slug = null;
  @SerializedName("sms_sent")
  private Integer smsSent = null;
  @SerializedName("success_url")
  private String successUrl = null;
  @SerializedName("starts_at")
  private Integer startsAt = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("url")
  private String url = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getAllowedPaymentMethods() {
    return allowedPaymentMethods;
  }
  public void setAllowedPaymentMethods(List<String> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getCanNotExpire() {
    return canNotExpire;
  }
  public void setCanNotExpire(Boolean canNotExpire) {
    this.canNotExpire = canNotExpire;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEmailsSent() {
    return emailsSent;
  }
  public void setEmailsSent(Integer emailsSent) {
    this.emailsSent = emailsSent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Object> getExcludeCardNetworks() {
    return excludeCardNetworks;
  }
  public void setExcludeCardNetworks(List<Object> excludeCardNetworks) {
    this.excludeCardNetworks = excludeCardNetworks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFailureUrl() {
    return failureUrl;
  }
  public void setFailureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getForce3dsFlow() {
    return force3dsFlow;
  }
  public void setForce3dsFlow(Boolean force3dsFlow) {
    this.force3dsFlow = force3dsFlow;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsRedirectOnFailure() {
    return isRedirectOnFailure;
  }
  public void setIsRedirectOnFailure(Boolean isRedirectOnFailure) {
    this.isRedirectOnFailure = isRedirectOnFailure;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getLivemode() {
    return livemode;
  }
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, OasAnyTypeNotMapped> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, OasAnyTypeNotMapped> metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getMonthlyInstallmentsEnabled() {
    return monthlyInstallmentsEnabled;
  }
  public void setMonthlyInstallmentsEnabled(Boolean monthlyInstallmentsEnabled) {
    this.monthlyInstallmentsEnabled = monthlyInstallmentsEnabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getMonthlyInstallmentsOptions() {
    return monthlyInstallmentsOptions;
  }
  public void setMonthlyInstallmentsOptions(List<Integer> monthlyInstallmentsOptions) {
    this.monthlyInstallmentsOptions = monthlyInstallmentsOptions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getNeedsShippingContact() {
    return needsShippingContact;
  }
  public void setNeedsShippingContact(Boolean needsShippingContact) {
    this.needsShippingContact = needsShippingContact;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getOnDemandEnabled() {
    return onDemandEnabled;
  }
  public void setOnDemandEnabled(Boolean onDemandEnabled) {
    this.onDemandEnabled = onDemandEnabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPaidPaymentsCount() {
    return paidPaymentsCount;
  }
  public void setPaidPaymentsCount(Integer paidPaymentsCount) {
    this.paidPaymentsCount = paidPaymentsCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getRecurrent() {
    return recurrent;
  }
  public void setRecurrent(Boolean recurrent) {
    this.recurrent = recurrent;
  }

  /**
   * number of seconds to wait before redirecting to the success_url
   **/
  @ApiModelProperty(value = "number of seconds to wait before redirecting to the success_url")
  public Integer getRedirectionTime() {
    return redirectionTime;
  }
  public void setRedirectionTime(Integer redirectionTime) {
    this.redirectionTime = redirectionTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSmsSent() {
    return smsSent;
  }
  public void setSmsSent(Integer smsSent) {
    this.smsSent = smsSent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSuccessUrl() {
    return successUrl;
  }
  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStartsAt() {
    return startsAt;
  }
  public void setStartsAt(Integer startsAt) {
    this.startsAt = startsAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResponseCheckout orderResponseCheckout = (OrderResponseCheckout) o;
    return (this.allowedPaymentMethods == null ? orderResponseCheckout.allowedPaymentMethods == null : this.allowedPaymentMethods.equals(orderResponseCheckout.allowedPaymentMethods)) &&
        (this.canNotExpire == null ? orderResponseCheckout.canNotExpire == null : this.canNotExpire.equals(orderResponseCheckout.canNotExpire)) &&
        (this.emailsSent == null ? orderResponseCheckout.emailsSent == null : this.emailsSent.equals(orderResponseCheckout.emailsSent)) &&
        (this.excludeCardNetworks == null ? orderResponseCheckout.excludeCardNetworks == null : this.excludeCardNetworks.equals(orderResponseCheckout.excludeCardNetworks)) &&
        (this.expiresAt == null ? orderResponseCheckout.expiresAt == null : this.expiresAt.equals(orderResponseCheckout.expiresAt)) &&
        (this.failureUrl == null ? orderResponseCheckout.failureUrl == null : this.failureUrl.equals(orderResponseCheckout.failureUrl)) &&
        (this.force3dsFlow == null ? orderResponseCheckout.force3dsFlow == null : this.force3dsFlow.equals(orderResponseCheckout.force3dsFlow)) &&
        (this.id == null ? orderResponseCheckout.id == null : this.id.equals(orderResponseCheckout.id)) &&
        (this.isRedirectOnFailure == null ? orderResponseCheckout.isRedirectOnFailure == null : this.isRedirectOnFailure.equals(orderResponseCheckout.isRedirectOnFailure)) &&
        (this.livemode == null ? orderResponseCheckout.livemode == null : this.livemode.equals(orderResponseCheckout.livemode)) &&
        (this.metadata == null ? orderResponseCheckout.metadata == null : this.metadata.equals(orderResponseCheckout.metadata)) &&
        (this.monthlyInstallmentsEnabled == null ? orderResponseCheckout.monthlyInstallmentsEnabled == null : this.monthlyInstallmentsEnabled.equals(orderResponseCheckout.monthlyInstallmentsEnabled)) &&
        (this.monthlyInstallmentsOptions == null ? orderResponseCheckout.monthlyInstallmentsOptions == null : this.monthlyInstallmentsOptions.equals(orderResponseCheckout.monthlyInstallmentsOptions)) &&
        (this.name == null ? orderResponseCheckout.name == null : this.name.equals(orderResponseCheckout.name)) &&
        (this.needsShippingContact == null ? orderResponseCheckout.needsShippingContact == null : this.needsShippingContact.equals(orderResponseCheckout.needsShippingContact)) &&
        (this._object == null ? orderResponseCheckout._object == null : this._object.equals(orderResponseCheckout._object)) &&
        (this.onDemandEnabled == null ? orderResponseCheckout.onDemandEnabled == null : this.onDemandEnabled.equals(orderResponseCheckout.onDemandEnabled)) &&
        (this.paidPaymentsCount == null ? orderResponseCheckout.paidPaymentsCount == null : this.paidPaymentsCount.equals(orderResponseCheckout.paidPaymentsCount)) &&
        (this.recurrent == null ? orderResponseCheckout.recurrent == null : this.recurrent.equals(orderResponseCheckout.recurrent)) &&
        (this.redirectionTime == null ? orderResponseCheckout.redirectionTime == null : this.redirectionTime.equals(orderResponseCheckout.redirectionTime)) &&
        (this.slug == null ? orderResponseCheckout.slug == null : this.slug.equals(orderResponseCheckout.slug)) &&
        (this.smsSent == null ? orderResponseCheckout.smsSent == null : this.smsSent.equals(orderResponseCheckout.smsSent)) &&
        (this.successUrl == null ? orderResponseCheckout.successUrl == null : this.successUrl.equals(orderResponseCheckout.successUrl)) &&
        (this.startsAt == null ? orderResponseCheckout.startsAt == null : this.startsAt.equals(orderResponseCheckout.startsAt)) &&
        (this.status == null ? orderResponseCheckout.status == null : this.status.equals(orderResponseCheckout.status)) &&
        (this.type == null ? orderResponseCheckout.type == null : this.type.equals(orderResponseCheckout.type)) &&
        (this.url == null ? orderResponseCheckout.url == null : this.url.equals(orderResponseCheckout.url));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.allowedPaymentMethods == null ? 0: this.allowedPaymentMethods.hashCode());
    result = 31 * result + (this.canNotExpire == null ? 0: this.canNotExpire.hashCode());
    result = 31 * result + (this.emailsSent == null ? 0: this.emailsSent.hashCode());
    result = 31 * result + (this.excludeCardNetworks == null ? 0: this.excludeCardNetworks.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    result = 31 * result + (this.failureUrl == null ? 0: this.failureUrl.hashCode());
    result = 31 * result + (this.force3dsFlow == null ? 0: this.force3dsFlow.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.isRedirectOnFailure == null ? 0: this.isRedirectOnFailure.hashCode());
    result = 31 * result + (this.livemode == null ? 0: this.livemode.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this.monthlyInstallmentsEnabled == null ? 0: this.monthlyInstallmentsEnabled.hashCode());
    result = 31 * result + (this.monthlyInstallmentsOptions == null ? 0: this.monthlyInstallmentsOptions.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.needsShippingContact == null ? 0: this.needsShippingContact.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.onDemandEnabled == null ? 0: this.onDemandEnabled.hashCode());
    result = 31 * result + (this.paidPaymentsCount == null ? 0: this.paidPaymentsCount.hashCode());
    result = 31 * result + (this.recurrent == null ? 0: this.recurrent.hashCode());
    result = 31 * result + (this.redirectionTime == null ? 0: this.redirectionTime.hashCode());
    result = 31 * result + (this.slug == null ? 0: this.slug.hashCode());
    result = 31 * result + (this.smsSent == null ? 0: this.smsSent.hashCode());
    result = 31 * result + (this.successUrl == null ? 0: this.successUrl.hashCode());
    result = 31 * result + (this.startsAt == null ? 0: this.startsAt.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponseCheckout {\n");
    
    sb.append("  allowedPaymentMethods: ").append(allowedPaymentMethods).append("\n");
    sb.append("  canNotExpire: ").append(canNotExpire).append("\n");
    sb.append("  emailsSent: ").append(emailsSent).append("\n");
    sb.append("  excludeCardNetworks: ").append(excludeCardNetworks).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("  failureUrl: ").append(failureUrl).append("\n");
    sb.append("  force3dsFlow: ").append(force3dsFlow).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  isRedirectOnFailure: ").append(isRedirectOnFailure).append("\n");
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
    sb.append("  redirectionTime: ").append(redirectionTime).append("\n");
    sb.append("  slug: ").append(slug).append("\n");
    sb.append("  smsSent: ").append(smsSent).append("\n");
    sb.append("  successUrl: ").append(successUrl).append("\n");
    sb.append("  startsAt: ").append(startsAt).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
