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

import io.conekta.model.ChargeRequestPaymentMethod
import io.conekta.model.PaymentMethodCardRequest
import io.conekta.model.PaymentMethodGeneralRequest

class ChargeRequestPaymentMethodTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ChargeRequestPaymentMethod
        //val modelInstance = ChargeRequestPaymentMethod()

        // to test the property `type` - Type of payment method
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `cvc` - Card security code
        should("test cvc") {
            // uncomment below to test the property
            //modelInstance.cvc shouldBe ("TODO")
        }

        // to test the property `expMonth` - Card expiration month
        should("test expMonth") {
            // uncomment below to test the property
            //modelInstance.expMonth shouldBe ("TODO")
        }

        // to test the property `expYear` - Card expiration year
        should("test expYear") {
            // uncomment below to test the property
            //modelInstance.expYear shouldBe ("TODO")
        }

        // to test the property `name` - Cardholder name
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `number` - Card number
        should("test number") {
            // uncomment below to test the property
            //modelInstance.number shouldBe ("TODO")
        }

        // to test the property `expiresAt` - Method expiration date as unix timestamp
        should("test expiresAt") {
            // uncomment below to test the property
            //modelInstance.expiresAt shouldBe ("TODO")
        }

        // to test the property `monthlyInstallments` - How many months without interest to apply, it can be 3, 6, 9, 12 or 18
        should("test monthlyInstallments") {
            // uncomment below to test the property
            //modelInstance.monthlyInstallments shouldBe ("TODO")
        }

        // to test the property `tokenId`
        should("test tokenId") {
            // uncomment below to test the property
            //modelInstance.tokenId shouldBe ("TODO")
        }

        // to test the property `paymentSourceId`
        should("test paymentSourceId") {
            // uncomment below to test the property
            //modelInstance.paymentSourceId shouldBe ("TODO")
        }

        // to test the property `contractId` - Optional id sent to indicate the bank contract for recurrent card charges.
        should("test contractId") {
            // uncomment below to test the property
            //modelInstance.contractId shouldBe ("TODO")
        }

    }
}
