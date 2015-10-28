package com.conekta.conektasdk;

import android.os.AsyncTask;
import org.json.JSONObject;
import org.apache.http.client.HttpClient;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Created by picharras on 27/10/15.
 */
public class Connection extends  AsyncTask<Void, Integer, Boolean> {
    JSONObject jsonResult;

    @Override
    protected Boolean doInBackground(Void... params) {
        HttpClient http = new DefaultHttpClient();
        HttpPost httpDomain = new HttpPost(Conekta.baseUril);
        httpDomain.setHeader("Accept", "application/json");
        httpDomain.setHeader("content-type", "application/json");

        try {
            HttpResponse response = http.execute(httpDomain);
            String result = EntityUtils.toString(response.getEntity());
            jsonResult = new JSONObject(result);
        } catch (Exception ex) {
            System.console();
        }
        return true;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {

    }

    @Override
    protected void onPreExecute() {
        //progress = ProgressDialog.show(Main.this, getString(R.string.looking),getString(R.string.looking_wait));
    }

    @Override
    protected void onPostExecute(Boolean result) {

    }

}
