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

import io.conekta.model.PaymentMethodBankTransfer
import io.conekta.model.PaymentMethodCard
import io.conekta.model.PaymentMethodCash

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param `object` 
 * @param type 
 * @param authCode 
 * @param cashierId 
 * @param reference 
 * @param barcodeUrl 
 * @param expiresAt 
 * @param serviceName 
 * @param store 
 * @param storeName 
 * @param accountType Account type of the card
 * @param brand Brand of the card
 * @param contractId Id sent for recurrent charges.
 * @param country Country of the card
 * @param expMonth Expiration month of the card
 * @param expYear Expiration year of the card
 * @param fraudIndicators 
 * @param issuer Issuer of the card
 * @param last4 Last 4 digits of the card
 * @param name Name of the cardholder
 * @param bank 
 * @param clabe 
 * @param description 
 * @param executedAt 
 * @param issuingAccountBank 
 * @param issuingAccountNumber 
 * @param issuingAccountHolderName 
 * @param issuingAccountTaxId 
 * @param paymentAttempts 
 * @param receivingAccountHolderName 
 * @param receivingAccountNumber 
 * @param receivingAccountBank 
 * @param receivingAccountTaxId 
 * @param referenceNumber 
 * @param trackingCode 
 */


interface ChargeResponsePaymentMethod {

    @get:SerializedName("object")
    val `object`: kotlin.String
    @get:SerializedName("type")
    val type: kotlin.String?
    @get:SerializedName("auth_code")
    val authCode: kotlin.String?
    @get:SerializedName("cashier_id")
    val cashierId: kotlin.String?
    @get:SerializedName("reference")
    val reference: kotlin.String?
    @get:SerializedName("barcode_url")
    val barcodeUrl: kotlin.String?
    @get:SerializedName("expires_at")
    val expiresAt: kotlin.Long?
    @get:SerializedName("service_name")
    val serviceName: kotlin.String?
    @get:SerializedName("store")
    val store: kotlin.String?
    @get:SerializedName("store_name")
    val storeName: kotlin.String?
    /* Account type of the card */
    @get:SerializedName("account_type")
    val accountType: kotlin.String?
    /* Brand of the card */
    @get:SerializedName("brand")
    val brand: kotlin.String?
    /* Id sent for recurrent charges. */
    @get:SerializedName("contract_id")
    val contractId: kotlin.String?
    /* Country of the card */
    @get:SerializedName("country")
    val country: kotlin.String?
    /* Expiration month of the card */
    @get:SerializedName("exp_month")
    val expMonth: kotlin.String?
    /* Expiration year of the card */
    @get:SerializedName("exp_year")
    val expYear: kotlin.String?
    @get:SerializedName("fraud_indicators")
    val fraudIndicators: kotlin.collections.List<kotlin.Any>?
    /* Issuer of the card */
    @get:SerializedName("issuer")
    val issuer: kotlin.String?
    /* Last 4 digits of the card */
    @get:SerializedName("last4")
    val last4: kotlin.String?
    /* Name of the cardholder */
    @get:SerializedName("name")
    val name: kotlin.String?
    @get:SerializedName("bank")
    val bank: kotlin.String?
    @get:SerializedName("clabe")
    val clabe: kotlin.String?
    @get:SerializedName("description")
    val description: kotlin.String?
    @get:SerializedName("executed_at")
    val executedAt: kotlin.Int?
    @get:SerializedName("issuing_account_bank")
    val issuingAccountBank: kotlin.String?
    @get:SerializedName("issuing_account_number")
    val issuingAccountNumber: kotlin.String?
    @get:SerializedName("issuing_account_holder_name")
    val issuingAccountHolderName: kotlin.String?
    @get:SerializedName("issuing_account_tax_id")
    val issuingAccountTaxId: kotlin.String?
    @get:SerializedName("payment_attempts")
    val paymentAttempts: kotlin.collections.List<kotlin.Any>?
    @get:SerializedName("receiving_account_holder_name")
    val receivingAccountHolderName: kotlin.String?
    @get:SerializedName("receiving_account_number")
    val receivingAccountNumber: kotlin.String?
    @get:SerializedName("receiving_account_bank")
    val receivingAccountBank: kotlin.String?
    @get:SerializedName("receiving_account_tax_id")
    val receivingAccountTaxId: kotlin.String?
    @get:SerializedName("reference_number")
    val referenceNumber: kotlin.String?
    @get:SerializedName("tracking_code")
    val trackingCode: kotlin.String?
}

