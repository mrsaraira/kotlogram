package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLInputPaymentCredentialsGooglePay extends TLAbsInputPaymentCredentials {
    public static final int CONSTRUCTOR_ID = 0x8ac32801;

    protected TLDataJSON paymentToken;

    private final String _constructor = "inputPaymentCredentialsGooglePay#8ac32801";

    public TLInputPaymentCredentialsGooglePay() {
    }

    public TLInputPaymentCredentialsGooglePay(TLDataJSON paymentToken) {
        this.paymentToken = paymentToken;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(paymentToken, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        paymentToken = readTLObject(stream, context, TLDataJSON.class, TLDataJSON.CONSTRUCTOR_ID);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += paymentToken.computeSerializedSize();
        return size;
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }

    public TLDataJSON getPaymentToken() {
        return paymentToken;
    }

    public void setPaymentToken(TLDataJSON paymentToken) {
        this.paymentToken = paymentToken;
    }
}
