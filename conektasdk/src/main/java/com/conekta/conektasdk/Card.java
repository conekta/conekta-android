package com.conekta.conektasdk;

/**
 * Created by picharras on 27/10/15.
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

    public String getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getCvc() {
        return this.cvc;
    }

    public String getExpMonth() {
        return this.expMonth;
    }

    public String getExpYear() {
        return this.expYear;
    }
}
