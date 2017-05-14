package com.conekta.conektasdk;

import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.HttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.http.NameValuePair;
import org.apache.http.HttpResponse;
import android.os.AsyncTask;
import android.util.Base64;
import java.util.ArrayList;
import android.util.Log;
import java.util.List;

/**
 * Created by picharras on 27/10/15.
 */
public class Connection {
    private List<NameValuePair> nameValuePair;
    private String endPoint;

    public interface Request {
        public void onRequestReady(String data);
    }

    private Request listener;

    public Connection() {
        this.listener = null;
    }

    // Assign the listener implementing events interface that will receive the events
    public void onRequestListener (Request listener) {
        this.listener = listener;
    }

    public void request(List<NameValuePair> nameValuePair, String endPoint) {
        this.nameValuePair = nameValuePair;
        this.endPoint = endPoint;
        try {
            new Task().execute();
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }

    private class Task extends AsyncTask<Void, Void, String> {

        protected String doInBackground(Void...params) {
            String result;

            HttpClient http = new DefaultHttpClient();
            HttpPost httpRequest = new HttpPost(Conekta.getBaseUri() + endPoint);
            String encoding = Base64.encodeToString( Conekta.getPublicKey().getBytes(), Base64.NO_WRAP);

            try {
                httpRequest.setHeader("Accept", "application/vnd.conekta-v" + Conekta.getApiVersion() + "+json");
                httpRequest.setHeader("Accept-Language", Conekta.getLanguage());
                httpRequest.setHeader("Conekta-Client-User-Agent", "{\"agent\": \"Conekta Android SDK\"}");
                httpRequest.setHeader("Authorization", "Basic " + encoding);
                httpRequest.setEntity(new UrlEncodedFormEntity(nameValuePair));

                HttpResponse response = http.execute(httpRequest);
                result = EntityUtils.toString(response.getEntity());
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            return result;
        }

        @Override
        protected void onPreExecute() {

        }

        @Override
        protected void onPostExecute(String result) {
            listener.onRequestReady(result);
        }

    }

}
