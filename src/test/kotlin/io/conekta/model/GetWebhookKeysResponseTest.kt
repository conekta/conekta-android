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

import io.conekta.model.GetWebhookKeysResponse
import io.conekta.model.WebhookKeyResponse

class GetWebhookKeysResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GetWebhookKeysResponse
        //val modelInstance = GetWebhookKeysResponse()

        // to test the property `hasMore` - Indicates if there are more pages to be requested
        should("test hasMore") {
            // uncomment below to test the property
            //modelInstance.hasMore shouldBe ("TODO")
        }

        // to test the property ``object`` - Object type, in this case is list
        should("test `object`") {
            // uncomment below to test the property
            //modelInstance.`object` shouldBe ("TODO")
        }

        // to test the property `nextPageUrl` - URL of the next page.
        should("test nextPageUrl") {
            // uncomment below to test the property
            //modelInstance.nextPageUrl shouldBe ("TODO")
        }

        // to test the property `previousPageUrl` - Url of the previous page.
        should("test previousPageUrl") {
            // uncomment below to test the property
            //modelInstance.previousPageUrl shouldBe ("TODO")
        }

        // to test the property ``data``
        should("test `data`") {
            // uncomment below to test the property
            //modelInstance.`data` shouldBe ("TODO")
        }

    }
}
