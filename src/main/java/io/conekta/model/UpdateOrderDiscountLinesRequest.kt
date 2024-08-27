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
 * @param amount 
 * @param code Discount code.
 * @param type 
 */


data class UpdateOrderDiscountLinesRequest (

    @SerializedName("amount")
    val amount: kotlin.Long? = null,

    /* Discount code. */
    @SerializedName("code")
    val code: kotlin.String? = null,

    @SerializedName("type")
    val type: kotlin.String? = null

)
