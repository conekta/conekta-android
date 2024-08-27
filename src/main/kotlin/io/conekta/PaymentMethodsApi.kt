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

import io.conekta.model.CreateCustomerPaymentMethodsRequest
import io.conekta.model.CreateCustomerPaymentMethodsResponse
import io.conekta.model.Error
import io.conekta.model.GetPaymentMethodResponse
import io.conekta.model.UpdateCustomerPaymentMethodsResponse
import io.conekta.model.UpdatePaymentMethods

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

class PaymentMethodsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.conekta.io")
        }
    }

    /**
     * enum for parameter acceptLanguage
     */
     enum class AcceptLanguageCreateCustomerPaymentMethods(val value: kotlin.String) {
         @SerializedName(value = "es") es("es"),
         @SerializedName(value = "en") en("en")
     }

    /**
     * Create Payment Method
     * Create a payment method for a customer.
     * @param id Identifier of the resource
     * @param createCustomerPaymentMethodsRequest requested field for customer payment methods
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return CreateCustomerPaymentMethodsResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createCustomerPaymentMethods(id: kotlin.String, createCustomerPaymentMethodsRequest: CreateCustomerPaymentMethodsRequest, acceptLanguage: AcceptLanguageCreateCustomerPaymentMethods? = AcceptLanguageCreateCustomerPaymentMethods.es, xChildCompanyId: kotlin.String? = null) : CreateCustomerPaymentMethodsResponse {
        val localVarResponse = createCustomerPaymentMethodsWithHttpInfo(id = id, createCustomerPaymentMethodsRequest = createCustomerPaymentMethodsRequest, acceptLanguage = acceptLanguage, xChildCompanyId = xChildCompanyId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CreateCustomerPaymentMethodsResponse
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
     * Create Payment Method
     * Create a payment method for a customer.
     * @param id Identifier of the resource
     * @param createCustomerPaymentMethodsRequest requested field for customer payment methods
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return ApiResponse<CreateCustomerPaymentMethodsResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createCustomerPaymentMethodsWithHttpInfo(id: kotlin.String, createCustomerPaymentMethodsRequest: CreateCustomerPaymentMethodsRequest, acceptLanguage: AcceptLanguageCreateCustomerPaymentMethods?, xChildCompanyId: kotlin.String?) : ApiResponse<CreateCustomerPaymentMethodsResponse?> {
        val localVariableConfig = createCustomerPaymentMethodsRequestConfig(id = id, createCustomerPaymentMethodsRequest = createCustomerPaymentMethodsRequest, acceptLanguage = acceptLanguage, xChildCompanyId = xChildCompanyId)

        return request<CreateCustomerPaymentMethodsRequest, CreateCustomerPaymentMethodsResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createCustomerPaymentMethods
     *
     * @param id Identifier of the resource
     * @param createCustomerPaymentMethodsRequest requested field for customer payment methods
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return RequestConfig
     */
    fun createCustomerPaymentMethodsRequestConfig(id: kotlin.String, createCustomerPaymentMethodsRequest: CreateCustomerPaymentMethodsRequest, acceptLanguage: AcceptLanguageCreateCustomerPaymentMethods?, xChildCompanyId: kotlin.String?) : RequestConfig<CreateCustomerPaymentMethodsRequest> {
        val localVariableBody = createCustomerPaymentMethodsRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        xChildCompanyId?.apply { localVariableHeaders["X-Child-Company-Id"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/vnd.conekta-v2.1.0+json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/customers/{id}/payment_sources".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter acceptLanguage
     */
     enum class AcceptLanguageDeleteCustomerPaymentMethods(val value: kotlin.String) {
         @SerializedName(value = "es") es("es"),
         @SerializedName(value = "en") en("en")
     }

    /**
     * Delete Payment Method
     * Delete an existing payment method
     * @param id Identifier of the resource
     * @param paymentMethodId Identifier of the payment method
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return UpdateCustomerPaymentMethodsResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteCustomerPaymentMethods(id: kotlin.String, paymentMethodId: kotlin.String, acceptLanguage: AcceptLanguageDeleteCustomerPaymentMethods? = AcceptLanguageDeleteCustomerPaymentMethods.es, xChildCompanyId: kotlin.String? = null) : UpdateCustomerPaymentMethodsResponse {
        val localVarResponse = deleteCustomerPaymentMethodsWithHttpInfo(id = id, paymentMethodId = paymentMethodId, acceptLanguage = acceptLanguage, xChildCompanyId = xChildCompanyId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UpdateCustomerPaymentMethodsResponse
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
     * Delete Payment Method
     * Delete an existing payment method
     * @param id Identifier of the resource
     * @param paymentMethodId Identifier of the payment method
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return ApiResponse<UpdateCustomerPaymentMethodsResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteCustomerPaymentMethodsWithHttpInfo(id: kotlin.String, paymentMethodId: kotlin.String, acceptLanguage: AcceptLanguageDeleteCustomerPaymentMethods?, xChildCompanyId: kotlin.String?) : ApiResponse<UpdateCustomerPaymentMethodsResponse?> {
        val localVariableConfig = deleteCustomerPaymentMethodsRequestConfig(id = id, paymentMethodId = paymentMethodId, acceptLanguage = acceptLanguage, xChildCompanyId = xChildCompanyId)

        return request<Unit, UpdateCustomerPaymentMethodsResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteCustomerPaymentMethods
     *
     * @param id Identifier of the resource
     * @param paymentMethodId Identifier of the payment method
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return RequestConfig
     */
    fun deleteCustomerPaymentMethodsRequestConfig(id: kotlin.String, paymentMethodId: kotlin.String, acceptLanguage: AcceptLanguageDeleteCustomerPaymentMethods?, xChildCompanyId: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        xChildCompanyId?.apply { localVariableHeaders["X-Child-Company-Id"] = this.toString() }
        localVariableHeaders["Accept"] = "application/vnd.conekta-v2.1.0+json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/customers/{id}/payment_sources/{payment_method_id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())).replace("{"+"payment_method_id"+"}", encodeURIComponent(paymentMethodId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter acceptLanguage
     */
     enum class AcceptLanguageGetCustomerPaymentMethods(val value: kotlin.String) {
         @SerializedName(value = "es") es("es"),
         @SerializedName(value = "en") en("en")
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
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCustomerPaymentMethods(id: kotlin.String, acceptLanguage: AcceptLanguageGetCustomerPaymentMethods? = AcceptLanguageGetCustomerPaymentMethods.es, xChildCompanyId: kotlin.String? = null, limit: kotlin.Int? = 20, next: kotlin.String? = null, previous: kotlin.String? = null, search: kotlin.String? = null) : GetPaymentMethodResponse {
        val localVarResponse = getCustomerPaymentMethodsWithHttpInfo(id = id, acceptLanguage = acceptLanguage, xChildCompanyId = xChildCompanyId, limit = limit, next = next, previous = previous, search = search)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetPaymentMethodResponse
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
     * Get Payment Methods
     * Get a list of Payment Methods
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
     * @param next next page (optional)
     * @param previous previous page (optional)
     * @param search General order search, e.g. by mail, reference etc. (optional)
     * @return ApiResponse<GetPaymentMethodResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getCustomerPaymentMethodsWithHttpInfo(id: kotlin.String, acceptLanguage: AcceptLanguageGetCustomerPaymentMethods?, xChildCompanyId: kotlin.String?, limit: kotlin.Int?, next: kotlin.String?, previous: kotlin.String?, search: kotlin.String?) : ApiResponse<GetPaymentMethodResponse?> {
        val localVariableConfig = getCustomerPaymentMethodsRequestConfig(id = id, acceptLanguage = acceptLanguage, xChildCompanyId = xChildCompanyId, limit = limit, next = next, previous = previous, search = search)

        return request<Unit, GetPaymentMethodResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getCustomerPaymentMethods
     *
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
     * @param next next page (optional)
     * @param previous previous page (optional)
     * @param search General order search, e.g. by mail, reference etc. (optional)
     * @return RequestConfig
     */
    fun getCustomerPaymentMethodsRequestConfig(id: kotlin.String, acceptLanguage: AcceptLanguageGetCustomerPaymentMethods?, xChildCompanyId: kotlin.String?, limit: kotlin.Int?, next: kotlin.String?, previous: kotlin.String?, search: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (limit != null) {
                    put("limit", listOf(limit.toString()))
                }
                if (next != null) {
                    put("next", listOf(next.toString()))
                }
                if (previous != null) {
                    put("previous", listOf(previous.toString()))
                }
                if (search != null) {
                    put("search", listOf(search.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        xChildCompanyId?.apply { localVariableHeaders["X-Child-Company-Id"] = this.toString() }
        localVariableHeaders["Accept"] = "application/vnd.conekta-v2.1.0+json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/customers/{id}/payment_sources".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter acceptLanguage
     */
     enum class AcceptLanguageUpdateCustomerPaymentMethods(val value: kotlin.String) {
         @SerializedName(value = "es") es("es"),
         @SerializedName(value = "en") en("en")
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
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateCustomerPaymentMethods(id: kotlin.String, paymentMethodId: kotlin.String, updatePaymentMethods: UpdatePaymentMethods, acceptLanguage: AcceptLanguageUpdateCustomerPaymentMethods? = AcceptLanguageUpdateCustomerPaymentMethods.es, xChildCompanyId: kotlin.String? = null) : UpdateCustomerPaymentMethodsResponse {
        val localVarResponse = updateCustomerPaymentMethodsWithHttpInfo(id = id, paymentMethodId = paymentMethodId, updatePaymentMethods = updatePaymentMethods, acceptLanguage = acceptLanguage, xChildCompanyId = xChildCompanyId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UpdateCustomerPaymentMethodsResponse
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
     * Update Payment Method
     * Gets a payment Method that corresponds to a customer ID.
     * @param id Identifier of the resource
     * @param paymentMethodId Identifier of the payment method
     * @param updatePaymentMethods requested field for customer payment methods
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return ApiResponse<UpdateCustomerPaymentMethodsResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updateCustomerPaymentMethodsWithHttpInfo(id: kotlin.String, paymentMethodId: kotlin.String, updatePaymentMethods: UpdatePaymentMethods, acceptLanguage: AcceptLanguageUpdateCustomerPaymentMethods?, xChildCompanyId: kotlin.String?) : ApiResponse<UpdateCustomerPaymentMethodsResponse?> {
        val localVariableConfig = updateCustomerPaymentMethodsRequestConfig(id = id, paymentMethodId = paymentMethodId, updatePaymentMethods = updatePaymentMethods, acceptLanguage = acceptLanguage, xChildCompanyId = xChildCompanyId)

        return request<UpdatePaymentMethods, UpdateCustomerPaymentMethodsResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateCustomerPaymentMethods
     *
     * @param id Identifier of the resource
     * @param paymentMethodId Identifier of the payment method
     * @param updatePaymentMethods requested field for customer payment methods
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return RequestConfig
     */
    fun updateCustomerPaymentMethodsRequestConfig(id: kotlin.String, paymentMethodId: kotlin.String, updatePaymentMethods: UpdatePaymentMethods, acceptLanguage: AcceptLanguageUpdateCustomerPaymentMethods?, xChildCompanyId: kotlin.String?) : RequestConfig<UpdatePaymentMethods> {
        val localVariableBody = updatePaymentMethods
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        xChildCompanyId?.apply { localVariableHeaders["X-Child-Company-Id"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/vnd.conekta-v2.1.0+json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/customers/{id}/payment_sources/{payment_method_id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())).replace("{"+"payment_method_id"+"}", encodeURIComponent(paymentMethodId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
