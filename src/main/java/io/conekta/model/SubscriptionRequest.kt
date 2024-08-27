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
 * It is a parameter that allows to identify in the response, the detailed content of the plans to which the client has subscribed
 *
 * @param planId 
 * @param cardId 
 * @param trialEnd 
 */


data class SubscriptionRequest (

    @SerializedName("plan_id")
    val planId: kotlin.String,

    @SerializedName("card_id")
    val cardId: kotlin.String? = null,

    @SerializedName("trial_end")
    val trialEnd: kotlin.Int? = null

)
