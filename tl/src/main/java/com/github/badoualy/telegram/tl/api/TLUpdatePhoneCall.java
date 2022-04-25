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

public class TLUpdatePhoneCall extends TLAbsUpdate {
    public static final int CONSTRUCTOR_ID = 0xab0f6b1e;

    protected TLAbsPhoneCall phoneCall;

    private final String _constructor = "updatePhoneCall#ab0f6b1e";

    public TLUpdatePhoneCall() {
    }

    public TLUpdatePhoneCall(TLAbsPhoneCall phoneCall) {
        this.phoneCall = phoneCall;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(phoneCall, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        phoneCall = readTLObject(stream, context, TLAbsPhoneCall.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += phoneCall.computeSerializedSize();
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

    public TLAbsPhoneCall getPhoneCall() {
        return phoneCall;
    }

    public void setPhoneCall(TLAbsPhoneCall phoneCall) {
        this.phoneCall = phoneCall;
    }
}
