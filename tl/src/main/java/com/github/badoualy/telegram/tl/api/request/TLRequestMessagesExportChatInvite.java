package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputPeer;
import com.github.badoualy.telegram.tl.api.TLChatInviteExported;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestMessagesExportChatInvite extends TLMethod<TLChatInviteExported> {
    public static final int CONSTRUCTOR_ID = 0xa02ce5d5;

    protected int flags;

    protected boolean legacyRevokePermanent;

    protected boolean requestNeeded;

    protected TLAbsInputPeer peer;

    protected Integer expireDate;

    protected Integer usageLimit;

    protected String title;

    private final String _constructor = "messages.exportChatInvite#a02ce5d5";

    public TLRequestMessagesExportChatInvite() {
    }

    public TLRequestMessagesExportChatInvite(boolean legacyRevokePermanent, boolean requestNeeded, TLAbsInputPeer peer, Integer expireDate, Integer usageLimit, String title) {
        this.legacyRevokePermanent = legacyRevokePermanent;
        this.requestNeeded = requestNeeded;
        this.peer = peer;
        this.expireDate = expireDate;
        this.usageLimit = usageLimit;
        this.title = title;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLChatInviteExported deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLChatInviteExported)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLChatInviteExported) response;
    }

    private void computeFlags() {
        flags = 0;
        flags = legacyRevokePermanent ? (flags | 4) : (flags & ~4);
        flags = requestNeeded ? (flags | 8) : (flags & ~8);
        flags = expireDate != null ? (flags | 1) : (flags & ~1);
        flags = usageLimit != null ? (flags | 2) : (flags & ~2);
        flags = title != null ? (flags | 16) : (flags & ~16);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLObject(peer, stream);
        if ((flags & 1) != 0) {
            if (expireDate == null) throwNullFieldException("expireDate", flags);
            writeInt(expireDate, stream);
        }
        if ((flags & 2) != 0) {
            if (usageLimit == null) throwNullFieldException("usageLimit", flags);
            writeInt(usageLimit, stream);
        }
        if ((flags & 16) != 0) {
            if (title == null) throwNullFieldException("title", flags);
            writeString(title, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        legacyRevokePermanent = (flags & 4) != 0;
        requestNeeded = (flags & 8) != 0;
        peer = readTLObject(stream, context, TLAbsInputPeer.class, -1);
        expireDate = (flags & 1) != 0 ? readInt(stream) : null;
        usageLimit = (flags & 2) != 0 ? readInt(stream) : null;
        title = (flags & 16) != 0 ? readTLString(stream) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += peer.computeSerializedSize();
        if ((flags & 1) != 0) {
            if (expireDate == null) throwNullFieldException("expireDate", flags);
            size += SIZE_INT32;
        }
        if ((flags & 2) != 0) {
            if (usageLimit == null) throwNullFieldException("usageLimit", flags);
            size += SIZE_INT32;
        }
        if ((flags & 16) != 0) {
            if (title == null) throwNullFieldException("title", flags);
            size += computeTLStringSerializedSize(title);
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

    public boolean getLegacyRevokePermanent() {
        return legacyRevokePermanent;
    }

    public void setLegacyRevokePermanent(boolean legacyRevokePermanent) {
        this.legacyRevokePermanent = legacyRevokePermanent;
    }

    public boolean getRequestNeeded() {
        return requestNeeded;
    }

    public void setRequestNeeded(boolean requestNeeded) {
        this.requestNeeded = requestNeeded;
    }

    public TLAbsInputPeer getPeer() {
        return peer;
    }

    public void setPeer(TLAbsInputPeer peer) {
        this.peer = peer;
    }

    public Integer getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Integer expireDate) {
        this.expireDate = expireDate;
    }

    public Integer getUsageLimit() {
        return usageLimit;
    }

    public void setUsageLimit(Integer usageLimit) {
        this.usageLimit = usageLimit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
