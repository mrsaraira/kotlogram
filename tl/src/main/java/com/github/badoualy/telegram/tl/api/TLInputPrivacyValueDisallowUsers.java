package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLInputPrivacyValueDisallowUsers extends TLAbsInputPrivacyRule {
    public static final int CONSTRUCTOR_ID = 0x90110467;

    protected TLVector<TLAbsInputUser> users;

    private final String _constructor = "inputPrivacyValueDisallowUsers#90110467";

    public TLInputPrivacyValueDisallowUsers() {
    }

    public TLInputPrivacyValueDisallowUsers(TLVector<TLAbsInputUser> users) {
        this.users = users;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(users, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        users = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
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

    public TLVector<TLAbsInputUser> getUsers() {
        return users;
    }

    public void setUsers(TLVector<TLAbsInputUser> users) {
        this.users = users;
    }
}
