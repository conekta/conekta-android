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

package io.conekta

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import io.conekta.EventsApi
import io.conekta.model.Error
import io.conekta.model.EventResponse
import io.conekta.model.EventsResendResponse
import io.conekta.model.GetEventsResponse

class EventsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EventsApi
        //val apiInstance = EventsApi()

        // to test getEvent
        should("test getEvent") {
            // uncomment below to test getEvent
            //val id : kotlin.String = 6307a60c41de27127515a575 // kotlin.String | Identifier of the resource
            //val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
            //val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
            //val result : EventResponse = apiInstance.getEvent(id, acceptLanguage, xChildCompanyId)
            //result shouldBe ("TODO")
        }

        // to test getEvents
        should("test getEvents") {
            // uncomment below to test getEvents
            //val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
            //val xChildCompanyId : kotlin.String = 6441b6376b60c3a638da80af // kotlin.String | In the case of a holding company, the company id of the child company to which will process the request.
            //val limit : kotlin.Int = 56 // kotlin.Int | The numbers of items to return, the maximum value is 250
            //val search : kotlin.String = search_example // kotlin.String | General order search, e.g. by mail, reference etc.
            //val next : kotlin.String = next_example // kotlin.String | next page
            //val previous : kotlin.String = previous_example // kotlin.String | previous page
            //val result : GetEventsResponse = apiInstance.getEvents(acceptLanguage, xChildCompanyId, limit, search, next, previous)
            //result shouldBe ("TODO")
        }

        // to test resendEvent
        should("test resendEvent") {
            // uncomment below to test resendEvent
            //val eventId : kotlin.String = 6463d6e35a4c3e001819e760 // kotlin.String | event identifier
            //val webhookLogId : kotlin.String = webhl_2tsv6NzWJHBWCkqGt // kotlin.String | webhook log identifier
            //val acceptLanguage : kotlin.String = es // kotlin.String | Use for knowing which language to use
            //val result : EventsResendResponse = apiInstance.resendEvent(eventId, webhookLogId, acceptLanguage)
            //result shouldBe ("TODO")
        }

    }
}
