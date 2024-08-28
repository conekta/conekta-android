package io.conekta;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import io.conekta.model.*;
import io.conekta.model.Error;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ApiKeyCreateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiKeyCreateResponse>>(){}.getType();
    }
    
    if ("ApiKeyRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiKeyRequest>>(){}.getType();
    }
    
    if ("ApiKeyResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiKeyResponse>>(){}.getType();
    }
    
    if ("ApiKeyResponseOnDelete".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiKeyResponseOnDelete>>(){}.getType();
    }
    
    if ("ApiKeyUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApiKeyUpdateRequest>>(){}.getType();
    }
    
    if ("BalanceCommonField".equalsIgnoreCase(className)) {
      return new TypeToken<List<BalanceCommonField>>(){}.getType();
    }
    
    if ("BalanceResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BalanceResponse>>(){}.getType();
    }
    
    if ("BlacklistRuleResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BlacklistRuleResponse>>(){}.getType();
    }
    
    if ("ChargeOrderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChargeOrderResponse>>(){}.getType();
    }
    
    if ("ChargeOrderResponsePaymentMethod".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChargeOrderResponsePaymentMethod>>(){}.getType();
    }
    
    if ("ChargeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChargeRequest>>(){}.getType();
    }
    
    if ("ChargeRequestPaymentMethod".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChargeRequestPaymentMethod>>(){}.getType();
    }
    
    if ("ChargeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChargeResponse>>(){}.getType();
    }
    
    if ("ChargeResponseChannel".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChargeResponseChannel>>(){}.getType();
    }
    
    if ("ChargeResponsePaymentMethod".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChargeResponsePaymentMethod>>(){}.getType();
    }
    
    if ("ChargeResponseRefunds".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChargeResponseRefunds>>(){}.getType();
    }
    
    if ("ChargeResponseRefundsData".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChargeResponseRefundsData>>(){}.getType();
    }
    
    if ("ChargeUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChargeUpdateRequest>>(){}.getType();
    }
    
    if ("ChargesDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChargesDataResponse>>(){}.getType();
    }
    
    if ("Checkout".equalsIgnoreCase(className)) {
      return new TypeToken<List<Checkout>>(){}.getType();
    }
    
    if ("CheckoutOrderTemplate".equalsIgnoreCase(className)) {
      return new TypeToken<List<CheckoutOrderTemplate>>(){}.getType();
    }
    
    if ("CheckoutOrderTemplateCustomerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<CheckoutOrderTemplateCustomerInfo>>(){}.getType();
    }
    
    if ("CheckoutRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CheckoutRequest>>(){}.getType();
    }
    
    if ("CheckoutResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CheckoutResponse>>(){}.getType();
    }
    
    if ("CheckoutsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CheckoutsResponse>>(){}.getType();
    }
    
    if ("CompanyFiscalInfoAddressResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CompanyFiscalInfoAddressResponse>>(){}.getType();
    }
    
    if ("CompanyFiscalInfoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CompanyFiscalInfoResponse>>(){}.getType();
    }
    
    if ("CompanyPayoutDestinationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CompanyPayoutDestinationResponse>>(){}.getType();
    }
    
    if ("CompanyResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CompanyResponse>>(){}.getType();
    }
    
    if ("CreateCustomerFiscalEntitiesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateCustomerFiscalEntitiesResponse>>(){}.getType();
    }
    
    if ("CreateCustomerPaymentMethodsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateCustomerPaymentMethodsRequest>>(){}.getType();
    }
    
    if ("CreateCustomerPaymentMethodsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateCustomerPaymentMethodsResponse>>(){}.getType();
    }
    
    if ("CreateRiskRulesData".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateRiskRulesData>>(){}.getType();
    }
    
    if ("Customer".equalsIgnoreCase(className)) {
      return new TypeToken<List<Customer>>(){}.getType();
    }
    
    if ("CustomerAddress".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerAddress>>(){}.getType();
    }
    
    if ("CustomerAntifraudInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerAntifraudInfo>>(){}.getType();
    }
    
    if ("CustomerAntifraudInfoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerAntifraudInfoResponse>>(){}.getType();
    }
    
    if ("CustomerFiscalEntitiesDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerFiscalEntitiesDataResponse>>(){}.getType();
    }
    
    if ("CustomerFiscalEntitiesRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerFiscalEntitiesRequest>>(){}.getType();
    }
    
    if ("CustomerFiscalEntitiesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerFiscalEntitiesResponse>>(){}.getType();
    }
    
    if ("CustomerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerInfo>>(){}.getType();
    }
    
    if ("CustomerInfoJustCustomerId".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerInfoJustCustomerId>>(){}.getType();
    }
    
    if ("CustomerInfoJustCustomerIdResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerInfoJustCustomerIdResponse>>(){}.getType();
    }
    
    if ("CustomerPaymentMethodRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerPaymentMethodRequest>>(){}.getType();
    }
    
    if ("CustomerPaymentMethodsData".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerPaymentMethodsData>>(){}.getType();
    }
    
    if ("CustomerPaymentMethodsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerPaymentMethodsRequest>>(){}.getType();
    }
    
    if ("CustomerPaymentMethodsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerPaymentMethodsResponse>>(){}.getType();
    }
    
    if ("CustomerResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerResponse>>(){}.getType();
    }
    
    if ("CustomerResponseShippingContacts".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerResponseShippingContacts>>(){}.getType();
    }
    
    if ("CustomerShippingContacts".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerShippingContacts>>(){}.getType();
    }
    
    if ("CustomerShippingContactsAddress".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerShippingContactsAddress>>(){}.getType();
    }
    
    if ("CustomerShippingContactsDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerShippingContactsDataResponse>>(){}.getType();
    }
    
    if ("CustomerShippingContactsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerShippingContactsResponse>>(){}.getType();
    }
    
    if ("CustomerShippingContactsResponseAddress".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerShippingContactsResponseAddress>>(){}.getType();
    }
    
    if ("CustomerUpdateFiscalEntitiesRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerUpdateFiscalEntitiesRequest>>(){}.getType();
    }
    
    if ("CustomerUpdateShippingContacts".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomerUpdateShippingContacts>>(){}.getType();
    }
    
    if ("CustomersResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CustomersResponse>>(){}.getType();
    }
    
    if ("DeleteApiKeysResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeleteApiKeysResponse>>(){}.getType();
    }
    
    if ("DeletedBlacklistRuleResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeletedBlacklistRuleResponse>>(){}.getType();
    }
    
    if ("DeletedWhitelistRuleResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeletedWhitelistRuleResponse>>(){}.getType();
    }
    
    if ("Details".equalsIgnoreCase(className)) {
      return new TypeToken<List<Details>>(){}.getType();
    }
    
    if ("DetailsError".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetailsError>>(){}.getType();
    }
    
    if ("DiscountLinesDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DiscountLinesDataResponse>>(){}.getType();
    }
    
    if ("DiscountLinesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DiscountLinesResponse>>(){}.getType();
    }
    
    if ("EmailCheckoutRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<EmailCheckoutRequest>>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<List<Error>>(){}.getType();
    }
    
    if ("EventResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EventResponse>>(){}.getType();
    }
    
    if ("EventTypes".equalsIgnoreCase(className)) {
      return new TypeToken<List<EventTypes>>(){}.getType();
    }
    
    if ("EventsResendResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<EventsResendResponse>>(){}.getType();
    }
    
    if ("FiscalEntityAddress".equalsIgnoreCase(className)) {
      return new TypeToken<List<FiscalEntityAddress>>(){}.getType();
    }
    
    if ("GetApiKeysResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetApiKeysResponse>>(){}.getType();
    }
    
    if ("GetChargesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetChargesResponse>>(){}.getType();
    }
    
    if ("GetCompaniesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetCompaniesResponse>>(){}.getType();
    }
    
    if ("GetCustomerPaymentMethodDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetCustomerPaymentMethodDataResponse>>(){}.getType();
    }
    
    if ("GetEventsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetEventsResponse>>(){}.getType();
    }
    
    if ("GetOrderDiscountLinesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetOrderDiscountLinesResponse>>(){}.getType();
    }
    
    if ("GetOrdersResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetOrdersResponse>>(){}.getType();
    }
    
    if ("GetPaymentMethodResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetPaymentMethodResponse>>(){}.getType();
    }
    
    if ("GetPlansResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetPlansResponse>>(){}.getType();
    }
    
    if ("GetTransactionsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetTransactionsResponse>>(){}.getType();
    }
    
    if ("GetTransfersResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetTransfersResponse>>(){}.getType();
    }
    
    if ("GetWebhookKeysResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetWebhookKeysResponse>>(){}.getType();
    }
    
    if ("GetWebhooksResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetWebhooksResponse>>(){}.getType();
    }
    
    if ("LogResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LogResponse>>(){}.getType();
    }
    
    if ("LogsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LogsResponse>>(){}.getType();
    }
    
    if ("LogsResponseData".equalsIgnoreCase(className)) {
      return new TypeToken<List<LogsResponseData>>(){}.getType();
    }
    
    if ("OrderCaptureRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderCaptureRequest>>(){}.getType();
    }
    
    if ("OrderCustomerInfoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderCustomerInfoResponse>>(){}.getType();
    }
    
    if ("OrderDiscountLinesRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderDiscountLinesRequest>>(){}.getType();
    }
    
    if ("OrderFiscalEntityAddressResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderFiscalEntityAddressResponse>>(){}.getType();
    }
    
    if ("OrderFiscalEntityRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderFiscalEntityRequest>>(){}.getType();
    }
    
    if ("OrderFiscalEntityResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderFiscalEntityResponse>>(){}.getType();
    }
    
    if ("OrderNextActionResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderNextActionResponse>>(){}.getType();
    }
    
    if ("OrderNextActionResponseRedirectToUrl".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderNextActionResponseRedirectToUrl>>(){}.getType();
    }
    
    if ("OrderRefundRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderRefundRequest>>(){}.getType();
    }
    
    if ("OrderRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderRequest>>(){}.getType();
    }
    
    if ("OrderRequestCustomerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderRequestCustomerInfo>>(){}.getType();
    }
    
    if ("OrderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderResponse>>(){}.getType();
    }
    
    if ("OrderResponseCharges".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderResponseCharges>>(){}.getType();
    }
    
    if ("OrderResponseCheckout".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderResponseCheckout>>(){}.getType();
    }
    
    if ("OrderResponseCustomerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderResponseCustomerInfo>>(){}.getType();
    }
    
    if ("OrderResponseDiscountLines".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderResponseDiscountLines>>(){}.getType();
    }
    
    if ("OrderResponseProducts".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderResponseProducts>>(){}.getType();
    }
    
    if ("OrderResponseShippingContact".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderResponseShippingContact>>(){}.getType();
    }
    
    if ("OrderTaxRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderTaxRequest>>(){}.getType();
    }
    
    if ("OrderUpdateFiscalEntityRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderUpdateFiscalEntityRequest>>(){}.getType();
    }
    
    if ("OrderUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderUpdateRequest>>(){}.getType();
    }
    
    if ("OrderUpdateRequestCustomerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderUpdateRequestCustomerInfo>>(){}.getType();
    }
    
    if ("OrdersResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrdersResponse>>(){}.getType();
    }
    
    if ("Page".equalsIgnoreCase(className)) {
      return new TypeToken<List<Page>>(){}.getType();
    }
    
    if ("Pagination".equalsIgnoreCase(className)) {
      return new TypeToken<List<Pagination>>(){}.getType();
    }
    
    if ("PaymentMethod".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentMethod>>(){}.getType();
    }
    
    if ("PaymentMethodBankTransfer".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentMethodBankTransfer>>(){}.getType();
    }
    
    if ("PaymentMethodCard".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentMethodCard>>(){}.getType();
    }
    
    if ("PaymentMethodCardRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentMethodCardRequest>>(){}.getType();
    }
    
    if ("PaymentMethodCardResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentMethodCardResponse>>(){}.getType();
    }
    
    if ("PaymentMethodCash".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentMethodCash>>(){}.getType();
    }
    
    if ("PaymentMethodCashRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentMethodCashRequest>>(){}.getType();
    }
    
    if ("PaymentMethodCashResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentMethodCashResponse>>(){}.getType();
    }
    
    if ("PaymentMethodGeneralRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentMethodGeneralRequest>>(){}.getType();
    }
    
    if ("PaymentMethodResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentMethodResponse>>(){}.getType();
    }
    
    if ("PaymentMethodSpeiRecurrent".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentMethodSpeiRecurrent>>(){}.getType();
    }
    
    if ("PaymentMethodSpeiRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentMethodSpeiRequest>>(){}.getType();
    }
    
    if ("PaymentMethodTokenRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentMethodTokenRequest>>(){}.getType();
    }
    
    if ("Payout".equalsIgnoreCase(className)) {
      return new TypeToken<List<Payout>>(){}.getType();
    }
    
    if ("PayoutMethod".equalsIgnoreCase(className)) {
      return new TypeToken<List<PayoutMethod>>(){}.getType();
    }
    
    if ("PayoutOrder".equalsIgnoreCase(className)) {
      return new TypeToken<List<PayoutOrder>>(){}.getType();
    }
    
    if ("PayoutOrderPayoutsItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<PayoutOrderPayoutsItem>>(){}.getType();
    }
    
    if ("PayoutOrderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PayoutOrderResponse>>(){}.getType();
    }
    
    if ("PayoutOrderResponseCustomerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<PayoutOrderResponseCustomerInfo>>(){}.getType();
    }
    
    if ("PayoutOrdersResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PayoutOrdersResponse>>(){}.getType();
    }
    
    if ("PlanRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanRequest>>(){}.getType();
    }
    
    if ("PlanResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanResponse>>(){}.getType();
    }
    
    if ("PlanUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<PlanUpdateRequest>>(){}.getType();
    }
    
    if ("Product".equalsIgnoreCase(className)) {
      return new TypeToken<List<Product>>(){}.getType();
    }
    
    if ("ProductDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductDataResponse>>(){}.getType();
    }
    
    if ("ProductOrderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductOrderResponse>>(){}.getType();
    }
    
    if ("RiskRulesData".equalsIgnoreCase(className)) {
      return new TypeToken<List<RiskRulesData>>(){}.getType();
    }
    
    if ("RiskRulesList".equalsIgnoreCase(className)) {
      return new TypeToken<List<RiskRulesList>>(){}.getType();
    }
    
    if ("ShippingOrderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ShippingOrderResponse>>(){}.getType();
    }
    
    if ("ShippingRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ShippingRequest>>(){}.getType();
    }
    
    if ("SmsCheckoutRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<SmsCheckoutRequest>>(){}.getType();
    }
    
    if ("SubscriptionEventsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SubscriptionEventsResponse>>(){}.getType();
    }
    
    if ("SubscriptionRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<SubscriptionRequest>>(){}.getType();
    }
    
    if ("SubscriptionResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SubscriptionResponse>>(){}.getType();
    }
    
    if ("SubscriptionUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<SubscriptionUpdateRequest>>(){}.getType();
    }
    
    if ("Token".equalsIgnoreCase(className)) {
      return new TypeToken<List<Token>>(){}.getType();
    }
    
    if ("TokenCard".equalsIgnoreCase(className)) {
      return new TypeToken<List<TokenCard>>(){}.getType();
    }
    
    if ("TokenCheckout".equalsIgnoreCase(className)) {
      return new TypeToken<List<TokenCheckout>>(){}.getType();
    }
    
    if ("TokenResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TokenResponse>>(){}.getType();
    }
    
    if ("TokenResponseCheckout".equalsIgnoreCase(className)) {
      return new TypeToken<List<TokenResponseCheckout>>(){}.getType();
    }
    
    if ("TransactionResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransactionResponse>>(){}.getType();
    }
    
    if ("TransferDestinationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferDestinationResponse>>(){}.getType();
    }
    
    if ("TransferMethodResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferMethodResponse>>(){}.getType();
    }
    
    if ("TransferResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransferResponse>>(){}.getType();
    }
    
    if ("TransfersResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransfersResponse>>(){}.getType();
    }
    
    if ("UpdateCustomer".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateCustomer>>(){}.getType();
    }
    
    if ("UpdateCustomerAntifraudInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateCustomerAntifraudInfo>>(){}.getType();
    }
    
    if ("UpdateCustomerFiscalEntitiesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateCustomerFiscalEntitiesResponse>>(){}.getType();
    }
    
    if ("UpdateCustomerPaymentMethodsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateCustomerPaymentMethodsResponse>>(){}.getType();
    }
    
    if ("UpdateOrderDiscountLinesRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateOrderDiscountLinesRequest>>(){}.getType();
    }
    
    if ("UpdateOrderTaxRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateOrderTaxRequest>>(){}.getType();
    }
    
    if ("UpdateOrderTaxResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateOrderTaxResponse>>(){}.getType();
    }
    
    if ("UpdatePaymentMethods".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdatePaymentMethods>>(){}.getType();
    }
    
    if ("UpdateProduct".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateProduct>>(){}.getType();
    }
    
    if ("WebhookKeyCreateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookKeyCreateResponse>>(){}.getType();
    }
    
    if ("WebhookKeyDeleteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookKeyDeleteResponse>>(){}.getType();
    }
    
    if ("WebhookKeyRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookKeyRequest>>(){}.getType();
    }
    
    if ("WebhookKeyResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookKeyResponse>>(){}.getType();
    }
    
    if ("WebhookKeyUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookKeyUpdateRequest>>(){}.getType();
    }
    
    if ("WebhookLog".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookLog>>(){}.getType();
    }
    
    if ("WebhookRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookRequest>>(){}.getType();
    }
    
    if ("WebhookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookResponse>>(){}.getType();
    }
    
    if ("WebhookUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<WebhookUpdateRequest>>(){}.getType();
    }
    
    if ("WhitelistlistRuleResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<WhitelistlistRuleResponse>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ApiKeyCreateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ApiKeyCreateResponse>(){}.getType();
    }
    
    if ("ApiKeyRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ApiKeyRequest>(){}.getType();
    }
    
    if ("ApiKeyResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ApiKeyResponse>(){}.getType();
    }
    
    if ("ApiKeyResponseOnDelete".equalsIgnoreCase(className)) {
      return new TypeToken<ApiKeyResponseOnDelete>(){}.getType();
    }
    
    if ("ApiKeyUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ApiKeyUpdateRequest>(){}.getType();
    }
    
    if ("BalanceCommonField".equalsIgnoreCase(className)) {
      return new TypeToken<BalanceCommonField>(){}.getType();
    }
    
    if ("BalanceResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BalanceResponse>(){}.getType();
    }
    
    if ("BlacklistRuleResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BlacklistRuleResponse>(){}.getType();
    }
    
    if ("ChargeOrderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ChargeOrderResponse>(){}.getType();
    }
    
    if ("ChargeOrderResponsePaymentMethod".equalsIgnoreCase(className)) {
      return new TypeToken<ChargeOrderResponsePaymentMethod>(){}.getType();
    }
    
    if ("ChargeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ChargeRequest>(){}.getType();
    }
    
    if ("ChargeRequestPaymentMethod".equalsIgnoreCase(className)) {
      return new TypeToken<ChargeRequestPaymentMethod>(){}.getType();
    }
    
    if ("ChargeResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ChargeResponse>(){}.getType();
    }
    
    if ("ChargeResponseChannel".equalsIgnoreCase(className)) {
      return new TypeToken<ChargeResponseChannel>(){}.getType();
    }
    
    if ("ChargeResponsePaymentMethod".equalsIgnoreCase(className)) {
      return new TypeToken<ChargeResponsePaymentMethod>(){}.getType();
    }
    
    if ("ChargeResponseRefunds".equalsIgnoreCase(className)) {
      return new TypeToken<ChargeResponseRefunds>(){}.getType();
    }
    
    if ("ChargeResponseRefundsData".equalsIgnoreCase(className)) {
      return new TypeToken<ChargeResponseRefundsData>(){}.getType();
    }
    
    if ("ChargeUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ChargeUpdateRequest>(){}.getType();
    }
    
    if ("ChargesDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ChargesDataResponse>(){}.getType();
    }
    
    if ("Checkout".equalsIgnoreCase(className)) {
      return new TypeToken<Checkout>(){}.getType();
    }
    
    if ("CheckoutOrderTemplate".equalsIgnoreCase(className)) {
      return new TypeToken<CheckoutOrderTemplate>(){}.getType();
    }
    
    if ("CheckoutOrderTemplateCustomerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<CheckoutOrderTemplateCustomerInfo>(){}.getType();
    }
    
    if ("CheckoutRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CheckoutRequest>(){}.getType();
    }
    
    if ("CheckoutResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CheckoutResponse>(){}.getType();
    }
    
    if ("CheckoutsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CheckoutsResponse>(){}.getType();
    }
    
    if ("CompanyFiscalInfoAddressResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CompanyFiscalInfoAddressResponse>(){}.getType();
    }
    
    if ("CompanyFiscalInfoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CompanyFiscalInfoResponse>(){}.getType();
    }
    
    if ("CompanyPayoutDestinationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CompanyPayoutDestinationResponse>(){}.getType();
    }
    
    if ("CompanyResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CompanyResponse>(){}.getType();
    }
    
    if ("CreateCustomerFiscalEntitiesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CreateCustomerFiscalEntitiesResponse>(){}.getType();
    }
    
    if ("CreateCustomerPaymentMethodsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CreateCustomerPaymentMethodsRequest>(){}.getType();
    }
    
    if ("CreateCustomerPaymentMethodsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CreateCustomerPaymentMethodsResponse>(){}.getType();
    }
    
    if ("CreateRiskRulesData".equalsIgnoreCase(className)) {
      return new TypeToken<CreateRiskRulesData>(){}.getType();
    }
    
    if ("Customer".equalsIgnoreCase(className)) {
      return new TypeToken<Customer>(){}.getType();
    }
    
    if ("CustomerAddress".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerAddress>(){}.getType();
    }
    
    if ("CustomerAntifraudInfo".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerAntifraudInfo>(){}.getType();
    }
    
    if ("CustomerAntifraudInfoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerAntifraudInfoResponse>(){}.getType();
    }
    
    if ("CustomerFiscalEntitiesDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerFiscalEntitiesDataResponse>(){}.getType();
    }
    
    if ("CustomerFiscalEntitiesRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerFiscalEntitiesRequest>(){}.getType();
    }
    
    if ("CustomerFiscalEntitiesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerFiscalEntitiesResponse>(){}.getType();
    }
    
    if ("CustomerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerInfo>(){}.getType();
    }
    
    if ("CustomerInfoJustCustomerId".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerInfoJustCustomerId>(){}.getType();
    }
    
    if ("CustomerInfoJustCustomerIdResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerInfoJustCustomerIdResponse>(){}.getType();
    }
    
    if ("CustomerPaymentMethodRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerPaymentMethodRequest>(){}.getType();
    }
    
    if ("CustomerPaymentMethodsData".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerPaymentMethodsData>(){}.getType();
    }
    
    if ("CustomerPaymentMethodsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerPaymentMethodsRequest>(){}.getType();
    }
    
    if ("CustomerPaymentMethodsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerPaymentMethodsResponse>(){}.getType();
    }
    
    if ("CustomerResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerResponse>(){}.getType();
    }
    
    if ("CustomerResponseShippingContacts".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerResponseShippingContacts>(){}.getType();
    }
    
    if ("CustomerShippingContacts".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerShippingContacts>(){}.getType();
    }
    
    if ("CustomerShippingContactsAddress".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerShippingContactsAddress>(){}.getType();
    }
    
    if ("CustomerShippingContactsDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerShippingContactsDataResponse>(){}.getType();
    }
    
    if ("CustomerShippingContactsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerShippingContactsResponse>(){}.getType();
    }
    
    if ("CustomerShippingContactsResponseAddress".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerShippingContactsResponseAddress>(){}.getType();
    }
    
    if ("CustomerUpdateFiscalEntitiesRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerUpdateFiscalEntitiesRequest>(){}.getType();
    }
    
    if ("CustomerUpdateShippingContacts".equalsIgnoreCase(className)) {
      return new TypeToken<CustomerUpdateShippingContacts>(){}.getType();
    }
    
    if ("CustomersResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CustomersResponse>(){}.getType();
    }
    
    if ("DeleteApiKeysResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DeleteApiKeysResponse>(){}.getType();
    }
    
    if ("DeletedBlacklistRuleResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DeletedBlacklistRuleResponse>(){}.getType();
    }
    
    if ("DeletedWhitelistRuleResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DeletedWhitelistRuleResponse>(){}.getType();
    }
    
    if ("Details".equalsIgnoreCase(className)) {
      return new TypeToken<Details>(){}.getType();
    }
    
    if ("DetailsError".equalsIgnoreCase(className)) {
      return new TypeToken<DetailsError>(){}.getType();
    }
    
    if ("DiscountLinesDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DiscountLinesDataResponse>(){}.getType();
    }
    
    if ("DiscountLinesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DiscountLinesResponse>(){}.getType();
    }
    
    if ("EmailCheckoutRequest".equalsIgnoreCase(className)) {
      return new TypeToken<EmailCheckoutRequest>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<Error>(){}.getType();
    }
    
    if ("EventResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EventResponse>(){}.getType();
    }
    
    if ("EventTypes".equalsIgnoreCase(className)) {
      return new TypeToken<EventTypes>(){}.getType();
    }
    
    if ("EventsResendResponse".equalsIgnoreCase(className)) {
      return new TypeToken<EventsResendResponse>(){}.getType();
    }
    
    if ("FiscalEntityAddress".equalsIgnoreCase(className)) {
      return new TypeToken<FiscalEntityAddress>(){}.getType();
    }
    
    if ("GetApiKeysResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GetApiKeysResponse>(){}.getType();
    }
    
    if ("GetChargesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GetChargesResponse>(){}.getType();
    }
    
    if ("GetCompaniesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GetCompaniesResponse>(){}.getType();
    }
    
    if ("GetCustomerPaymentMethodDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GetCustomerPaymentMethodDataResponse>(){}.getType();
    }
    
    if ("GetEventsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GetEventsResponse>(){}.getType();
    }
    
    if ("GetOrderDiscountLinesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GetOrderDiscountLinesResponse>(){}.getType();
    }
    
    if ("GetOrdersResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GetOrdersResponse>(){}.getType();
    }
    
    if ("GetPaymentMethodResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GetPaymentMethodResponse>(){}.getType();
    }
    
    if ("GetPlansResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GetPlansResponse>(){}.getType();
    }
    
    if ("GetTransactionsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GetTransactionsResponse>(){}.getType();
    }
    
    if ("GetTransfersResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GetTransfersResponse>(){}.getType();
    }
    
    if ("GetWebhookKeysResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GetWebhookKeysResponse>(){}.getType();
    }
    
    if ("GetWebhooksResponse".equalsIgnoreCase(className)) {
      return new TypeToken<GetWebhooksResponse>(){}.getType();
    }
    
    if ("LogResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LogResponse>(){}.getType();
    }
    
    if ("LogsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LogsResponse>(){}.getType();
    }
    
    if ("LogsResponseData".equalsIgnoreCase(className)) {
      return new TypeToken<LogsResponseData>(){}.getType();
    }
    
    if ("OrderCaptureRequest".equalsIgnoreCase(className)) {
      return new TypeToken<OrderCaptureRequest>(){}.getType();
    }
    
    if ("OrderCustomerInfoResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OrderCustomerInfoResponse>(){}.getType();
    }
    
    if ("OrderDiscountLinesRequest".equalsIgnoreCase(className)) {
      return new TypeToken<OrderDiscountLinesRequest>(){}.getType();
    }
    
    if ("OrderFiscalEntityAddressResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OrderFiscalEntityAddressResponse>(){}.getType();
    }
    
    if ("OrderFiscalEntityRequest".equalsIgnoreCase(className)) {
      return new TypeToken<OrderFiscalEntityRequest>(){}.getType();
    }
    
    if ("OrderFiscalEntityResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OrderFiscalEntityResponse>(){}.getType();
    }
    
    if ("OrderNextActionResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OrderNextActionResponse>(){}.getType();
    }
    
    if ("OrderNextActionResponseRedirectToUrl".equalsIgnoreCase(className)) {
      return new TypeToken<OrderNextActionResponseRedirectToUrl>(){}.getType();
    }
    
    if ("OrderRefundRequest".equalsIgnoreCase(className)) {
      return new TypeToken<OrderRefundRequest>(){}.getType();
    }
    
    if ("OrderRequest".equalsIgnoreCase(className)) {
      return new TypeToken<OrderRequest>(){}.getType();
    }
    
    if ("OrderRequestCustomerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<OrderRequestCustomerInfo>(){}.getType();
    }
    
    if ("OrderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OrderResponse>(){}.getType();
    }
    
    if ("OrderResponseCharges".equalsIgnoreCase(className)) {
      return new TypeToken<OrderResponseCharges>(){}.getType();
    }
    
    if ("OrderResponseCheckout".equalsIgnoreCase(className)) {
      return new TypeToken<OrderResponseCheckout>(){}.getType();
    }
    
    if ("OrderResponseCustomerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<OrderResponseCustomerInfo>(){}.getType();
    }
    
    if ("OrderResponseDiscountLines".equalsIgnoreCase(className)) {
      return new TypeToken<OrderResponseDiscountLines>(){}.getType();
    }
    
    if ("OrderResponseProducts".equalsIgnoreCase(className)) {
      return new TypeToken<OrderResponseProducts>(){}.getType();
    }
    
    if ("OrderResponseShippingContact".equalsIgnoreCase(className)) {
      return new TypeToken<OrderResponseShippingContact>(){}.getType();
    }
    
    if ("OrderTaxRequest".equalsIgnoreCase(className)) {
      return new TypeToken<OrderTaxRequest>(){}.getType();
    }
    
    if ("OrderUpdateFiscalEntityRequest".equalsIgnoreCase(className)) {
      return new TypeToken<OrderUpdateFiscalEntityRequest>(){}.getType();
    }
    
    if ("OrderUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<OrderUpdateRequest>(){}.getType();
    }
    
    if ("OrderUpdateRequestCustomerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<OrderUpdateRequestCustomerInfo>(){}.getType();
    }
    
    if ("OrdersResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OrdersResponse>(){}.getType();
    }
    
    if ("Page".equalsIgnoreCase(className)) {
      return new TypeToken<Page>(){}.getType();
    }
    
    if ("Pagination".equalsIgnoreCase(className)) {
      return new TypeToken<Pagination>(){}.getType();
    }
    
    if ("PaymentMethod".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentMethod>(){}.getType();
    }
    
    if ("PaymentMethodBankTransfer".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentMethodBankTransfer>(){}.getType();
    }
    
    if ("PaymentMethodCard".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentMethodCard>(){}.getType();
    }
    
    if ("PaymentMethodCardRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentMethodCardRequest>(){}.getType();
    }
    
    if ("PaymentMethodCardResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentMethodCardResponse>(){}.getType();
    }
    
    if ("PaymentMethodCash".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentMethodCash>(){}.getType();
    }
    
    if ("PaymentMethodCashRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentMethodCashRequest>(){}.getType();
    }
    
    if ("PaymentMethodCashResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentMethodCashResponse>(){}.getType();
    }
    
    if ("PaymentMethodGeneralRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentMethodGeneralRequest>(){}.getType();
    }
    
    if ("PaymentMethodResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentMethodResponse>(){}.getType();
    }
    
    if ("PaymentMethodSpeiRecurrent".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentMethodSpeiRecurrent>(){}.getType();
    }
    
    if ("PaymentMethodSpeiRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentMethodSpeiRequest>(){}.getType();
    }
    
    if ("PaymentMethodTokenRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentMethodTokenRequest>(){}.getType();
    }
    
    if ("Payout".equalsIgnoreCase(className)) {
      return new TypeToken<Payout>(){}.getType();
    }
    
    if ("PayoutMethod".equalsIgnoreCase(className)) {
      return new TypeToken<PayoutMethod>(){}.getType();
    }
    
    if ("PayoutOrder".equalsIgnoreCase(className)) {
      return new TypeToken<PayoutOrder>(){}.getType();
    }
    
    if ("PayoutOrderPayoutsItem".equalsIgnoreCase(className)) {
      return new TypeToken<PayoutOrderPayoutsItem>(){}.getType();
    }
    
    if ("PayoutOrderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PayoutOrderResponse>(){}.getType();
    }
    
    if ("PayoutOrderResponseCustomerInfo".equalsIgnoreCase(className)) {
      return new TypeToken<PayoutOrderResponseCustomerInfo>(){}.getType();
    }
    
    if ("PayoutOrdersResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PayoutOrdersResponse>(){}.getType();
    }
    
    if ("PlanRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PlanRequest>(){}.getType();
    }
    
    if ("PlanResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PlanResponse>(){}.getType();
    }
    
    if ("PlanUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<PlanUpdateRequest>(){}.getType();
    }
    
    if ("Product".equalsIgnoreCase(className)) {
      return new TypeToken<Product>(){}.getType();
    }
    
    if ("ProductDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProductDataResponse>(){}.getType();
    }
    
    if ("ProductOrderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ProductOrderResponse>(){}.getType();
    }
    
    if ("RiskRulesData".equalsIgnoreCase(className)) {
      return new TypeToken<RiskRulesData>(){}.getType();
    }
    
    if ("RiskRulesList".equalsIgnoreCase(className)) {
      return new TypeToken<RiskRulesList>(){}.getType();
    }
    
    if ("ShippingOrderResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ShippingOrderResponse>(){}.getType();
    }
    
    if ("ShippingRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ShippingRequest>(){}.getType();
    }
    
    if ("SmsCheckoutRequest".equalsIgnoreCase(className)) {
      return new TypeToken<SmsCheckoutRequest>(){}.getType();
    }
    
    if ("SubscriptionEventsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SubscriptionEventsResponse>(){}.getType();
    }
    
    if ("SubscriptionRequest".equalsIgnoreCase(className)) {
      return new TypeToken<SubscriptionRequest>(){}.getType();
    }
    
    if ("SubscriptionResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SubscriptionResponse>(){}.getType();
    }
    
    if ("SubscriptionUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<SubscriptionUpdateRequest>(){}.getType();
    }
    
    if ("Token".equalsIgnoreCase(className)) {
      return new TypeToken<Token>(){}.getType();
    }
    
    if ("TokenCard".equalsIgnoreCase(className)) {
      return new TypeToken<TokenCard>(){}.getType();
    }
    
    if ("TokenCheckout".equalsIgnoreCase(className)) {
      return new TypeToken<TokenCheckout>(){}.getType();
    }
    
    if ("TokenResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TokenResponse>(){}.getType();
    }
    
    if ("TokenResponseCheckout".equalsIgnoreCase(className)) {
      return new TypeToken<TokenResponseCheckout>(){}.getType();
    }
    
    if ("TransactionResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransactionResponse>(){}.getType();
    }
    
    if ("TransferDestinationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferDestinationResponse>(){}.getType();
    }
    
    if ("TransferMethodResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferMethodResponse>(){}.getType();
    }
    
    if ("TransferResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransferResponse>(){}.getType();
    }
    
    if ("TransfersResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TransfersResponse>(){}.getType();
    }
    
    if ("UpdateCustomer".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateCustomer>(){}.getType();
    }
    
    if ("UpdateCustomerAntifraudInfo".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateCustomerAntifraudInfo>(){}.getType();
    }
    
    if ("UpdateCustomerFiscalEntitiesResponse".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateCustomerFiscalEntitiesResponse>(){}.getType();
    }
    
    if ("UpdateCustomerPaymentMethodsResponse".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateCustomerPaymentMethodsResponse>(){}.getType();
    }
    
    if ("UpdateOrderDiscountLinesRequest".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateOrderDiscountLinesRequest>(){}.getType();
    }
    
    if ("UpdateOrderTaxRequest".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateOrderTaxRequest>(){}.getType();
    }
    
    if ("UpdateOrderTaxResponse".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateOrderTaxResponse>(){}.getType();
    }
    
    if ("UpdatePaymentMethods".equalsIgnoreCase(className)) {
      return new TypeToken<UpdatePaymentMethods>(){}.getType();
    }
    
    if ("UpdateProduct".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateProduct>(){}.getType();
    }
    
    if ("WebhookKeyCreateResponse".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookKeyCreateResponse>(){}.getType();
    }
    
    if ("WebhookKeyDeleteResponse".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookKeyDeleteResponse>(){}.getType();
    }
    
    if ("WebhookKeyRequest".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookKeyRequest>(){}.getType();
    }
    
    if ("WebhookKeyResponse".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookKeyResponse>(){}.getType();
    }
    
    if ("WebhookKeyUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookKeyUpdateRequest>(){}.getType();
    }
    
    if ("WebhookLog".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookLog>(){}.getType();
    }
    
    if ("WebhookRequest".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookRequest>(){}.getType();
    }
    
    if ("WebhookResponse".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookResponse>(){}.getType();
    }
    
    if ("WebhookUpdateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<WebhookUpdateRequest>(){}.getType();
    }
    
    if ("WhitelistlistRuleResponse".equalsIgnoreCase(className)) {
      return new TypeToken<WhitelistlistRuleResponse>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
