package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputFileLocation;
import com.github.badoualy.telegram.tl.api.TLFileHash;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestUploadGetFileHashes extends TLMethod<TLVector<TLFileHash>> {
    public static final int CONSTRUCTOR_ID = 0xc7025931;

    protected TLAbsInputFileLocation location;

    protected int offset;

    private final String _constructor = "upload.getFileHashes#c7025931";

    public TLRequestUploadGetFileHashes() {
    }

    public TLRequestUploadGetFileHashes(TLAbsInputFileLocation location, int offset) {
        this.location = location;
        this.offset = offset;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLVector<TLFileHash> deserializeResponse(InputStream stream, TLContext context) throws IOException {
        return readTLVector(stream, context);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(location, stream);
        writeInt(offset, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        location = readTLObject(stream, context, TLAbsInputFileLocation.class, -1);
        offset = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += location.computeSerializedSize();
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

    public TLAbsInputFileLocation getLocation() {
        return location;
    }

    public void setLocation(TLAbsInputFileLocation location) {
        this.location = location;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
