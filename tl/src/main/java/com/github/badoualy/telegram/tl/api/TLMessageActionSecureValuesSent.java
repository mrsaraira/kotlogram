package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLMessageActionSecureValuesSent extends TLAbsMessageAction {
    public static final int CONSTRUCTOR_ID = 0xd95c6154;

    protected TLVector<TLAbsSecureValueType> types;

    private final String _constructor = "messageActionSecureValuesSent#d95c6154";

    public TLMessageActionSecureValuesSent() {
    }

    public TLMessageActionSecureValuesSent(TLVector<TLAbsSecureValueType> types) {
        this.types = types;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(types, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        types = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += types.computeSerializedSize();
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

    public TLVector<TLAbsSecureValueType> getTypes() {
        return types;
    }

    public void setTypes(TLVector<TLAbsSecureValueType> types) {
        this.types = types;
    }
}
