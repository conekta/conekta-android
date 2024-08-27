/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.conekta.model

import io.conekta.model.CustomerFiscalEntitiesRequest
import io.conekta.model.CustomerPaymentMethodsRequest
import io.conekta.model.CustomerShippingContacts
import io.conekta.model.SubscriptionRequest
import io.conekta.model.UpdateCustomerAntifraudInfo

import com.google.gson.annotations.SerializedName

/**
 * update customer
 *
 * @param antifraudInfo 
 * @param defaultPaymentSourceId It is a parameter that allows to identify in the response, the Conekta ID of a payment method (payment_id)
 * @param email An email address is a series of customizable characters followed by a universal Internet symbol, the at symbol (@), the name of a host server, and a web domain ending (.mx, .com, .org, . net, etc).
 * @param name Client's name
 * @param phone Is the customer's phone number
 * @param planId Contains the ID of a plan, which could together with name, email and phone create a client directly to a subscription
 * @param defaultShippingContactId It is a parameter that allows to identify in the response, the Conekta ID of the shipping address (shipping_contact)
 * @param corporate It is a value that allows identifying if the email is corporate or not.
 * @param customReference It is an undefined value.
 * @param fiscalEntities 
 * @param metadata 
 * @param paymentSources Contains details of the payment methods that the customer has active or has used in Conekta
 * @param shippingContacts Contains the detail of the shipping addresses that the client has active or has used in Conekta
 * @param subscription 
 */


data class UpdateCustomer (

    @SerializedName("antifraud_info")
    val antifraudInfo: UpdateCustomerAntifraudInfo? = null,

    /* It is a parameter that allows to identify in the response, the Conekta ID of a payment method (payment_id) */
    @SerializedName("default_payment_source_id")
    val defaultPaymentSourceId: kotlin.String? = null,

    /* An email address is a series of customizable characters followed by a universal Internet symbol, the at symbol (@), the name of a host server, and a web domain ending (.mx, .com, .org, . net, etc). */
    @SerializedName("email")
    val email: kotlin.String? = null,

    /* Client's name */
    @SerializedName("name")
    val name: kotlin.String? = null,

    /* Is the customer's phone number */
    @SerializedName("phone")
    val phone: kotlin.String? = null,

    /* Contains the ID of a plan, which could together with name, email and phone create a client directly to a subscription */
    @SerializedName("plan_id")
    val planId: kotlin.String? = null,

    /* It is a parameter that allows to identify in the response, the Conekta ID of the shipping address (shipping_contact) */
    @SerializedName("default_shipping_contact_id")
    val defaultShippingContactId: kotlin.String? = null,

    /* It is a value that allows identifying if the email is corporate or not. */
    @SerializedName("corporate")
    val corporate: kotlin.Boolean? = false,

    /* It is an undefined value. */
    @SerializedName("custom_reference")
    val customReference: kotlin.String? = null,

    @SerializedName("fiscal_entities")
    val fiscalEntities: kotlin.collections.List<CustomerFiscalEntitiesRequest>? = null,

    @SerializedName("metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    /* Contains details of the payment methods that the customer has active or has used in Conekta */
    @SerializedName("payment_sources")
    val paymentSources: kotlin.collections.List<CustomerPaymentMethodsRequest>? = null,

    /* Contains the detail of the shipping addresses that the client has active or has used in Conekta */
    @SerializedName("shipping_contacts")
    val shippingContacts: kotlin.collections.List<CustomerShippingContacts>? = null,

    @SerializedName("subscription")
    val subscription: SubscriptionRequest? = null

)
