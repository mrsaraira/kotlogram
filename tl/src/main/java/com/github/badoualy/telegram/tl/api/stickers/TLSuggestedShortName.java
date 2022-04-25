package com.github.badoualy.telegram.tl.api.stickers;

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

public class TLSuggestedShortName extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x85fea03f;

    protected String shortName;

    private final String _constructor = "stickers.suggestedShortName#85fea03f";

    public TLSuggestedShortName() {
    }

    public TLSuggestedShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(shortName, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        shortName = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(shortName);
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
