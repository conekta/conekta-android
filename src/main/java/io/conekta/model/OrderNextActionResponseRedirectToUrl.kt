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
 * contains the following attributes that will guide to continue the flow
 *
 * @param url pay.conekta.com/{id} Indicates the url of the Conekta component to authenticate the flow through 3DS2.
 * @param returnUrl Indicates the url to which the 3DS2 flow returns at the end, when the integration is redirected.
 */


data class OrderNextActionResponseRedirectToUrl (

    /* pay.conekta.com/{id} Indicates the url of the Conekta component to authenticate the flow through 3DS2. */
    @SerializedName("url")
    val url: java.net.URI? = null,

    /* Indicates the url to which the 3DS2 flow returns at the end, when the integration is redirected. */
    @SerializedName("return_url")
    val returnUrl: java.net.URI? = null

)
