package com.github.badoualy.telegram.tl.api.account;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsUser;
import com.github.badoualy.telegram.tl.api.TLWebAuthorization;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLWebAuthorizations extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xed56c9fc;

    protected TLVector<TLWebAuthorization> authorizations;

    protected TLVector<TLAbsUser> users;

    private final String _constructor = "account.webAuthorizations#ed56c9fc";

    public TLWebAuthorizations() {
    }

    public TLWebAuthorizations(TLVector<TLWebAuthorization> authorizations, TLVector<TLAbsUser> users) {
        this.authorizations = authorizations;
        this.users = users;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(authorizations, stream);
        writeTLVector(users, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        authorizations = readTLVector(stream, context);
        users = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += authorizations.computeSerializedSize();
        size += users.computeSerializedSize();
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

    public TLVector<TLWebAuthorization> getAuthorizations() {
        return authorizations;
    }

    public void setAuthorizations(TLVector<TLWebAuthorization> authorizations) {
        this.authorizations = authorizations;
    }

    public TLVector<TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(TLVector<TLAbsUser> users) {
        this.users = users;
    }
}
