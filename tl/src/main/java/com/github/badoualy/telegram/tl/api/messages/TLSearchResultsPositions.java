package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLSearchResultPosition;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLSearchResultsPositions extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x53b22baf;

    protected int count;

    protected TLVector<TLSearchResultPosition> positions;

    private final String _constructor = "messages.searchResultsPositions#53b22baf";

    public TLSearchResultsPositions() {
    }

    public TLSearchResultsPositions(int count, TLVector<TLSearchResultPosition> positions) {
        this.count = count;
        this.positions = positions;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(count, stream);
        writeTLVector(positions, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        count = readInt(stream);
        positions = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += positions.computeSerializedSize();
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public TLVector<TLSearchResultPosition> getPositions() {
        return positions;
    }

    public void setPositions(TLVector<TLSearchResultPosition> positions) {
        this.positions = positions;
    }
}
