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

public class TLMessageActionGeoProximityReached extends TLAbsMessageAction {
    public static final int CONSTRUCTOR_ID = 0x98e0d697;

    protected TLAbsPeer fromId;

    protected TLAbsPeer toId;

    protected int distance;

    private final String _constructor = "messageActionGeoProximityReached#98e0d697";

    public TLMessageActionGeoProximityReached() {
    }

    public TLMessageActionGeoProximityReached(TLAbsPeer fromId, TLAbsPeer toId, int distance) {
        this.fromId = fromId;
        this.toId = toId;
        this.distance = distance;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(fromId, stream);
        writeTLObject(toId, stream);
        writeInt(distance, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        fromId = readTLObject(stream, context, TLAbsPeer.class, -1);
        toId = readTLObject(stream, context, TLAbsPeer.class, -1);
        distance = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += fromId.computeSerializedSize();
        size += toId.computeSerializedSize();
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

    public TLAbsPeer getFromId() {
        return fromId;
    }

    public void setFromId(TLAbsPeer fromId) {
        this.fromId = fromId;
    }

    public TLAbsPeer getToId() {
        return toId;
    }

    public void setToId(TLAbsPeer toId) {
        this.toId = toId;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
