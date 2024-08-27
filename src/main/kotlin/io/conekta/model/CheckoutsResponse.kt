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

import io.conekta.model.CheckoutResponse

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param hasMore Indicates if there are more pages to be requested
 * @param `object` Object type, in this case is list
 * @param nextPageUrl URL of the next page.
 * @param previousPageUrl Url of the previous page.
 * @param `data` 
 */


data class CheckoutsResponse (

    /* Indicates if there are more pages to be requested */
    @SerializedName("has_more")
    val hasMore: kotlin.Boolean,

    /* Object type, in this case is list */
    @SerializedName("object")
    val `object`: kotlin.String,

    /* URL of the next page. */
    @SerializedName("next_page_url")
    val nextPageUrl: kotlin.String? = null,

    /* Url of the previous page. */
    @SerializedName("previous_page_url")
    val previousPageUrl: kotlin.String? = null,

    @SerializedName("data")
    val `data`: kotlin.collections.List<CheckoutResponse>? = null

)

