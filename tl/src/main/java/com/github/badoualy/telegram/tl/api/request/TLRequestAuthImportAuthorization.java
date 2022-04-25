package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.auth.TLAbsAuthorization;
import com.github.badoualy.telegram.tl.core.TLBytes;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestAuthImportAuthorization extends TLMethod<TLAbsAuthorization> {
    public static final int CONSTRUCTOR_ID = 0xa57a7dad;

    protected long id;

    protected TLBytes bytes;

    private final String _constructor = "auth.importAuthorization#a57a7dad";

    public TLRequestAuthImportAuthorization() {
    }

    public TLRequestAuthImportAuthorization(long id, TLBytes bytes) {
        this.id = id;
        this.bytes = bytes;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLAbsAuthorization deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLAbsAuthorization)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLAbsAuthorization) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(id, stream);
        writeTLBytes(bytes, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        id = readLong(stream);
        bytes = readTLBytes(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TLBytes getBytes() {
        return bytes;
    }

    public void setBytes(TLBytes bytes) {
        this.bytes = bytes;
    }
}
