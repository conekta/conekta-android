package io.conekta

import android.content.Context
import com.android.volley.DefaultRetryPolicy
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.BaseHttpStack
import com.android.volley.toolbox.Volley
import java.util.*
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine
import com.google.gson.reflect.TypeToken

import org.openapitools.client.request.IRequestFactory
import org.openapitools.client.request.RequestFactory
import org.openapitools.client.infrastructure.CollectionFormats.*

import io.conekta.model.Error
import io.conekta.model.SubscriptionEventsResponse
import io.conekta.model.SubscriptionRequest
import io.conekta.model.SubscriptionResponse
import io.conekta.model.SubscriptionUpdateRequest

/*
* If you wish to use a custom http stack with your client you
* can pass that to the request queue like:
* Volley.newRequestQueue(context.applicationContext, myCustomHttpStack)
*/
class SubscriptionsApi (
    private val context: Context,
    private val requestQueue: Lazy<RequestQueue> = lazy(initializer = {
        Volley.newRequestQueue(context.applicationContext)
    }),
    private val requestFactory: IRequestFactory = RequestFactory(),
    private val basePath: String = "https://api.conekta.io",
    private val postProcessors :List <(Request<*>) -> Unit> = listOf()) {

    /**
     * Cancel Subscription
     * You can cancel the subscription to stop the plans that your customers consume
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return SubscriptionResponse
     */
    suspend fun cancelSubscription(id: kotlin.String, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): SubscriptionResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}/subscription/cancel".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

        val formParams = mapOf<String, String>()


        // TODO: Cater for allowing empty values
        // TODO, if its apikey auth, then add the header names here and the hardcoded auth key
        // Only support hard coded apikey in query param auth for when we do this first path
        val queryParams = mapOf<String, String>()
            .filter { it.value.isNotEmpty() }

        val headerParams: Map<String, String> = mapOf(
            "Accept-Language" to IRequestFactory.parameterToString(acceptLanguage),
            "X-Child-Company-Id" to IRequestFactory.parameterToString(xChildCompanyId)
        )

        return suspendCoroutine { continuation ->
            val responseListener = Response.Listener<SubscriptionResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<SubscriptionResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<SubscriptionResponse> = requestFactory.build(
                    Request.Method.POST,
                    "$basePath$path",
                    body,
                    headerParams,
                    queryParams,
                    formParams,
                    contentType,
                    responseType,
                    responseListener,
                    errorListener)

            postProcessors.forEach { it.invoke(request) }

            requestQueue.value.add(request)
        }
    }
    /**
     * Create Subscription
     * You can create the subscription to include the plans that your customers consume
     * @param id Identifier of the resource
     * @param subscriptionRequest requested field for subscriptions
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return SubscriptionResponse
     */
    suspend fun createSubscription(id: kotlin.String, subscriptionRequest: SubscriptionRequest, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): SubscriptionResponse? {
        val body: Any? = subscriptionRequest

        val contentTypes : Array<String> = arrayOf("application/json")
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}/subscription".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

        val formParams = mapOf<String, String>()


        // TODO: Cater for allowing empty values
        // TODO, if its apikey auth, then add the header names here and the hardcoded auth key
        // Only support hard coded apikey in query param auth for when we do this first path
        val queryParams = mapOf<String, String>()
            .filter { it.value.isNotEmpty() }

        val headerParams: Map<String, String> = mapOf(
            "Accept-Language" to IRequestFactory.parameterToString(acceptLanguage),
            "X-Child-Company-Id" to IRequestFactory.parameterToString(xChildCompanyId)
        )

        return suspendCoroutine { continuation ->
            val responseListener = Response.Listener<SubscriptionResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<SubscriptionResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<SubscriptionResponse> = requestFactory.build(
                    Request.Method.POST,
                    "$basePath$path",
                    body,
                    headerParams,
                    queryParams,
                    formParams,
                    contentType,
                    responseType,
                    responseListener,
                    errorListener)

            postProcessors.forEach { it.invoke(request) }

            requestQueue.value.add(request)
        }
    }
    /**
     * Get Events By Subscription
     * You can get the events of the subscription(s) of a client, with the customer id
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return SubscriptionEventsResponse
     */
    suspend fun getAllEventsFromSubscription(id: kotlin.String, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): SubscriptionEventsResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}/subscription/events".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

        val formParams = mapOf<String, String>()


        // TODO: Cater for allowing empty values
        // TODO, if its apikey auth, then add the header names here and the hardcoded auth key
        // Only support hard coded apikey in query param auth for when we do this first path
        val queryParams = mapOf<String, String>()
            .filter { it.value.isNotEmpty() }

        val headerParams: Map<String, String> = mapOf(
            "Accept-Language" to IRequestFactory.parameterToString(acceptLanguage),
            "X-Child-Company-Id" to IRequestFactory.parameterToString(xChildCompanyId)
        )

        return suspendCoroutine { continuation ->
            val responseListener = Response.Listener<SubscriptionEventsResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<SubscriptionEventsResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<SubscriptionEventsResponse> = requestFactory.build(
                    Request.Method.GET,
                    "$basePath$path",
                    body,
                    headerParams,
                    queryParams,
                    formParams,
                    contentType,
                    responseType,
                    responseListener,
                    errorListener)

            postProcessors.forEach { it.invoke(request) }

            requestQueue.value.add(request)
        }
    }
    /**
     * Get Subscription
     * 
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @return SubscriptionResponse
     */
    suspend fun getSubscription(id: kotlin.String, acceptLanguage: kotlin.String? = "es"): SubscriptionResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}/subscription".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

        val formParams = mapOf<String, String>()


        // TODO: Cater for allowing empty values
        // TODO, if its apikey auth, then add the header names here and the hardcoded auth key
        // Only support hard coded apikey in query param auth for when we do this first path
        val queryParams = mapOf<String, String>()
            .filter { it.value.isNotEmpty() }

        val headerParams: Map<String, String> = mapOf(
            "Accept-Language" to IRequestFactory.parameterToString(acceptLanguage)
        )

        return suspendCoroutine { continuation ->
            val responseListener = Response.Listener<SubscriptionResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<SubscriptionResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<SubscriptionResponse> = requestFactory.build(
                    Request.Method.GET,
                    "$basePath$path",
                    body,
                    headerParams,
                    queryParams,
                    formParams,
                    contentType,
                    responseType,
                    responseListener,
                    errorListener)

            postProcessors.forEach { it.invoke(request) }

            requestQueue.value.add(request)
        }
    }
    /**
     * Pause Subscription
     * You can pause the subscription to stop the plans that your customers consume
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return SubscriptionResponse
     */
    suspend fun pauseSubscription(id: kotlin.String, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): SubscriptionResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}/subscription/pause".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

        val formParams = mapOf<String, String>()


        // TODO: Cater for allowing empty values
        // TODO, if its apikey auth, then add the header names here and the hardcoded auth key
        // Only support hard coded apikey in query param auth for when we do this first path
        val queryParams = mapOf<String, String>()
            .filter { it.value.isNotEmpty() }

        val headerParams: Map<String, String> = mapOf(
            "Accept-Language" to IRequestFactory.parameterToString(acceptLanguage),
            "X-Child-Company-Id" to IRequestFactory.parameterToString(xChildCompanyId)
        )

        return suspendCoroutine { continuation ->
            val responseListener = Response.Listener<SubscriptionResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<SubscriptionResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<SubscriptionResponse> = requestFactory.build(
                    Request.Method.POST,
                    "$basePath$path",
                    body,
                    headerParams,
                    queryParams,
                    formParams,
                    contentType,
                    responseType,
                    responseListener,
                    errorListener)

            postProcessors.forEach { it.invoke(request) }

            requestQueue.value.add(request)
        }
    }
    /**
     * Resume Subscription
     * You can resume the subscription to start the plans that your customers consume
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return SubscriptionResponse
     */
    suspend fun resumeSubscription(id: kotlin.String, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): SubscriptionResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}/subscription/resume".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

        val formParams = mapOf<String, String>()


        // TODO: Cater for allowing empty values
        // TODO, if its apikey auth, then add the header names here and the hardcoded auth key
        // Only support hard coded apikey in query param auth for when we do this first path
        val queryParams = mapOf<String, String>()
            .filter { it.value.isNotEmpty() }

        val headerParams: Map<String, String> = mapOf(
            "Accept-Language" to IRequestFactory.parameterToString(acceptLanguage),
            "X-Child-Company-Id" to IRequestFactory.parameterToString(xChildCompanyId)
        )

        return suspendCoroutine { continuation ->
            val responseListener = Response.Listener<SubscriptionResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<SubscriptionResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<SubscriptionResponse> = requestFactory.build(
                    Request.Method.POST,
                    "$basePath$path",
                    body,
                    headerParams,
                    queryParams,
                    formParams,
                    contentType,
                    responseType,
                    responseListener,
                    errorListener)

            postProcessors.forEach { it.invoke(request) }

            requestQueue.value.add(request)
        }
    }
    /**
     * Update Subscription
     * You can modify the subscription to change the plans that your customers consume
     * @param id Identifier of the resource
     * @param subscriptionUpdateRequest requested field for update a subscription
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return SubscriptionResponse
     */
    suspend fun updateSubscription(id: kotlin.String, subscriptionUpdateRequest: SubscriptionUpdateRequest, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): SubscriptionResponse? {
        val body: Any? = subscriptionUpdateRequest

        val contentTypes : Array<String> = arrayOf("application/json")
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}/subscription".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

        val formParams = mapOf<String, String>()


        // TODO: Cater for allowing empty values
        // TODO, if its apikey auth, then add the header names here and the hardcoded auth key
        // Only support hard coded apikey in query param auth for when we do this first path
        val queryParams = mapOf<String, String>()
            .filter { it.value.isNotEmpty() }

        val headerParams: Map<String, String> = mapOf(
            "Accept-Language" to IRequestFactory.parameterToString(acceptLanguage),
            "X-Child-Company-Id" to IRequestFactory.parameterToString(xChildCompanyId)
        )

        return suspendCoroutine { continuation ->
            val responseListener = Response.Listener<SubscriptionResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<SubscriptionResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<SubscriptionResponse> = requestFactory.build(
                    Request.Method.PUT,
                    "$basePath$path",
                    body,
                    headerParams,
                    queryParams,
                    formParams,
                    contentType,
                    responseType,
                    responseListener,
                    errorListener)

            postProcessors.forEach { it.invoke(request) }

            requestQueue.value.add(request)
        }
    }
}
