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
 * @param active Indicates if the webhook key is active
 * @param description A name or brief explanation of what this api key is used for
 */


data class ApiKeyUpdateRequest (

    /* Indicates if the webhook key is active */
    @SerializedName("active")
    val active: kotlin.Boolean? = null,

    /* A name or brief explanation of what this api key is used for */
    @SerializedName("description")
    val description: kotlin.String? = null

)

