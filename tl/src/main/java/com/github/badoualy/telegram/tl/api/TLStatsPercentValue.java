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

public class TLStatsPercentValue extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xcbce2fe0;

    protected double part;

    protected double total;

    private final String _constructor = "statsPercentValue#cbce2fe0";

    public TLStatsPercentValue() {
    }

    public TLStatsPercentValue(double part, double total) {
        this.part = part;
        this.total = total;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeDouble(part, stream);
        writeDouble(total, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        part = readDouble(stream);
        total = readDouble(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_DOUBLE;
        size += SIZE_DOUBLE;
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

    public double getPart() {
        return part;
    }

    public void setPart(double part) {
        this.part = part;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
