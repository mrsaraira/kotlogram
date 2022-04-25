package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLLongVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLMessageActionChatCreate extends TLAbsMessageAction {
    public static final int CONSTRUCTOR_ID = 0xbd47cbad;

    protected String title;

    protected TLLongVector users;

    private final String _constructor = "messageActionChatCreate#bd47cbad";

    public TLMessageActionChatCreate() {
    }

    public TLMessageActionChatCreate(String title, TLLongVector users) {
        this.title = title;
        this.users = users;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(title, stream);
        writeTLVector(users, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        title = readTLString(stream);
        users = readTLLongVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(title);
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TLLongVector getUsers() {
        return users;
    }

    public void setUsers(TLLongVector users) {
        this.users = users;
    }
}
