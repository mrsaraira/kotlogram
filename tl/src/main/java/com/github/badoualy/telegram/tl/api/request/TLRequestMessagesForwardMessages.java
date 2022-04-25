package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputPeer;
import com.github.badoualy.telegram.tl.api.TLAbsUpdates;
import com.github.badoualy.telegram.tl.core.TLIntVector;
import com.github.badoualy.telegram.tl.core.TLLongVector;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestMessagesForwardMessages extends TLMethod<TLAbsUpdates> {
    public static final int CONSTRUCTOR_ID = 0xcc30290b;

    protected int flags;

    protected boolean silent;

    protected boolean background;

    protected boolean withMyScore;

    protected boolean dropAuthor;

    protected boolean dropMediaCaptions;

    protected boolean noforwards;

    protected TLAbsInputPeer fromPeer;

    protected TLIntVector id;

    protected TLLongVector randomId;

    protected TLAbsInputPeer toPeer;

    protected Integer scheduleDate;

    protected TLAbsInputPeer sendAs;

    private final String _constructor = "messages.forwardMessages#cc30290b";

    public TLRequestMessagesForwardMessages() {
    }

    public TLRequestMessagesForwardMessages(boolean silent, boolean background, boolean withMyScore, boolean dropAuthor, boolean dropMediaCaptions, boolean noforwards, TLAbsInputPeer fromPeer, TLIntVector id, TLLongVector randomId, TLAbsInputPeer toPeer, Integer scheduleDate, TLAbsInputPeer sendAs) {
        this.silent = silent;
        this.background = background;
        this.withMyScore = withMyScore;
        this.dropAuthor = dropAuthor;
        this.dropMediaCaptions = dropMediaCaptions;
        this.noforwards = noforwards;
        this.fromPeer = fromPeer;
        this.id = id;
        this.randomId = randomId;
        this.toPeer = toPeer;
        this.scheduleDate = scheduleDate;
        this.sendAs = sendAs;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLAbsUpdates deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLAbsUpdates)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLAbsUpdates) response;
    }

    private void computeFlags() {
        flags = 0;
        flags = silent ? (flags | 32) : (flags & ~32);
        flags = background ? (flags | 64) : (flags & ~64);
        flags = withMyScore ? (flags | 256) : (flags & ~256);
        flags = dropAuthor ? (flags | 2048) : (flags & ~2048);
        flags = dropMediaCaptions ? (flags | 4096) : (flags & ~4096);
        flags = noforwards ? (flags | 16384) : (flags & ~16384);
        flags = scheduleDate != null ? (flags | 1024) : (flags & ~1024);
        flags = sendAs != null ? (flags | 8192) : (flags & ~8192);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLObject(fromPeer, stream);
        writeTLVector(id, stream);
        writeTLVector(randomId, stream);
        writeTLObject(toPeer, stream);
        if ((flags & 1024) != 0) {
            if (scheduleDate == null) throwNullFieldException("scheduleDate", flags);
            writeInt(scheduleDate, stream);
        }
        if ((flags & 8192) != 0) {
            if (sendAs == null) throwNullFieldException("sendAs", flags);
            writeTLObject(sendAs, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        silent = (flags & 32) != 0;
        background = (flags & 64) != 0;
        withMyScore = (flags & 256) != 0;
        dropAuthor = (flags & 2048) != 0;
        dropMediaCaptions = (flags & 4096) != 0;
        noforwards = (flags & 16384) != 0;
        fromPeer = readTLObject(stream, context, TLAbsInputPeer.class, -1);
        id = readTLIntVector(stream, context);
        randomId = readTLLongVector(stream, context);
        toPeer = readTLObject(stream, context, TLAbsInputPeer.class, -1);
        scheduleDate = (flags & 1024) != 0 ? readInt(stream) : null;
        sendAs = (flags & 8192) != 0 ? readTLObject(stream, context, TLAbsInputPeer.class, -1) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += fromPeer.computeSerializedSize();
        size += id.computeSerializedSize();
        size += randomId.computeSerializedSize();
        size += toPeer.computeSerializedSize();
        if ((flags & 1024) != 0) {
            if (scheduleDate == null) throwNullFieldException("scheduleDate", flags);
            size += SIZE_INT32;
        }
        if ((flags & 8192) != 0) {
            if (sendAs == null) throwNullFieldException("sendAs", flags);
            size += sendAs.computeSerializedSize();
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

    public boolean getSilent() {
        return silent;
    }

    public void setSilent(boolean silent) {
        this.silent = silent;
    }

    public boolean getBackground() {
        return background;
    }

    public void setBackground(boolean background) {
        this.background = background;
    }

    public boolean getWithMyScore() {
        return withMyScore;
    }

    public void setWithMyScore(boolean withMyScore) {
        this.withMyScore = withMyScore;
    }

    public boolean getDropAuthor() {
        return dropAuthor;
    }

    public void setDropAuthor(boolean dropAuthor) {
        this.dropAuthor = dropAuthor;
    }

    public boolean getDropMediaCaptions() {
        return dropMediaCaptions;
    }

    public void setDropMediaCaptions(boolean dropMediaCaptions) {
        this.dropMediaCaptions = dropMediaCaptions;
    }

    public boolean getNoforwards() {
        return noforwards;
    }

    public void setNoforwards(boolean noforwards) {
        this.noforwards = noforwards;
    }

    public TLAbsInputPeer getFromPeer() {
        return fromPeer;
    }

    public void setFromPeer(TLAbsInputPeer fromPeer) {
        this.fromPeer = fromPeer;
    }

    public TLIntVector getId() {
        return id;
    }

    public void setId(TLIntVector id) {
        this.id = id;
    }

    public TLLongVector getRandomId() {
        return randomId;
    }

    public void setRandomId(TLLongVector randomId) {
        this.randomId = randomId;
    }

    public TLAbsInputPeer getToPeer() {
        return toPeer;
    }

    public void setToPeer(TLAbsInputPeer toPeer) {
        this.toPeer = toPeer;
    }

    public Integer getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Integer scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public TLAbsInputPeer getSendAs() {
        return sendAs;
    }

    public void setSendAs(TLAbsInputPeer sendAs) {
        this.sendAs = sendAs;
    }
}
