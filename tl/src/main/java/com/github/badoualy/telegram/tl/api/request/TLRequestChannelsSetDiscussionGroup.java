package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputChannel;
import com.github.badoualy.telegram.tl.core.TLBool;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestChannelsSetDiscussionGroup extends TLMethod<TLBool> {
    public static final int CONSTRUCTOR_ID = 0x40582bb2;

    protected TLAbsInputChannel broadcast;

    protected TLAbsInputChannel group;

    private final String _constructor = "channels.setDiscussionGroup#40582bb2";

    public TLRequestChannelsSetDiscussionGroup() {
    }

    public TLRequestChannelsSetDiscussionGroup(TLAbsInputChannel broadcast, TLAbsInputChannel group) {
        this.broadcast = broadcast;
        this.group = group;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLBool)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLBool) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(broadcast, stream);
        writeTLObject(group, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        broadcast = readTLObject(stream, context, TLAbsInputChannel.class, -1);
        group = readTLObject(stream, context, TLAbsInputChannel.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += broadcast.computeSerializedSize();
        size += group.computeSerializedSize();
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

    public TLAbsInputChannel getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(TLAbsInputChannel broadcast) {
        this.broadcast = broadcast;
    }

    public TLAbsInputChannel getGroup() {
        return group;
    }

    public void setGroup(TLAbsInputChannel group) {
        this.group = group;
    }
}
