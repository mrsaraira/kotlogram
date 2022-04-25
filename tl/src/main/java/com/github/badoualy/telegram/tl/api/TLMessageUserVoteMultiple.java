package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLBytes;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLMessageUserVoteMultiple extends TLAbsMessageUserVote {
    public static final int CONSTRUCTOR_ID = 0x8a65e557;

    protected TLVector<TLBytes> options;

    private final String _constructor = "messageUserVoteMultiple#8a65e557";

    public TLMessageUserVoteMultiple() {
    }

    public TLMessageUserVoteMultiple(long userId, TLVector<TLBytes> options, int date) {
        this.userId = userId;
        this.options = options;
        this.date = date;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(userId, stream);
        writeTLVector(options, stream);
        writeInt(date, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        userId = readLong(stream);
        options = readTLVector(stream, context);
        date = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += options.computeSerializedSize();
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

    public TLVector<TLBytes> getOptions() {
        return options;
    }

    public void setOptions(TLVector<TLBytes> options) {
        this.options = options;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
