# Conekta Android
You can use conekta-android for tokenize credit cards.

You have two methods to integrate conekta-android. Use artifacts or include our module.

## Install Conekta Android Artifacts (AAR) 2.0
The artifact contains everything you need to start.

### Instructions
This example uses mavenCentral to install the .aar (conektasdk) artefact.
```
repositories {
    mavenCentral()
}
...
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile 'com.android.support:appcompat-v7:21.0.3'
    compile 'io.conekta:conektasdk:2.0'
}
```
Now just Sync gradle

## Import Conekta Android module 2.0

This is an example about how to create Android Apps importing conekta module.

### Instructions
1. Clone this project

2. On your Android Studio go to: ```File -> New -> Import Module``` and find ```conektasdk``` folder on your file system.

3. Go to ```File -> Project Structure...```, this will open a window, then choose on Modules section your app, then click on Dependencies tab, then click on + button, and on Module dependency dialog, choose ```conektasdk```.

## Usage Conekta SDK

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
        //TODO: Create charge
        Log.d("Token::::", data.getString("id"));
      } catch (Exception err) {
      //TODO: Handle error
        Log.d("Error: " + err.toString());
      }
    }
  });

  token.create(card);//Create token
  // Your code below....
```

# Use conekta-android with Proguard

Just add

```
-keep class com.conekta.** { ; }
```


### Example
![alt tag](https://raw.githubusercontent.com/conekta/conekta-android/master/readme_files/screen.png?token=AAg1lvVJXYuvYIqmOaIpM0ZW_tMJrM95ks5VCiLhwA%3D%3D)

We are hiring
-------------

If you are a comfortable working with a range of backend languages (Java, Python, Ruby, PHP, etc) and frameworks, you have solid foundation in data structures, algorithms and software design with strong analytical and debugging skills. 
Send your CV, github to quieroser@conekta.io
