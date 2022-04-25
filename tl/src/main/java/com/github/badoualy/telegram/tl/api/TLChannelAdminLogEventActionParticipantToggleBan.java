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

public class TLChannelAdminLogEventActionParticipantToggleBan extends TLAbsChannelAdminLogEventAction {
    public static final int CONSTRUCTOR_ID = 0xe6d83d7e;

    protected TLAbsChannelParticipant prevParticipant;

    protected TLAbsChannelParticipant newParticipant;

    private final String _constructor = "channelAdminLogEventActionParticipantToggleBan#e6d83d7e";

    public TLChannelAdminLogEventActionParticipantToggleBan() {
    }

    public TLChannelAdminLogEventActionParticipantToggleBan(TLAbsChannelParticipant prevParticipant, TLAbsChannelParticipant newParticipant) {
        this.prevParticipant = prevParticipant;
        this.newParticipant = newParticipant;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(prevParticipant, stream);
        writeTLObject(newParticipant, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        prevParticipant = readTLObject(stream, context, TLAbsChannelParticipant.class, -1);
        newParticipant = readTLObject(stream, context, TLAbsChannelParticipant.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += prevParticipant.computeSerializedSize();
        size += newParticipant.computeSerializedSize();
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

    public TLAbsChannelParticipant getPrevParticipant() {
        return prevParticipant;
    }

    public void setPrevParticipant(TLAbsChannelParticipant prevParticipant) {
        this.prevParticipant = prevParticipant;
    }

    public TLAbsChannelParticipant getNewParticipant() {
        return newParticipant;
    }

    public void setNewParticipant(TLAbsChannelParticipant newParticipant) {
        this.newParticipant = newParticipant;
    }
}
