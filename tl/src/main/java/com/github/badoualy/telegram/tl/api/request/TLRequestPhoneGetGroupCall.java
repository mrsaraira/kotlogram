package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLInputGroupCall;
import com.github.badoualy.telegram.tl.api.phone.TLGroupCall;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestPhoneGetGroupCall extends TLMethod<TLGroupCall> {
    public static final int CONSTRUCTOR_ID = 0x41845db;

    protected TLInputGroupCall call;

    protected int limit;

    private final String _constructor = "phone.getGroupCall#41845db";

    public TLRequestPhoneGetGroupCall() {
    }

    public TLRequestPhoneGetGroupCall(TLInputGroupCall call, int limit) {
        this.call = call;
        this.limit = limit;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLGroupCall deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLGroupCall)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLGroupCall) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(call, stream);
        writeInt(limit, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        call = readTLObject(stream, context, TLInputGroupCall.class, TLInputGroupCall.CONSTRUCTOR_ID);
        limit = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += call.computeSerializedSize();
        size += SIZE_INT32;
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

    public TLInputGroupCall getCall() {
        return call;
    }

    public void setCall(TLInputGroupCall call) {
        this.call = call;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
