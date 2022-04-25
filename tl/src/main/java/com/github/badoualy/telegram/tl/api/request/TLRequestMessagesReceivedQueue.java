package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLLongVector;
import com.github.badoualy.telegram.tl.core.TLMethod;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestMessagesReceivedQueue extends TLMethod<TLLongVector> {
    public static final int CONSTRUCTOR_ID = 0x55a5bb66;

    protected int maxQts;

    private final String _constructor = "messages.receivedQueue#55a5bb66";

    public TLRequestMessagesReceivedQueue() {
    }

    public TLRequestMessagesReceivedQueue(int maxQts) {
        this.maxQts = maxQts;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLLongVector deserializeResponse(InputStream stream, TLContext context) throws IOException {
        return readTLLongVector(stream, context);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(maxQts, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        maxQts = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
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

    public int getMaxQts() {
        return maxQts;
    }

    public void setMaxQts(int maxQts) {
        this.maxQts = maxQts;
    }
}
