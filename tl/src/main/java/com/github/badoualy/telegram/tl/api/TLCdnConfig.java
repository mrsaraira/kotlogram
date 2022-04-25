package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLCdnConfig extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x5725e40a;

    protected TLVector<TLCdnPublicKey> publicKeys;

    private final String _constructor = "cdnConfig#5725e40a";

    public TLCdnConfig() {
    }

    public TLCdnConfig(TLVector<TLCdnPublicKey> publicKeys) {
        this.publicKeys = publicKeys;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(publicKeys, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        publicKeys = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += publicKeys.computeSerializedSize();
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

    public TLVector<TLCdnPublicKey> getPublicKeys() {
        return publicKeys;
    }

    public void setPublicKeys(TLVector<TLCdnPublicKey> publicKeys) {
        this.publicKeys = publicKeys;
    }
}
