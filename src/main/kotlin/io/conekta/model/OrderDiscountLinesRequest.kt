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


import com.google.gson.annotations.SerializedName

/**
 * List of discounts that apply to the order.
 *
 * @param amount The amount to be deducted from the total sum of all payments, in cents.
 * @param code Discount code.
 * @param type It can be 'loyalty', 'campaign', 'coupon' o 'sign'
 */


data class OrderDiscountLinesRequest (

    /* The amount to be deducted from the total sum of all payments, in cents. */
    @SerializedName("amount")
    val amount: kotlin.Long,

    /* Discount code. */
    @SerializedName("code")
    val code: kotlin.String,

    /* It can be 'loyalty', 'campaign', 'coupon' o 'sign' */
    @SerializedName("type")
    val type: kotlin.String

)
