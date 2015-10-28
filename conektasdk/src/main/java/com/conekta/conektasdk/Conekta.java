package com.conekta.conektasdk;

import android.app.Activity;
import android.provider.Settings;

/**
 * Created by picharras on 27/10/15.
 */
public class Conekta {
    public static String apiVersion = "0.3.0";
    public static String baseUril = "https://api.conekta.io";
    public static String publicKey = "";

    public static String collectDevice(Activity activity) {
        String sessionId = Settings.Secure.getString(activity.getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
        return sessionId;

    }

    public static void deviceFingerPrint(Activity activity) {

        String sessionId = Conekta.collectDevice(activity);
        String publicKey = Conekta.publicKey;

        String html = "<html style=\"background: blue;\"><head></head><body>";
        html += "<script type=\"text/javascript\" src=\"https://conektaapi.s3.amazonaws.com/v0.5.0/js/conekta.js\" data-public-key=\"" + publicKey + "\" data-session-id=\"" + sessionId + "\"></script>";
        html += "</body></html>";
    }
}
