package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsUser;
import com.github.badoualy.telegram.tl.api.TLChatInviteExported;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLExportedChatInvites extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xbdc62dcc;

    protected int count;

    protected TLVector<TLChatInviteExported> invites;

    protected TLVector<TLAbsUser> users;

    private final String _constructor = "messages.exportedChatInvites#bdc62dcc";

    public TLExportedChatInvites() {
    }

    public TLExportedChatInvites(int count, TLVector<TLChatInviteExported> invites, TLVector<TLAbsUser> users) {
        this.count = count;
        this.invites = invites;
        this.users = users;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(count, stream);
        writeTLVector(invites, stream);
        writeTLVector(users, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        count = readInt(stream);
        invites = readTLVector(stream, context);
        users = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += invites.computeSerializedSize();
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public TLVector<TLChatInviteExported> getInvites() {
        return invites;
    }

    public void setInvites(TLVector<TLChatInviteExported> invites) {
        this.invites = invites;
    }

    public TLVector<TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(TLVector<TLAbsUser> users) {
        this.users = users;
    }
}
