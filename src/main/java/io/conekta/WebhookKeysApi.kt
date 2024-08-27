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
import io.conekta.model.GetWebhookKeysResponse
import io.conekta.model.WebhookKeyCreateResponse
import io.conekta.model.WebhookKeyDeleteResponse
import io.conekta.model.WebhookKeyRequest
import io.conekta.model.WebhookKeyResponse
import io.conekta.model.WebhookKeyUpdateRequest

/*
* If you wish to use a custom http stack with your client you
* can pass that to the request queue like:
* Volley.newRequestQueue(context.applicationContext, myCustomHttpStack)
*/
class WebhookKeysApi (
    private val context: Context,
    private val requestQueue: Lazy<RequestQueue> = lazy(initializer = {
        Volley.newRequestQueue(context.applicationContext)
    }),
    private val requestFactory: IRequestFactory = RequestFactory(),
    private val basePath: String = "https://api.conekta.io",
    private val postProcessors :List <(Request<*>) -> Unit> = listOf()) {

    /**
     * Create Webhook Key
     * Create a webhook key
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param webhookKeyRequest  (optional)
     * @return WebhookKeyCreateResponse
     */
    suspend fun createWebhookKey(acceptLanguage: kotlin.String? = "es", webhookKeyRequest: WebhookKeyRequest? = null): WebhookKeyCreateResponse? {
        val body: Any? = webhookKeyRequest

        val contentTypes : Array<String> = arrayOf("application/json")
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/webhook_keys"

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
            val responseListener = Response.Listener<WebhookKeyCreateResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<WebhookKeyCreateResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<WebhookKeyCreateResponse> = requestFactory.build(
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
     * Delete Webhook key
     * 
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @return WebhookKeyDeleteResponse
     */
    suspend fun deleteWebhookKey(id: kotlin.String, acceptLanguage: kotlin.String? = "es"): WebhookKeyDeleteResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/webhook_keys/{id}".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

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
            val responseListener = Response.Listener<WebhookKeyDeleteResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<WebhookKeyDeleteResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<WebhookKeyDeleteResponse> = requestFactory.build(
                    Request.Method.DELETE,
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
     * Get Webhook Key
     * 
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return WebhookKeyResponse
     */
    suspend fun getWebhookKey(id: kotlin.String, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): WebhookKeyResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/webhook_keys/{id}".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

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
            val responseListener = Response.Listener<WebhookKeyResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<WebhookKeyResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<WebhookKeyResponse> = requestFactory.build(
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
     * Get List of Webhook Keys
     * Consume the list of webhook keys you have
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
     * @param search General order search, e.g. by mail, reference etc. (optional)
     * @param next next page (optional)
     * @param previous previous page (optional)
     * @return GetWebhookKeysResponse
     */
    suspend fun getWebhookKeys(acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null, limit: kotlin.Int? = 20, search: kotlin.String? = null, next: kotlin.String? = null, previous: kotlin.String? = null): GetWebhookKeysResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/webhook_keys"

        val formParams = mapOf<String, String>()


        // TODO: Cater for allowing empty values
        // TODO, if its apikey auth, then add the header names here and the hardcoded auth key
        // Only support hard coded apikey in query param auth for when we do this first path
        val queryParams = mapOf<String, String>(
                "limit" to IRequestFactory.parameterToString(limit),
                "search" to IRequestFactory.parameterToString(search),
                "next" to IRequestFactory.parameterToString(next),
                "previous" to IRequestFactory.parameterToString(previous)
            )
            .filter { it.value.isNotEmpty() }

        val headerParams: Map<String, String> = mapOf(
            "Accept-Language" to IRequestFactory.parameterToString(acceptLanguage),
            "X-Child-Company-Id" to IRequestFactory.parameterToString(xChildCompanyId)
        )

        return suspendCoroutine { continuation ->
            val responseListener = Response.Listener<GetWebhookKeysResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<GetWebhookKeysResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<GetWebhookKeysResponse> = requestFactory.build(
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
     * Update Webhook Key
     * updates an existing webhook key
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param webhookKeyUpdateRequest  (optional)
     * @return WebhookKeyResponse
     */
    suspend fun updateWebhookKey(id: kotlin.String, acceptLanguage: kotlin.String? = "es", webhookKeyUpdateRequest: WebhookKeyUpdateRequest? = null): WebhookKeyResponse? {
        val body: Any? = webhookKeyUpdateRequest

        val contentTypes : Array<String> = arrayOf("application/json")
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/webhook_keys/{id}".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

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
            val responseListener = Response.Listener<WebhookKeyResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<WebhookKeyResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<WebhookKeyResponse> = requestFactory.build(
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
