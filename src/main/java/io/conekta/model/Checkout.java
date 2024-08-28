package io.conekta.model;

import io.conekta.model.CheckoutOrderTemplate;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * It is a sub-resource of the Order model that can be stipulated in order to configure its corresponding checkout
 **/
@ApiModel(description = "It is a sub-resource of the Order model that can be stipulated in order to configure its corresponding checkout")
public class Checkout  {
  
  @SerializedName("allowed_payment_methods")
  private List<String> allowedPaymentMethods = null;
  @SerializedName("expires_at")
  private Long expiresAt = null;
  @SerializedName("monthly_installments_enabled")
  private Boolean monthlyInstallmentsEnabled = null;
  @SerializedName("monthly_installments_options")
  private List<Integer> monthlyInstallmentsOptions = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("needs_shipping_contact")
  private Boolean needsShippingContact = null;
  @SerializedName("on_demand_enabled")
  private Boolean onDemandEnabled = null;
  @SerializedName("order_template")
  private CheckoutOrderTemplate orderTemplate = null;
  @SerializedName("payments_limit_count")
  private Integer paymentsLimitCount = null;
  @SerializedName("recurrent")
  private Boolean recurrent = null;
  @SerializedName("type")
  private String type = null;

  /**
   * Those are the payment methods that will be available for the link
   **/
  @ApiModelProperty(required = true, value = "Those are the payment methods that will be available for the link")
  public List<String> getAllowedPaymentMethods() {
    return allowedPaymentMethods;
  }
  public void setAllowedPaymentMethods(List<String> allowedPaymentMethods) {
    this.allowedPaymentMethods = allowedPaymentMethods;
  }

  /**
   * It is the time when the link will expire. It is expressed in seconds since the Unix epoch. The valid range is from 2 to 365 days (the valid range will be taken from the next day of the creation date at 00:01 hrs) 
   **/
  @ApiModelProperty(required = true, value = "It is the time when the link will expire. It is expressed in seconds since the Unix epoch. The valid range is from 2 to 365 days (the valid range will be taken from the next day of the creation date at 00:01 hrs) ")
  public Long getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * This flag allows you to specify if months without interest will be active.
   **/
  @ApiModelProperty(value = "This flag allows you to specify if months without interest will be active.")
  public Boolean getMonthlyInstallmentsEnabled() {
    return monthlyInstallmentsEnabled;
  }
  public void setMonthlyInstallmentsEnabled(Boolean monthlyInstallmentsEnabled) {
    this.monthlyInstallmentsEnabled = monthlyInstallmentsEnabled;
  }

  /**
   * This field allows you to specify the number of months without interest.
   **/
  @ApiModelProperty(value = "This field allows you to specify the number of months without interest.")
  public List<Integer> getMonthlyInstallmentsOptions() {
    return monthlyInstallmentsOptions;
  }
  public void setMonthlyInstallmentsOptions(List<Integer> monthlyInstallmentsOptions) {
    this.monthlyInstallmentsOptions = monthlyInstallmentsOptions;
  }

  /**
   * Reason for charge
   **/
  @ApiModelProperty(required = true, value = "Reason for charge")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * This flag allows you to fill in the shipping information at checkout.
   **/
  @ApiModelProperty(value = "This flag allows you to fill in the shipping information at checkout.")
  public Boolean getNeedsShippingContact() {
    return needsShippingContact;
  }
  public void setNeedsShippingContact(Boolean needsShippingContact) {
    this.needsShippingContact = needsShippingContact;
  }

