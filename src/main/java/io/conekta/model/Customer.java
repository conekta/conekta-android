package io.conekta.model;

import io.conekta.model.CustomerAntifraudInfo;
import io.conekta.model.CustomerFiscalEntitiesRequest;
import io.conekta.model.CustomerPaymentMethodsRequest;
import io.conekta.model.CustomerShippingContacts;
import io.conekta.model.OasAnyTypeNotMapped;
import io.conekta.model.SubscriptionRequest;
import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;

/**
 * a customer
 **/
@ApiModel(description = "a customer")
public class Customer  {

  private static final String MXN = "MXN";

  @SerializedName("antifraud_info")
  private CustomerAntifraudInfo antifraudInfo = null;
  @SerializedName("corporate")
  private Boolean corporate = false;
  @SerializedName("custom_reference")
  private String customReference = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("default_payment_source_id")
  private String defaultPaymentSourceId = null;
  @SerializedName("default_shipping_contact_id")
  private String defaultShippingContactId = null;
  @SerializedName("fiscal_entities")
  private List<CustomerFiscalEntitiesRequest> fiscalEntities = null;
  @SerializedName("metadata")
  private Map<String, OasAnyTypeNotMapped> metadata = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("payment_sources")
  private List<CustomerPaymentMethodsRequest> paymentSources = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("plan_id")
  private String planId = null;
  @SerializedName("shipping_contacts")
  private List<CustomerShippingContacts> shippingContacts = null;
  @SerializedName("subscription")
  private SubscriptionRequest subscription = null;

  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public CustomerAntifraudInfo getAntifraudInfo() {
    return antifraudInfo;
  }

  public void setAntifraudInfo(CustomerAntifraudInfo antifraudInfo) {
    this.antifraudInfo = antifraudInfo;
  }
  /**
   * It is a value that allows identifying if the email is corporate or not.
   * 
   **/
  @ApiModelProperty(value = "It is a value that allows identifying if the email is corporate or not.")
  public Boolean getCorporate() {
    return corporate;
  }

  public void setCorporate(Boolean corporate) {
    this.corporate = corporate;
  }
  /**
   * It is an undefined value.
   * 
   **/
  @ApiModelProperty(value = "It is an undefined value.")
  public String getCustomReference() {
    return customReference;
  }

  public void setCustomReference(String customReference) {
    this.customReference = customReference;
  }
  /**
   * An email address is a series of customizable characters followed by a universal Internet symbol, the at symbol (@), the name of a host server, and a web domain ending (.mx, .com, .org, . net, etc).
   * 
   **/
  @ApiModelProperty(required = true, value = "An email address is a series of customizable characters followed by a universal Internet symbol, the at symbol (@), the name of a host server, and a web domain ending (.mx, .com, .org, . net, etc).")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  /**
   * It is a parameter that allows to identify in the response, the Conekta ID of a payment method (payment_id)
   * 
   **/
  @ApiModelProperty(value = "It is a parameter that allows to identify in the response, the Conekta ID of a payment method (payment_id)")
  public String getDefaultPaymentSourceId() {
    return defaultPaymentSourceId;
  }

  public void setDefaultPaymentSourceId(String defaultPaymentSourceId) {
    this.defaultPaymentSourceId = defaultPaymentSourceId;
  }
  /**
   * It is a parameter that allows to identify in the response, the Conekta ID of the shipping address (shipping_contact)
   * 
   **/
  @ApiModelProperty(value = "It is a parameter that allows to identify in the response, the Conekta ID of the shipping address (shipping_contact)")
  public String getDefaultShippingContactId() {
    return defaultShippingContactId;
  }

