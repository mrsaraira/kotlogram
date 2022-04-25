package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.auth.TLAbsLoginToken;
import com.github.badoualy.telegram.tl.core.TLLongVector;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestAuthExportLoginToken extends TLMethod<TLAbsLoginToken> {
    public static final int CONSTRUCTOR_ID = 0xb7e085fe;

    protected int apiId;

    protected String apiHash;

    protected TLLongVector exceptIds;

    private final String _constructor = "auth.exportLoginToken#b7e085fe";

    public TLRequestAuthExportLoginToken() {
    }

    public TLRequestAuthExportLoginToken(int apiId, String apiHash, TLLongVector exceptIds) {
        this.apiId = apiId;
        this.apiHash = apiHash;
        this.exceptIds = exceptIds;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLAbsLoginToken deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLAbsLoginToken)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLAbsLoginToken) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(apiId, stream);
        writeString(apiHash, stream);
        writeTLVector(exceptIds, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        apiId = readInt(stream);
        apiHash = readTLString(stream);
        exceptIds = readTLLongVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += computeTLStringSerializedSize(apiHash);
        size += exceptIds.computeSerializedSize();
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

    public TLLongVector getExceptIds() {
        return exceptIds;
    }

    public void setExceptIds(TLLongVector exceptIds) {
        this.exceptIds = exceptIds;
    }
}
