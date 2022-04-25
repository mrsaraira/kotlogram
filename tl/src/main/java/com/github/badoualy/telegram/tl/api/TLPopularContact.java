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

public class TLPopularContact extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x5ce14175;

    protected long clientId;

    protected int importers;

    private final String _constructor = "popularContact#5ce14175";

    public TLPopularContact() {
    }

    public TLPopularContact(long clientId, int importers) {
        this.clientId = clientId;
        this.importers = importers;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(clientId, stream);
        writeInt(importers, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        clientId = readLong(stream);
        importers = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
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

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public int getImporters() {
        return importers;
    }

    public void setImporters(int importers) {
        this.importers = importers;
    }
}
