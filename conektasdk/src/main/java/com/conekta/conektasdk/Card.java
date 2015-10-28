package com.conekta.conektasdk;

/**
 * Created by picharras on 27/10/15.
 */
public class Card {
    public String number;
    public String name;
    public String cvc;
    public String expMonth;
    public String expYear;

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

        this.name = name;
        this.number = number;
        this.cvc = cvc;
        this.expMonth = expMonth;
        this.expYear = expYear;
    }
}
