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

public class TLGroupCallDiscarded extends TLAbsGroupCall {
    public static final int CONSTRUCTOR_ID = 0x7780bcb4;

    protected int duration;

    private final String _constructor = "groupCallDiscarded#7780bcb4";

    public TLGroupCallDiscarded() {
    }

    public TLGroupCallDiscarded(long id, long accessHash, int duration) {
        this.id = id;
        this.accessHash = accessHash;
        this.duration = duration;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(id, stream);
        writeLong(accessHash, stream);
        writeInt(duration, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        id = readLong(stream);
        accessHash = readLong(stream);
        duration = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += SIZE_INT64;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccessHash() {
        return accessHash;
    }

    public void setAccessHash(long accessHash) {
        this.accessHash = accessHash;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
