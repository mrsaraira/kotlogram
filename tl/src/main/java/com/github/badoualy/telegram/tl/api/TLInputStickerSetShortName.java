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

public class TLInputStickerSetShortName extends TLAbsInputStickerSet {
    public static final int CONSTRUCTOR_ID = 0x861cc8a0;

    protected String shortName;

    private final String _constructor = "inputStickerSetShortName#861cc8a0";

    public TLInputStickerSetShortName() {
    }

    public TLInputStickerSetShortName(String shortName) {
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
