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

public class TLUpdateMessagePollVote extends TLAbsUpdate {
    public static final int CONSTRUCTOR_ID = 0x106395c9;

    protected long pollId;

    protected long userId;

    protected TLVector<TLBytes> options;

    protected int qts;

    private final String _constructor = "updateMessagePollVote#106395c9";

    public TLUpdateMessagePollVote() {
    }

    public TLUpdateMessagePollVote(long pollId, long userId, TLVector<TLBytes> options, int qts) {
        this.pollId = pollId;
        this.userId = userId;
        this.options = options;
        this.qts = qts;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(pollId, stream);
        writeLong(userId, stream);
        writeTLVector(options, stream);
        writeInt(qts, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        pollId = readLong(stream);
        userId = readLong(stream);
        options = readTLVector(stream, context);
        qts = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
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

    public long getPollId() {
        return pollId;
    }

    public void setPollId(long pollId) {
        this.pollId = pollId;
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

    public int getQts() {
        return qts;
    }

    public void setQts(int qts) {
        this.qts = qts;
    }
}
