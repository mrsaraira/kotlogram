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

public class TLChannelAdminLogEventActionParticipantJoinByRequest extends TLAbsChannelAdminLogEventAction {
    public static final int CONSTRUCTOR_ID = 0xafb6144a;

    protected TLChatInviteExported invite;

    protected long approvedBy;

    private final String _constructor = "channelAdminLogEventActionParticipantJoinByRequest#afb6144a";

    public TLChannelAdminLogEventActionParticipantJoinByRequest() {
    }

    public TLChannelAdminLogEventActionParticipantJoinByRequest(TLChatInviteExported invite, long approvedBy) {
        this.invite = invite;
        this.approvedBy = approvedBy;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(invite, stream);
        writeLong(approvedBy, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        invite = readTLObject(stream, context, TLChatInviteExported.class, TLChatInviteExported.CONSTRUCTOR_ID);
        approvedBy = readLong(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += invite.computeSerializedSize();
        size += SIZE_INT64;
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

    public TLChatInviteExported getInvite() {
        return invite;
    }

    public void setInvite(TLChatInviteExported invite) {
        this.invite = invite;
    }

    public long getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(long approvedBy) {
        this.approvedBy = approvedBy;
    }
}
