# Conekta Android
You can use conekta for tokenize credit cards.

You have two methods for integration conekta-android. Use artifacts or import our module.

## Conekta Android Artifacts (AAR) 1.1
The artifact contains everything you need to start processing mobile payments.

## Conekta Android module

This is an example on how to create Android Apps using conekta-android Tokenizer.

### Instructions
- Clone this project

- From your project go to: File -> New -> Import Module and select conektasdk folder.

- Now, go to: File -> Project Structure... in "modules" select you app and "Dependencies" at top left tab.

- Click plus button (+) and select "conektasdk". That's it.

- Now just import all conekta classes


```java
  // Your code....
  import com.conekta.conektasdk.Conekta;
  import com.conekta.conektasdk.Card;
  import com.conekta.conektasdk.Token;
  import org.json.JSONObject;
  // Your code...
  
  private Activity activity = this;

  Conekta.setPublicKey("key_KJysdbf6PotS2ut2"); //Set public key
  Conekta.setApiVersion("0.3.0"); //Set api version (optional)
  Conekta.collectDevice(activity); //Collect device

  Card card = new Card("Josue Camara", "4242424242424242", "332", "11", "2017");
  Token token = new Token(activity);

  token.onCreateTokenListener( new Token.CreateToken(){
    @Override
    public void onCreateTokenReady(JSONObject data) {
      try {
        Log.d("Token::::", data.getString("id"));
      } catch (Exception err) {
        Log.d("Error: " + err.toString());
      }
    }
  });

  token.create(card);//Create the token
  // Your code....
```
