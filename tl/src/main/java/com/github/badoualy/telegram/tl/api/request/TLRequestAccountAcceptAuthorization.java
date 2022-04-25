package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLSecureCredentialsEncrypted;
import com.github.badoualy.telegram.tl.api.TLSecureValueHash;
import com.github.badoualy.telegram.tl.core.TLBool;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestAccountAcceptAuthorization extends TLMethod<TLBool> {
    public static final int CONSTRUCTOR_ID = 0xf3ed4c73;

    protected long botId;

    protected String scope;

    protected String publicKey;

    protected TLVector<TLSecureValueHash> valueHashes;

    protected TLSecureCredentialsEncrypted credentials;

    private final String _constructor = "account.acceptAuthorization#f3ed4c73";

    public TLRequestAccountAcceptAuthorization() {
    }

    public TLRequestAccountAcceptAuthorization(long botId, String scope, String publicKey, TLVector<TLSecureValueHash> valueHashes, TLSecureCredentialsEncrypted credentials) {
        this.botId = botId;
        this.scope = scope;
        this.publicKey = publicKey;
        this.valueHashes = valueHashes;
        this.credentials = credentials;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLBool)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLBool) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(botId, stream);
        writeString(scope, stream);
        writeString(publicKey, stream);
        writeTLVector(valueHashes, stream);
        writeTLObject(credentials, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        botId = readLong(stream);
        scope = readTLString(stream);
        publicKey = readTLString(stream);
        valueHashes = readTLVector(stream, context);
        credentials = readTLObject(stream, context, TLSecureCredentialsEncrypted.class, TLSecureCredentialsEncrypted.CONSTRUCTOR_ID);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += computeTLStringSerializedSize(scope);
        size += computeTLStringSerializedSize(publicKey);
        size += valueHashes.computeSerializedSize();
        size += credentials.computeSerializedSize();
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

    public long getBotId() {
        return botId;
    }

    public void setBotId(long botId) {
        this.botId = botId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public TLVector<TLSecureValueHash> getValueHashes() {
        return valueHashes;
    }

    public void setValueHashes(TLVector<TLSecureValueHash> valueHashes) {
        this.valueHashes = valueHashes;
    }

    public TLSecureCredentialsEncrypted getCredentials() {
        return credentials;
    }

    public void setCredentials(TLSecureCredentialsEncrypted credentials) {
        this.credentials = credentials;
    }
}
