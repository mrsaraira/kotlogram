package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputPeer;
import com.github.badoualy.telegram.tl.core.TLLongVector;
import com.github.badoualy.telegram.tl.core.TLMethod;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestMessagesGetMessageReadParticipants extends TLMethod<TLLongVector> {
    public static final int CONSTRUCTOR_ID = 0x2c6f97b7;

    protected TLAbsInputPeer peer;

    protected int msgId;

    private final String _constructor = "messages.getMessageReadParticipants#2c6f97b7";

    public TLRequestMessagesGetMessageReadParticipants() {
    }

    public TLRequestMessagesGetMessageReadParticipants(TLAbsInputPeer peer, int msgId) {
        this.peer = peer;
        this.msgId = msgId;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLLongVector deserializeResponse(InputStream stream, TLContext context) throws IOException {
        return readTLLongVector(stream, context);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(peer, stream);
        writeInt(msgId, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        peer = readTLObject(stream, context, TLAbsInputPeer.class, -1);
        msgId = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += peer.computeSerializedSize();
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
}
