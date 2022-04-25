package com.github.badoualy.telegram.tl.api.auth;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.help.TLTermsOfService;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLAuthorizationSignUpRequired extends TLAbsAuthorization {
    public static final int CONSTRUCTOR_ID = 0x44747e9a;

    protected TLTermsOfService termsOfService;

    private final String _constructor = "auth.authorizationSignUpRequired#44747e9a";

    public TLAuthorizationSignUpRequired() {
    }

    public TLAuthorizationSignUpRequired(TLTermsOfService termsOfService) {
        this.termsOfService = termsOfService;
    }

    private void computeFlags() {
        flags = 0;
        flags = termsOfService != null ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        if ((flags & 1) != 0) {
            if (termsOfService == null) throwNullFieldException("termsOfService", flags);
            writeTLObject(termsOfService, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        termsOfService = (flags & 1) != 0 ? readTLObject(stream, context, TLTermsOfService.class, TLTermsOfService.CONSTRUCTOR_ID) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        if ((flags & 1) != 0) {
            if (termsOfService == null) throwNullFieldException("termsOfService", flags);
            size += termsOfService.computeSerializedSize();
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

    public TLTermsOfService getTermsOfService() {
        return termsOfService;
    }

    public void setTermsOfService(TLTermsOfService termsOfService) {
        this.termsOfService = termsOfService;
    }
}
