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
 * Company fiscal info address model
 *
 * @param `object` The resource's type
 * @param street1 Street Address
 * @param street2 Colonia
 * @param city City
 * @param state State
 * @param country Country
 * @param postalCode Postal code
 * @param externalNumber Street number
 * @param internalNumber Unit / apartment number
 */


data class CompanyFiscalInfoAddressResponse (

    /* The resource's type */
    @SerializedName("object")
    val `object`: CompanyFiscalInfoAddressResponse.`Object`? = null,

    /* Street Address */
    @SerializedName("street1")
    val street1: kotlin.String? = null,

    /* Colonia */
    @SerializedName("street2")
    val street2: kotlin.String? = null,

    /* City */
    @SerializedName("city")
    val city: kotlin.String? = null,

    /* State */
    @SerializedName("state")
    val state: kotlin.String? = null,

    /* Country */
    @SerializedName("country")
    val country: kotlin.String? = null,

    /* Postal code */
    @SerializedName("postal_code")
    val postalCode: kotlin.String? = null,

    /* Street number */
    @SerializedName("external_number")
    val externalNumber: kotlin.String? = null,

    /* Unit / apartment number */
    @SerializedName("internal_number")
    val internalNumber: kotlin.String? = null

) {

    /**
     * The resource's type
     *
     * Values: address
     */
    enum class `Object`(val value: kotlin.String) {
        @SerializedName(value = "address") address("address");
    }
}
