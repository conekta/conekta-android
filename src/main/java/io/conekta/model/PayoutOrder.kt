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

import io.conekta.model.CustomerInfoJustCustomerId
import io.conekta.model.Payout

import com.google.gson.annotations.SerializedName

/**
 * a payout order
 *
 * @param allowedPayoutMethods The payout methods that are allowed for the payout order.
 * @param amount The amount of the payout order.
 * @param currency The currency in which the payout order is made.
 * @param customerInfo 
 * @param payout 
 * @param reason The reason for the payout order.
 * @param metadata The metadata of the payout order.
 */


data class PayoutOrder (

    /* The payout methods that are allowed for the payout order. */
    @SerializedName("allowed_payout_methods")
    val allowedPayoutMethods: kotlin.collections.List<kotlin.String>,

    /* The amount of the payout order. */
    @SerializedName("amount")
    val amount: kotlin.Int,

    /* The currency in which the payout order is made. */
    @SerializedName("currency")
    val currency: kotlin.String = "MXN",

    @SerializedName("customer_info")
    val customerInfo: CustomerInfoJustCustomerId,

    @SerializedName("payout")
    val payout: Payout,

    /* The reason for the payout order. */
    @SerializedName("reason")
    val reason: kotlin.String,

    /* The metadata of the payout order. */
    @SerializedName("metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

)
