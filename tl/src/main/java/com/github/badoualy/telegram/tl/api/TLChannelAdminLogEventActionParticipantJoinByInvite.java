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

public class TLChannelAdminLogEventActionParticipantJoinByInvite extends TLAbsChannelAdminLogEventAction {
    public static final int CONSTRUCTOR_ID = 0x5cdada77;

    protected TLChatInviteExported invite;

    private final String _constructor = "channelAdminLogEventActionParticipantJoinByInvite#5cdada77";

    public TLChannelAdminLogEventActionParticipantJoinByInvite() {
    }

    public TLChannelAdminLogEventActionParticipantJoinByInvite(TLChatInviteExported invite) {
        this.invite = invite;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(invite, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        invite = readTLObject(stream, context, TLChatInviteExported.class, TLChatInviteExported.CONSTRUCTOR_ID);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += invite.computeSerializedSize();
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
}
