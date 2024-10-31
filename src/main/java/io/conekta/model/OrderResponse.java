package io.conekta.model;

import io.conekta.model.ChargeResponseChannel;
import io.conekta.model.OasAnyTypeNotMapped;
import io.conekta.model.OrderFiscalEntityResponse;
import io.conekta.model.OrderNextActionResponse;
import io.conekta.model.OrderResponseCharges;
import io.conekta.model.OrderResponseCheckout;
import io.conekta.model.OrderResponseCustomerInfo;
import io.conekta.model.OrderResponseDiscountLines;
import io.conekta.model.OrderResponseProducts;
import io.conekta.model.OrderResponseShippingContact;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import io.conekta.EncryptedTypeAdapter;


/**
 * order response
 **/
@ApiModel(description = "order response")
public class OrderResponse  {
  
  private static final String MXN = "MXN";
  
  
  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("amount_refunded")
  private Integer amountRefunded = null;
  @SerializedName("channel")
  private ChargeResponseChannel channel = null;
  @SerializedName("charges")
  private OrderResponseCharges charges = null;
  @SerializedName("checkout")
  private OrderResponseCheckout checkout = null;
  @SerializedName("created_at")
  private Long createdAt = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("customer_info")
  private OrderResponseCustomerInfo customerInfo = null;
  @SerializedName("discount_lines")
  private OrderResponseDiscountLines discountLines = null;
  @SerializedName("fiscal_entity")
  private OrderFiscalEntityResponse fiscalEntity = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("is_refundable")
  private Boolean isRefundable = null;
  @SerializedName("line_items")
  private OrderResponseProducts lineItems = null;
  @SerializedName("livemode")
  private Boolean livemode = null;
  @SerializedName("metadata")
  private Map<String, OasAnyTypeNotMapped> metadata = null;
  @SerializedName("next_action")
  private OrderNextActionResponse nextAction = null;
  @SerializedName("object")
  private String _object = null;
  @SerializedName("payment_status")
  private String paymentStatus = null;
  @SerializedName("processing_mode")
  private String processingMode = null;
  @SerializedName("shipping_contact")
  private OrderResponseShippingContact shippingContact = null;
  @SerializedName("updated_at")
  private Long updatedAt = null;

