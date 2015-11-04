package com.conekta.conektasdk;

import android.app.Activity;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by picharras on 27/10/15.
 */
public class Token {
    private String endPoint = "/tokens";
    private Activity activity;

    public interface CreateToken {
        public void onCreateTokenReady(JSONObject data);
    }

    private CreateToken listener;

    public Token() {
        this.listener = null;
    }

    public void onCreateTokenListener (CreateToken listener) {
        this.listener = listener;
    }

    public Token(Activity activity) {
        this.activity = activity;
    }

    public void create(Card card) {
        /* Remember add to index of nameValuePair if you add more rows */
        List<NameValuePair> nameValuePair = new ArrayList<NameValuePair>(6);

        nameValuePair.add(new BasicNameValuePair("card[number]", card.getNumber()));
        nameValuePair.add(new BasicNameValuePair("card[name]", card.getName()));
        nameValuePair.add(new BasicNameValuePair("card[cvc]", card.getCvc()));
        nameValuePair.add(new BasicNameValuePair("card[exp_month]", card.getExpMonth()));
        nameValuePair.add(new BasicNameValuePair("card[exp_year]", card.getExpYear()));
        nameValuePair.add(new BasicNameValuePair("card[device_fingerprint]", Conekta.collectDevice(activity)));

        Connection connection = new Connection();

        connection.onRequestListener(new Connection.Request() {
            @Override
            public void onRequestReady(String data) {
                JSONObject obj;
                try {
                     obj = new JSONObject(data);

                } catch (Exception err) {
                    obj = new JSONObject();
                }
                listener.onCreateTokenReady(obj);
            }
        });
        connection.request(nameValuePair, this.endPoint);
    }
}
