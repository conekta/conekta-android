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

import io.conekta.model.PayoutOrderPayoutsItem
import io.conekta.model.PayoutOrderResponseCustomerInfo

import com.google.gson.annotations.SerializedName

/**
 * payout order model response
 *
 * @param allowedPayoutMethods The payout methods that are allowed for the payout order.
 * @param amount The amount of the payout order.
 * @param createdAt The creation date of the payout order.
 * @param currency The currency in which the payout order is made.
 * @param customerInfo 
 * @param id The id of the payout order.
 * @param livemode The live mode of the payout order.
 * @param `object` The object of the payout order.
 * @param payouts The payout information of the payout order.
 * @param reason The reason for the payout order.
 * @param updatedAt The update date of the payout order.
 * @param expiresAt The expiration date of the payout order.
 * @param metadata The metadata of the payout order.
 * @param status The status of the payout order.
 */


data class PayoutOrderResponse (

    /* The payout methods that are allowed for the payout order. */
    @SerializedName("allowed_payout_methods")
    val allowedPayoutMethods: kotlin.collections.List<kotlin.String>,

    /* The amount of the payout order. */
    @SerializedName("amount")
    val amount: kotlin.Int,

    /* The creation date of the payout order. */
    @SerializedName("created_at")
    val createdAt: kotlin.Long,

    /* The currency in which the payout order is made. */
    @SerializedName("currency")
    val currency: kotlin.String = "MXN",

    @SerializedName("customer_info")
    val customerInfo: PayoutOrderResponseCustomerInfo,

    /* The id of the payout order. */
    @SerializedName("id")
    val id: kotlin.String,

    /* The live mode of the payout order. */
    @SerializedName("livemode")
    val livemode: kotlin.Boolean,

    /* The object of the payout order. */
    @SerializedName("object")
    val `object`: kotlin.String,

    /* The payout information of the payout order. */
    @SerializedName("payouts")
    val payouts: kotlin.collections.List<PayoutOrderPayoutsItem>,

    /* The reason for the payout order. */
    @SerializedName("reason")
    val reason: kotlin.String,

    /* The update date of the payout order. */
    @SerializedName("updated_at")
    val updatedAt: kotlin.Long,

    /* The expiration date of the payout order. */
    @SerializedName("expires_at")
    val expiresAt: kotlin.Long? = null,

    /* The metadata of the payout order. */
    @SerializedName("metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    /* The status of the payout order. */
    @SerializedName("status")
    val status: kotlin.String? = null

)
