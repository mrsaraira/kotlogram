package com.github.badoualy.telegram.tl.api.account;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAuthorization;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLAuthorizations extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x4bff8ea0;

    protected int authorizationTtlDays;

    protected TLVector<TLAuthorization> authorizations;

    private final String _constructor = "account.authorizations#4bff8ea0";

    public TLAuthorizations() {
    }

    public TLAuthorizations(int authorizationTtlDays, TLVector<TLAuthorization> authorizations) {
        this.authorizationTtlDays = authorizationTtlDays;
        this.authorizations = authorizations;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(authorizationTtlDays, stream);
        writeTLVector(authorizations, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        authorizationTtlDays = readInt(stream);
        authorizations = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += authorizations.computeSerializedSize();
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

    public int getAuthorizationTtlDays() {
        return authorizationTtlDays;
    }

    public void setAuthorizationTtlDays(int authorizationTtlDays) {
        this.authorizationTtlDays = authorizationTtlDays;
    }

    public TLVector<TLAuthorization> getAuthorizations() {
        return authorizations;
    }

    public void setAuthorizations(TLVector<TLAuthorization> authorizations) {
        this.authorizations = authorizations;
    }
}
