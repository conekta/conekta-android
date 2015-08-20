package io.conekta.tokenizer;

import org.json.JSONObject;

/**
 * Created by mauriciomurga on 3/2/15.
 */

import com.conekta.*;
import io.conekta.tokenizer.compat.AsyncTask;

import android.app.Activity;
import android.provider.Settings.Secure;

import com.devicecollector.DeviceCollector;
import com.devicecollector.DeviceCollector.ErrorCode;


public class Tokenizer implements DeviceCollector.StatusListener {

    private String publicKey;
    private DeviceCollector dc;
    private String sessionId;

    public Tokenizer(String publicKey, Activity activity) {
        this.setApiKey(publicKey);
        this.setDeviceCollector(activity);
    }

    private void setApiKey(String publicKey) {
        this.publicKey = publicKey;
        com.conekta.Conekta.setApiKey(publicKey);
    }

    private void setDeviceCollector(Activity activity) {
        this.dc = new DeviceCollector(activity);
        this.dc.setStatusListener(this);
        this.dc.setMerchantId("205000");
        this.dc.setCollectorUrl("https://api.conekta.io/fraud_providers/kount/logo.htm");
        this.sessionId = Secure.getString(activity.getApplicationContext().getContentResolver(), Secure.ANDROID_ID);
    }

    public void tokenizeCard(final JSONObject card, final TokenizerCallback callback) {
        if (card == null) {
            throw new RuntimeException("Parameter Validation Error: missing card");
        }
        if (callback == null) {
            throw new RuntimeException("Parameter Validation Error: missing callback to handler errors");
        }
        final String s = this.sessionId;
        this.dc.collect(s);
        AsyncTask<Void, Void, Response> task = new AsyncTask<Void, Void, Response>() {
            protected Response doInBackground(Void... params) {
                try {
                    JSONObject tokenParams = new JSONObject();
                    tokenParams.put("card", ((JSONObject) card.get("card")).put("device_fingerprint", s));
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

    @Override
    public void onCollectorStart() {
        System.out.println("Device Collector Started");
    }

    @Override
    public void onCollectorSuccess() {
        System.out.println("Device Collector Finished Successfully!!!!");
    }

    @Override
    public void onCollectorError(ErrorCode errorCode, Exception e) {
        String error = null;
        if (null != e) {
            if (errorCode.equals(ErrorCode.MERCHANT_CANCELLED)) {
                error += "Merchant Cancelled\n";
            } else {
                error += "Device Collector Failed. It had an error [" + errorCode + "]:" + e.getMessage();
                error += "Stack Trace:";
                for (StackTraceElement element : e.getStackTrace()) {
                    error += element.getClassName() + " " + element.getMethodName() + "(" + element.getLineNumber() + ")";
                }
            }
        } else {
            error += "Device Collector failed. It had an error [" + errorCode + "]:";
        }
        throw new RuntimeException(error);
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