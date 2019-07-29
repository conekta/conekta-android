package io.conekta.helloconekta;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.content.Context;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.json.JSONObject;
import android.util.Log;

import com.conekta.conektasdk.*;

public class Form extends Activity {

    private Button btnTokenize;
    private TextView outputView;
    private TextView uuidDevice;
    private EditText numberText;
    private EditText monthText;
    private EditText yearText;
    private EditText cvcText;
    private EditText nameText;
    private Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_form);

        btnTokenize = (Button) findViewById(R.id.btnTokenize);
        outputView = (TextView) findViewById(R.id.outputView);
        uuidDevice = (TextView) findViewById(R.id.uuidDevice);
        numberText = (EditText) findViewById(R.id.numberText);
        nameText = (EditText) findViewById(R.id.nameText);
        monthText = (EditText) findViewById(R.id.monthText);
        yearText = (EditText) findViewById(R.id.yearText);
        cvcText = (EditText) findViewById(R.id.cvcText);

        btnTokenize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean haveInternet = isOnline();
                if (haveInternet) {

                    Conekta.setPublicKey("EpnQNGMghzDrytvfpqtG");
                    Conekta.setApiVersion("0.3.0");
                    Conekta.collectDevice(activity);
                    Card card = new Card(nameText.getText().toString(), numberText.getText().toString(), cvcText.getText().toString(), monthText.getText().toString(), yearText.getText().toString());
                    Token token = new Token(activity);

                    //Listen when token is returned
                    token.onCreateTokenListener(new Token.CreateToken() {

                        @Override
                        public void onCreateTokenReady(JSONObject data) {

                            try {
                                Log.d("The token::::", data.getString("id"));
                                outputView.setText("Token id: " + data.getString("id"));
                            } catch (Exception err) {
                                outputView.setText("Error: " + err.toString());
                            }
                            uuidDevice.setText("Uuid device: " + Conekta.deviceFingerPrint(activity));
                        }
                    });

                    //Request for create token
                    token.create(card);
                } else {
                    outputView.setText("You don't have internet");
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
