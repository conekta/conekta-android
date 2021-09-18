//------------------------------------------------------------- Application form
package io.conekta.helloconekta

import android.app.Activity
import android.os.Bundle
import android.net.ConnectivityManager
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import io.conekta.conektasdk.Card
import io.conekta.conektasdk.CardResponse
import io.conekta.conektasdk.Conekta
import io.conekta.conektasdk.Conekta.Companion.apiVersion
import io.conekta.conektasdk.Conekta.Companion.publicKey
import io.conekta.conektasdk.Token
import java.lang.Exception

//------------------------------------------------------------- Imports
//------------------------------------------------------------- Application sdk form class
/**
 * Application form class
 */
class Form : Activity(), Token.CreateToken {
    //--------------------------------------------------------- Variables
    private var buttonTokenize: Button? = null
    private val activity: Activity = this
    private var hasValidCardData: Boolean? = null
    private var outputView: TextView? = null
    private var uuidDevice: TextView? = null
    private var numberText: EditText? = null
    private var monthText: EditText? = null
    private var yearText: EditText? = null
    private var cvcText: EditText? = null
    private var nameText: EditText? = null
    private var cardName: String? = null
    private var cardNumber: String? = null
    private var cardCvc: String? = null
    private var cardMonth: String? = null
    private var cardYear //card data strings
            : String? = null
    private var tokenIdTag: String? = null
    private var errorTag: String? = null
    private var uuidDeviceTag //tags strings
            : String? = null
    private var progressBar: ProgressBar? = null
    private var fadeRect: View? = null
    //--------------------------------------------------------- Methods
    /**
     * Is a method of Android System where initialize the activity.
     * Initialize views on this function
     * Initialize inputs listeners
     * @param savedInstanceState is the default Bundle of Android
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        initializeViewForm()
        setListeners()
    }

    /**
     * System override method, launched when the user enter to the activity form.
     */
    override fun onStart() {
        super.onStart()
        initializeTags()
        enableInputs()
        disableProgressBar()
    }

    /**
     * System override method to create a option menu bar
     * @param menu menu type
     * @return always value true
     */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_form, menu)
        return true
    }

    /**
     * Method to add items to the menu bar
     * @param item type item
     * @return true value if an item is chosen otherwise false
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val itemId = item.itemId
        return if (itemId == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)
    }

    /**
     * Method to initialize tags text
     */
    private fun initializeTags() {
        tokenIdTag = resources.getString(R.string.theTokenIdLabel) // The token id:
        errorTag = resources.getString(R.string.errorLabel) // Error:
        uuidDeviceTag = resources.getString(R.string.uuidDeviceLabel) // Uuid device:
    }

    /**
     * Initialize all inputs from view
     */
    private fun initializeViewForm() {
        buttonTokenize = findViewById(R.id.btnTokenize)
        outputView = findViewById(R.id.outputView)
        uuidDevice = findViewById(R.id.uuidDevice)
        numberText = findViewById(R.id.numberText)
        nameText = findViewById(R.id.nameText)
        monthText = findViewById(R.id.monthText)
        yearText = findViewById(R.id.yearText)
        cvcText = findViewById(R.id.cvcText)
        progressBar = findViewById(R.id.progress_bar_form)
        fadeRect = findViewById(R.id.shadow_view_form)
    }

    /**
     * Method to set inputs listeners
     */
    private fun setListeners() {
        buttonTokenize!!.setOnClickListener { onPressTokenizeButton() }
    }

    /**
     * Method to enable all inputs
     */
    private fun enableInputs() {
        buttonTokenize!!.isEnabled = true
        numberText!!.isEnabled = true
        nameText!!.isEnabled = true
        monthText!!.isEnabled = true
        yearText!!.isEnabled = true
        cvcText!!.isEnabled = true
    }

    /**
     * Method to disable all inputs
     */
    private fun disableInputs() {
        buttonTokenize!!.isEnabled = false
        numberText!!.isEnabled = false
        nameText!!.isEnabled = false
        monthText!!.isEnabled = false
        yearText!!.isEnabled = false
        cvcText!!.isEnabled = false
    }

    /**
     * Method to enable the progress bar
     */
    private fun enableProgressBar() {
        progressBar!!.visibility = View.VISIBLE
        fadeRect!!.visibility = View.VISIBLE
    }

    /**
     * Method to disable the progress bar
     */
    private fun disableProgressBar() {
        progressBar!!.visibility = View.GONE
        fadeRect!!.visibility = View.GONE
    }

    /**
     * Method triggered when press tokenize button to get a token from the card data received
     */
    private fun onPressTokenizeButton() {
        disableInputs()
        enableProgressBar()
        if (hasInternetConnection()) {
            Conekta().apply {
                publicKey = PUBLIC_KEY
                apiVersion = API_VERSION
                collectDevice(activity)
            }
            cardData
            if (hasValidCardData!!) {
                val card = Card(cardName!!, cardNumber!!, cardCvc!!, cardMonth!!, cardYear!!)
                val token = Token(activity, this@Form)
                //Request for create token
                token.create(card)
            } else {
                Toast.makeText(
                    this@Form,
                    resources.getString(R.string.cardDataIncomplete),
                    Toast.LENGTH_LONG
                ).show()
                enableInputs()
                disableProgressBar()
            }
        } else {
            Toast.makeText(
                this@Form,
                resources.getString(R.string.needInternetConnection),
                Toast.LENGTH_LONG
            ).show()
            outputView!!.text = resources.getString(R.string.needInternetConnection)
            enableInputs()
            disableProgressBar()
        }
    }

    /**
     * Method to get card data
     */
    private val cardData: Unit
        private get() {
            hasValidCardData = true
            cardName = nameText?.text.toString()
            cardNumber = numberText?.text.toString()
            cardCvc = cvcText?.text.toString()
            cardMonth = monthText?.text.toString()
            cardYear = yearText?.text.toString()
            if (cardName!!.isEmpty() || cardNumber!!.isEmpty() || cardCvc!!.isEmpty() || cardMonth!!.isEmpty() || cardYear!!.isEmpty()) {
                hasValidCardData = false
            }
        }

    /**
     * Method to check device internet connection
     * @return true value in case of success internet connection otherwise false
     */
    private fun hasInternetConnection(): Boolean {
        val cm = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        val netInfo = cm.activeNetworkInfo
        return netInfo != null && netInfo.isConnected
    }

    /**
     * Method to show on device the token result
     * @param data token data
     */
    private fun showTokenResult(data: CardResponse?) {
        try {
            val tokenId = data?.id.orEmpty()
            val tokenMessage = "$tokenIdTag $tokenId"
            outputView?.text = tokenMessage
            Log.d(tokenIdTag, tokenId)
            enableInputs()
            disableProgressBar()
        } catch (error: Exception) {
            val errorMessage = "$errorTag $error"
            outputView?.text = errorMessage
            enableInputs()
            disableProgressBar()
        }
        val uuidMessage = uuidDeviceTag + " " + Conekta().deviceFingerPrint(activity)
        uuidDevice?.text = uuidMessage
    }

    companion object {
        //--------------------------------------------------------- Constants
        private const val PUBLIC_KEY = "key_Mf1iEazveN6EnkhgtvXxzBA"
        private const val API_VERSION = "0.3.0"
    }

    override fun onCreateTokenReady(data: CardResponse?) {
        showTokenResult(data)
    }

    override fun onError(message: String?) {
        val errorMessage = "$errorTag $message"
        outputView?.text = errorMessage
        enableInputs()
        disableProgressBar()
    }
}