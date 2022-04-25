package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLMessageUserReaction extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x932844fa;

    protected long userId;

    protected String reaction;

    private final String _constructor = "messageUserReaction#932844fa";

    public TLMessageUserReaction() {
    }

    public TLMessageUserReaction(long userId, String reaction) {
        this.userId = userId;
        this.reaction = reaction;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(userId, stream);
        writeString(reaction, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        userId = readLong(stream);
        reaction = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += computeTLStringSerializedSize(reaction);
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }
}
