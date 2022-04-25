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

public class TLChannelAdminLogEventActionChangeLocation extends TLAbsChannelAdminLogEventAction {
    public static final int CONSTRUCTOR_ID = 0xe6b76ae;

    protected TLAbsChannelLocation prevValue;

    protected TLAbsChannelLocation newValue;

    private final String _constructor = "channelAdminLogEventActionChangeLocation#e6b76ae";

    public TLChannelAdminLogEventActionChangeLocation() {
    }

    public TLChannelAdminLogEventActionChangeLocation(TLAbsChannelLocation prevValue, TLAbsChannelLocation newValue) {
        this.prevValue = prevValue;
        this.newValue = newValue;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(prevValue, stream);
        writeTLObject(newValue, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        prevValue = readTLObject(stream, context, TLAbsChannelLocation.class, -1);
        newValue = readTLObject(stream, context, TLAbsChannelLocation.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += prevValue.computeSerializedSize();
        size += newValue.computeSerializedSize();
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

    public TLAbsChannelLocation getPrevValue() {
        return prevValue;
    }

    public void setPrevValue(TLAbsChannelLocation prevValue) {
        this.prevValue = prevValue;
    }

    public TLAbsChannelLocation getNewValue() {
        return newValue;
    }

    public void setNewValue(TLAbsChannelLocation newValue) {
        this.newValue = newValue;
    }
}
