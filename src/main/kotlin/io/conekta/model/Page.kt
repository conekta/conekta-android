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
 * page metadata
 *
 * @param nextPageUrl URL of the next page.
 * @param previousPageUrl Url of the previous page.
 */


data class Page (

    /* URL of the next page. */
    @SerializedName("next_page_url")
    val nextPageUrl: kotlin.String? = null,

    /* Url of the previous page. */
    @SerializedName("previous_page_url")
    val previousPageUrl: kotlin.String? = null

)

