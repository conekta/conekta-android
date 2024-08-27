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

import io.conekta.model.CompanyPayoutDestinationResponse

class CompanyPayoutDestinationResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CompanyPayoutDestinationResponse
        //val modelInstance = CompanyPayoutDestinationResponse()

        // to test the property ``object`` - The resource's type
        should("test `object`") {
            // uncomment below to test the property
            //modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `currency` - currency of the receiving account
        should("test currency") {
            // uncomment below to test the property
            //modelInstance.currency shouldBe ("TODO")
        }

        // to test the property `accountHolderName` - Name of the account holder
        should("test accountHolderName") {
            // uncomment below to test the property
            //modelInstance.accountHolderName shouldBe ("TODO")
        }

        // to test the property `bank` - Name of the bank
        should("test bank") {
            // uncomment below to test the property
            //modelInstance.bank shouldBe ("TODO")
        }

        // to test the property `type` - Type of the payout destination
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `accountNumber` - Account number of the receiving account
        should("test accountNumber") {
            // uncomment below to test the property
            //modelInstance.accountNumber shouldBe ("TODO")
        }

    }
}
