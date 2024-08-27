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

import io.conekta.model.TokenCard
import io.conekta.model.TokenCheckout

import com.google.gson.annotations.SerializedName

/**
 * a token
 *
 * @param card 
 * @param checkout 
 */


data class Token (

    @SerializedName("card")
    val card: TokenCard? = null,

    @SerializedName("checkout")
    @Deprecated(message = "This property is deprecated.")
    val checkout: TokenCheckout? = null

)
