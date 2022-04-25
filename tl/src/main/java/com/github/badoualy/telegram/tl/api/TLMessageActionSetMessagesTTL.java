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

public class TLMessageActionSetMessagesTTL extends TLAbsMessageAction {
    public static final int CONSTRUCTOR_ID = 0xaa1afbfd;

    protected int period;

    private final String _constructor = "messageActionSetMessagesTTL#aa1afbfd";

    public TLMessageActionSetMessagesTTL() {
    }

    public TLMessageActionSetMessagesTTL(int period) {
        this.period = period;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(period, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        period = readInt(stream);
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

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
