package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputBotInlineMessageID;
import com.github.badoualy.telegram.tl.api.TLAbsInputUser;
import com.github.badoualy.telegram.tl.core.TLBool;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestMessagesSetInlineGameScore extends TLMethod<TLBool> {
    public static final int CONSTRUCTOR_ID = 0x15ad9f64;

    protected int flags;

    protected boolean editMessage;

    protected boolean force;

    protected TLAbsInputBotInlineMessageID id;

    protected TLAbsInputUser userId;

    protected int score;

    private final String _constructor = "messages.setInlineGameScore#15ad9f64";

    public TLRequestMessagesSetInlineGameScore() {
    }

    public TLRequestMessagesSetInlineGameScore(boolean editMessage, boolean force, TLAbsInputBotInlineMessageID id, TLAbsInputUser userId, int score) {
        this.editMessage = editMessage;
        this.force = force;
        this.id = id;
        this.userId = userId;
        this.score = score;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLBool)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLBool) response;
    }

    private void computeFlags() {
        flags = 0;
        flags = editMessage ? (flags | 1) : (flags & ~1);
        flags = force ? (flags | 2) : (flags & ~2);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLObject(id, stream);
        writeTLObject(userId, stream);
        writeInt(score, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        editMessage = (flags & 1) != 0;
        force = (flags & 2) != 0;
        id = readTLObject(stream, context, TLAbsInputBotInlineMessageID.class, -1);
        userId = readTLObject(stream, context, TLAbsInputUser.class, -1);
        score = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += id.computeSerializedSize();
        size += userId.computeSerializedSize();
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

    public boolean getEditMessage() {
        return editMessage;
    }

    public void setEditMessage(boolean editMessage) {
        this.editMessage = editMessage;
    }

    public boolean getForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }

    public TLAbsInputBotInlineMessageID getId() {
        return id;
    }

    public void setId(TLAbsInputBotInlineMessageID id) {
        this.id = id;
    }

    public TLAbsInputUser getUserId() {
        return userId;
    }

    public void setUserId(TLAbsInputUser userId) {
        this.userId = userId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
