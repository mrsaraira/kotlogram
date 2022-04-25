package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputChannel;
import com.github.badoualy.telegram.tl.core.TLBool;
import com.github.badoualy.telegram.tl.core.TLBytes;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestChannelsViewSponsoredMessage extends TLMethod<TLBool> {
    public static final int CONSTRUCTOR_ID = 0xbeaedb94;

    protected TLAbsInputChannel channel;

    protected TLBytes randomId;

    private final String _constructor = "channels.viewSponsoredMessage#beaedb94";

    public TLRequestChannelsViewSponsoredMessage() {
    }

    public TLRequestChannelsViewSponsoredMessage(TLAbsInputChannel channel, TLBytes randomId) {
        this.channel = channel;
        this.randomId = randomId;
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
        writeTLObject(channel, stream);
        writeTLBytes(randomId, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        channel = readTLObject(stream, context, TLAbsInputChannel.class, -1);
        randomId = readTLBytes(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += channel.computeSerializedSize();
        size += computeTLBytesSerializedSize(randomId);
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

    public TLBytes getRandomId() {
        return randomId;
    }

    public void setRandomId(TLBytes randomId) {
        this.randomId = randomId;
    }
}
