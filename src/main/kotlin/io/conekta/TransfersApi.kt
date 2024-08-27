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
import io.conekta.model.GetTransfersResponse
import io.conekta.model.TransferResponse

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

class TransfersApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.conekta.io")
        }
    }

    /**
     * enum for parameter acceptLanguage
     */
     enum class AcceptLanguageGetTransfer(val value: kotlin.String) {
         @SerializedName(value = "es") es("es"),
         @SerializedName(value = "en") en("en")
     }

    /**
     * Get Transfer
     * Get the details of a Transfer
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return TransferResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getTransfer(id: kotlin.String, acceptLanguage: AcceptLanguageGetTransfer? = AcceptLanguageGetTransfer.es, xChildCompanyId: kotlin.String? = null) : TransferResponse {
        val localVarResponse = getTransferWithHttpInfo(id = id, acceptLanguage = acceptLanguage, xChildCompanyId = xChildCompanyId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TransferResponse
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
     * Get Transfer
     * Get the details of a Transfer
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return ApiResponse<TransferResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getTransferWithHttpInfo(id: kotlin.String, acceptLanguage: AcceptLanguageGetTransfer?, xChildCompanyId: kotlin.String?) : ApiResponse<TransferResponse?> {
        val localVariableConfig = getTransferRequestConfig(id = id, acceptLanguage = acceptLanguage, xChildCompanyId = xChildCompanyId)

        return request<Unit, TransferResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getTransfer
     *
     * @param id Identifier of the resource
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @return RequestConfig
     */
    fun getTransferRequestConfig(id: kotlin.String, acceptLanguage: AcceptLanguageGetTransfer?, xChildCompanyId: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        xChildCompanyId?.apply { localVariableHeaders["X-Child-Company-Id"] = this.toString() }
        localVariableHeaders["Accept"] = "application/vnd.conekta-v2.1.0+json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/transfers/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter acceptLanguage
     */
     enum class AcceptLanguageGetTransfers(val value: kotlin.String) {
         @SerializedName(value = "es") es("es"),
         @SerializedName(value = "en") en("en")
     }

    /**
     * Get a list of transfers
     * Get transfers details in the form of a list
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
     * @param search General order search, e.g. by mail, reference etc. (optional)
     * @param next next page (optional)
     * @param previous previous page (optional)
     * @return GetTransfersResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getTransfers(acceptLanguage: AcceptLanguageGetTransfers? = AcceptLanguageGetTransfers.es, xChildCompanyId: kotlin.String? = null, limit: kotlin.Int? = 20, search: kotlin.String? = null, next: kotlin.String? = null, previous: kotlin.String? = null) : GetTransfersResponse {
        val localVarResponse = getTransfersWithHttpInfo(acceptLanguage = acceptLanguage, xChildCompanyId = xChildCompanyId, limit = limit, search = search, next = next, previous = previous)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetTransfersResponse
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
     * Get a list of transfers
     * Get transfers details in the form of a list
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
     * @param search General order search, e.g. by mail, reference etc. (optional)
     * @param next next page (optional)
     * @param previous previous page (optional)
     * @return ApiResponse<GetTransfersResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getTransfersWithHttpInfo(acceptLanguage: AcceptLanguageGetTransfers?, xChildCompanyId: kotlin.String?, limit: kotlin.Int?, search: kotlin.String?, next: kotlin.String?, previous: kotlin.String?) : ApiResponse<GetTransfersResponse?> {
        val localVariableConfig = getTransfersRequestConfig(acceptLanguage = acceptLanguage, xChildCompanyId = xChildCompanyId, limit = limit, search = search, next = next, previous = previous)

        return request<Unit, GetTransfersResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getTransfers
     *
     * @param acceptLanguage Use for knowing which language to use (optional, default to es)
     * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
     * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
     * @param search General order search, e.g. by mail, reference etc. (optional)
     * @param next next page (optional)
     * @param previous previous page (optional)
     * @return RequestConfig
     */
    fun getTransfersRequestConfig(acceptLanguage: AcceptLanguageGetTransfers?, xChildCompanyId: kotlin.String?, limit: kotlin.Int?, search: kotlin.String?, next: kotlin.String?, previous: kotlin.String?) : RequestConfig<Unit> {
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
        xChildCompanyId?.apply { localVariableHeaders["X-Child-Company-Id"] = this.toString() }
        localVariableHeaders["Accept"] = "application/vnd.conekta-v2.1.0+json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/transfers",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
