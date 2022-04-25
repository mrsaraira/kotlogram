package com.github.badoualy.telegram.tl.api.auth;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLBytes;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLLoggedOut extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xc3a2835f;

    protected int flags;

    protected TLBytes futureAuthToken;

    private final String _constructor = "auth.loggedOut#c3a2835f";

    public TLLoggedOut() {
    }

    public TLLoggedOut(TLBytes futureAuthToken) {
        this.futureAuthToken = futureAuthToken;
    }

    private void computeFlags() {
        flags = 0;
        flags = futureAuthToken != null ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        if ((flags & 1) != 0) {
            if (futureAuthToken == null) throwNullFieldException("futureAuthToken", flags);
            writeTLBytes(futureAuthToken, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        futureAuthToken = (flags & 1) != 0 ? readTLBytes(stream, context) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        if ((flags & 1) != 0) {
            if (futureAuthToken == null) throwNullFieldException("futureAuthToken", flags);
            size += computeTLBytesSerializedSize(futureAuthToken);
        }
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

    public TLBytes getFutureAuthToken() {
        return futureAuthToken;
    }

    public void setFutureAuthToken(TLBytes futureAuthToken) {
        this.futureAuthToken = futureAuthToken;
    }
}
