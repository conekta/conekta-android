# Conekta Android
You can use conekta-android for tokenize credit cards.

You have two methods for integration conekta-android. Use artifacts or import our module.

## Install Conekta Android Artifacts (AAR) 2.0
The artifact contains everything you need to start processing mobile payments.

### Instructions
This example uses mavenLocal to install the .aar (conektasdk) artefact.
```
repositories {
    mavenCentral()
    mavenLocal()
}
...
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile 'com.android.support:appcompat-v7:21.0.3'
    compile 'com.conekta:conektasdk:2.0'
}

```
To install the tokenizer in Maven locally use the following command:

```
mvn install:install-file -Dfile=app/libs/conektasdk-release.aar -DgroupId=com.conekta -DartifactId=conektasdk -Dversion=1.0 -Dpackaging=aar
```

## Import Conekta Android module 2.0

This is an example on how to create Android Apps importing module conekta.

### Instructions
- Clone this project

- From your project go to: ```File -> New -> Import Module``` and select ```conektasdk``` folder.

- Now, go to: ```File -> Project Structure...``` in ```modules``` select you app and ```Dependencies``` at top left tab.

- Click plus button (+) and select ```conektasdk```. That's it.


## Use Conekta SDK
Just import all conekta classes from com.conekta namespace


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
        //TODO: Make a charge
        Log.d("Token::::", data.getString("id"));
      } catch (Exception err) {
      //TODO: Manage error
        Log.d("Error: " + err.toString());
      }
    }
  });

  token.create(card);//Create the token
  // Your code....
```

We are hiring
-------------

If you are a comfortable working with a range of backend languages (Java, Python, Ruby, PHP, etc) and frameworks, you have solid foundation in data structures, algorithms and software design with strong analytical and debugging skills. 
Send your CV, github to quieroser@conekta.io