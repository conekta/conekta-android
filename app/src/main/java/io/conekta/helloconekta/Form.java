package io.conekta.helloconekta;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import com.conekta.*;
import com.conekta.Error;

public class Form extends ActionBarActivity {

    Conekta conekta = new Conekta("key_KJysdbf6PotS2ut2");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }

    public void tokenizeCard(View view) {
        EditText nameText = (EditText) this.findViewById(R.id.nameText);
        EditText numberText = (EditText) this.findViewById(R.id.numberText);
        EditText monthText = (EditText) this.findViewById(R.id.monthText);
        EditText yearText = (EditText) this.findViewById(R.id.yearText);
        EditText cvcText = (EditText) this.findViewById(R.id.cvcText);
        final TextView outputView = (TextView) this.findViewById(R.id.outputView);
        try {
            JSONObject card = new JSONObject(
                    "{'card':" +
                            "{" +
                            "'name': '"+ String.valueOf(nameText.getText()) + "'," +
                            "'number': '"+ String.valueOf(numberText.getText()).trim() + "'," +
                            "'exp_month': '"+ String.valueOf(monthText.getText()).trim() + "'," +
                            "'exp_year': '"+ String.valueOf(yearText.getText()).trim() + "'," +
                            "'cvc': '"+ String.valueOf(cvcText.getText()).trim() + "'" +
                            "}" +
                    "}");
            conekta.tokenizeCard(card,
                    new ConektaCallback() {
                        public void success(Token token) {
                            // Send token to your web service to create the charge
                            //MyServer.chargeToken(token);
                            outputView.setText(token.id);
                        }

                        public void failure(Exception error) {
                            // Output the error in your app
                            String result = null;
                            if (error instanceof com.conekta.Error)
                                result = ((com.conekta.Error) error).message_to_purchaser;
                            else
                                result = error.getMessage();
                            outputView.setText(result);
                        }
                    });
        } catch (JSONException e) {
            e.printStackTrace();
        }
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
