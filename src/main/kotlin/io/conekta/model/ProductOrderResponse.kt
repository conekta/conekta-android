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
 * 
 *
 * @param name The name of the item. It will be displayed in the order.
 * @param quantity The quantity of the item in the order.
 * @param unitPrice The price of the item in cents.
 * @param antifraudInfo 
 * @param brand The brand of the item.
 * @param description Short description of the item
 * @param metadata It is a key/value hash that can hold custom fields. Maximum 100 elements and allows special characters.
 * @param sku The stock keeping unit for the item. It is used to identify the item in the order.
 * @param tags List of tags for the item. It is used to identify the item in the order.
 * @param id 
 * @param `object` 
 * @param parentId 
 */


data class ProductOrderResponse (

    /* The name of the item. It will be displayed in the order. */
    @SerializedName("name")
    val name: kotlin.String,

    /* The quantity of the item in the order. */
    @SerializedName("quantity")
    val quantity: kotlin.Int,

    /* The price of the item in cents. */
    @SerializedName("unit_price")
    val unitPrice: kotlin.Int,

    @SerializedName("antifraud_info")
    val antifraudInfo: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    /* The brand of the item. */
    @SerializedName("brand")
    val brand: kotlin.String? = null,

    /* Short description of the item */
    @SerializedName("description")
    val description: kotlin.String? = null,

    /* It is a key/value hash that can hold custom fields. Maximum 100 elements and allows special characters. */
    @SerializedName("metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    /* The stock keeping unit for the item. It is used to identify the item in the order. */
    @SerializedName("sku")
    val sku: kotlin.String? = null,

    /* List of tags for the item. It is used to identify the item in the order. */
    @SerializedName("tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    @SerializedName("id")
    val id: kotlin.String? = null,

    @SerializedName("object")
    val `object`: kotlin.String? = null,

    @SerializedName("parent_id")
    val parentId: kotlin.String? = null

)

