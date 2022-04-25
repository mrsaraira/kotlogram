package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLChatAdminWithInvites extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xf2ecef23;

    protected long adminId;

    protected int invitesCount;

    protected int revokedInvitesCount;

    private final String _constructor = "chatAdminWithInvites#f2ecef23";

    public TLChatAdminWithInvites() {
    }

    public TLChatAdminWithInvites(long adminId, int invitesCount, int revokedInvitesCount) {
        this.adminId = adminId;
        this.invitesCount = invitesCount;
        this.revokedInvitesCount = revokedInvitesCount;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(adminId, stream);
        writeInt(invitesCount, stream);
        writeInt(revokedInvitesCount, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        adminId = readLong(stream);
        invitesCount = readInt(stream);
        revokedInvitesCount = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += SIZE_INT32;
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

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public int getInvitesCount() {
        return invitesCount;
    }

    public void setInvitesCount(int invitesCount) {
        this.invitesCount = invitesCount;
    }

    public int getRevokedInvitesCount() {
        return revokedInvitesCount;
    }

    public void setRevokedInvitesCount(int revokedInvitesCount) {
        this.revokedInvitesCount = revokedInvitesCount;
    }
}
