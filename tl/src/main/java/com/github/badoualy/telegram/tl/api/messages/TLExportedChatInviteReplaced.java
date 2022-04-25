package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsUser;
import com.github.badoualy.telegram.tl.api.TLChatInviteExported;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLExportedChatInviteReplaced extends TLAbsExportedChatInvite {
    public static final int CONSTRUCTOR_ID = 0x222600ef;

    protected TLChatInviteExported newInvite;

    private final String _constructor = "messages.exportedChatInviteReplaced#222600ef";

    public TLExportedChatInviteReplaced() {
    }

    public TLExportedChatInviteReplaced(TLChatInviteExported invite, TLChatInviteExported newInvite, TLVector<TLAbsUser> users) {
        this.invite = invite;
        this.newInvite = newInvite;
        this.users = users;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(invite, stream);
        writeTLObject(newInvite, stream);
        writeTLVector(users, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        invite = readTLObject(stream, context, TLChatInviteExported.class, TLChatInviteExported.CONSTRUCTOR_ID);
        newInvite = readTLObject(stream, context, TLChatInviteExported.class, TLChatInviteExported.CONSTRUCTOR_ID);
        users = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += invite.computeSerializedSize();
        size += newInvite.computeSerializedSize();
        size += users.computeSerializedSize();
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

    public TLChatInviteExported getNewInvite() {
        return newInvite;
    }

    public void setNewInvite(TLChatInviteExported newInvite) {
        this.newInvite = newInvite;
    }

    public TLVector<TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(TLVector<TLAbsUser> users) {
        this.users = users;
    }
}
