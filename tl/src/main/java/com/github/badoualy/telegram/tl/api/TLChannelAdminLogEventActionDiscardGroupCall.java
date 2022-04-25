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

public class TLChannelAdminLogEventActionDiscardGroupCall extends TLAbsChannelAdminLogEventAction {
    public static final int CONSTRUCTOR_ID = 0xdb9f9140;

    protected TLInputGroupCall call;

    private final String _constructor = "channelAdminLogEventActionDiscardGroupCall#db9f9140";

    public TLChannelAdminLogEventActionDiscardGroupCall() {
    }

    public TLChannelAdminLogEventActionDiscardGroupCall(TLInputGroupCall call) {
        this.call = call;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(call, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        call = readTLObject(stream, context, TLInputGroupCall.class, TLInputGroupCall.CONSTRUCTOR_ID);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += call.computeSerializedSize();
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

    public TLInputGroupCall getCall() {
        return call;
    }

    public void setCall(TLInputGroupCall call) {
        this.call = call;
    }
}
