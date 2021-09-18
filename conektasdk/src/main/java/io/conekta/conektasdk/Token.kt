package io.conekta.conektasdk


import android.app.Activity
import org.apache.http.NameValuePair
import org.apache.http.message.BasicNameValuePair
import java.util.ArrayList

/**
 * POJO of the object Token.
 */
/**
 * The custom consturctor.
 * @param activity from where it was called.
 */
class Token(private val activity: Activity, private val listener: CreateToken? = null) {
    private val endPoint = "/tokens"


    /**
     * Create a interface of token.
     */
    interface CreateToken {
        fun onCreateTokenReady(data: CardResponse?)
        fun onError(message: String?)
    }


    /**
     * Create a connection with a Card object to send.
     * @param card
     */
    fun create(card: Card) {
        val connection = Connection()
        connection.onRequestListener(object : Connection.Request {
            override fun onRequestReady(data: CardResponse?) {
                listener?.onCreateTokenReady(data)
            }

            override fun onError(message: String?) {
                listener?.onError(message)
            }
        })
        connection.request(card, Conekta().deviceFingerPrint(activity))
    }
}