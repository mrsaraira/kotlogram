package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLBytes;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLSponsoredMessage extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x3a836df8;

    protected int flags;

    protected TLBytes randomId;

    protected TLAbsPeer fromId;

    protected TLAbsChatInvite chatInvite;

    protected String chatInviteHash;

    protected Integer channelPost;

    protected String startParam;

    protected String message;

    protected TLVector<TLAbsMessageEntity> entities;

    private final String _constructor = "sponsoredMessage#3a836df8";

    public TLSponsoredMessage() {
    }

    public TLSponsoredMessage(TLBytes randomId, TLAbsPeer fromId, TLAbsChatInvite chatInvite, String chatInviteHash, Integer channelPost, String startParam, String message, TLVector<TLAbsMessageEntity> entities) {
        this.randomId = randomId;
        this.fromId = fromId;
        this.chatInvite = chatInvite;
        this.chatInviteHash = chatInviteHash;
        this.channelPost = channelPost;
        this.startParam = startParam;
        this.message = message;
        this.entities = entities;
    }

    private void computeFlags() {
        flags = 0;
        flags = fromId != null ? (flags | 8) : (flags & ~8);
        flags = chatInvite != null ? (flags | 16) : (flags & ~16);
        flags = chatInviteHash != null ? (flags | 16) : (flags & ~16);
        flags = channelPost != null ? (flags | 4) : (flags & ~4);
        flags = startParam != null ? (flags | 1) : (flags & ~1);
        flags = entities != null ? (flags | 2) : (flags & ~2);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLBytes(randomId, stream);
        if ((flags & 8) != 0) {
            if (fromId == null) throwNullFieldException("fromId", flags);
            writeTLObject(fromId, stream);
        }
        if ((flags & 16) != 0) {
            if (chatInvite == null) throwNullFieldException("chatInvite", flags);
            writeTLObject(chatInvite, stream);
        }
        if ((flags & 16) != 0) {
            if (chatInviteHash == null) throwNullFieldException("chatInviteHash", flags);
            writeString(chatInviteHash, stream);
        }
        if ((flags & 4) != 0) {
            if (channelPost == null) throwNullFieldException("channelPost", flags);
            writeInt(channelPost, stream);
        }
        if ((flags & 1) != 0) {
            if (startParam == null) throwNullFieldException("startParam", flags);
            writeString(startParam, stream);
        }
        writeString(message, stream);
        if ((flags & 2) != 0) {
            if (entities == null) throwNullFieldException("entities", flags);
            writeTLVector(entities, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        randomId = readTLBytes(stream, context);
        fromId = (flags & 8) != 0 ? readTLObject(stream, context, TLAbsPeer.class, -1) : null;
        chatInvite = (flags & 16) != 0 ? readTLObject(stream, context, TLAbsChatInvite.class, -1) : null;
        chatInviteHash = (flags & 16) != 0 ? readTLString(stream) : null;
        channelPost = (flags & 4) != 0 ? readInt(stream) : null;
        startParam = (flags & 1) != 0 ? readTLString(stream) : null;
        message = readTLString(stream);
        entities = (flags & 2) != 0 ? readTLVector(stream, context) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += computeTLBytesSerializedSize(randomId);
        if ((flags & 8) != 0) {
            if (fromId == null) throwNullFieldException("fromId", flags);
            size += fromId.computeSerializedSize();
        }
        if ((flags & 16) != 0) {
            if (chatInvite == null) throwNullFieldException("chatInvite", flags);
            size += chatInvite.computeSerializedSize();
        }
        if ((flags & 16) != 0) {
            if (chatInviteHash == null) throwNullFieldException("chatInviteHash", flags);
            size += computeTLStringSerializedSize(chatInviteHash);
        }
        if ((flags & 4) != 0) {
            if (channelPost == null) throwNullFieldException("channelPost", flags);
            size += SIZE_INT32;
        }
        if ((flags & 1) != 0) {
            if (startParam == null) throwNullFieldException("startParam", flags);
            size += computeTLStringSerializedSize(startParam);
        }
        size += computeTLStringSerializedSize(message);
        if ((flags & 2) != 0) {
            if (entities == null) throwNullFieldException("entities", flags);
            size += entities.computeSerializedSize();
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

    public TLBytes getRandomId() {
        return randomId;
    }

    public void setRandomId(TLBytes randomId) {
        this.randomId = randomId;
    }

    public TLAbsPeer getFromId() {
        return fromId;
    }

    public void setFromId(TLAbsPeer fromId) {
        this.fromId = fromId;
    }

    public TLAbsChatInvite getChatInvite() {
        return chatInvite;
    }

    public void setChatInvite(TLAbsChatInvite chatInvite) {
        this.chatInvite = chatInvite;
    }

    public String getChatInviteHash() {
        return chatInviteHash;
    }

    public void setChatInviteHash(String chatInviteHash) {
        this.chatInviteHash = chatInviteHash;
    }

    public Integer getChannelPost() {
        return channelPost;
    }

    public void setChannelPost(Integer channelPost) {
        this.channelPost = channelPost;
    }

    public String getStartParam() {
        return startParam;
    }

    public void setStartParam(String startParam) {
        this.startParam = startParam;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TLVector<TLAbsMessageEntity> getEntities() {
        return entities;
    }

    public void setEntities(TLVector<TLAbsMessageEntity> entities) {
        this.entities = entities;
    }
}
