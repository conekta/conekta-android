package io.conekta.helloconekta;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.content.Context;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.*;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.conekta.conektasdk.*;

public class Form extends Activity {

    private Button btnTokenize;
    private TextView outputView;
    private Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        btnTokenize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean haveInternet = isOnline();
                if (haveInternet) {
                    Conekta.publicKey = "key_KJysdbf6PotS2ut2";
                    Conekta.apiVersion = "0.3.0";
                    String id = Conekta.collectDevice(activity);
                    Card card = new Card("Josue Camara", "4242424242424242", "456", "11", "2016");
                    Token token = new Token();

                    outputView.setText("");
                } else {
                    outputView.setText("No hay internet");
                }
            }
        });
    }

    public boolean isOnline () {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnected()) {
            return true;
        }
        return false;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_form, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
