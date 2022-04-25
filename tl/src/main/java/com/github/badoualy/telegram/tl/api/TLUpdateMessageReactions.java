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

public class TLUpdateMessageReactions extends TLAbsUpdate {
    public static final int CONSTRUCTOR_ID = 0x154798c3;

    protected TLAbsPeer peer;

    protected int msgId;

    protected TLMessageReactions reactions;

    private final String _constructor = "updateMessageReactions#154798c3";

    public TLUpdateMessageReactions() {
    }

    public TLUpdateMessageReactions(TLAbsPeer peer, int msgId, TLMessageReactions reactions) {
        this.peer = peer;
        this.msgId = msgId;
        this.reactions = reactions;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(peer, stream);
        writeInt(msgId, stream);
        writeTLObject(reactions, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        peer = readTLObject(stream, context, TLAbsPeer.class, -1);
        msgId = readInt(stream);
        reactions = readTLObject(stream, context, TLMessageReactions.class, TLMessageReactions.CONSTRUCTOR_ID);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += peer.computeSerializedSize();
        size += SIZE_INT32;
        size += reactions.computeSerializedSize();
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

    public TLAbsPeer getPeer() {
        return peer;
    }

    public void setPeer(TLAbsPeer peer) {
        this.peer = peer;
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public TLMessageReactions getReactions() {
        return reactions;
    }

    public void setReactions(TLMessageReactions reactions) {
        this.reactions = reactions;
    }
}
