package io.conekta.model;

import io.conekta.model.CustomerAntifraudInfoResponse;
import io.conekta.model.CustomerFiscalEntitiesResponse;
import io.conekta.model.CustomerPaymentMethodsResponse;
import io.conekta.model.CustomerResponseShippingContacts;
import io.conekta.model.OasAnyTypeNotMapped;
import io.conekta.model.SubscriptionResponse;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * customer response
 **/
@ApiModel(description = "customer response")
public class CustomerResponse  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("antifraud_info")
  private CustomerAntifraudInfoResponse antifraudInfo = null;
  @SerializedName("corporate")
  private Boolean corporate = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("custom_reference")
  private String customReference = null;
  @SerializedName("default_fiscal_entity_id")
  private String defaultFiscalEntityId = null;
  @SerializedName("default_shipping_contact_id")
  private String defaultShippingContactId = null;
  @SerializedName("default_payment_source_id")
  private String defaultPaymentSourceId = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("fiscal_entities")
  private CustomerFiscalEntitiesResponse fiscalEntities = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("metadata")
  private Map<String, OasAnyTypeNotMapped> metadata = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("payment_sources")
  private CustomerPaymentMethodsResponse paymentSources = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("shipping_contacts")
  private CustomerResponseShippingContacts shippingContacts = null;
  @SerializedName("subscription")
  private SubscriptionResponse subscription = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public CustomerAntifraudInfoResponse getAntifraudInfo() {
    return antifraudInfo;
  }
  public void setAntifraudInfo(CustomerAntifraudInfoResponse antifraudInfo) {
    this.antifraudInfo = antifraudInfo;
  }

  /**
   * true if the customer is a company
   **/
  @ApiModelProperty(value = "true if the customer is a company")
  public Boolean getCorporate() {
    return corporate;
  }
  public void setCorporate(Boolean corporate) {
    this.corporate = corporate;
  }

  /**
   * Creation date of the object
   **/
  @ApiModelProperty(required = true, value = "Creation date of the object")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Custom reference
   **/
  @ApiModelProperty(value = "Custom reference")
  public String getCustomReference() {
    return customReference;
  }
  public void setCustomReference(String customReference) {
    this.customReference = customReference;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDefaultFiscalEntityId() {
    return defaultFiscalEntityId;
  }
  public void setDefaultFiscalEntityId(String defaultFiscalEntityId) {
    this.defaultFiscalEntityId = defaultFiscalEntityId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDefaultShippingContactId() {
    return defaultShippingContactId;
  }
  public void setDefaultShippingContactId(String defaultShippingContactId) {
    this.defaultShippingContactId = defaultShippingContactId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDefaultPaymentSourceId() {
    return defaultPaymentSourceId;
  }
  public void setDefaultPaymentSourceId(String defaultPaymentSourceId) {
    this.defaultPaymentSourceId = defaultPaymentSourceId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CustomerFiscalEntitiesResponse getFiscalEntities() {
    return fiscalEntities;
  }
  public void setFiscalEntities(CustomerFiscalEntitiesResponse fiscalEntities) {
    this.fiscalEntities = fiscalEntities;
  }

  /**
   * Customer's ID
   **/
  @ApiModelProperty(required = true, value = "Customer's ID")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * true if the object exists in live mode or the value false if the object exists in test mode
   **/
  @ApiModelProperty(required = true, value = "true if the object exists in live mode or the value false if the object exists in test mode")
  public Boolean getLivemode() {
    return livemode;
  }
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  /**
   * Customer's name
   **/
  @ApiModelProperty(required = true, value = "Customer's name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
  @ApiModelProperty(required = true, value = "")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CustomerPaymentMethodsResponse getPaymentSources() {
    return paymentSources;
  }
  public void setPaymentSources(CustomerPaymentMethodsResponse paymentSources) {
    this.paymentSources = paymentSources;
  }

  /**
   * Customer's phone number
   **/
  @ApiModelProperty(value = "Customer's phone number")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CustomerResponseShippingContacts getShippingContacts() {
    return shippingContacts;
  }
  public void setShippingContacts(CustomerResponseShippingContacts shippingContacts) {
    this.shippingContacts = shippingContacts;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SubscriptionResponse getSubscription() {
    return subscription;
  }
  public void setSubscription(SubscriptionResponse subscription) {
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
    CustomerResponse customerResponse = (CustomerResponse) o;
    return (this.antifraudInfo == null ? customerResponse.antifraudInfo == null : this.antifraudInfo.equals(customerResponse.antifraudInfo)) &&
        (this.corporate == null ? customerResponse.corporate == null : this.corporate.equals(customerResponse.corporate)) &&
        (this.createdAt == null ? customerResponse.createdAt == null : this.createdAt.equals(customerResponse.createdAt)) &&
        (this.customReference == null ? customerResponse.customReference == null : this.customReference.equals(customerResponse.customReference)) &&
        (this.defaultFiscalEntityId == null ? customerResponse.defaultFiscalEntityId == null : this.defaultFiscalEntityId.equals(customerResponse.defaultFiscalEntityId)) &&
        (this.defaultShippingContactId == null ? customerResponse.defaultShippingContactId == null : this.defaultShippingContactId.equals(customerResponse.defaultShippingContactId)) &&
        (this.defaultPaymentSourceId == null ? customerResponse.defaultPaymentSourceId == null : this.defaultPaymentSourceId.equals(customerResponse.defaultPaymentSourceId)) &&
        (this.email == null ? customerResponse.email == null : this.email.equals(customerResponse.email)) &&
        (this.fiscalEntities == null ? customerResponse.fiscalEntities == null : this.fiscalEntities.equals(customerResponse.fiscalEntities)) &&
        (this.id == null ? customerResponse.id == null : this.id.equals(customerResponse.id)) &&
        (this.livemode == null ? customerResponse.livemode == null : this.livemode.equals(customerResponse.livemode)) &&
        (this.name == null ? customerResponse.name == null : this.name.equals(customerResponse.name)) &&
        (this.metadata == null ? customerResponse.metadata == null : this.metadata.equals(customerResponse.metadata)) &&
        (this._object == null ? customerResponse._object == null : this._object.equals(customerResponse._object)) &&
        (this.paymentSources == null ? customerResponse.paymentSources == null : this.paymentSources.equals(customerResponse.paymentSources)) &&
        (this.phone == null ? customerResponse.phone == null : this.phone.equals(customerResponse.phone)) &&
        (this.shippingContacts == null ? customerResponse.shippingContacts == null : this.shippingContacts.equals(customerResponse.shippingContacts)) &&
        (this.subscription == null ? customerResponse.subscription == null : this.subscription.equals(customerResponse.subscription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.antifraudInfo == null ? 0: this.antifraudInfo.hashCode());
    result = 31 * result + (this.corporate == null ? 0: this.corporate.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.customReference == null ? 0: this.customReference.hashCode());
    result = 31 * result + (this.defaultFiscalEntityId == null ? 0: this.defaultFiscalEntityId.hashCode());
    result = 31 * result + (this.defaultShippingContactId == null ? 0: this.defaultShippingContactId.hashCode());
    result = 31 * result + (this.defaultPaymentSourceId == null ? 0: this.defaultPaymentSourceId.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.fiscalEntities == null ? 0: this.fiscalEntities.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.livemode == null ? 0: this.livemode.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.paymentSources == null ? 0: this.paymentSources.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.shippingContacts == null ? 0: this.shippingContacts.hashCode());
    result = 31 * result + (this.subscription == null ? 0: this.subscription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerResponse {\n");
    
    sb.append("  antifraudInfo: ").append(antifraudInfo).append("\n");
    sb.append("  corporate: ").append(corporate).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  customReference: ").append(customReference).append("\n");
    sb.append("  defaultFiscalEntityId: ").append(defaultFiscalEntityId).append("\n");
    sb.append("  defaultShippingContactId: ").append(defaultShippingContactId).append("\n");
    sb.append("  defaultPaymentSourceId: ").append(defaultPaymentSourceId).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  fiscalEntities: ").append(fiscalEntities).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  livemode: ").append(livemode).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  paymentSources: ").append(paymentSources).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  shippingContacts: ").append(shippingContacts).append("\n");
    sb.append("  subscription: ").append(subscription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
