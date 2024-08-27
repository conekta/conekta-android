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

import io.conekta.model.WebhookLog

import com.google.gson.annotations.SerializedName

/**
 * event model
 *
 * @param createdAt 
 * @param `data` 
 * @param id 
 * @param livemode 
 * @param `object` 
 * @param type 
 * @param webhookLogs 
 * @param webhookStatus 
 */


data class EventResponse (

    @SerializedName("created_at")
    val createdAt: kotlin.Long? = null,

    @SerializedName("data")
    val `data`: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @SerializedName("id")
    val id: kotlin.String? = null,

    @SerializedName("livemode")
    val livemode: kotlin.Boolean? = null,

    @SerializedName("object")
    val `object`: kotlin.String? = null,

    @SerializedName("type")
    val type: kotlin.String? = null,

    @SerializedName("webhook_logs")
    val webhookLogs: kotlin.collections.List<WebhookLog>? = null,

    @SerializedName("webhook_status")
    val webhookStatus: kotlin.String? = null

)
