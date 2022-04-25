package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLStringVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLChannelAdminLogEventActionChangeAvailableReactions extends TLAbsChannelAdminLogEventAction {
    public static final int CONSTRUCTOR_ID = 0x9cf7f76a;

    protected TLStringVector prevValue;

    protected TLStringVector newValue;

    private final String _constructor = "channelAdminLogEventActionChangeAvailableReactions#9cf7f76a";

    public TLChannelAdminLogEventActionChangeAvailableReactions() {
    }

    public TLChannelAdminLogEventActionChangeAvailableReactions(TLStringVector prevValue, TLStringVector newValue) {
        this.prevValue = prevValue;
        this.newValue = newValue;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(prevValue, stream);
        writeTLVector(newValue, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        prevValue = readTLStringVector(stream, context);
        newValue = readTLStringVector(stream, context);
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

    public TLStringVector getPrevValue() {
        return prevValue;
    }

    public void setPrevValue(TLStringVector prevValue) {
        this.prevValue = prevValue;
    }

    public TLStringVector getNewValue() {
        return newValue;
    }

    public void setNewValue(TLStringVector newValue) {
        this.newValue = newValue;
    }
}
