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

import io.conekta.model.PaymentMethodCashRequest
import io.conekta.model.PaymentMethodSpeiRequest
import io.conekta.model.PaymentMethodTokenRequest

import com.google.gson.annotations.SerializedName

/**
 * Contains details of the payment methods that the customer has active or has used in Conekta
 *
 * @param type Type of payment method
 * @param tokenId Token id that will be used to create a \"card\" type payment method. See the (subscriptions)[https://developers.conekta.com/v2.1.0/reference/createsubscription] tutorial for more information on how to tokenize cards.
 * @param expiresAt 
 */


data class CreateCustomerPaymentMethodsRequest (

    /* Type of payment method */
    @SerializedName("type")
    val type: kotlin.String,

    /* Token id that will be used to create a \"card\" type payment method. See the (subscriptions)[https://developers.conekta.com/v2.1.0/reference/createsubscription] tutorial for more information on how to tokenize cards. */
    @SerializedName("token_id")
    val tokenId: kotlin.String,

    @SerializedName("expires_at")
    val expiresAt: kotlin.Long? = null

)

