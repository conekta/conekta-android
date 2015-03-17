package io.conekta.helloconekta;

import org.json.JSONObject;

/**
 * Created by mauriciomurga on 3/2/15.
 */

import com.conekta.*;

import io.conekta.helloconekta.compat.AsyncTask;

import android.provider.Settings.Secure;


public abstract class ConektaAndroid {

    public static String publicKey;

    public static void setApiKey(String publicKey) {
        ConektaAndroid.publicKey = publicKey;
        com.conekta.Conekta.setApiKey(publicKey);
    }

    public static void tokenizeCard(final JSONObject card, final ConektaCallback callback) {
        if (card == null) {
            throw new RuntimeException("Parameter Validation Error: missing card");
        }
        if (callback == null) {
            throw new RuntimeException("Parameter Validation Error: missing callback to hander errors");
        }

        AsyncTask<Void, Void, Response> task = new AsyncTask<Void, Void, Response>() {
            protected Response doInBackground(Void... params) {
                try {
                    JSONObject tokenParams = new JSONObject();
                    tokenParams.put("card", ((JSONObject) card.get("card")).put("device_fingerprint", Secure.ANDROID_ID));
                    Token token = Token.create(tokenParams);
                    return new Response(token, null);
                } catch (Exception e) {
                    return new Response(null, e);
                }
            }

            protected void onPostExecute(Response result) {
                if (result.token != null) {
                    callback.success(result.token);
                } else if (result.error != null) {
                    callback.failure(result.error);
                }
            }
        };
        task.execute();

    }

    private static class Response {
        public final Token token;
        public final Exception error;

        private Response(Token token, Exception error) {
            this.error = error;
            this.token = token;
        }
    }
}