  public void setDefaultShippingContactId(String defaultShippingContactId) {
    this.defaultShippingContactId = defaultShippingContactId;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public List<CustomerFiscalEntitiesRequest> getFiscalEntities() {
    return fiscalEntities;
  }

  public void setFiscalEntities(List<CustomerFiscalEntitiesRequest> fiscalEntities) {
    this.fiscalEntities = fiscalEntities;
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
   * Client's name
   * 
   **/
  @ApiModelProperty(required = true, value = "Client's name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  /**
   * Contains details of the payment methods that the customer has active or has used in Conekta
   * 
   **/
  @ApiModelProperty(value = "Contains details of the payment methods that the customer has active or has used in Conekta")
  public List<CustomerPaymentMethodsRequest> getPaymentSources() {
    return paymentSources;
  }

  public void setPaymentSources(List<CustomerPaymentMethodsRequest> paymentSources) {
    this.paymentSources = paymentSources;
  }
  /**
   * Is the customer's phone number
   * 
   **/
  @ApiModelProperty(required = true, value = "Is the customer's phone number")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
  /**
   * Contains the ID of a plan, which could together with name, email and phone create a client directly to a subscription
   * 
   **/
  @ApiModelProperty(value = "Contains the ID of a plan, which could together with name, email and phone create a client directly to a subscription")
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }
  /**
   * Contains the detail of the shipping addresses that the client has active or has used in Conekta
   * 
   **/
  @ApiModelProperty(value = "Contains the detail of the shipping addresses that the client has active or has used in Conekta")
  public List<CustomerShippingContacts> getShippingContacts() {
    return shippingContacts;
  }

  public void setShippingContacts(List<CustomerShippingContacts> shippingContacts) {
    this.shippingContacts = shippingContacts;
  }
  /**
   * 
   * 
   **/
  @ApiModelProperty(value = "")
  public SubscriptionRequest getSubscription() {
    return subscription;
  }

  public void setSubscription(SubscriptionRequest subscription) {
    this.subscription = subscription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return (this.antifraudInfo == null ? customer.antifraudInfo == null : this.antifraudInfo.equals(customer.antifraudInfo)) &&
        (this.corporate == null ? customer.corporate == null : this.corporate.equals(customer.corporate)) &&
        (this.customReference == null ? customer.customReference == null : this.customReference.equals(customer.customReference)) &&
        (this.email == null ? customer.email == null : this.email.equals(customer.email)) &&
        (this.defaultPaymentSourceId == null ? customer.defaultPaymentSourceId == null : this.defaultPaymentSourceId.equals(customer.defaultPaymentSourceId)) &&
        (this.defaultShippingContactId == null ? customer.defaultShippingContactId == null : this.defaultShippingContactId.equals(customer.defaultShippingContactId)) &&
        (this.fiscalEntities == null ? customer.fiscalEntities == null : this.fiscalEntities.equals(customer.fiscalEntities)) &&
        (this.metadata == null ? customer.metadata == null : this.metadata.equals(customer.metadata)) &&
        (this.name == null ? customer.name == null : this.name.equals(customer.name)) &&
        (this.paymentSources == null ? customer.paymentSources == null : this.paymentSources.equals(customer.paymentSources)) &&
        (this.phone == null ? customer.phone == null : this.phone.equals(customer.phone)) &&
        (this.planId == null ? customer.planId == null : this.planId.equals(customer.planId)) &&
        (this.shippingContacts == null ? customer.shippingContacts == null : this.shippingContacts.equals(customer.shippingContacts)) &&
        (this.subscription == null ? customer.subscription == null : this.subscription.equals(customer.subscription));
    
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.antifraudInfo == null ? 0 : this.antifraudInfo.hashCode());
    result = 31 * result + (this.corporate == null ? 0 : this.corporate.hashCode());
    result = 31 * result + (this.customReference == null ? 0 : this.customReference.hashCode());
    result = 31 * result + (this.email == null ? 0 : this.email.hashCode());
    result = 31 * result + (this.defaultPaymentSourceId == null ? 0 : this.defaultPaymentSourceId.hashCode());
    result = 31 * result + (this.defaultShippingContactId == null ? 0 : this.defaultShippingContactId.hashCode());
    result = 31 * result + (this.fiscalEntities == null ? 0 : this.fiscalEntities.hashCode());
    result = 31 * result + (this.metadata == null ? 0 : this.metadata.hashCode());
    result = 31 * result + (this.name == null ? 0 : this.name.hashCode());
    result = 31 * result + (this.paymentSources == null ? 0 : this.paymentSources.hashCode());
    result = 31 * result + (this.phone == null ? 0 : this.phone.hashCode());
    result = 31 * result + (this.planId == null ? 0 : this.planId.hashCode());
    result = 31 * result + (this.shippingContacts == null ? 0 : this.shippingContacts.hashCode());
    result = 31 * result + (this.subscription == null ? 0 : this.subscription.hashCode());
    return result;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("  antifraudInfo: ").append(antifraudInfo).append("\n");
sb.append("  corporate: ").append(corporate).append("\n");
sb.append("  customReference: ").append(customReference).append("\n");
sb.append("  email: ").append(email).append("\n");
sb.append("  defaultPaymentSourceId: ").append(defaultPaymentSourceId).append("\n");
sb.append("  defaultShippingContactId: ").append(defaultShippingContactId).append("\n");
sb.append("  fiscalEntities: ").append(fiscalEntities).append("\n");
sb.append("  metadata: ").append(metadata).append("\n");
sb.append("  name: ").append(name).append("\n");
sb.append("  paymentSources: ").append(paymentSources).append("\n");
sb.append("  phone: ").append(phone).append("\n");
sb.append("  planId: ").append(planId).append("\n");
sb.append("  shippingContacts: ").append(shippingContacts).append("\n");
sb.append("  subscription: ").append(subscription).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
