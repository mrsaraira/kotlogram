package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.auth.TLAbsAuthorization;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestAuthImportBotAuthorization extends TLMethod<TLAbsAuthorization> {
    public static final int CONSTRUCTOR_ID = 0x67a3ff2c;

    protected int flags;

    protected int apiId;

    protected String apiHash;

    protected String botAuthToken;

    private final String _constructor = "auth.importBotAuthorization#67a3ff2c";

    public TLRequestAuthImportBotAuthorization() {
    }

    public TLRequestAuthImportBotAuthorization(int flags, int apiId, String apiHash, String botAuthToken) {
        this.flags = flags;
        this.apiId = apiId;
        this.apiHash = apiHash;
        this.botAuthToken = botAuthToken;
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
        writeInt(flags, stream);
        writeInt(apiId, stream);
        writeString(apiHash, stream);
        writeString(botAuthToken, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        apiId = readInt(stream);
        apiHash = readTLString(stream);
        botAuthToken = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += computeTLStringSerializedSize(apiHash);
        size += computeTLStringSerializedSize(botAuthToken);
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

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public int getApiId() {
        return apiId;
    }

    public void setApiId(int apiId) {
        this.apiId = apiId;
    }

    public String getApiHash() {
        return apiHash;
    }

    public void setApiHash(String apiHash) {
        this.apiHash = apiHash;
    }

    public String getBotAuthToken() {
        return botAuthToken;
    }

    public void setBotAuthToken(String botAuthToken) {
        this.botAuthToken = botAuthToken;
    }
}
