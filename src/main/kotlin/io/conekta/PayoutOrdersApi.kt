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

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import io.conekta.model.Error
import io.conekta.model.PayoutOrder
import io.conekta.model.PayoutOrderResponse
import io.conekta.model.PayoutOrdersResponse

import com.google.gson.annotations.SerializedName

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class PayoutOrdersApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.conekta.io")
        }
    }

    /**
     * enum for parameter acceptLanguage
     */
     enum class AcceptLanguageCreatePayoutOrder(val value: kotlin.String) {
         @SerializedName(value = "es") es("es"),
         @SerializedName(value = "en") en("en")
     }

    /**
     * Create payout order
     * Create a new payout order.
     * @param payoutOrder requested field for payout order
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @return PayoutOrderResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createPayoutOrder(payoutOrder: PayoutOrder, acceptLanguage: AcceptLanguageCreatePayoutOrder? = AcceptLanguageCreatePayoutOrder.es) : PayoutOrderResponse {
        val localVarResponse = createPayoutOrderWithHttpInfo(payoutOrder = payoutOrder, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PayoutOrderResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Create payout order
     * Create a new payout order.
     * @param payoutOrder requested field for payout order
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @return ApiResponse<PayoutOrderResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createPayoutOrderWithHttpInfo(payoutOrder: PayoutOrder, acceptLanguage: AcceptLanguageCreatePayoutOrder?) : ApiResponse<PayoutOrderResponse?> {
        val localVariableConfig = createPayoutOrderRequestConfig(payoutOrder = payoutOrder, acceptLanguage = acceptLanguage)

        return request<PayoutOrder, PayoutOrderResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createPayoutOrder
     *
     * @param payoutOrder requested field for payout order
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @return RequestConfig
     */
    fun createPayoutOrderRequestConfig(payoutOrder: PayoutOrder, acceptLanguage: AcceptLanguageCreatePayoutOrder?) : RequestConfig<PayoutOrder> {
        val localVariableBody = payoutOrder
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/vnd.conekta-v2.1.0+json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/payout_orders",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter acceptLanguage
     */
     enum class AcceptLanguageGetPayoutOrderById(val value: kotlin.String) {
         @SerializedName(value = "es") es("es"),
         @SerializedName(value = "en") en("en")
     }

    /**
     * Get Payout Order
     * Gets a payout Order resource that corresponds to a payout order ID.
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @return PayoutOrderResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getPayoutOrderById(id: kotlin.String, acceptLanguage: AcceptLanguageGetPayoutOrderById? = AcceptLanguageGetPayoutOrderById.es) : PayoutOrderResponse {
        val localVarResponse = getPayoutOrderByIdWithHttpInfo(id = id, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PayoutOrderResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get Payout Order
     * Gets a payout Order resource that corresponds to a payout order ID.
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @return ApiResponse<PayoutOrderResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getPayoutOrderByIdWithHttpInfo(id: kotlin.String, acceptLanguage: AcceptLanguageGetPayoutOrderById?) : ApiResponse<PayoutOrderResponse?> {
        val localVariableConfig = getPayoutOrderByIdRequestConfig(id = id, acceptLanguage = acceptLanguage)

        return request<Unit, PayoutOrderResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getPayoutOrderById
     *
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @return RequestConfig
     */
    fun getPayoutOrderByIdRequestConfig(id: kotlin.String, acceptLanguage: AcceptLanguageGetPayoutOrderById?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        localVariableHeaders["Accept"] = "application/vnd.conekta-v2.1.0+json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/payout_orders/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter acceptLanguage
     */
     enum class AcceptLanguageGetPayoutOrders(val value: kotlin.String) {
         @SerializedName(value = "es") es("es"),
         @SerializedName(value = "en") en("en")
     }

    /**
     * Get a list of Payout Orders
     * Get Payout order details in the form of a list
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
     * @param search General order search, e.g. by mail, reference etc. (optional)
     * @param next next page (optional)
     * @param previous previous page (optional)
     * @return PayoutOrdersResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getPayoutOrders(acceptLanguage: AcceptLanguageGetPayoutOrders? = AcceptLanguageGetPayoutOrders.es, limit: kotlin.Int? = 20, search: kotlin.String? = null, next: kotlin.String? = null, previous: kotlin.String? = null) : PayoutOrdersResponse {
        val localVarResponse = getPayoutOrdersWithHttpInfo(acceptLanguage = acceptLanguage, limit = limit, search = search, next = next, previous = previous)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PayoutOrdersResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get a list of Payout Orders
     * Get Payout order details in the form of a list
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
     * @param search General order search, e.g. by mail, reference etc. (optional)
     * @param next next page (optional)
     * @param previous previous page (optional)
     * @return ApiResponse<PayoutOrdersResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getPayoutOrdersWithHttpInfo(acceptLanguage: AcceptLanguageGetPayoutOrders?, limit: kotlin.Int?, search: kotlin.String?, next: kotlin.String?, previous: kotlin.String?) : ApiResponse<PayoutOrdersResponse?> {
        val localVariableConfig = getPayoutOrdersRequestConfig(acceptLanguage = acceptLanguage, limit = limit, search = search, next = next, previous = previous)

        return request<Unit, PayoutOrdersResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getPayoutOrders
     *
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
     * @param search General order search, e.g. by mail, reference etc. (optional)
     * @param next next page (optional)
     * @param previous previous page (optional)
     * @return RequestConfig
     */
    fun getPayoutOrdersRequestConfig(acceptLanguage: AcceptLanguageGetPayoutOrders?, limit: kotlin.Int?, search: kotlin.String?, next: kotlin.String?, previous: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
                if (search != null) {
                    put("search", listOf(search.toString()))
                }
                if (next != null) {
                    put("next", listOf(next.toString()))
                }
                if (previous != null) {
                    put("previous", listOf(previous.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        localVariableHeaders["Accept"] = "application/vnd.conekta-v2.1.0+json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/payout_orders",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
