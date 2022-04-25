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

public class TLInputUserFromMessage extends TLAbsInputUser {
    public static final int CONSTRUCTOR_ID = 0x1da448e2;

    protected TLAbsInputPeer peer;

    protected int msgId;

    protected long userId;

    private final String _constructor = "inputUserFromMessage#1da448e2";

    public TLInputUserFromMessage() {
    }

    public TLInputUserFromMessage(TLAbsInputPeer peer, int msgId, long userId) {
        this.peer = peer;
        this.msgId = msgId;
        this.userId = userId;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(peer, stream);
        writeInt(msgId, stream);
        writeLong(userId, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        peer = readTLObject(stream, context, TLAbsInputPeer.class, -1);
        msgId = readInt(stream);
        userId = readLong(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += peer.computeSerializedSize();
        size += SIZE_INT32;
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

    public TLAbsInputPeer getPeer() {
        return peer;
    }

    public void setPeer(TLAbsInputPeer peer) {
        this.peer = peer;
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
