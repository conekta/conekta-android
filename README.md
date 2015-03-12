# Conekta Android Example

This is an example on how to create Android Apps using conekta-android.

# Usage
To be able to use conekta-android a Conekta object must be initialized with your conekta api public key.
To tokenize a card you have to create a ConektaCallback that will handle the response.
```
Conekta conekta = new Conekta("key_KJysdbf6PotS2ut2");
conekta.tokenizeCard(card, new ConektaCallback() {
    public void success(Token token) {
        // Send token to your web service to create the charge
        WebService.Charge.create(token);
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
![alt tag](https://raw.githubusercontent.com/conekta/conekta-android/master/readme_files/screen.png?token=AAg1lvVJXYuvYIqmOaIpM0ZW_tMJrM95ks5VCiLhwA%3D%3D)