package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputChannel;
import com.github.badoualy.telegram.tl.api.TLAbsInputPeer;
import com.github.badoualy.telegram.tl.api.messages.TLAbsMessages;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestStatsGetMessagePublicForwards extends TLMethod<TLAbsMessages> {
    public static final int CONSTRUCTOR_ID = 0x5630281b;

    protected TLAbsInputChannel channel;

    protected int msgId;

    protected int offsetRate;

    protected TLAbsInputPeer offsetPeer;

    protected int offsetId;

    protected int limit;

    private final String _constructor = "stats.getMessagePublicForwards#5630281b";

    public TLRequestStatsGetMessagePublicForwards() {
    }

    public TLRequestStatsGetMessagePublicForwards(TLAbsInputChannel channel, int msgId, int offsetRate, TLAbsInputPeer offsetPeer, int offsetId, int limit) {
        this.channel = channel;
        this.msgId = msgId;
        this.offsetRate = offsetRate;
        this.offsetPeer = offsetPeer;
        this.offsetId = offsetId;
        this.limit = limit;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLAbsMessages deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLAbsMessages)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLAbsMessages) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(channel, stream);
        writeInt(msgId, stream);
        writeInt(offsetRate, stream);
        writeTLObject(offsetPeer, stream);
        writeInt(offsetId, stream);
        writeInt(limit, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        channel = readTLObject(stream, context, TLAbsInputChannel.class, -1);
        msgId = readInt(stream);
        offsetRate = readInt(stream);
        offsetPeer = readTLObject(stream, context, TLAbsInputPeer.class, -1);
        offsetId = readInt(stream);
        limit = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += channel.computeSerializedSize();
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += offsetPeer.computeSerializedSize();
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

    public TLAbsInputChannel getChannel() {
        return channel;
    }

    public void setChannel(TLAbsInputChannel channel) {
        this.channel = channel;
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public int getOffsetRate() {
        return offsetRate;
    }

    public void setOffsetRate(int offsetRate) {
        this.offsetRate = offsetRate;
    }

    public TLAbsInputPeer getOffsetPeer() {
        return offsetPeer;
    }

    public void setOffsetPeer(TLAbsInputPeer offsetPeer) {
        this.offsetPeer = offsetPeer;
    }

    public int getOffsetId() {
        return offsetId;
    }

    public void setOffsetId(int offsetId) {
        this.offsetId = offsetId;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
