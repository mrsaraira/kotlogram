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

public class TLStatsGroupTopPoster extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x9d04af9b;

    protected long userId;

    protected int messages;

    protected int avgChars;

    private final String _constructor = "statsGroupTopPoster#9d04af9b";

    public TLStatsGroupTopPoster() {
    }

    public TLStatsGroupTopPoster(long userId, int messages, int avgChars) {
        this.userId = userId;
        this.messages = messages;
        this.avgChars = avgChars;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(userId, stream);
        writeInt(messages, stream);
        writeInt(avgChars, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        userId = readLong(stream);
        messages = readInt(stream);
        avgChars = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += SIZE_INT32;
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

    public int getMessages() {
        return messages;
    }

    public void setMessages(int messages) {
        this.messages = messages;
    }

    public int getAvgChars() {
        return avgChars;
    }

    public void setAvgChars(int avgChars) {
        this.avgChars = avgChars;
    }
}
