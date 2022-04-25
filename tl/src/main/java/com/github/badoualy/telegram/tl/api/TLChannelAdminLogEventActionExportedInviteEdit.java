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

public class TLChannelAdminLogEventActionExportedInviteEdit extends TLAbsChannelAdminLogEventAction {
    public static final int CONSTRUCTOR_ID = 0xe90ebb59;

    protected TLChatInviteExported prevInvite;

    protected TLChatInviteExported newInvite;

    private final String _constructor = "channelAdminLogEventActionExportedInviteEdit#e90ebb59";

    public TLChannelAdminLogEventActionExportedInviteEdit() {
    }

    public TLChannelAdminLogEventActionExportedInviteEdit(TLChatInviteExported prevInvite, TLChatInviteExported newInvite) {
        this.prevInvite = prevInvite;
        this.newInvite = newInvite;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(prevInvite, stream);
        writeTLObject(newInvite, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        prevInvite = readTLObject(stream, context, TLChatInviteExported.class, TLChatInviteExported.CONSTRUCTOR_ID);
        newInvite = readTLObject(stream, context, TLChatInviteExported.class, TLChatInviteExported.CONSTRUCTOR_ID);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += prevInvite.computeSerializedSize();
        size += newInvite.computeSerializedSize();
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

    public TLChatInviteExported getPrevInvite() {
        return prevInvite;
    }

    public void setPrevInvite(TLChatInviteExported prevInvite) {
        this.prevInvite = prevInvite;
    }

    public TLChatInviteExported getNewInvite() {
        return newInvite;
    }

    public void setNewInvite(TLChatInviteExported newInvite) {
        this.newInvite = newInvite;
    }
}
