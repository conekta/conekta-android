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
 * 
 *
 * @param accountCreatedAt 
 * @param firstPaidAt 
 */


data class UpdateCustomerAntifraudInfo (

    @SerializedName("account_created_at")
    val accountCreatedAt: kotlin.Long? = null,

    @SerializedName("first_paid_at")
    val firstPaidAt: kotlin.Int? = null

)

