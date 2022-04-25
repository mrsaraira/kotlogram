package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLPhotoPathSize extends TLAbsPhotoSize {
    public static final int CONSTRUCTOR_ID = 0xd8214d41;

    protected TLBytes bytes;

    private final String _constructor = "photoPathSize#d8214d41";

    public TLPhotoPathSize() {
    }

    public TLPhotoPathSize(String type, TLBytes bytes) {
        this.type = type;
        this.bytes = bytes;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(type, stream);
        writeTLBytes(bytes, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        type = readTLString(stream);
        bytes = readTLBytes(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(type);
        size += computeTLBytesSerializedSize(bytes);
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TLBytes getBytes() {
        return bytes;
    }

    public void setBytes(TLBytes bytes) {
        this.bytes = bytes;
    }
}
