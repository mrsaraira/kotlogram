package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLInputGeoPoint extends TLAbsInputGeoPoint {
    public static final int CONSTRUCTOR_ID = 0x48222faf;

    protected int flags;

    protected double lat;

    protected double _long;

    protected Integer accuracyRadius;

    private final String _constructor = "inputGeoPoint#48222faf";

    public TLInputGeoPoint() {
    }

    public TLInputGeoPoint(double lat, double _long, Integer accuracyRadius) {
        this.lat = lat;
        this._long = _long;
        this.accuracyRadius = accuracyRadius;
    }

    private void computeFlags() {
        flags = 0;
        flags = accuracyRadius != null ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeDouble(lat, stream);
        writeDouble(_long, stream);
        if ((flags & 1) != 0) {
            if (accuracyRadius == null) throwNullFieldException("accuracyRadius", flags);
            writeInt(accuracyRadius, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        lat = readDouble(stream);
        _long = readDouble(stream);
        accuracyRadius = (flags & 1) != 0 ? readInt(stream) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_DOUBLE;
        size += SIZE_DOUBLE;
        if ((flags & 1) != 0) {
            if (accuracyRadius == null) throwNullFieldException("accuracyRadius", flags);
            size += SIZE_INT32;
        }
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

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLong() {
        return _long;
    }

    public void setLong(double _long) {
        this._long = _long;
    }

    public Integer getAccuracyRadius() {
        return accuracyRadius;
    }

    public void setAccuracyRadius(Integer accuracyRadius) {
        this.accuracyRadius = accuracyRadius;
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final boolean isNotEmpty() {
        return true;
    }

    @Override
    public final TLInputGeoPoint getAsInputGeoPoint() {
        return this;
    }
}
