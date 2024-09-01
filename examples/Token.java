package examples;
import io.conekta.model.Token;
import io.conekta.model.TokenCard;
import io.conekta.model.TokenResponse;
import io.conekta.TokensApi;

public class Token {
    TokensApi instance = new TokensApi();
    instance.setApiKey( "key_xxx" );
    
    Token token = new Token();
    TokenCard card = new TokenCard();
    card.setCvc("123");
    card.setExpYear("29");
    card.setName("fran carrero");
    card.setNumber("5475040095304607");
    token.setCard(card);
    
    TokenResponse response = instance.createToken(token, "es");
}