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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import io.conekta.model.OrderDiscountLinesRequest

class OrderDiscountLinesRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of OrderDiscountLinesRequest
        //val modelInstance = OrderDiscountLinesRequest()

        // to test the property `amount` - The amount to be deducted from the total sum of all payments, in cents.
        should("test amount") {
            // uncomment below to test the property
            //modelInstance.amount shouldBe ("TODO")
        }

        // to test the property `code` - Discount code.
        should("test code") {
            // uncomment below to test the property
            //modelInstance.code shouldBe ("TODO")
        }

        // to test the property `type` - It can be 'loyalty', 'campaign', 'coupon' o 'sign'
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

    }
}
