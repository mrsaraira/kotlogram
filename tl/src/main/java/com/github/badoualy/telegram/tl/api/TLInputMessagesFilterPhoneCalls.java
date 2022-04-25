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

public class TLInputMessagesFilterPhoneCalls extends TLAbsMessagesFilter {
    public static final int CONSTRUCTOR_ID = 0x80c99768;

    protected int flags;

    protected boolean missed;

    private final String _constructor = "inputMessagesFilterPhoneCalls#80c99768";

    public TLInputMessagesFilterPhoneCalls() {
    }

    public TLInputMessagesFilterPhoneCalls(boolean missed) {
        this.missed = missed;
    }

    private void computeFlags() {
        flags = 0;
        flags = missed ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        missed = (flags & 1) != 0;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
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

    public boolean getMissed() {
        return missed;
    }

    public void setMissed(boolean missed) {
        this.missed = missed;
    }
}
