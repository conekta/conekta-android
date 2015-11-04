package com.conekta.conektasdk;

import android.app.Activity;
import android.provider.Settings;
import android.webkit.WebView;
import android.webkit.CookieManager;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.content.SharedPreferences.Editor;

/**
 * Created by picharras on 27/10/15.
 */
public abstract class Conekta {
    private static String apiVersion = "0.3.0";
    private static String baseUri = "https://api.conekta.io";
    private static String language = "es";
    private static String publicKey = "";

    public static String getApiVersion() {
        return Conekta.apiVersion;
    }

    public static void setApiVersion(String apiVersion) {
        Conekta.apiVersion = apiVersion;
    }

    public static String getPublicKey() {
        return Conekta.publicKey;
    }

    public static void setPublicKey(String publicKey) {
        Conekta.publicKey = publicKey;
    }

    public static String getBaseUri() {
        return Conekta.baseUri;
    }

    public static void setLanguage(String language) {
        Conekta.language = language;
    }

    public static String getLanguage() {
        return Conekta.language;
    }

    public static String collectDevice(Activity activity) {
        String sessionId = Settings.Secure.getString(activity.getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
        return sessionId;
    }

    public static void deviceFingerPrint(final Activity activity) {

        String sessionId = Conekta.collectDevice(activity);
        String publicKey = Conekta.getPublicKey();
        if(publicKey.isEmpty())
            throw new RuntimeException("publicKey empty");

        String html = "<!DOCTYPE html><html><head></head><body style=\"background: blue;\">";
        html += "<script type=\"text/javascript\" src=\"https://conektaapi.s3.amazonaws.com/v0.5.0/js/conekta.js\" data-conekta-public-key=\"" + publicKey + "\" data-conekta-session-id=\"" + sessionId + "\"></script>";
        html += "</body></html>";

        WebView webView = new WebView(activity);

        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.loadDataWithBaseURL("https://conektaapi.s3.amazonaws.com/v0.5.0/js/conekta.js", html, "text/html", "UTF-8", null);

        Log.e("Agregado webview", "Agredado");
    }
}
