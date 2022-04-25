package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRecentMeUrlUser extends TLAbsRecentMeUrl {
    public static final int CONSTRUCTOR_ID = 0xb92c09e2;

    protected long userId;

    private final String _constructor = "recentMeUrlUser#b92c09e2";

    public TLRecentMeUrlUser() {
    }

    public TLRecentMeUrlUser(String url, long userId) {
        this.url = url;
        this.userId = userId;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(url, stream);
        writeLong(userId, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        url = readTLString(stream);
        userId = readLong(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(url);
        size += SIZE_INT64;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
