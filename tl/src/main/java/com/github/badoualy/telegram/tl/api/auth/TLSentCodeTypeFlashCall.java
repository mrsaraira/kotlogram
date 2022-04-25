package com.github.badoualy.telegram.tl.api.auth;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLSentCodeTypeFlashCall extends TLAbsSentCodeType {
    public static final int CONSTRUCTOR_ID = 0xab03c6d9;

    protected String pattern;

    private final String _constructor = "auth.sentCodeTypeFlashCall#ab03c6d9";

    public TLSentCodeTypeFlashCall() {
    }

    public TLSentCodeTypeFlashCall(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(pattern, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        pattern = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(pattern);
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

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
