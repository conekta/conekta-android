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

import io.conekta.model.CustomerFiscalEntitiesDataResponse

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param hasMore Indicates if there are more pages to be requested
 * @param `object` Object type, in this case is list
 * @param `data` 
 */


data class CustomerFiscalEntitiesResponse (

    /* Indicates if there are more pages to be requested */
    @SerializedName("has_more")
    val hasMore: kotlin.Boolean,

    /* Object type, in this case is list */
    @SerializedName("object")
    val `object`: kotlin.String,

    @SerializedName("data")
    val `data`: kotlin.collections.List<CustomerFiscalEntitiesDataResponse>? = null

)

