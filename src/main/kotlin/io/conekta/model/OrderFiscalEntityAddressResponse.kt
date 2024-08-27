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
 * Address of the fiscal entity
 *
 * @param street1 Street name and number
 * @param postalCode Postal code
 * @param city City
 * @param country this field follows the [ISO 3166-1 alpha-2 standard](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
 * @param externalNumber External number
 * @param street2 Street name and number
 * @param state State
 * @param `object` 
 */


data class OrderFiscalEntityAddressResponse (

    /* Street name and number */
    @SerializedName("street1")
    val street1: kotlin.String,

    /* Postal code */
    @SerializedName("postal_code")
    val postalCode: kotlin.String,

    /* City */
    @SerializedName("city")
    val city: kotlin.String,

    /* this field follows the [ISO 3166-1 alpha-2 standard](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) */
    @SerializedName("country")
    val country: kotlin.String,

    /* External number */
    @SerializedName("external_number")
    val externalNumber: kotlin.String,

    /* Street name and number */
    @SerializedName("street2")
    val street2: kotlin.String? = null,

    /* State */
    @SerializedName("state")
    val state: kotlin.String? = null,

    @SerializedName("object")
    val `object`: kotlin.String? = null

)

