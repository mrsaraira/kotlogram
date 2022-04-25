package com.github.badoualy.telegram.tl.api.messages;

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

public class TLDhConfigNotModified extends TLAbsDhConfig {
    public static final int CONSTRUCTOR_ID = 0xc0e24635;

    private final String _constructor = "messages.dhConfigNotModified#c0e24635";

    public TLDhConfigNotModified() {
    }

    public TLDhConfigNotModified(TLBytes random) {
        this.random = random;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLBytes(random, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        random = readTLBytes(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLBytesSerializedSize(random);
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

    public TLBytes getRandom() {
        return random;
    }

    public void setRandom(TLBytes random) {
        this.random = random;
    }
}
