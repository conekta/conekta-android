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

import io.conekta.model.CustomerShippingContacts
import io.conekta.model.CustomerShippingContactsAddress

class CustomerShippingContactsTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomerShippingContacts
        //val modelInstance = CustomerShippingContacts()

        // to test the property `address`
        should("test address") {
            // uncomment below to test the property
            //modelInstance.address shouldBe ("TODO")
        }

        // to test the property `phone` - Phone contact
        should("test phone") {
            // uncomment below to test the property
            //modelInstance.phone shouldBe ("TODO")
        }

        // to test the property ``receiver`` - Name of the person who will receive the order
        should("test `receiver`") {
            // uncomment below to test the property
            //modelInstance.`receiver` shouldBe ("TODO")
        }

        // to test the property `betweenStreets` - The street names between which the order will be delivered.
        should("test betweenStreets") {
            // uncomment below to test the property
            //modelInstance.betweenStreets shouldBe ("TODO")
        }

        // to test the property `parentId`
        should("test parentId") {
            // uncomment below to test the property
            //modelInstance.parentId shouldBe ("TODO")
        }

        // to test the property `default`
        should("test default") {
            // uncomment below to test the property
            //modelInstance.default shouldBe ("TODO")
        }

        // to test the property `deleted`
        should("test deleted") {
            // uncomment below to test the property
            //modelInstance.deleted shouldBe ("TODO")
        }

        // to test the property `metadata` - Metadata associated with the shipping contact
        should("test metadata") {
            // uncomment below to test the property
            //modelInstance.metadata shouldBe ("TODO")
        }

    }
}
