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

public class TLChannelAdminLogEventActionParticipantVolume extends TLAbsChannelAdminLogEventAction {
    public static final int CONSTRUCTOR_ID = 0x3e7f6847;

    protected TLGroupCallParticipant participant;

    private final String _constructor = "channelAdminLogEventActionParticipantVolume#3e7f6847";

    public TLChannelAdminLogEventActionParticipantVolume() {
    }

    public TLChannelAdminLogEventActionParticipantVolume(TLGroupCallParticipant participant) {
        this.participant = participant;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(participant, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        participant = readTLObject(stream, context, TLGroupCallParticipant.class, TLGroupCallParticipant.CONSTRUCTOR_ID);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += participant.computeSerializedSize();
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

    public TLGroupCallParticipant getParticipant() {
        return participant;
    }

    public void setParticipant(TLGroupCallParticipant participant) {
        this.participant = participant;
    }
}
