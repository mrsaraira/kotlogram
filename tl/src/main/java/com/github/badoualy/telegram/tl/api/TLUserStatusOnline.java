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

public class TLUserStatusOnline extends TLAbsUserStatus {
    public static final int CONSTRUCTOR_ID = 0xedb93949;

    protected int expires;

    private final String _constructor = "userStatusOnline#edb93949";

    public TLUserStatusOnline() {
    }

    public TLUserStatusOnline(int expires) {
        this.expires = expires;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(expires, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        expires = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
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

    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }
}
