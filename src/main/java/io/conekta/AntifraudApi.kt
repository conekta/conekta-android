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

import io.conekta.model.BlacklistRuleResponse
import io.conekta.model.CreateRiskRulesData
import io.conekta.model.DeletedBlacklistRuleResponse
import io.conekta.model.DeletedWhitelistRuleResponse
import io.conekta.model.Error
import io.conekta.model.RiskRulesList
import io.conekta.model.WhitelistlistRuleResponse

/*
* If you wish to use a custom http stack with your client you
* can pass that to the request queue like:
* Volley.newRequestQueue(context.applicationContext, myCustomHttpStack)
*/
class AntifraudApi (
    private val context: Context,
    private val requestQueue: Lazy<RequestQueue> = lazy(initializer = {
        Volley.newRequestQueue(context.applicationContext)
    }),
    private val requestFactory: IRequestFactory = RequestFactory(),
    private val basePath: String = "https://api.conekta.io",
    private val postProcessors :List <(Request<*>) -> Unit> = listOf()) {

    /**
     * Create blacklisted rule
     * 
     * @param createRiskRulesData requested field for blacklist rule
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @return BlacklistRuleResponse
     */
    suspend fun createRuleBlacklist(createRiskRulesData: CreateRiskRulesData, acceptLanguage: kotlin.String? = "es"): BlacklistRuleResponse? {
        val body: Any? = createRiskRulesData

        val contentTypes : Array<String> = arrayOf("application/json")
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/antifraud/blacklists"

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
            val responseListener = Response.Listener<BlacklistRuleResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<BlacklistRuleResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<BlacklistRuleResponse> = requestFactory.build(
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
     * Create whitelisted rule
     * 
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param createRiskRulesData  (optional)
     * @return WhitelistlistRuleResponse
     */
    suspend fun createRuleWhitelist(acceptLanguage: kotlin.String? = "es", createRiskRulesData: CreateRiskRulesData? = null): WhitelistlistRuleResponse? {
        val body: Any? = createRiskRulesData

        val contentTypes : Array<String> = arrayOf("application/json")
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/antifraud/whitelists"

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
            val responseListener = Response.Listener<WhitelistlistRuleResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<WhitelistlistRuleResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<WhitelistlistRuleResponse> = requestFactory.build(
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
     * Delete blacklisted rule
     * 
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return DeletedBlacklistRuleResponse
     */
    suspend fun deleteRuleBlacklist(id: kotlin.String, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): DeletedBlacklistRuleResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/antifraud/blacklists/{id}".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

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
            val responseListener = Response.Listener<DeletedBlacklistRuleResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<DeletedBlacklistRuleResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<DeletedBlacklistRuleResponse> = requestFactory.build(
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
     * Delete whitelisted rule
     * 
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return DeletedWhitelistRuleResponse
     */
    suspend fun deleteRuleWhitelist(id: kotlin.String, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): DeletedWhitelistRuleResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/antifraud/whitelists/{id}".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

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
            val responseListener = Response.Listener<DeletedWhitelistRuleResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<DeletedWhitelistRuleResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<DeletedWhitelistRuleResponse> = requestFactory.build(
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
     * Get list of blacklisted rules
     * Return all rules
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @return RiskRulesList
     */
    suspend fun getRuleBlacklist(acceptLanguage: kotlin.String? = "es"): RiskRulesList? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/antifraud/blacklists"

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
            val responseListener = Response.Listener<RiskRulesList> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<RiskRulesList>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<RiskRulesList> = requestFactory.build(
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
     * Get a list of whitelisted rules
     * Return all rules
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @return RiskRulesList
     */
    suspend fun getRuleWhitelist(acceptLanguage: kotlin.String? = "es"): RiskRulesList? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/antifraud/whitelists"

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
            val responseListener = Response.Listener<RiskRulesList> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<RiskRulesList>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<RiskRulesList> = requestFactory.build(
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
}
