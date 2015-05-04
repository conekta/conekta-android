package io.conekta.tokenizer;

import com.conekta.Token;

/**
 * Created by mauriciomurga on 5/4/15.
 */
public abstract class TokenizerCallback {
    public abstract void failure(Exception error);
    public abstract void success(Token token);
}
