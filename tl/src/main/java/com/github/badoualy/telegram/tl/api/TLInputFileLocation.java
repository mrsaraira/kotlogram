package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLInputFileLocation extends TLAbsInputFileLocation {
    public static final int CONSTRUCTOR_ID = 0xdfdaabe1;

    protected long volumeId;

    protected int localId;

    protected long secret;

    protected TLBytes fileReference;

    private final String _constructor = "inputFileLocation#dfdaabe1";

    public TLInputFileLocation() {
    }

    public TLInputFileLocation(long volumeId, int localId, long secret, TLBytes fileReference) {
        this.volumeId = volumeId;
        this.localId = localId;
        this.secret = secret;
        this.fileReference = fileReference;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(volumeId, stream);
        writeInt(localId, stream);
        writeLong(secret, stream);
        writeTLBytes(fileReference, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        volumeId = readLong(stream);
        localId = readInt(stream);
        secret = readLong(stream);
        fileReference = readTLBytes(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += SIZE_INT32;
        size += SIZE_INT64;
        size += computeTLBytesSerializedSize(fileReference);
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

    public long getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(long volumeId) {
        this.volumeId = volumeId;
    }

    public int getLocalId() {
        return localId;
    }

    public void setLocalId(int localId) {
        this.localId = localId;
    }

    public long getSecret() {
        return secret;
    }

    public void setSecret(long secret) {
        this.secret = secret;
    }

    public TLBytes getFileReference() {
        return fileReference;
    }

    public void setFileReference(TLBytes fileReference) {
        this.fileReference = fileReference;
    }
}
