package io.conekta.helloconekta;

import org.json.JSONObject;

import java.util.concurrent.Executor;

/**
 * Created by mauriciomurga on 3/2/15.
 */

import com.conekta.*;

import io.conekta.helloconekta.compat.AsyncTask;
import android.provider.Settings.Secure;


public class Conekta {

    private String publicKey;
    public Tokenizer tokenizer;

    public Conekta(String publicKey) {
        this.publicKey = publicKey;
        com.conekta.Conekta.setApiKey(publicKey);
        this.tokenizer = new Tokenizer();
    }

    private class Response {
        public final Token token;
        public final Exception error;

        private Response(Token token, Exception error) {
            this.error = error;
            this.token = token;
        }
    }

    public class Tokenizer{
        public void create(final JSONObject card, final ConektaCallback callback) {
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
    }

    public void tokenizeCard(final JSONObject card, final ConektaCallback callback) {
        if (card == null) {
            throw new RuntimeException("Parameter Validation Error: missing card");
        }
        if (callback == null) {
            throw new RuntimeException("Parameter Validation Error: missing callback to hander errors");
        }

        tokenizer.create(card, callback);
    }
}