package com.github.badoualy.telegram.tl.api.messages;

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

public class TLMessageEditData extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x26b5dde6;

    protected int flags;

    protected boolean caption;

    private final String _constructor = "messages.messageEditData#26b5dde6";

    public TLMessageEditData() {
    }

    public TLMessageEditData(boolean caption) {
        this.caption = caption;
    }

    private void computeFlags() {
        flags = 0;
        flags = caption ? (flags | 1) : (flags & ~1);
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
        caption = (flags & 1) != 0;
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

    public boolean getCaption() {
        return caption;
    }

    public void setCaption(boolean caption) {
        this.caption = caption;
    }
}
