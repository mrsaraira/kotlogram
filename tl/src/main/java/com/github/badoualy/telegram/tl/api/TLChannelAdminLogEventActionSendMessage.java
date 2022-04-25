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

public class TLChannelAdminLogEventActionSendMessage extends TLAbsChannelAdminLogEventAction {
    public static final int CONSTRUCTOR_ID = 0x278f2868;

    protected TLAbsMessage message;

    private final String _constructor = "channelAdminLogEventActionSendMessage#278f2868";

    public TLChannelAdminLogEventActionSendMessage() {
    }

    public TLChannelAdminLogEventActionSendMessage(TLAbsMessage message) {
        this.message = message;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(message, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        message = readTLObject(stream, context, TLAbsMessage.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += message.computeSerializedSize();
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

    public TLAbsMessage getMessage() {
        return message;
    }

    public void setMessage(TLAbsMessage message) {
        this.message = message;
    }
}
