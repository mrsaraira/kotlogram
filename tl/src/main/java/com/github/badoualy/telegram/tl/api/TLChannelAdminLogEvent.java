package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLChannelAdminLogEvent extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x1fad68cd;

    protected long id;

    protected int date;

    protected long userId;

    protected TLAbsChannelAdminLogEventAction action;

    private final String _constructor = "channelAdminLogEvent#1fad68cd";

    public TLChannelAdminLogEvent() {
    }

    public TLChannelAdminLogEvent(long id, int date, long userId, TLAbsChannelAdminLogEventAction action) {
        this.id = id;
        this.date = date;
        this.userId = userId;
        this.action = action;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(id, stream);
        writeInt(date, stream);
        writeLong(userId, stream);
        writeTLObject(action, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        id = readLong(stream);
        date = readInt(stream);
        userId = readLong(stream);
        action = readTLObject(stream, context, TLAbsChannelAdminLogEventAction.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += SIZE_INT32;
        size += SIZE_INT64;
        size += action.computeSerializedSize();
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public TLAbsChannelAdminLogEventAction getAction() {
        return action;
    }

    public void setAction(TLAbsChannelAdminLogEventAction action) {
        this.action = action;
    }
}
