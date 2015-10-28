# Conekta Android Artifacts (AAR) 1.1
The artifact contains everything you need to start processing mobile payments.

# Conekta Android Example

This is an example on how to create Android Apps using conekta-android Tokenizer.

# Usage
To be able to use the Tokenizer a Tokenizer object must be initialized with your conekta api public key.
To tokenize a card you have to create a ConektaCallback that will handle the response.
```
import io.conekta.tokenizer.Tokenizer;
import io.conekta.tokenizer.TokenizerCallback;
import com.conekta.Token;
import com.conekta.Error;
Tokenizer tokenizer = new Tokenizer("key_KJysdbf6PotS2ut2", this);
tokenizer.tokenizeCard(card, new TokenizerCallback() {
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
        if (error instanceof Error)
            result = ((Error) error).message_to_purchaser;
        else
            result = error.getMessage();
        outputView.setText(result);
    }
});
```
# Installation
This example uses mavenLocal to install the .aar (Tokenizer) artefact.
```
repositories {
    mavenCentral()
    mavenLocal()
}
...
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile 'com.android.support:appcompat-v7:21.0.3'
    compile 'io.conekta:tokenizer:1.0'
}
```
To install the tokenizer in Maven locally use the following command:
```
mvn install:install-file -Dfile=app/libs/tokenizer-release.aar -DgroupId=io.conekta -DartifactId=tokenizer -Dversion=1.0 -Dpackaging=aar
```

# Use conekta-android with Proguard

Just add

```
-keep class com.conekta.** { ; }
```


# Example
![alt tag](https://raw.githubusercontent.com/conekta/conekta-android/master/readme_files/screen.png?token=AAg1lvVJXYuvYIqmOaIpM0ZW_tMJrM95ks5VCiLhwA%3D%3D)

We are hiring
-------------

If you are a comfortable working with a range of backend languages (Java, Python, Ruby, PHP, etc) and frameworks, you have solid foundation in data structures, algorithms and software design with strong analytical and debugging skills. 
Send your CV, github to quieroser@conekta.io