  /**
   * The total amount to be collected in cents
   **/
  @ApiModelProperty(value = "The total amount to be collected in cents")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  /**
   * The total amount refunded in cents
   **/
  @ApiModelProperty(value = "The total amount refunded in cents")
  public Integer getAmountRefunded() {
    return amountRefunded;
  }
  public void setAmountRefunded(Integer amountRefunded) {
    this.amountRefunded = amountRefunded;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ChargeResponseChannel getChannel() {
    return channel;
  }
  public void setChannel(ChargeResponseChannel channel) {
    this.channel = channel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrderResponseCharges getCharges() {
    return charges;
  }
  public void setCharges(OrderResponseCharges charges) {
    this.charges = charges;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrderResponseCheckout getCheckout() {
    return checkout;
  }
  public void setCheckout(OrderResponseCheckout checkout) {
    this.checkout = checkout;
  }

  /**
   * The time at which the object was created in seconds since the Unix epoch
   **/
  @ApiModelProperty(value = "The time at which the object was created in seconds since the Unix epoch")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The three-letter ISO 4217 currency code. The currency of the order.
   **/
  @ApiModelProperty(value = "The three-letter ISO 4217 currency code. The currency of the order.")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrderResponseCustomerInfo getCustomerInfo() {
    return customerInfo;
  }
  public void setCustomerInfo(OrderResponseCustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrderResponseDiscountLines getDiscountLines() {
    return discountLines;
  }
  public void setDiscountLines(OrderResponseDiscountLines discountLines) {
    this.discountLines = discountLines;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrderFiscalEntityResponse getFiscalEntity() {
    return fiscalEntity;
  }
  public void setFiscalEntity(OrderFiscalEntityResponse fiscalEntity) {
    this.fiscalEntity = fiscalEntity;
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
  public Boolean getIsRefundable() {
    return isRefundable;
  }
  public void setIsRefundable(Boolean isRefundable) {
    this.isRefundable = isRefundable;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrderResponseProducts getLineItems() {
    return lineItems;
  }
  public void setLineItems(OrderResponseProducts lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * Whether the object exists in live mode or test mode
   **/
  @ApiModelProperty(value = "Whether the object exists in live mode or test mode")
  public Boolean getLivemode() {
    return livemode;
  }
  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
   **/
  @ApiModelProperty(value = "Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.")
  public Map<String, OasAnyTypeNotMapped> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, OasAnyTypeNotMapped> metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrderNextActionResponse getNextAction() {
    return nextAction;
  }
  public void setNextAction(OrderNextActionResponse nextAction) {
    this.nextAction = nextAction;
  }

  /**
   * String representing the object’s type. Objects of the same type share the same value.
   **/
  @ApiModelProperty(value = "String representing the object’s type. Objects of the same type share the same value.")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * The payment status of the order.
   **/
  @ApiModelProperty(value = "The payment status of the order.")
  public String getPaymentStatus() {
    return paymentStatus;
  }
  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  /**
   * Indicates the processing mode for the order, either ecommerce, recurrent or validation.
   **/
  @ApiModelProperty(value = "Indicates the processing mode for the order, either ecommerce, recurrent or validation.")
  public String getProcessingMode() {
    return processingMode;
  }
  public void setProcessingMode(String processingMode) {
    this.processingMode = processingMode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrderResponseShippingContact getShippingContact() {
    return shippingContact;
  }
  public void setShippingContact(OrderResponseShippingContact shippingContact) {
    this.shippingContact = shippingContact;
  }

  /**
   * The time at which the object was last updated in seconds since the Unix epoch
   **/
  @ApiModelProperty(value = "The time at which the object was last updated in seconds since the Unix epoch")
  public Long getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResponse orderResponse = (OrderResponse) o;
    return (this.amount == null ? orderResponse.amount == null : this.amount.equals(orderResponse.amount)) &&
        (this.amountRefunded == null ? orderResponse.amountRefunded == null : this.amountRefunded.equals(orderResponse.amountRefunded)) &&
        (this.channel == null ? orderResponse.channel == null : this.channel.equals(orderResponse.channel)) &&
        (this.charges == null ? orderResponse.charges == null : this.charges.equals(orderResponse.charges)) &&
        (this.checkout == null ? orderResponse.checkout == null : this.checkout.equals(orderResponse.checkout)) &&
        (this.createdAt == null ? orderResponse.createdAt == null : this.createdAt.equals(orderResponse.createdAt)) &&
        (this.currency == null ? orderResponse.currency == null : this.currency.equals(orderResponse.currency)) &&
        (this.customerInfo == null ? orderResponse.customerInfo == null : this.customerInfo.equals(orderResponse.customerInfo)) &&
        (this.discountLines == null ? orderResponse.discountLines == null : this.discountLines.equals(orderResponse.discountLines)) &&
        (this.fiscalEntity == null ? orderResponse.fiscalEntity == null : this.fiscalEntity.equals(orderResponse.fiscalEntity)) &&
        (this.id == null ? orderResponse.id == null : this.id.equals(orderResponse.id)) &&
        (this.isRefundable == null ? orderResponse.isRefundable == null : this.isRefundable.equals(orderResponse.isRefundable)) &&
        (this.lineItems == null ? orderResponse.lineItems == null : this.lineItems.equals(orderResponse.lineItems)) &&
        (this.livemode == null ? orderResponse.livemode == null : this.livemode.equals(orderResponse.livemode)) &&
        (this.metadata == null ? orderResponse.metadata == null : this.metadata.equals(orderResponse.metadata)) &&
        (this.nextAction == null ? orderResponse.nextAction == null : this.nextAction.equals(orderResponse.nextAction)) &&
        (this._object == null ? orderResponse._object == null : this._object.equals(orderResponse._object)) &&
        (this.paymentStatus == null ? orderResponse.paymentStatus == null : this.paymentStatus.equals(orderResponse.paymentStatus)) &&
        (this.processingMode == null ? orderResponse.processingMode == null : this.processingMode.equals(orderResponse.processingMode)) &&
        (this.shippingContact == null ? orderResponse.shippingContact == null : this.shippingContact.equals(orderResponse.shippingContact)) &&
        (this.updatedAt == null ? orderResponse.updatedAt == null : this.updatedAt.equals(orderResponse.updatedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.amountRefunded == null ? 0: this.amountRefunded.hashCode());
    result = 31 * result + (this.channel == null ? 0: this.channel.hashCode());
    result = 31 * result + (this.charges == null ? 0: this.charges.hashCode());
    result = 31 * result + (this.checkout == null ? 0: this.checkout.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.customerInfo == null ? 0: this.customerInfo.hashCode());
    result = 31 * result + (this.discountLines == null ? 0: this.discountLines.hashCode());
    result = 31 * result + (this.fiscalEntity == null ? 0: this.fiscalEntity.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.isRefundable == null ? 0: this.isRefundable.hashCode());
    result = 31 * result + (this.lineItems == null ? 0: this.lineItems.hashCode());
    result = 31 * result + (this.livemode == null ? 0: this.livemode.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this.nextAction == null ? 0: this.nextAction.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.paymentStatus == null ? 0: this.paymentStatus.hashCode());
    result = 31 * result + (this.processingMode == null ? 0: this.processingMode.hashCode());
    result = 31 * result + (this.shippingContact == null ? 0: this.shippingContact.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponse {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  amountRefunded: ").append(amountRefunded).append("\n");
    sb.append("  channel: ").append(channel).append("\n");
    sb.append("  charges: ").append(charges).append("\n");
    sb.append("  checkout: ").append(checkout).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  customerInfo: ").append(customerInfo).append("\n");
    sb.append("  discountLines: ").append(discountLines).append("\n");
    sb.append("  fiscalEntity: ").append(fiscalEntity).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  isRefundable: ").append(isRefundable).append("\n");
    sb.append("  lineItems: ").append(lineItems).append("\n");
    sb.append("  livemode: ").append(livemode).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  nextAction: ").append(nextAction).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  paymentStatus: ").append(paymentStatus).append("\n");
    sb.append("  processingMode: ").append(processingMode).append("\n");
    sb.append("  shippingContact: ").append(shippingContact).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
