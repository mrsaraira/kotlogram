package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLInputMediaDocument extends TLAbsInputMedia {
    public static final int CONSTRUCTOR_ID = 0x33473058;

    protected int flags;

    protected TLAbsInputDocument id;

    protected Integer ttlSeconds;

    protected String query;

    private final String _constructor = "inputMediaDocument#33473058";

    public TLInputMediaDocument() {
    }

    public TLInputMediaDocument(TLAbsInputDocument id, Integer ttlSeconds, String query) {
        this.id = id;
        this.ttlSeconds = ttlSeconds;
        this.query = query;
    }

    private void computeFlags() {
        flags = 0;
        flags = ttlSeconds != null ? (flags | 1) : (flags & ~1);
        flags = query != null ? (flags | 2) : (flags & ~2);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLObject(id, stream);
        if ((flags & 1) != 0) {
            if (ttlSeconds == null) throwNullFieldException("ttlSeconds", flags);
            writeInt(ttlSeconds, stream);
        }
        if ((flags & 2) != 0) {
            if (query == null) throwNullFieldException("query", flags);
            writeString(query, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        id = readTLObject(stream, context, TLAbsInputDocument.class, -1);
        ttlSeconds = (flags & 1) != 0 ? readInt(stream) : null;
        query = (flags & 2) != 0 ? readTLString(stream) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += id.computeSerializedSize();
        if ((flags & 1) != 0) {
            if (ttlSeconds == null) throwNullFieldException("ttlSeconds", flags);
            size += SIZE_INT32;
        }
        if ((flags & 2) != 0) {
            if (query == null) throwNullFieldException("query", flags);
            size += computeTLStringSerializedSize(query);
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

    public TLAbsInputDocument getId() {
        return id;
    }

    public void setId(TLAbsInputDocument id) {
        this.id = id;
    }

    public Integer getTtlSeconds() {
        return ttlSeconds;
    }

    public void setTtlSeconds(Integer ttlSeconds) {
        this.ttlSeconds = ttlSeconds;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
