package io.conekta.helloconekta;

/**
 * Created by mauriciomurga on 3/2/15.
 */

import com.conekta.Token;

public abstract class ConektaCallback {
    public abstract void failure(Exception error);
    public abstract void success(Token token);
}