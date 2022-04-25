package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsUser;
import com.github.badoualy.telegram.tl.api.TLMessageUserReaction;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLMessageReactionsList extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xa366923c;

    protected int flags;

    protected int count;

    protected TLVector<TLMessageUserReaction> reactions;

    protected TLVector<TLAbsUser> users;

    protected String nextOffset;

    private final String _constructor = "messages.messageReactionsList#a366923c";

    public TLMessageReactionsList() {
    }

    public TLMessageReactionsList(int count, TLVector<TLMessageUserReaction> reactions, TLVector<TLAbsUser> users, String nextOffset) {
        this.count = count;
        this.reactions = reactions;
        this.users = users;
        this.nextOffset = nextOffset;
    }

    private void computeFlags() {
        flags = 0;
        flags = nextOffset != null ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeInt(count, stream);
        writeTLVector(reactions, stream);
        writeTLVector(users, stream);
        if ((flags & 1) != 0) {
            if (nextOffset == null) throwNullFieldException("nextOffset", flags);
            writeString(nextOffset, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        count = readInt(stream);
        reactions = readTLVector(stream, context);
        users = readTLVector(stream, context);
        nextOffset = (flags & 1) != 0 ? readTLString(stream) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += reactions.computeSerializedSize();
        size += users.computeSerializedSize();
        if ((flags & 1) != 0) {
            if (nextOffset == null) throwNullFieldException("nextOffset", flags);
            size += computeTLStringSerializedSize(nextOffset);
        }
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

    public TLVector<TLMessageUserReaction> getReactions() {
        return reactions;
    }

    public void setReactions(TLVector<TLMessageUserReaction> reactions) {
        this.reactions = reactions;
    }

    public TLVector<TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(TLVector<TLAbsUser> users) {
        this.users = users;
    }

    public String getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(String nextOffset) {
        this.nextOffset = nextOffset;
    }
}
