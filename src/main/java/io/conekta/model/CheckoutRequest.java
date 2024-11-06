package io.conekta.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * [Checkout](https://developers.conekta.com/v2.1.0/reference/payment-link) details 
 **/
@ApiModel(description = "[Checkout](https://developers.conekta.com/v2.1.0/reference/payment-link) details ")
public class CheckoutRequest  {

  private static final String MXN = "MXN";

  @SerializedName("allowed_payment_methods")
  private List<String> allowedPaymentMethods = null;
  @SerializedName("expires_at")
  private Long expiresAt = null;
  @SerializedName("failure_url")
  private String failureUrl = null;
  @SerializedName("monthly_installments_enabled")
  private Boolean monthlyInstallmentsEnabled = null;
  @SerializedName("monthly_installments_options")
  private List<Integer> monthlyInstallmentsOptions = null;
  @SerializedName("max_failed_retries")
  private Integer maxFailedRetries = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("on_demand_enabled")
  private Boolean onDemandEnabled = null;
  @SerializedName("redirection_time")
  private Integer redirectionTime = null;
  @SerializedName("success_url")
  private String successUrl = null;
  @SerializedName("type")
  private String type = null;

  /**
   * Are the payment methods available for this link
   * 
   **/
  @ApiModelProperty(required = true, value = "Are the payment methods available for this link")
  public List<String> getAllowedPaymentMethods() {
    return allowedPaymentMethods;
  }

  public void setAllowedPaymentMethods(List<String> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
  }
  /**
   * Unix timestamp of checkout expiration
   * 
   **/
  @ApiModelProperty(value = "Unix timestamp of checkout expiration")
  public Long getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }
  /**
   * Redirection url back to the site in case of failed payment, applies only to HostedPayment.
   * 
   **/
  @ApiModelProperty(value = "Redirection url back to the site in case of failed payment, applies only to HostedPayment.")
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
   * Number of retries allowed before the checkout is marked as failed
   * 
   **/
  @ApiModelProperty(value = "Number of retries allowed before the checkout is marked as failed")
  public Integer getMaxFailedRetries() {
    return maxFailedRetries;
  }

  public void setMaxFailedRetries(Integer maxFailedRetries) {
    this.maxFailedRetries = maxFailedRetries;
  }
  /**
   * Reason for payment
   * 
   **/
  @ApiModelProperty(value = "Reason for payment")
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
  public Boolean getOnDemandEnabled() {
    return onDemandEnabled;
  }

  public void setOnDemandEnabled(Boolean onDemandEnabled) {
    this.onDemandEnabled = onDemandEnabled;
  }
  /**
   * number of seconds to wait before redirecting to the success_url
   * 
   **/
  @ApiModelProperty(value = "number of seconds to wait before redirecting to the success_url")
  public Integer getRedirectionTime() {
    return redirectionTime;
  }

  public void setRedirectionTime(Integer redirectionTime) {
    this.redirectionTime = redirectionTime;
  }
  /**
   * Redirection url back to the site in case of successful payment, applies only to HostedPayment
   * 
   **/
  @ApiModelProperty(value = "Redirection url back to the site in case of successful payment, applies only to HostedPayment")
  public String getSuccessUrl() {
    return successUrl;
  }

  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }
  /**
   * This field represents the type of checkout
   * 
   **/
  @ApiModelProperty(value = "This field represents the type of checkout")
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
    CheckoutRequest checkoutRequest = (CheckoutRequest) o;
    return (this.allowedPaymentMethods == null ? checkoutRequest.allowedPaymentMethods == null : this.allowedPaymentMethods.equals(checkoutRequest.allowedPaymentMethods)) &&
        (this.expiresAt == null ? checkoutRequest.expiresAt == null : this.expiresAt.equals(checkoutRequest.expiresAt)) &&
        (this.failureUrl == null ? checkoutRequest.failureUrl == null : this.failureUrl.equals(checkoutRequest.failureUrl)) &&
        (this.monthlyInstallmentsEnabled == null ? checkoutRequest.monthlyInstallmentsEnabled == null : this.monthlyInstallmentsEnabled.equals(checkoutRequest.monthlyInstallmentsEnabled)) &&
        (this.monthlyInstallmentsOptions == null ? checkoutRequest.monthlyInstallmentsOptions == null : this.monthlyInstallmentsOptions.equals(checkoutRequest.monthlyInstallmentsOptions)) &&
        (this.maxFailedRetries == null ? checkoutRequest.maxFailedRetries == null : this.maxFailedRetries.equals(checkoutRequest.maxFailedRetries)) &&
        (this.name == null ? checkoutRequest.name == null : this.name.equals(checkoutRequest.name)) &&
        (this.onDemandEnabled == null ? checkoutRequest.onDemandEnabled == null : this.onDemandEnabled.equals(checkoutRequest.onDemandEnabled)) &&
        (this.redirectionTime == null ? checkoutRequest.redirectionTime == null : this.redirectionTime.equals(checkoutRequest.redirectionTime)) &&
        (this.successUrl == null ? checkoutRequest.successUrl == null : this.successUrl.equals(checkoutRequest.successUrl)) &&
        (this.type == null ? checkoutRequest.type == null : this.type.equals(checkoutRequest.type));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.allowedPaymentMethods == null ? 0 : this.allowedPaymentMethods.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0 : this.expiresAt.hashCode());
    result = 31 * result + (this.failureUrl == null ? 0 : this.failureUrl.hashCode());
    result = 31 * result + (this.monthlyInstallmentsEnabled == null ? 0 : this.monthlyInstallmentsEnabled.hashCode());
    result = 31 * result + (this.monthlyInstallmentsOptions == null ? 0 : this.monthlyInstallmentsOptions.hashCode());
    result = 31 * result + (this.maxFailedRetries == null ? 0 : this.maxFailedRetries.hashCode());
    result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
    result = 31 * result + (this.onDemandEnabled == null ? 0 : this.onDemandEnabled.hashCode());
    result = 31 * result + (this.redirectionTime == null ? 0 : this.redirectionTime.hashCode());
    result = 31 * result + (this.successUrl == null ? 0 : this.successUrl.hashCode());
    result = 31 * result + (this.type == null ? 0 : this.type.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutRequest {\n");
    
    sb.append("  allowedPaymentMethods: ").append(allowedPaymentMethods).append("\n");
sb.append("  expiresAt: ").append(expiresAt).append("\n");
sb.append("  failureUrl: ").append(failureUrl).append("\n");
sb.append("  monthlyInstallmentsEnabled: ").append(monthlyInstallmentsEnabled).append("\n");
sb.append("  monthlyInstallmentsOptions: ").append(monthlyInstallmentsOptions).append("\n");
sb.append("  maxFailedRetries: ").append(maxFailedRetries).append("\n");
sb.append("  name: ").append(name).append("\n");
sb.append("  onDemandEnabled: ").append(onDemandEnabled).append("\n");
sb.append("  redirectionTime: ").append(redirectionTime).append("\n");
sb.append("  successUrl: ").append(successUrl).append("\n");
sb.append("  type: ").append(type).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
