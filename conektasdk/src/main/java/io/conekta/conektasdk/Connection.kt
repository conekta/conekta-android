package io.conekta.conektasdk

import android.util.Base64
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi
import io.conekta.conektasdk.Conekta.Companion.apiVersion
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import java.util.concurrent.TimeUnit

/**
 * POJO of the object Connection.
 */
class Connection
/**
 * Connection constructor.
 */
{
    private var card: Card? = null
    private var deviceFingerPrint: String = ""

    /**
     * Create a Request interface.
     */
    interface Request {
        fun onRequestReady(data: CardResponse?)
        fun onError(message: String?)
    }

    private var listener: Request? = null

    /**
     * Assign the listener implementing events interface that will receive the events
     */
    fun onRequestListener(listener: Request?) {
        this.listener = listener
    }

    /**
     *
     * @param card
     * @param deviceFingerPrint
     */
    fun request(card: Card, deviceFingerPrint: String) {
        this.card = card
        this.deviceFingerPrint = deviceFingerPrint
        RetrofitAdapter().getToken()
    }

    inner class RetrofitAdapter {
        fun getToken() {
            val encoding = Base64.encodeToString(Conekta.publicKey.toByteArray(), Base64.NO_WRAP)

            val retrofit = Retrofit.Builder()
                .client(
                    OkHttpClient.Builder()
                        .readTimeout(30, TimeUnit.SECONDS)
                        .connectTimeout(30, TimeUnit.SECONDS)
                        .addInterceptor(
                            HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
                        .addInterceptor { chain ->
                            chain.proceed(
                                chain.request().newBuilder()
                                    .addHeader("Accept", "application/vnd.conekta-v" + apiVersion + "+json")
                                    .addHeader("Accept-Language", Conekta.language)
                                    .addHeader("Conekta-Client-User-Agent", "{\"agent\": \"Conekta Android SDK\"}")
                                    .addHeader("Authorization","Basic $encoding")
                                    .addHeader("Content-Type", "application/json; charset=utf-8")
                                    .build())
                        }
                        .build()
                )
                .baseUrl(Conekta.baseUri)
                .addConverterFactory(MoshiConverterFactory.create(Moshi.Builder().build()))
                .build()

            val service = retrofit.create(ApiService::class.java)
            GlobalScope.launch(Dispatchers.Main) {
                kotlin.runCatching {
                    withContext(Dispatchers.IO) {service.getToken(card?.number.orEmpty(), card?.name.orEmpty(),
                        card?.cvc.orEmpty(), card?.expMonth.orEmpty(), card?.expYear.orEmpty(),
                        deviceFingerPrint
                    )}
                }.onSuccess {
                    if (it.code() == 200)
                        listener?.onRequestReady(it.body())
                    else
                        listener?.onError(it.errorBody().toString())
                }.onFailure {
                    listener?.onError(it.localizedMessage)
                }
            }
        }


    }

    interface ApiService {
        @FormUrlEncoded
        @POST("/tokens")
        @JvmSuppressWildcards
        suspend fun getToken(@Field(value ="card[number]", encoded = true) number: String,
                             @Field(value ="card[name]", encoded = true) name: String,
                             @Field(value ="card[cvc]", encoded = true) cvc: String,
                             @Field(value ="card[exp_month]", encoded = true) expMonth: String,
                             @Field(value ="card[exp_year]", encoded = true) expYear: String,
                             @Field(value ="card[device_fingerprint]", encoded = true) deviceFingerprint: String): Response<CardResponse>
    }
}

@JsonClass(generateAdapter = true)
data class CardResponse(@Json(name = "id") val id: String,
                        @Json(name = "livemode")val livemode: Boolean,
                        @Json(name = "used")val used: Boolean,
                        @Json(name = "object")val objec: String)