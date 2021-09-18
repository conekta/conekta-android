package io.conekta.conektasdk

import io.conekta.conektasdk.Conekta
import android.app.Activity
import android.os.Build
import android.provider.Settings
import android.webkit.CookieManager
import android.webkit.WebView
import java.lang.RuntimeException

/**
 * POJO of the object Conekta.
 */
class Conekta {

    companion object {
    /**
     * Return the Api version.
     * @return a string of the api version.
     */


        /**
     * Set the api version of Conekta.
     * @param apiVersion is the String of the api version.
     */
    var apiVersion = "0.3.0"

    /**
     * Return the base uri.
     * @return a String of the base uri
     */
    const val baseUri = "https://api.conekta.io"
    /**
     * Return the language of Conekta api.
     * @return String with the language.
     */
    /**
     * Set the language of the api.
     * @param language
     */
    const val language = "es"
    /**
     * Return the public key of Conekta api.
     * @return a String of the public key.
     */
    /**
     * Set the public key.
     * @param publicKey
     */
    var publicKey = ""

    }

    /**
     * Create a connection with the api Conekta.
     * @param activity The activity from where it was called.
     */
    fun collectDevice(activity: Activity) {
        val sessionId = deviceFingerPrint(activity)
        val publicKey = publicKey
        if (publicKey.isEmpty()) throw RuntimeException("publicKey empty")
        var html = "<!DOCTYPE html><html><head></head><body style=\"background: blue;\">"
        html += "<script type=\"text/javascript\" src=\"https://conektaapi.s3.amazonaws.com/v0.5.0/js/conekta.js\" data-conekta-public-key=\"$publicKey\" data-conekta-session-id=\"$sessionId\"></script>"
        html += "</body></html>"
        val webView = WebView(activity)
        CookieManager.getInstance().setAcceptCookie(true)
        if (Build.VERSION.SDK_INT >= 21) CookieManager.getInstance()
            .setAcceptThirdPartyCookies(webView, true)
        webView.settings.javaScriptEnabled = true
        webView.settings.allowContentAccess = true
        webView.settings.databaseEnabled = true
        webView.settings.domStorageEnabled = true
        webView.loadDataWithBaseURL(
            "https://conektaapi.s3.amazonaws.com/v0.5.0/js/conekta.js",
            html,
            "text/html",
            "UTF-8",
            null
        )
    }

    /**
     * Return a device finger print.
     * @param activity The activity from where it was called.
     * @return the String of device finger print.
     */
    fun deviceFingerPrint(activity: Activity): String {
        return Settings.Secure.getString(
            activity.applicationContext.contentResolver,
            Settings.Secure.ANDROID_ID
        )
    }
}