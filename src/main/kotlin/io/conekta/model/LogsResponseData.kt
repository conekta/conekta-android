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
 * @param createdAt 
 * @param id 
 * @param ipAddress 
 * @param livemode 
 * @param loggableId 
 * @param loggableType 
 * @param method 
 * @param oauthTokenId 
 * @param queryString 
 * @param related 
 * @param requestBody 
 * @param requestHeaders 
 * @param responseBody 
 * @param responseHeaders 
 * @param searchableTags 
 * @param status 
 * @param updatedAt 
 * @param url 
 * @param userAccountId 
 * @param version 
 */


data class LogsResponseData (

    @SerializedName("created_at")
    val createdAt: kotlin.Long? = null,

    @SerializedName("id")
    val id: kotlin.String? = null,

    @SerializedName("ip_address")
    val ipAddress: kotlin.String? = null,

    @SerializedName("livemode")
    val livemode: kotlin.Boolean? = null,

    @SerializedName("loggable_id")
    val loggableId: kotlin.String? = null,

    @SerializedName("loggable_type")
    val loggableType: kotlin.String? = null,

    @SerializedName("method")
    val method: kotlin.String? = null,

    @SerializedName("oauth_token_id")
    val oauthTokenId: kotlin.String? = null,

    @SerializedName("query_string")
    val queryString: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @SerializedName("related")
    val related: kotlin.String? = null,

    @SerializedName("request_body")
    val requestBody: kotlin.Any? = null,

    @SerializedName("request_headers")
    val requestHeaders: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @SerializedName("response_body")
    val responseBody: kotlin.Any? = null,

    @SerializedName("response_headers")
    val responseHeaders: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @SerializedName("searchable_tags")
    val searchableTags: kotlin.collections.List<kotlin.String>? = null,

    @SerializedName("status")
    val status: kotlin.String? = null,

    @SerializedName("updated_at")
    val updatedAt: kotlin.String? = null,

    @SerializedName("url")
    val url: kotlin.String? = null,

    @SerializedName("user_account_id")
    val userAccountId: kotlin.String? = null,

    @SerializedName("version")
    val version: kotlin.String? = null

)

