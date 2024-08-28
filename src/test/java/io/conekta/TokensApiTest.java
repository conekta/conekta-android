package io.conekta;

import io.conekta.model.Token;
import io.conekta.model.TokenCard;
import io.conekta.model.TokenResponse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class TokensApiTest {
    TokensApi instance = new TokensApi();
    String apiKey = "key_xxx";
    @Before
    public void config (){
        instance.setBasePath(BaseTest.getBasePath());
        instance.setApiKey( apiKey );
    }
    
    @Test
    public void CreateToken() throws ApiException {
        Token token = new Token();
        TokenCard card = new TokenCard();
        card.setCvc("123");
        card.setExpYear("29");
        card.setName("fran carrero");
        card.setNumber("5475040095304607");
        token.setCard(card);
        
        TokenResponse response = instance.createToken(token, "es");
        
        assertEquals("tok_2toPJUcZ27AH5LsZk", response.getId());
    }
}