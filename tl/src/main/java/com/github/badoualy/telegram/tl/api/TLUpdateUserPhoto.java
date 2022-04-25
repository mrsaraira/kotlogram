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

public class TLUpdateUserPhoto extends TLAbsUpdate {
    public static final int CONSTRUCTOR_ID = 0xf227868c;

    protected long userId;

    protected int date;

    protected TLAbsUserProfilePhoto photo;

    protected boolean previous;

    private final String _constructor = "updateUserPhoto#f227868c";

    public TLUpdateUserPhoto() {
    }

    public TLUpdateUserPhoto(long userId, int date, TLAbsUserProfilePhoto photo, boolean previous) {
        this.userId = userId;
        this.date = date;
        this.photo = photo;
        this.previous = previous;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(userId, stream);
        writeInt(date, stream);
        writeTLObject(photo, stream);
        writeBoolean(previous, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        userId = readLong(stream);
        date = readInt(stream);
        photo = readTLObject(stream, context, TLAbsUserProfilePhoto.class, -1);
        previous = readTLBool(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += SIZE_INT32;
        size += photo.computeSerializedSize();
        size += SIZE_BOOLEAN;
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public TLAbsUserProfilePhoto getPhoto() {
        return photo;
    }

    public void setPhoto(TLAbsUserProfilePhoto photo) {
        this.photo = photo;
    }

    public boolean getPrevious() {
        return previous;
    }

    public void setPrevious(boolean previous) {
        this.previous = previous;
    }
}
