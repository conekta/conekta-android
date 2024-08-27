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

import io.conekta.model.CreateCustomerPaymentMethodsRequest
import io.conekta.model.CreateCustomerPaymentMethodsResponse
import io.conekta.model.Error
import io.conekta.model.GetPaymentMethodResponse
import io.conekta.model.UpdateCustomerPaymentMethodsResponse
import io.conekta.model.UpdatePaymentMethods

/*
* If you wish to use a custom http stack with your client you
* can pass that to the request queue like:
* Volley.newRequestQueue(context.applicationContext, myCustomHttpStack)
*/
class PaymentMethodsApi (
    private val context: Context,
    private val requestQueue: Lazy<RequestQueue> = lazy(initializer = {
        Volley.newRequestQueue(context.applicationContext)
    }),
    private val requestFactory: IRequestFactory = RequestFactory(),
    private val basePath: String = "https://api.conekta.io",
    private val postProcessors :List <(Request<*>) -> Unit> = listOf()) {

    /**
     * Create Payment Method
     * Create a payment method for a customer.
     * @param id Identifier of the resource
     * @param createCustomerPaymentMethodsRequest requested field for customer payment methods
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return CreateCustomerPaymentMethodsResponse
     */
    suspend fun createCustomerPaymentMethods(id: kotlin.String, createCustomerPaymentMethodsRequest: CreateCustomerPaymentMethodsRequest, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): CreateCustomerPaymentMethodsResponse? {
        val body: Any? = createCustomerPaymentMethodsRequest

        val contentTypes : Array<String> = arrayOf("application/json")
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}/payment_sources".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

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
            val responseListener = Response.Listener<CreateCustomerPaymentMethodsResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<CreateCustomerPaymentMethodsResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<CreateCustomerPaymentMethodsResponse> = requestFactory.build(
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
     * Delete Payment Method
     * Delete an existing payment method
     * @param id Identifier of the resource
     * @param paymentMethodId Identifier of the payment method
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return UpdateCustomerPaymentMethodsResponse
     */
    suspend fun deleteCustomerPaymentMethods(id: kotlin.String, paymentMethodId: kotlin.String, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): UpdateCustomerPaymentMethodsResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}/payment_sources/{payment_method_id}".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString())).replace("{" + "payment_method_id" + "}", IRequestFactory.escapeString(paymentMethodId.toString()))

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
            val responseListener = Response.Listener<UpdateCustomerPaymentMethodsResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<UpdateCustomerPaymentMethodsResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<UpdateCustomerPaymentMethodsResponse> = requestFactory.build(
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
     * Get Payment Methods
     * Get a list of Payment Methods
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
     * @param next next page (optional)
     * @param previous previous page (optional)
     * @param search General order search, e.g. by mail, reference etc. (optional)
     * @return GetPaymentMethodResponse
     */
    suspend fun getCustomerPaymentMethods(id: kotlin.String, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null, limit: kotlin.Int? = 20, next: kotlin.String? = null, previous: kotlin.String? = null, search: kotlin.String? = null): GetPaymentMethodResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}/payment_sources".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

        val formParams = mapOf<String, String>()


        // TODO: Cater for allowing empty values
        // TODO, if its apikey auth, then add the header names here and the hardcoded auth key
        // Only support hard coded apikey in query param auth for when we do this first path
        val queryParams = mapOf<String, String>(
                "limit" to IRequestFactory.parameterToString(limit),
                "next" to IRequestFactory.parameterToString(next),
                "previous" to IRequestFactory.parameterToString(previous),
                "search" to IRequestFactory.parameterToString(search)
            )
            .filter { it.value.isNotEmpty() }

        val headerParams: Map<String, String> = mapOf(
            "Accept-Language" to IRequestFactory.parameterToString(acceptLanguage),
            "X-Child-Company-Id" to IRequestFactory.parameterToString(xChildCompanyId)
        )

        return suspendCoroutine { continuation ->
            val responseListener = Response.Listener<GetPaymentMethodResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<GetPaymentMethodResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<GetPaymentMethodResponse> = requestFactory.build(
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
     * Update Payment Method
     * Gets a payment Method that corresponds to a customer ID.
     * @param id Identifier of the resource
     * @param paymentMethodId Identifier of the payment method
     * @param updatePaymentMethods requested field for customer payment methods
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return UpdateCustomerPaymentMethodsResponse
     */
    suspend fun updateCustomerPaymentMethods(id: kotlin.String, paymentMethodId: kotlin.String, updatePaymentMethods: UpdatePaymentMethods, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): UpdateCustomerPaymentMethodsResponse? {
        val body: Any? = updatePaymentMethods

        val contentTypes : Array<String> = arrayOf("application/json")
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}/payment_sources/{payment_method_id}".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString())).replace("{" + "payment_method_id" + "}", IRequestFactory.escapeString(paymentMethodId.toString()))

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
            val responseListener = Response.Listener<UpdateCustomerPaymentMethodsResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<UpdateCustomerPaymentMethodsResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<UpdateCustomerPaymentMethodsResponse> = requestFactory.build(
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
