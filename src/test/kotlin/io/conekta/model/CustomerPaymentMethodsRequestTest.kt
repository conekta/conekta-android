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

import io.conekta.model.CustomerPaymentMethodsRequest
import io.conekta.model.PaymentMethodCashRequest
import io.conekta.model.PaymentMethodSpeiRequest
import io.conekta.model.PaymentMethodTokenRequest

class CustomerPaymentMethodsRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomerPaymentMethodsRequest
        //val modelInstance = CustomerPaymentMethodsRequest()

        // to test the property `type` - Type of payment method
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `tokenId` - Token id that will be used to create a \"card\" type payment method. See the (subscriptions)[https://developers.conekta.com/v2.1.0/reference/createsubscription] tutorial for more information on how to tokenize cards.
        should("test tokenId") {
            // uncomment below to test the property
            //modelInstance.tokenId shouldBe ("TODO")
        }

        // to test the property `expiresAt`
        should("test expiresAt") {
            // uncomment below to test the property
            //modelInstance.expiresAt shouldBe ("TODO")
        }

    }
}
