package io.conekta.conektasdk;

import android.app.Activity;
import android.os.Build;
import android.provider.Settings;
import android.webkit.WebView;
import android.webkit.CookieManager;

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

    public static String deviceFingerPrint(Activity activity) {
        return Settings.Secure.getString(activity.getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
    }
}