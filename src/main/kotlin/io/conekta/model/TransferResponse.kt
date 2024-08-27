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

import io.conekta.model.TransferDestinationResponse

import com.google.gson.annotations.SerializedName

/**
 * A transfer represents the action of sending an amount to a business bank account including the status, amount and method used to make the transfer.
 *
 * @param amount Amount in cents of the transfer.
 * @param createdAt Date and time of creation of the transfer in Unix format.
 * @param currency The currency of the transfer. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217)
 * @param id Unique identifier of the transfer.
 * @param livemode Indicates whether the transfer was created in live mode or test mode.
 * @param destination 
 * @param `object` Object name, which is transfer.
 * @param statementDescription Description of the transfer.
 * @param statementReference Reference number of the transfer.
 * @param status Code indicating transfer status.
 */


data class TransferResponse (

    /* Amount in cents of the transfer. */
    @SerializedName("amount")
    val amount: kotlin.Long? = null,

    /* Date and time of creation of the transfer in Unix format. */
    @SerializedName("created_at")
    val createdAt: kotlin.Long? = null,

    /* The currency of the transfer. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217) */
    @SerializedName("currency")
    val currency: kotlin.String? = null,

    /* Unique identifier of the transfer. */
    @SerializedName("id")
    val id: kotlin.String? = null,

    /* Indicates whether the transfer was created in live mode or test mode. */
    @SerializedName("livemode")
    val livemode: kotlin.Boolean? = null,

    @SerializedName("destination")
    val destination: TransferDestinationResponse? = null,

    /* Object name, which is transfer. */
    @SerializedName("object")
    val `object`: kotlin.String? = null,

    /* Description of the transfer. */
    @SerializedName("statement_description")
    val statementDescription: kotlin.String? = null,

    /* Reference number of the transfer. */
    @SerializedName("statement_reference")
    val statementReference: kotlin.String? = null,

    /* Code indicating transfer status. */
    @SerializedName("status")
    val status: kotlin.String? = null

)

