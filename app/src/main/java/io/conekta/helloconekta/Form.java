//------------------------------------------------------------- Application form
package io.conekta.helloconekta;
//------------------------------------------------------------- Imports
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
import android.util.Log;
import android.widget.Toast;

import org.json.JSONObject;

import io.conekta.conektasdk.Card;
import io.conekta.conektasdk.Conekta;
import io.conekta.conektasdk.Token;
//------------------------------------------------------------- Application sdk form class
/**
 * Application form class
 */
public class Form extends Activity {
    //--------------------------------------------------------- Variables
    private Button buttonTokenize;
    private Activity activity = this;
    private Boolean hasValidCardData;
    private TextView outputView, uuidDevice;
    private EditText numberText, monthText, yearText, cvcText, nameText;
    private String cardName, cardNumber, cardCvc, cardMonth, cardYear; //card data strings
    private String tokenIdTag, errorTag, uuidDeviceTag; //tags strings
    //--------------------------------------------------------- Constants
    private static final String PUBLIC_KEY = "zbp4axNG4xVUMcDzTLNz";
    private static final String API_VERSION = "0.3.0";
    //--------------------------------------------------------- Methods
    /**
     * Is a method of Android System where initialize the activity.
     * Initialize views on this function
     * Initialize inputs listeners
     * @param savedInstanceState is the default Bundle of Android
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        initializeViewForm();
        setListeners();
    }

    /**
     * System override method, launched when the user enter to the activity form.
     */
    @Override
    protected void onStart() {
        super.onStart();
        initializeTags();
    }

    /**
     * System override method to create a option menu bar
     * @param menu menu type
     * @return always value true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_form, menu);
        return true;
    }

    /**
     * Method to add items to the menu bar
     * @param item type item
     * @return true value if an item is chosen otherwise false
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int itemId = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (itemId == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Method to initialize tags text
     */
    private void initializeTags(){
        tokenIdTag = getResources().getString(R.string.theTokenIdLabel); // The token id:
        errorTag = getResources().getString(R.string.errorLabel); // Error:
        uuidDeviceTag = getResources().getString(R.string.uuidDeviceLabel); // Uuid device:
    }

    /**
     * Initialize all inputs from view
     */
    private void initializeViewForm(){
        buttonTokenize = findViewById(R.id.btnTokenize);
        outputView = findViewById(R.id.outputView);
        uuidDevice = findViewById(R.id.uuidDevice);
        numberText = findViewById(R.id.numberText);
        nameText = findViewById(R.id.nameText);
        monthText = findViewById(R.id.monthText);
        yearText = findViewById(R.id.yearText);
        cvcText = findViewById(R.id.cvcText);
    }

    /**
     * Method to set inputs listeners
     */
    private void setListeners(){
        buttonTokenize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onPressTokenizeButton();
            }
        });
    }

    /**
     * Method triggered when press tokenize button to get a token from the card data received
     */
    private void onPressTokenizeButton(){
        if (hasInternetConnection()) {
            Conekta.setPublicKey(PUBLIC_KEY);
            Conekta.setApiVersion(API_VERSION);
            Conekta.collectDevice(activity);

            getCardData();

            if (hasValidCardData) {
                Card card = new Card(cardName, cardNumber, cardCvc, cardMonth, cardYear);
                Token token = new Token(activity);

                //Listen when token is returned
                token.onCreateTokenListener(new Token.CreateToken() {
                    @Override
                    public void onCreateTokenReady(JSONObject data) {
                        showTokenResult(data);
                    }
                });

                //Request for create token
                token.create(card);
            } else {
                Toast.makeText(Form.this, getResources().getString(R.string.cardDataIncomplete), Toast.LENGTH_LONG).show();
            }
        } else {
            outputView.setText(getResources().getString(R.string.needInternetConnection));
        }
    }

    /**
     * Method to get card data
     */
    private void getCardData(){
        hasValidCardData = true;

        cardName = nameText.getText().toString();
        cardNumber = numberText.getText().toString();
        cardCvc = cvcText.getText().toString();
        cardMonth = monthText.getText().toString();
        cardYear = yearText.getText().toString();

        if (cardName.equals("") || cardNumber.equals("") || cardCvc.equals("") || cardMonth.equals("") || cardYear.equals("")) {
            hasValidCardData = false;
        }
    }

    /**
     * Method to check device internet connection
     * @return true value in case of success internet connection otherwise false
     */
    private boolean hasInternetConnection () {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();

        return netInfo != null && netInfo.isConnected();
    }

    /**
     * Method to show on device the token result
     * @param data token data
     */
    private void showTokenResult(JSONObject data){
        try {
            String tokenId = data.getString("id");
            String tokenMessage = tokenIdTag +" "+ tokenId;

            outputView.setText(tokenMessage);
            Log.d(tokenIdTag, tokenId);
        } catch (Exception error) {
            String errorMessage = errorTag +" "+ error.toString();
            outputView.setText(errorMessage);
        }

        String uuidMessage = uuidDeviceTag +" "+ Conekta.deviceFingerPrint(activity);
        uuidDevice.setText(uuidMessage);
    }
}
