package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsChat;
import com.github.badoualy.telegram.tl.api.TLAbsMessage;
import com.github.badoualy.telegram.tl.api.TLAbsUser;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLMessagesSlice extends TLAbsMessages {
    public static final int CONSTRUCTOR_ID = 0x3a54685e;

    protected int flags;

    protected boolean inexact;

    protected int count;

    protected Integer nextRate;

    protected Integer offsetIdOffset;

    protected TLVector<TLAbsMessage> messages;

    protected TLVector<TLAbsChat> chats;

    protected TLVector<TLAbsUser> users;

    private final String _constructor = "messages.messagesSlice#3a54685e";

    public TLMessagesSlice() {
    }

    public TLMessagesSlice(boolean inexact, int count, Integer nextRate, Integer offsetIdOffset, TLVector<TLAbsMessage> messages, TLVector<TLAbsChat> chats, TLVector<TLAbsUser> users) {
        this.inexact = inexact;
        this.count = count;
        this.nextRate = nextRate;
        this.offsetIdOffset = offsetIdOffset;
        this.messages = messages;
        this.chats = chats;
        this.users = users;
    }

    private void computeFlags() {
        flags = 0;
        flags = inexact ? (flags | 2) : (flags & ~2);
        flags = nextRate != null ? (flags | 1) : (flags & ~1);
        flags = offsetIdOffset != null ? (flags | 4) : (flags & ~4);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeInt(count, stream);
        if ((flags & 1) != 0) {
            if (nextRate == null) throwNullFieldException("nextRate", flags);
            writeInt(nextRate, stream);
        }
        if ((flags & 4) != 0) {
            if (offsetIdOffset == null) throwNullFieldException("offsetIdOffset", flags);
            writeInt(offsetIdOffset, stream);
        }
        writeTLVector(messages, stream);
        writeTLVector(chats, stream);
        writeTLVector(users, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        inexact = (flags & 2) != 0;
        count = readInt(stream);
        nextRate = (flags & 1) != 0 ? readInt(stream) : null;
        offsetIdOffset = (flags & 4) != 0 ? readInt(stream) : null;
        messages = readTLVector(stream, context);
        chats = readTLVector(stream, context);
        users = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT32;
        if ((flags & 1) != 0) {
            if (nextRate == null) throwNullFieldException("nextRate", flags);
            size += SIZE_INT32;
        }
        if ((flags & 4) != 0) {
            if (offsetIdOffset == null) throwNullFieldException("offsetIdOffset", flags);
            size += SIZE_INT32;
        }
        size += messages.computeSerializedSize();
        size += chats.computeSerializedSize();
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

    public boolean getInexact() {
        return inexact;
    }

    public void setInexact(boolean inexact) {
        this.inexact = inexact;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Integer getNextRate() {
        return nextRate;
    }

    public void setNextRate(Integer nextRate) {
        this.nextRate = nextRate;
    }

    public Integer getOffsetIdOffset() {
        return offsetIdOffset;
    }

    public void setOffsetIdOffset(Integer offsetIdOffset) {
        this.offsetIdOffset = offsetIdOffset;
    }

    public TLVector<TLAbsMessage> getMessages() {
        return messages;
    }

    public void setMessages(TLVector<TLAbsMessage> messages) {
        this.messages = messages;
    }

    public TLVector<TLAbsChat> getChats() {
        return chats;
    }

    public void setChats(TLVector<TLAbsChat> chats) {
        this.chats = chats;
    }

    public TLVector<TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(TLVector<TLAbsUser> users) {
        this.users = users;
    }
}
