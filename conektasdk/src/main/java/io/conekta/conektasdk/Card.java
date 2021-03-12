package io.conekta.conektasdk;

/**
 * POJO of the object Card.
 */
public class Card {
    private String number;
    private String name;
    private String cvc;
    private String expMonth;
    private String expYear;
    private String deviceFingerprint;

    public Card(String name, String number, String cvc, String expMonth, String expYear) {
        if(name.isEmpty())
            throw new RuntimeException("name");
        if(number.isEmpty())
            throw new RuntimeException("number");
        if(cvc.isEmpty())
            throw new RuntimeException("cvc");
        if(Integer.parseInt(expMonth) < 1 || Integer.parseInt(expMonth) > 12)
            throw new RuntimeException("expMonth");
        if(Integer.parseInt(expYear) < 1)
            throw new RuntimeException("expYear");

        this.number = number;
        this.name = name;
        this.cvc = cvc;
        this.expMonth = expMonth;
        this.expYear = expYear;
    }

    /**
     * Return the number of the card.
     * @return a number of the card in string.
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * Return the name of the card.
     * @return a string name of the card.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the Cvc of the card.
     * @return a String of the cvc of the card.
     */
    public String getCvc() {
        return this.cvc;
    }

    /**
     * Return the date of expired month
     * @return a string for the number of the month.
     */
    public String getExpMonth() {
        return this.expMonth;
    }

    /**
     * Return the year of the expired card.
     * @return a string for the year.
     */
    public String getExpYear() {
        return this.expYear;
    }
}