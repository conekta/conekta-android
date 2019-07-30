![README Cover Image](readme_cover.png)

# Conekta Android
You can use conekta-android for tokenize credit cards.

You have two methods to integrate conekta-android. Use artifacts or include our module.

## Install Conekta Android Artifacts (AAR) 2.1
The artifact contains everything you need to start.

### Instructions
This example uses mavenCentral to install the .aar (conektasdk) artefact.
```
repositories {
    mavenCentral()
}
...
configurations {
    all {
        exclude group: 'commons-logging', module: 'commons-logging'
        exclude module: 'httpclient'
    }
}
...
dependencies {
    implementation fileTree(include: ['*.jar'], dir: 'libs')
    implementation 'com.android.support:appcompat-v7:28.0.0'
    implementation 'org.jbundle.util.osgi.wrapped:org.jbundle.util.osgi.wrapped.org.apache.http.client:4.1.2'
    implementation project(':conektasdk')
}

```
Now just Sync gradle

## Import Conekta Android module 2.0
### Android Studio tested in versions 2.3, 3.0.1

This is an example about how to create Android Apps importing conekta module.

### Instructions

1. Clone this project



## First you will need to open a new Android Project with ´empty´ activity

### 2 Set Android Environment

### 2.1 Add repositories

#### Gradle Scripts>Build.gradle(Project:YourProject)
```java
buildscript {
    
    repositories {
        google()
        jcenter()
  ```    
  ### Add the repository
  
```java    
        mavenCentral()
    }
```

### 1.2 Set versions and dependencies

#### Gradle Scripts>Build.gradle(Project:Module:app)
```java
android {
    compileSdkVersion 28
    defaultConfig {
        applicationId "com.conekta.conektatokenizeandroid"
        minSdkVersion 21
        targetSdkVersion 28
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}


dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'com.android.support:appcompat-v7:28.1.0'
    implementation 'com.android.support.constraint:constraint-layout:1.1.0'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.1'
    implementation 'org.jbundle.util.osgi.wrapped:org.jbundle.util.osgi.wrapped.org.apache.http.client:4.1.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.1'
```
  ### Add the dependency
 
```java
  
    implementation 'io.conekta:conektasdk:2.2'
}

```
### 2 Build tokenize form

#### App>res>layout>activity_main.xml
````java

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_form"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:id="@+id/cardNumberLabel"
        android:layout_width="90dp"
        android:layout_height="wrap_content"
        android:layout_alignBottom="@+id/cardNumber"
        android:layout_alignParentTop="true"
        android:text="Card holder:" />

    <EditText
        android:id="@+id/cardNumber"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:text="4242424242424242" />

    <TextView
        android:id="@+id/cardHolderLabel"
        android:layout_width="90dp"
        android:layout_height="wrap_content"
        android:layout_below="@id/cardNumberLabel"
        android:layout_alignBottom="@+id/cardHolder"
        android:text="Card: number:" />

    <EditText
        android:id="@+id/cardHolder"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:layout_below="@id/cardNumberLabel"
        android:layout_alignParentRight="true"
        android:text="Daniel Diner" />

    <TextView
        android:id="@+id/expirationLabel"

        android:layout_width="90dp"
        android:layout_height="wrap_content"
        android:layout_alignBottom="@+id/year"
        android:layout_below="@id/cardHolderLabel"
        android:text="Expiration:" />

    <EditText
        android:id="@+id/month"
        android:layout_width="80dp"
        android:layout_height="wrap_content"
        android:layout_below="@+id/cardHolderLabel"
        android:layout_toEndOf="@+id/expirationLabel"
        android:layout_toRightOf="@+id/expirationLabel"
        android:text="01" />

    <EditText
        android:id="@+id/year"
        android:layout_width="80dp"
        android:layout_height="wrap_content"
        android:layout_below="@+id/cardHolder"
        android:layout_toEndOf="@+id/month"
        android:layout_toRightOf="@+id/month"
        android:text="2020" />

    <TextView
        android:id="@+id/cvcLabel"
        android:layout_width="90dp"
        android:layout_height="wrap_content"
        android:layout_alignBottom="@+id/cvcNumber"
        android:layout_below="@id/year"
        android:text="CVV:" />

    <EditText
        android:id="@+id/cvcNumber"
        android:layout_width="50dp"
        android:layout_height="wrap_content"
        android:layout_below="@+id/month"
        android:layout_toEndOf="@+id/cvcLabel"
        android:layout_toRightOf="@+id/cvcLabel"
        android:text="123" />

    <TextView
        android:id="@+id/outputLabel"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="OUTPUT:"
        android:layout_below="@id/cvcNumber"
        android:textAppearance="?android:attr/textAppearanceLarge" />

    <Button
        android:id="@+id/btnTokenize"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/outputLabel"
        android:text="Tokenize" />

