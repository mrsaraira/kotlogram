package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLJsonObjectValue extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xc0de1bd9;

    protected String key;

    protected TLAbsJSONValue value;

    private final String _constructor = "jsonObjectValue#c0de1bd9";

    public TLJsonObjectValue() {
    }

    public TLJsonObjectValue(String key, TLAbsJSONValue value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(key, stream);
        writeTLObject(value, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        key = readTLString(stream);
        value = readTLObject(stream, context, TLAbsJSONValue.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(key);
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TLAbsJSONValue getValue() {
        return value;
    }

    public void setValue(TLAbsJSONValue value) {
        this.value = value;
    }
}
