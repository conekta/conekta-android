# Conekta Android Example

This is an example on how to create Android Apps using conekta-android.

# Usage
To be able to use conekta-android a ConektaAndroid object must be initialized with your conekta api public key.
To tokenize a card you have to create a ConektaCallback that will handle the response.
```
ConektaAndroid tokenizer = new ConektaAndroid("key_KJysdbf6PotS2ut2", this);
tokenizer.tokenizeCard(card, new ConektaCallback() {
    public void success(Token token) {
        // Send token to your web service to create the charge
        AsyncTask<Void, Void, ChargeResponse> task = new AsyncTask<Void, Void, ChargeResponse>() {
          protected ChargeResponse doInBackground(Void... params) {
            return WebService.Charge.create(token);
          }
          protected void onPostExecute(ChargeResponse response) {
            // Handle Response
          }
          task.execte();
        };
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
```
# Manifest
The tokenizer needs to be able to collect data from the devise for fraud detection. The following permissions need to be added in the manifest.xml:

```
<manifest ...>
    <uses-permission android:name="android.permission.INTERNET" />
    <!-- device collector permissions -->
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
    <!-- device collector permissions -->
    ...
</manifest>
```
# Example
![alt tag](https://raw.githubusercontent.com/conekta/conekta-android/master/readme_files/screen.png?token=AAg1lvVJXYuvYIqmOaIpM0ZW_tMJrM95ks5VCiLhwA%3D%3D)