</RelativeLayout>
`````
## Usage Conekta SDK


### 3 Add Conekta code


### 3.1 Add needed imports
#### App>java>com.conekta.YourProject>MainActivity.java

```java
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import io.conekta.conektasdk.Conekta;
import io.conekta.conektasdk.Card;
import io.conekta.conektasdk.Token;
import org.json.JSONObject;

```

### 3.2 Declare variables from XML

````java
 private Button btnTokenize;
    private TextView outputLabel;
    private EditText cardNumber;
    private EditText cardHolder;
    private EditText cvcNumber;
    private EditText month;
    private EditText year;
    private Activity activity = this;
`````
### 3.3 Add Conekta Code

````java

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Conekta.setPublicKey("key_CBsGarr9nE2Ueds5V5kV7Pw");
        Conekta.setApiVersion("0.3.0"); //Set api version (optional)
        Conekta.collectDevice(activity); //Collect device*/

        outputLabel = (TextView) findViewById(R.id.outputLabel);
        btnTokenize = (Button) findViewById(R.id.btnTokenize);
        cardHolder = (EditText) findViewById(R.id.cardHolder);
        cardNumber = (EditText) findViewById(R.id.cardNumber);
        month = (EditText) findViewById(R.id.month);
        year = (EditText) findViewById(R.id.year);
        cvcNumber = (EditText) findViewById(R.id.cvcNumber);


        btnTokenize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Card card = new Card(cardHolder.getText().toString(),
                        cardNumber.getText().toString(),
                        cvcNumber.getText().toString(),
                        month.getText().toString(),
                        year.getText().toString());


                Token token = new Token(activity);



                token.onCreateTokenListener(new Token.CreateToken() {
                    @Override
                    public void onCreateTokenReady(JSONObject data) {
                        try {
                            outputLabel.setText("Token id: " + data.getString("id"));
                        } catch (Exception error) {
                            outputLabel.setText("Error: " + error.toString());
                        }
                    }
                });
                token.create(card);//Create token
            }
        });


`````
###  Review your manifest
#### App>manifests>AndroidManifest.xml
````java

<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.conekta.conektatokenizeandroid">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">

        <uses-library android:name ="org.apache.http.legacy" android:required ="false"/>

        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>



`````
## Add internet permissions inside your manifest 
`````java
(...)
<uses-permission android:name="android.permission.INTERNET" />

<application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        
 (...)       
`````

## Usage Conekta SDK

Just import all conekta classes from com.conekta namespace


```java
  // Your code....
  import io.conekta.conektasdk.Conekta;
  import io.conekta.conektasdk.Card;
  import io.conekta.conektasdk.Token;
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

### Documentation

Please see [developers.conekta.com/api](https://developers.conekta.com/api) for up-to-date documentation.

### Example
![alt tag](https://raw.githubusercontent.com/conekta/conekta-android/master/readme_files/screen.png?token=AAg1lvVJXYuvYIqmOaIpM0ZW_tMJrM95ks5VCiLhwA%3D%3D)

## License

Developed in Mexico by [Conekta](https://www.conekta.com) in. Available with [MIT License](LICENSE).

***

## We are always hiring!

If you are a comfortable working with a range of backend languages (Java, Python, Ruby, PHP, etc) and frameworks, you have solid foundation in data structures, algorithms and software design with strong analytical and debugging skills. Send us your CV and GitHub to quieroser@conekta.com