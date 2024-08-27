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

import io.conekta.model.CreateCustomerFiscalEntitiesResponse
import io.conekta.model.Customer
import io.conekta.model.CustomerFiscalEntitiesRequest
import io.conekta.model.CustomerResponse
import io.conekta.model.CustomerUpdateFiscalEntitiesRequest
import io.conekta.model.CustomersResponse
import io.conekta.model.Error
import io.conekta.model.UpdateCustomer
import io.conekta.model.UpdateCustomerFiscalEntitiesResponse

/*
* If you wish to use a custom http stack with your client you
* can pass that to the request queue like:
* Volley.newRequestQueue(context.applicationContext, myCustomHttpStack)
*/
class CustomersApi (
    private val context: Context,
    private val requestQueue: Lazy<RequestQueue> = lazy(initializer = {
        Volley.newRequestQueue(context.applicationContext)
    }),
    private val requestFactory: IRequestFactory = RequestFactory(),
    private val basePath: String = "https://api.conekta.io",
    private val postProcessors :List <(Request<*>) -> Unit> = listOf()) {

    /**
     * Create customer
     * The purpose of business is to create and keep a customer, you will learn what elements you need to create a customer. Remember the credit and debit card tokenization process: [https://developers.conekta.com/page/web-checkout-tokenizer](https://developers.conekta.com/page/web-checkout-tokenizer) 
     * @param customer requested field for customer
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return CustomerResponse
     */
    suspend fun createCustomer(customer: Customer, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): CustomerResponse? {
        val body: Any? = customer

        val contentTypes : Array<String> = arrayOf("application/json")
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers"

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
            val responseListener = Response.Listener<CustomerResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<CustomerResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<CustomerResponse> = requestFactory.build(
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
     * Create Fiscal Entity
     * Create Fiscal entity resource that corresponds to a customer ID.
     * @param id Identifier of the resource
     * @param customerFiscalEntitiesRequest requested field for customer fiscal entities
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return CreateCustomerFiscalEntitiesResponse
     */
    suspend fun createCustomerFiscalEntities(id: kotlin.String, customerFiscalEntitiesRequest: CustomerFiscalEntitiesRequest, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): CreateCustomerFiscalEntitiesResponse? {
        val body: Any? = customerFiscalEntitiesRequest

        val contentTypes : Array<String> = arrayOf("application/json")
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}/fiscal_entities".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

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
            val responseListener = Response.Listener<CreateCustomerFiscalEntitiesResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<CreateCustomerFiscalEntitiesResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<CreateCustomerFiscalEntitiesResponse> = requestFactory.build(
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
     * Delete Customer
     * Deleted a customer resource that corresponds to a customer ID.
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return CustomerResponse
     */
    suspend fun deleteCustomerById(id: kotlin.String, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): CustomerResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

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
            val responseListener = Response.Listener<CustomerResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<CustomerResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<CustomerResponse> = requestFactory.build(
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
     * Get Customer
     * Gets a customer resource that corresponds to a customer ID.
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return CustomerResponse
     */
    suspend fun getCustomerById(id: kotlin.String, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): CustomerResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

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
            val responseListener = Response.Listener<CustomerResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<CustomerResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<CustomerResponse> = requestFactory.build(
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
     * Get a list of customers
     * The purpose of business is to create and maintain a client, you will learn what elements you need to obtain a list of clients, which can be paged.
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
     * @param search General order search, e.g. by mail, reference etc. (optional)
     * @param next next page (optional)
     * @param previous previous page (optional)
     * @return CustomersResponse
     */
    suspend fun getCustomers(acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null, limit: kotlin.Int? = 20, search: kotlin.String? = null, next: kotlin.String? = null, previous: kotlin.String? = null): CustomersResponse? {
        val body: Any? = null

        val contentTypes : Array<String> = arrayOf()
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers"

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
            val responseListener = Response.Listener<CustomersResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<CustomersResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<CustomersResponse> = requestFactory.build(
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
     * Update customer
     * You can update customer-related data
     * @param id Identifier of the resource
     * @param updateCustomer requested field for customer
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return CustomerResponse
     */
    suspend fun updateCustomer(id: kotlin.String, updateCustomer: UpdateCustomer, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): CustomerResponse? {
        val body: Any? = updateCustomer

        val contentTypes : Array<String> = arrayOf("application/json")
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString()))

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
            val responseListener = Response.Listener<CustomerResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<CustomerResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<CustomerResponse> = requestFactory.build(
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
    /**
     * Update  Fiscal Entity
     * Update Fiscal Entity resource that corresponds to a customer ID.
     * @param id Identifier of the resource
     * @param fiscalEntitiesId identifier
     * @param customerUpdateFiscalEntitiesRequest requested field for customer update fiscal entities
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return UpdateCustomerFiscalEntitiesResponse
     */
    suspend fun updateCustomerFiscalEntities(id: kotlin.String, fiscalEntitiesId: kotlin.String, customerUpdateFiscalEntitiesRequest: CustomerUpdateFiscalEntitiesRequest, acceptLanguage: kotlin.String? = "es", xChildCompanyId: kotlin.String? = null): UpdateCustomerFiscalEntitiesResponse? {
        val body: Any? = customerUpdateFiscalEntitiesRequest

        val contentTypes : Array<String> = arrayOf("application/json")
        val contentType: String = if (contentTypes.isNotEmpty()) { contentTypes.first() } else { "application/json" }

        // Do some work or avoid some work based on what we know about the model,
        // before we delegate to a pluggable request factory template
        // The request factory template contains only pure code and no templates
        // to make it easy to override with your own.

        // create path and map variables
        val path = "/customers/{id}/fiscal_entities/{fiscal_entities_id}".replace("{" + "id" + "}", IRequestFactory.escapeString(id.toString())).replace("{" + "fiscal_entities_id" + "}", IRequestFactory.escapeString(fiscalEntitiesId.toString()))

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
            val responseListener = Response.Listener<UpdateCustomerFiscalEntitiesResponse> { response ->
                continuation.resume(response)
            }

            val errorListener = Response.ErrorListener { error ->
                continuation.resumeWithException(error)
            }

            val responseType = object : TypeToken<UpdateCustomerFiscalEntitiesResponse>() {}.type

            // Call the correct request builder based on whether we have a return type or a body.
            // All other switching on types must be done in code inside the builder
            val request: Request<UpdateCustomerFiscalEntitiesResponse> = requestFactory.build(
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
