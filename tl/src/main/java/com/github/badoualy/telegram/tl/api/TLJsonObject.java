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

public class TLJsonObject extends TLAbsJSONValue {
    public static final int CONSTRUCTOR_ID = 0x99c1d49d;

    protected TLVector<TLJsonObjectValue> value;

    private final String _constructor = "jsonObject#99c1d49d";

    public TLJsonObject() {
    }

    public TLJsonObject(TLVector<TLJsonObjectValue> value) {
        this.value = value;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(value, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        value = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += value.computeSerializedSize();
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

    public TLVector<TLJsonObjectValue> getValue() {
        return value;
    }

    public void setValue(TLVector<TLJsonObjectValue> value) {
        this.value = value;
    }
}
