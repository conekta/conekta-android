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
 * requested field for update a charge
 *
 * @param referenceId custom reference id
 */


data class ChargeUpdateRequest (

    /* custom reference id */
    @SerializedName("reference_id")
    val referenceId: kotlin.String? = null

)

