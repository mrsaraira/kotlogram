package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLIntVector;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLAffectedFoundMessages extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xef8d3e6c;

    protected int pts;

    protected int ptsCount;

    protected int offset;

    protected TLIntVector messages;

    private final String _constructor = "messages.affectedFoundMessages#ef8d3e6c";

    public TLAffectedFoundMessages() {
    }

    public TLAffectedFoundMessages(int pts, int ptsCount, int offset, TLIntVector messages) {
        this.pts = pts;
        this.ptsCount = ptsCount;
        this.offset = offset;
        this.messages = messages;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(pts, stream);
        writeInt(ptsCount, stream);
        writeInt(offset, stream);
        writeTLVector(messages, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        pts = readInt(stream);
        ptsCount = readInt(stream);
        offset = readInt(stream);
        messages = readTLIntVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += messages.computeSerializedSize();
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

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    public int getPtsCount() {
        return ptsCount;
    }

    public void setPtsCount(int ptsCount) {
        this.ptsCount = ptsCount;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public TLIntVector getMessages() {
        return messages;
    }

    public void setMessages(TLIntVector messages) {
        this.messages = messages;
    }
}
