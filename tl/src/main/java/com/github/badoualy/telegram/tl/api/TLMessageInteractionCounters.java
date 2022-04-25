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

public class TLMessageInteractionCounters extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xad4fc9bd;

    protected int msgId;

    protected int views;

    protected int forwards;

    private final String _constructor = "messageInteractionCounters#ad4fc9bd";

    public TLMessageInteractionCounters() {
    }

    public TLMessageInteractionCounters(int msgId, int views, int forwards) {
        this.msgId = msgId;
        this.views = views;
        this.forwards = forwards;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(msgId, stream);
        writeInt(views, stream);
        writeInt(forwards, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        msgId = readInt(stream);
        views = readInt(stream);
        forwards = readInt(stream);
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

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getForwards() {
        return forwards;
    }

    public void setForwards(int forwards) {
        this.forwards = forwards;
    }
}
