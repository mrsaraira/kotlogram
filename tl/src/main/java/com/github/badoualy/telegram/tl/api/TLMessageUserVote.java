package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLMessageUserVote extends TLAbsMessageUserVote {
    public static final int CONSTRUCTOR_ID = 0x34d247b4;

    protected TLBytes option;

    private final String _constructor = "messageUserVote#34d247b4";

    public TLMessageUserVote() {
    }

    public TLMessageUserVote(long userId, TLBytes option, int date) {
        this.userId = userId;
        this.option = option;
        this.date = date;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(userId, stream);
        writeTLBytes(option, stream);
        writeInt(date, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        userId = readLong(stream);
        option = readTLBytes(stream, context);
        date = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += computeTLBytesSerializedSize(option);
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public TLBytes getOption() {
        return option;
    }

    public void setOption(TLBytes option) {
        this.option = option;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
