package io.conekta.model;

import io.conekta.model.OasAnyTypeNotMapped;
import java.net.URI;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * checkout response
 **/
@ApiModel(description = "checkout response")
public class CheckoutResponse  {

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
  @SerializedName("paid_payments_count")
  private Integer paidPaymentsCount = null;
  @SerializedName("payments_limit_count")
  private Integer paymentsLimitCount = null;
  @SerializedName("recurrent")
  private Boolean recurrent = null;
  @SerializedName("slug")
  private String slug = null;
  @SerializedName("sms_sent")
  private Integer smsSent = null;
  @SerializedName("starts_at")
  private Integer startsAt = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("success_url")
  private String successUrl = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("url")
  private URI url = null;

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
   * 
   * 
   **/
  @ApiModelProperty(value = "")
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
  public List<Object> getExcludeCardNetworks() {
    return excludeCardNetworks;
  }

  public void setExcludeCardNetworks(List<Object> excludeCardNetworks) {
    this.excludeCardNetworks = excludeCardNetworks;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Long getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getFailureUrl() {
    return failureUrl;
  }

  public void setFailureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Boolean getMonthlyInstallmentsEnabled() {
    return monthlyInstallmentsEnabled;
  }

  public void setMonthlyInstallmentsEnabled(Boolean monthlyInstallmentsEnabled) {
    this.monthlyInstallmentsEnabled = monthlyInstallmentsEnabled;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getMonthlyInstallmentsOptions() {
    return monthlyInstallmentsOptions;
  }

  public void setMonthlyInstallmentsOptions(List<Integer> monthlyInstallmentsOptions) {
    this.monthlyInstallmentsOptions = monthlyInstallmentsOptions;
  }
  /**
   * Reason for charge
   * 
   **/
  @ApiModelProperty(required = true, value = "Reason for charge")
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
   * 
   * 
   **/
  @ApiModelProperty(required = true, value = "")
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
  public Integer getPaidPaymentsCount() {
    return paidPaymentsCount;
  }

  public void setPaidPaymentsCount(Integer paidPaymentsCount) {
    this.paidPaymentsCount = paidPaymentsCount;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getPaymentsLimitCount() {
    return paymentsLimitCount;
  }

  public void setPaymentsLimitCount(Integer paymentsLimitCount) {
    this.paymentsLimitCount = paymentsLimitCount;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
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
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
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
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(Integer startsAt) {
    this.startsAt = startsAt;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getSuccessUrl() {
    return successUrl;
  }

  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
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
    CheckoutResponse checkoutResponse = (CheckoutResponse) o;
    return (this.allowedPaymentMethods == null ? checkoutResponse.allowedPaymentMethods == null : this.allowedPaymentMethods.equals(checkoutResponse.allowedPaymentMethods)) &&
        (this.canNotExpire == null ? checkoutResponse.canNotExpire == null : this.canNotExpire.equals(checkoutResponse.canNotExpire)) &&
        (this.emailsSent == null ? checkoutResponse.emailsSent == null : this.emailsSent.equals(checkoutResponse.emailsSent)) &&
        (this.excludeCardNetworks == null ? checkoutResponse.excludeCardNetworks == null : this.excludeCardNetworks.equals(checkoutResponse.excludeCardNetworks)) &&
        (this.expiresAt == null ? checkoutResponse.expiresAt == null : this.expiresAt.equals(checkoutResponse.expiresAt)) &&
        (this.failureUrl == null ? checkoutResponse.failureUrl == null : this.failureUrl.equals(checkoutResponse.failureUrl)) &&
        (this.force3dsFlow == null ? checkoutResponse.force3dsFlow == null : this.force3dsFlow.equals(checkoutResponse.force3dsFlow)) &&
        (this.id == null ? checkoutResponse.id == null : this.id.equals(checkoutResponse.id)) &&
        (this.livemode == null ? checkoutResponse.livemode == null : this.livemode.equals(checkoutResponse.livemode)) &&
        (this.metadata == null ? checkoutResponse.metadata == null : this.metadata.equals(checkoutResponse.metadata)) &&
        (this.monthlyInstallmentsEnabled == null ? checkoutResponse.monthlyInstallmentsEnabled == null : this.monthlyInstallmentsEnabled.equals(checkoutResponse.monthlyInstallmentsEnabled)) &&
        (this.monthlyInstallmentsOptions == null ? checkoutResponse.monthlyInstallmentsOptions == null : this.monthlyInstallmentsOptions.equals(checkoutResponse.monthlyInstallmentsOptions)) &&
        (this.name == null ? checkoutResponse.name == null : this.name.equals(checkoutResponse.name)) &&
        (this.needsShippingContact == null ? checkoutResponse.needsShippingContact == null : this.needsShippingContact.equals(checkoutResponse.needsShippingContact)) &&
        (this._object == null ? checkoutResponse._object == null : this._object.equals(checkoutResponse._object)) &&
        (this.paidPaymentsCount == null ? checkoutResponse.paidPaymentsCount == null : this.paidPaymentsCount.equals(checkoutResponse.paidPaymentsCount)) &&
        (this.paymentsLimitCount == null ? checkoutResponse.paymentsLimitCount == null : this.paymentsLimitCount.equals(checkoutResponse.paymentsLimitCount)) &&
        (this.recurrent == null ? checkoutResponse.recurrent == null : this.recurrent.equals(checkoutResponse.recurrent)) &&
        (this.slug == null ? checkoutResponse.slug == null : this.slug.equals(checkoutResponse.slug)) &&
        (this.smsSent == null ? checkoutResponse.smsSent == null : this.smsSent.equals(checkoutResponse.smsSent)) &&
        (this.startsAt == null ? checkoutResponse.startsAt == null : this.startsAt.equals(checkoutResponse.startsAt)) &&
        (this.status == null ? checkoutResponse.status == null : this.status.equals(checkoutResponse.status)) &&
        (this.successUrl == null ? checkoutResponse.successUrl == null : this.successUrl.equals(checkoutResponse.successUrl)) &&
        (this.type == null ? checkoutResponse.type == null : this.type.equals(checkoutResponse.type)) &&
        (this.url == null ? checkoutResponse.url == null : this.url.equals(checkoutResponse.url));
    
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
    result = 31 * result + (this.paidPaymentsCount == null ? 0 : this.paidPaymentsCount.hashCode());
    result = 31 * result + (this.paymentsLimitCount == null ? 0 : this.paymentsLimitCount.hashCode());
    result = 31 * result + (this.recurrent == null ? 0 : this.recurrent.hashCode());
    result = 31 * result + (this.slug == null ? 0 : this.slug.hashCode());
    result = 31 * result + (this.smsSent == null ? 0 : this.smsSent.hashCode());
    result = 31 * result + (this.startsAt == null ? 0 : this.startsAt.hashCode());
    result = 31 * result + (this.status == null ? 0 : this.status.hashCode());
    result = 31 * result + (this.successUrl == null ? 0 : this.successUrl.hashCode());
    result = 31 * result + (this.type == null ? 0 : this.type.hashCode());
    result = 31 * result + (this.url == null ? 0 : this.url.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutResponse {\n");
    
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
sb.append("  paidPaymentsCount: ").append(paidPaymentsCount).append("\n");
sb.append("  paymentsLimitCount: ").append(paymentsLimitCount).append("\n");
sb.append("  recurrent: ").append(recurrent).append("\n");
sb.append("  slug: ").append(slug).append("\n");
sb.append("  smsSent: ").append(smsSent).append("\n");
sb.append("  startsAt: ").append(startsAt).append("\n");
sb.append("  status: ").append(status).append("\n");
sb.append("  successUrl: ").append(successUrl).append("\n");
sb.append("  type: ").append(type).append("\n");
sb.append("  url: ").append(url).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
