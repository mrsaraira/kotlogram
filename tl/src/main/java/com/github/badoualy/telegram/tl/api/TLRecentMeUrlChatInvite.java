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

public class TLRecentMeUrlChatInvite extends TLAbsRecentMeUrl {
    public static final int CONSTRUCTOR_ID = 0xeb49081d;

    protected TLAbsChatInvite chatInvite;

    private final String _constructor = "recentMeUrlChatInvite#eb49081d";

    public TLRecentMeUrlChatInvite() {
    }

    public TLRecentMeUrlChatInvite(String url, TLAbsChatInvite chatInvite) {
        this.url = url;
        this.chatInvite = chatInvite;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(url, stream);
        writeTLObject(chatInvite, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        url = readTLString(stream);
        chatInvite = readTLObject(stream, context, TLAbsChatInvite.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(url);
        size += chatInvite.computeSerializedSize();
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TLAbsChatInvite getChatInvite() {
        return chatInvite;
    }

    public void setChatInvite(TLAbsChatInvite chatInvite) {
        this.chatInvite = chatInvite;
    }
}
