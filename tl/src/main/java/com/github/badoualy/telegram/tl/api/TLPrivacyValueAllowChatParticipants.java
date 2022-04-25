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

public class TLPrivacyValueAllowChatParticipants extends TLAbsPrivacyRule {
    public static final int CONSTRUCTOR_ID = 0x6b134e8e;

    protected TLLongVector chats;

    private final String _constructor = "privacyValueAllowChatParticipants#6b134e8e";

    public TLPrivacyValueAllowChatParticipants() {
    }

    public TLPrivacyValueAllowChatParticipants(TLLongVector chats) {
        this.chats = chats;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(chats, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        chats = readTLLongVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += chats.computeSerializedSize();
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

    public TLLongVector getChats() {
        return chats;
    }

    public void setChats(TLLongVector chats) {
        this.chats = chats;
    }
}