  /**
   * This flag allows you to specify if the link will be on demand.
   **/
  @ApiModelProperty(value = "This flag allows you to specify if the link will be on demand.")
  public Boolean getOnDemandEnabled() {
    return onDemandEnabled;
  }
  public void setOnDemandEnabled(Boolean onDemandEnabled) {
    this.onDemandEnabled = onDemandEnabled;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CheckoutOrderTemplate getOrderTemplate() {
    return orderTemplate;
  }
  public void setOrderTemplate(CheckoutOrderTemplate orderTemplate) {
    this.orderTemplate = orderTemplate;
  }

  /**
   * It is the number of payments that can be made through the link.
   **/
  @ApiModelProperty(value = "It is the number of payments that can be made through the link.")
  public Integer getPaymentsLimitCount() {
    return paymentsLimitCount;
  }
  public void setPaymentsLimitCount(Integer paymentsLimitCount) {
    this.paymentsLimitCount = paymentsLimitCount;
  }

  /**
   * false: single use. true: multiple payments
   **/
  @ApiModelProperty(required = true, value = "false: single use. true: multiple payments")
  public Boolean getRecurrent() {
    return recurrent;
  }
  public void setRecurrent(Boolean recurrent) {
    this.recurrent = recurrent;
  }

  /**
   * It is the type of link that will be created. It must be a valid type.
   **/
  @ApiModelProperty(required = true, value = "It is the type of link that will be created. It must be a valid type.")
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
    Checkout checkout = (Checkout) o;
    return (this.allowedPaymentMethods == null ? checkout.allowedPaymentMethods == null : this.allowedPaymentMethods.equals(checkout.allowedPaymentMethods)) &&
        (this.expiresAt == null ? checkout.expiresAt == null : this.expiresAt.equals(checkout.expiresAt)) &&
        (this.monthlyInstallmentsEnabled == null ? checkout.monthlyInstallmentsEnabled == null : this.monthlyInstallmentsEnabled.equals(checkout.monthlyInstallmentsEnabled)) &&
        (this.monthlyInstallmentsOptions == null ? checkout.monthlyInstallmentsOptions == null : this.monthlyInstallmentsOptions.equals(checkout.monthlyInstallmentsOptions)) &&
        (this.name == null ? checkout.name == null : this.name.equals(checkout.name)) &&
        (this.needsShippingContact == null ? checkout.needsShippingContact == null : this.needsShippingContact.equals(checkout.needsShippingContact)) &&
        (this.onDemandEnabled == null ? checkout.onDemandEnabled == null : this.onDemandEnabled.equals(checkout.onDemandEnabled)) &&
        (this.orderTemplate == null ? checkout.orderTemplate == null : this.orderTemplate.equals(checkout.orderTemplate)) &&
        (this.paymentsLimitCount == null ? checkout.paymentsLimitCount == null : this.paymentsLimitCount.equals(checkout.paymentsLimitCount)) &&
        (this.recurrent == null ? checkout.recurrent == null : this.recurrent.equals(checkout.recurrent)) &&
        (this.type == null ? checkout.type == null : this.type.equals(checkout.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.allowedPaymentMethods == null ? 0: this.allowedPaymentMethods.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    result = 31 * result + (this.monthlyInstallmentsEnabled == null ? 0: this.monthlyInstallmentsEnabled.hashCode());
    result = 31 * result + (this.monthlyInstallmentsOptions == null ? 0: this.monthlyInstallmentsOptions.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.needsShippingContact == null ? 0: this.needsShippingContact.hashCode());
    result = 31 * result + (this.onDemandEnabled == null ? 0: this.onDemandEnabled.hashCode());
    result = 31 * result + (this.orderTemplate == null ? 0: this.orderTemplate.hashCode());
    result = 31 * result + (this.paymentsLimitCount == null ? 0: this.paymentsLimitCount.hashCode());
    result = 31 * result + (this.recurrent == null ? 0: this.recurrent.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Checkout {\n");
    
    sb.append("  allowedPaymentMethods: ").append(allowedPaymentMethods).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("  monthlyInstallmentsEnabled: ").append(monthlyInstallmentsEnabled).append("\n");
    sb.append("  monthlyInstallmentsOptions: ").append(monthlyInstallmentsOptions).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  needsShippingContact: ").append(needsShippingContact).append("\n");
    sb.append("  onDemandEnabled: ").append(onDemandEnabled).append("\n");
    sb.append("  orderTemplate: ").append(orderTemplate).append("\n");
    sb.append("  paymentsLimitCount: ").append(paymentsLimitCount).append("\n");
    sb.append("  recurrent: ").append(recurrent).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
