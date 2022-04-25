package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLUpdateReadChannelInbox extends TLAbsUpdate {
    public static final int CONSTRUCTOR_ID = 0x922e6e10;

    protected int flags;

    protected Integer folderId;

    protected long channelId;

    protected int maxId;

    protected int stillUnreadCount;

    protected int pts;

    private final String _constructor = "updateReadChannelInbox#922e6e10";

    public TLUpdateReadChannelInbox() {
    }

    public TLUpdateReadChannelInbox(Integer folderId, long channelId, int maxId, int stillUnreadCount, int pts) {
        this.folderId = folderId;
        this.channelId = channelId;
        this.maxId = maxId;
        this.stillUnreadCount = stillUnreadCount;
        this.pts = pts;
    }

    private void computeFlags() {
        flags = 0;
        flags = folderId != null ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        if ((flags & 1) != 0) {
            if (folderId == null) throwNullFieldException("folderId", flags);
            writeInt(folderId, stream);
        }
        writeLong(channelId, stream);
        writeInt(maxId, stream);
        writeInt(stillUnreadCount, stream);
        writeInt(pts, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        folderId = (flags & 1) != 0 ? readInt(stream) : null;
        channelId = readLong(stream);
        maxId = readInt(stream);
        stillUnreadCount = readInt(stream);
        pts = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        if ((flags & 1) != 0) {
            if (folderId == null) throwNullFieldException("folderId", flags);
            size += SIZE_INT32;
        }
        size += SIZE_INT64;
        size += SIZE_INT32;
        size += SIZE_INT32;
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

    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public long getChannelId() {
        return channelId;
    }

    public void setChannelId(long channelId) {
        this.channelId = channelId;
    }

    public int getMaxId() {
        return maxId;
    }

    public void setMaxId(int maxId) {
        this.maxId = maxId;
    }

    public int getStillUnreadCount() {
        return stillUnreadCount;
    }

    public void setStillUnreadCount(int stillUnreadCount) {
        this.stillUnreadCount = stillUnreadCount;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }
}
