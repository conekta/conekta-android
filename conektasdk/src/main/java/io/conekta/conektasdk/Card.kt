package io.conekta.conektasdk

import java.lang.RuntimeException

/**
 * POJO of the object Card.
 */
class Card(name: String, number: String, cvc: String, expMonth: String, expYear: String) {
    /**
     * Return the number of the card.
     * @return a number of the card in string.
     */
    val number: String

    /**
     * Return the name of the card.
     * @return a string name of the card.
     */
    val name: String

    /**
     * Return the Cvc of the card.
     * @return a String of the cvc of the card.
     */
    val cvc: String

    /**
     * Return the date of expired month
     * @return a string for the number of the month.
     */
    val expMonth: String

    /**
     * Return the year of the expired card.
     * @return a string for the year.
     */
    val expYear: String
    private val deviceFingerprint: String? = null

    init {
        if (name.isEmpty()) throw RuntimeException("name")
        if (number.isEmpty()) throw RuntimeException("number")
        if (cvc.isEmpty()) throw RuntimeException("cvc")
        if (expMonth.toInt() < 1 || expMonth.toInt() > 12) throw RuntimeException("expMonth")
        if (expYear.toInt() < 1) throw RuntimeException("expYear")
        this.number = number
        this.name = name
        this.cvc = cvc
        this.expMonth = expMonth
        this.expYear = expYear
    }
}