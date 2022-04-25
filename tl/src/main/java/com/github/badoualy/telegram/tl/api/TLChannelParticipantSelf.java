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

public class TLChannelParticipantSelf extends TLAbsChannelParticipant {
    public static final int CONSTRUCTOR_ID = 0x35a8bfa7;

    protected int flags;

    protected boolean viaRequest;

    protected long userId;

    protected long inviterId;

    protected int date;

    private final String _constructor = "channelParticipantSelf#35a8bfa7";

    public TLChannelParticipantSelf() {
    }

    public TLChannelParticipantSelf(boolean viaRequest, long userId, long inviterId, int date) {
        this.viaRequest = viaRequest;
        this.userId = userId;
        this.inviterId = inviterId;
        this.date = date;
    }

    private void computeFlags() {
        flags = 0;
        flags = viaRequest ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeLong(userId, stream);
        writeLong(inviterId, stream);
        writeInt(date, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        viaRequest = (flags & 1) != 0;
        userId = readLong(stream);
        inviterId = readLong(stream);
        date = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT64;
        size += SIZE_INT64;
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

    public boolean getViaRequest() {
        return viaRequest;
    }

    public void setViaRequest(boolean viaRequest) {
        this.viaRequest = viaRequest;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getInviterId() {
        return inviterId;
    }

    public void setInviterId(long inviterId) {
        this.inviterId = inviterId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
