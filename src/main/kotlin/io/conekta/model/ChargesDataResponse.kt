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

import io.conekta.model.ChargeResponseChannel
import io.conekta.model.ChargeResponsePaymentMethod
import io.conekta.model.ChargeResponseRefunds

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param amount 
 * @param channel 
 * @param createdAt 
 * @param currency 
 * @param customerId 
 * @param description 
 * @param deviceFingerprint 
 * @param failureCode 
 * @param failureMessage 
 * @param id Charge ID
 * @param livemode Whether the charge was made in live mode or not
 * @param `object` 
 * @param orderId Order ID
 * @param paidAt Payment date
 * @param paymentMethod 
 * @param referenceId Reference ID of the charge
 * @param refunds 
 * @param status 
 */


data class ChargesDataResponse (

    @SerializedName("amount")
    val amount: kotlin.Int? = null,

    @SerializedName("channel")
    val channel: ChargeResponseChannel? = null,

    @SerializedName("created_at")
    val createdAt: kotlin.Long? = null,

    @SerializedName("currency")
    val currency: kotlin.String? = null,

    @SerializedName("customer_id")
    val customerId: kotlin.String? = null,

    @SerializedName("description")
    val description: kotlin.String? = null,

    @SerializedName("device_fingerprint")
    val deviceFingerprint: kotlin.String? = null,

    @SerializedName("failure_code")
    val failureCode: kotlin.String? = null,

    @SerializedName("failure_message")
    val failureMessage: kotlin.String? = null,

    /* Charge ID */
    @SerializedName("id")
    val id: kotlin.String? = null,

    /* Whether the charge was made in live mode or not */
    @SerializedName("livemode")
    val livemode: kotlin.Boolean? = null,

    @SerializedName("object")
    val `object`: kotlin.String? = null,

    /* Order ID */
    @SerializedName("order_id")
    val orderId: kotlin.String? = null,

    /* Payment date */
    @SerializedName("paid_at")
    val paidAt: kotlin.Long? = null,

    @SerializedName("payment_method")
    val paymentMethod: ChargeResponsePaymentMethod? = null,

    /* Reference ID of the charge */
    @SerializedName("reference_id")
    val referenceId: kotlin.String? = null,

    @SerializedName("refunds")
    val refunds: ChargeResponseRefunds? = null,

    @SerializedName("status")
    val status: kotlin.String? = null

)

