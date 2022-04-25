package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLMessageReplyHeader extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xa6d57763;

    protected int flags;

    protected boolean replyToScheduled;

    protected int replyToMsgId;

    protected TLAbsPeer replyToPeerId;

    protected Integer replyToTopId;

    private final String _constructor = "messageReplyHeader#a6d57763";

    public TLMessageReplyHeader() {
    }

    public TLMessageReplyHeader(boolean replyToScheduled, int replyToMsgId, TLAbsPeer replyToPeerId, Integer replyToTopId) {
        this.replyToScheduled = replyToScheduled;
        this.replyToMsgId = replyToMsgId;
        this.replyToPeerId = replyToPeerId;
        this.replyToTopId = replyToTopId;
    }

    private void computeFlags() {
        flags = 0;
        flags = replyToScheduled ? (flags | 4) : (flags & ~4);
        flags = replyToPeerId != null ? (flags | 1) : (flags & ~1);
        flags = replyToTopId != null ? (flags | 2) : (flags & ~2);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeInt(replyToMsgId, stream);
        if ((flags & 1) != 0) {
            if (replyToPeerId == null) throwNullFieldException("replyToPeerId", flags);
            writeTLObject(replyToPeerId, stream);
        }
        if ((flags & 2) != 0) {
            if (replyToTopId == null) throwNullFieldException("replyToTopId", flags);
            writeInt(replyToTopId, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        replyToScheduled = (flags & 4) != 0;
        replyToMsgId = readInt(stream);
        replyToPeerId = (flags & 1) != 0 ? readTLObject(stream, context, TLAbsPeer.class, -1) : null;
        replyToTopId = (flags & 2) != 0 ? readInt(stream) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT32;
        if ((flags & 1) != 0) {
            if (replyToPeerId == null) throwNullFieldException("replyToPeerId", flags);
            size += replyToPeerId.computeSerializedSize();
        }
        if ((flags & 2) != 0) {
            if (replyToTopId == null) throwNullFieldException("replyToTopId", flags);
            size += SIZE_INT32;
        }
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

    public boolean getReplyToScheduled() {
        return replyToScheduled;
    }

    public void setReplyToScheduled(boolean replyToScheduled) {
        this.replyToScheduled = replyToScheduled;
    }

    public int getReplyToMsgId() {
        return replyToMsgId;
    }

    public void setReplyToMsgId(int replyToMsgId) {
        this.replyToMsgId = replyToMsgId;
    }

    public TLAbsPeer getReplyToPeerId() {
        return replyToPeerId;
    }

    public void setReplyToPeerId(TLAbsPeer replyToPeerId) {
        this.replyToPeerId = replyToPeerId;
    }

    public Integer getReplyToTopId() {
        return replyToTopId;
    }

    public void setReplyToTopId(Integer replyToTopId) {
        this.replyToTopId = replyToTopId;
    }
}
