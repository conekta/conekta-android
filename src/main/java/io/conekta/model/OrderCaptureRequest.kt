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
 * @param amount Amount to capture
 */


data class OrderCaptureRequest (

    /* Amount to capture */
    @SerializedName("amount")
    val amount: kotlin.Long

)
