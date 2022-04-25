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

public class TLSearchResultPosition extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x7f648b67;

    protected int msgId;

    protected int date;

    protected int offset;

    private final String _constructor = "searchResultPosition#7f648b67";

    public TLSearchResultPosition() {
    }

    public TLSearchResultPosition(int msgId, int date, int offset) {
        this.msgId = msgId;
        this.date = date;
        this.offset = offset;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(msgId, stream);
        writeInt(date, stream);
        writeInt(offset, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        msgId = readInt(stream);
        date = readInt(stream);
        offset = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
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

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
