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

import io.conekta.model.PaymentMethodCardResponse
import io.conekta.model.PaymentMethodCashResponse
import io.conekta.model.PaymentMethodSpeiRecurrent

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param type 
 * @param id 
 * @param `object` 
 * @param createdAt 
 * @param parentId 
 * @param reference 
 * @param barcode 
 * @param barcodeUrl 
 * @param expiresAt 
 * @param provider 
 * @param last4 
 * @param bin 
 * @param cardType 
 * @param expMonth 
 * @param expYear 
 * @param brand 
 * @param name 
 * @param default 
 * @param visibleOnCheckout 
 * @param paymentSourceStatus 
 */


interface UpdateCustomerPaymentMethodsResponse {

    @get:SerializedName("type")
    val type: kotlin.String
    @get:SerializedName("id")
    val id: kotlin.String
    @get:SerializedName("object")
    val `object`: kotlin.String
    @get:SerializedName("created_at")
    val createdAt: kotlin.Long
    @get:SerializedName("parent_id")
    val parentId: kotlin.String?
    @get:SerializedName("reference")
    val reference: kotlin.String?
    @get:SerializedName("barcode")
    val barcode: kotlin.String?
    @get:SerializedName("barcode_url")
    val barcodeUrl: kotlin.String?
    @get:SerializedName("expires_at")
    val expiresAt: kotlin.String?
    @get:SerializedName("provider")
    val provider: kotlin.String?
    @get:SerializedName("last4")
    val last4: kotlin.String?
    @get:SerializedName("bin")
    val bin: kotlin.String?
    @get:SerializedName("card_type")
    val cardType: kotlin.String?
    @get:SerializedName("exp_month")
    val expMonth: kotlin.String?
    @get:SerializedName("exp_year")
    val expYear: kotlin.String?
    @get:SerializedName("brand")
    val brand: kotlin.String?
    @get:SerializedName("name")
    val name: kotlin.String?
    @get:SerializedName("default")
    val default: kotlin.Boolean?
    @get:SerializedName("visible_on_checkout")
    val visibleOnCheckout: kotlin.Boolean?
    @get:SerializedName("payment_source_status")
    val paymentSourceStatus: kotlin.String?
}
