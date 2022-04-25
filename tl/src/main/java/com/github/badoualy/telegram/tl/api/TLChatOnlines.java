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

public class TLChatOnlines extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xf041e250;

    protected int onlines;

    private final String _constructor = "chatOnlines#f041e250";

    public TLChatOnlines() {
    }

    public TLChatOnlines(int onlines) {
        this.onlines = onlines;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(onlines, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        onlines = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
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

    public int getOnlines() {
        return onlines;
    }

    public void setOnlines(int onlines) {
        this.onlines = onlines;
    }
}
