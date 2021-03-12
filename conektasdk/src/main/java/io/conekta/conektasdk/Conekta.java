package io.conekta.conektasdk;

import android.app.Activity;
import android.os.Build;
import android.provider.Settings;
import android.webkit.WebView;
import android.webkit.CookieManager;

/**
 * POJO of the object Conekta.
 */
public abstract class Conekta {
    private static String apiVersion = "0.3.0";
    private static String baseUri = "https://api.conekta.io";
    private static String language = "es";
    private static String publicKey = "";

    /**
     * Return the Api version.
     * @return a string of the api version.
     */
    public static String getApiVersion() {
        return Conekta.apiVersion;
    }

    /**
     * Return the public key of Conekta api.
     * @return a String of the public key.
     */
    public static String getPublicKey() {
        return Conekta.publicKey;
    }

    /**
     * Return the language of Conekta api.
     * @return String with the language.
     */
    public static String getLanguage() {
        return Conekta.language;
    }

    /**
     * Return the base uri.
     * @return a String of the base uri
     */
    public static String getBaseUri() {
        return Conekta.baseUri;
    }

    /**
     * Set the api version of Conekta.
     * @param apiVersion is the String of the api version.
     */
    public static void setApiVersion(String apiVersion) {
        Conekta.apiVersion = apiVersion;
    }

    /**
     * Set the public key.
     * @param publicKey
     */
    public static void setPublicKey(String publicKey) {
        Conekta.publicKey = publicKey;
    }

    /**
     * Set the language of the api.
     * @param language
     */
    public static void setLanguage(String language) {
        Conekta.language = language;
    }

    /**
     * Create a connection with the api Conekta.
     * @param activity The activity from where it was called.
     */
    public static void collectDevice(final Activity activity) {
        String sessionId = Conekta.deviceFingerPrint(activity);
        String publicKey = Conekta.getPublicKey();
        if(publicKey.isEmpty())
            throw new RuntimeException("publicKey empty");

        String html = "<!DOCTYPE html><html><head></head><body style=\"background: blue;\">";
        html += "<script type=\"text/javascript\" src=\"https://conektaapi.s3.amazonaws.com/v0.5.0/js/conekta.js\" data-conekta-public-key=\"" + publicKey + "\" data-conekta-session-id=\"" + sessionId + "\"></script>";
        html += "</body></html>";

        WebView webView = new WebView(activity);

        CookieManager.getInstance().setAcceptCookie(true);
        if (Build.VERSION.SDK_INT >= 21)
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.loadDataWithBaseURL("https://conektaapi.s3.amazonaws.com/v0.5.0/js/conekta.js", html, "text/html", "UTF-8", null);
    }

    /**
     * Return a device finger print.
     * @param activity The activity from where it was called.
     * @return the String of device finger print.
     */
    public static String deviceFingerPrint(Activity activity) {
        return Settings.Secure.getString(activity.getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
    }
}