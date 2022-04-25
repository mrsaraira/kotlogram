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

public class TLInputStickerSetThumb extends TLAbsInputFileLocation {
    public static final int CONSTRUCTOR_ID = 0x9d84f3db;

    protected TLAbsInputStickerSet stickerset;

    protected int thumbVersion;

    private final String _constructor = "inputStickerSetThumb#9d84f3db";

    public TLInputStickerSetThumb() {
    }

    public TLInputStickerSetThumb(TLAbsInputStickerSet stickerset, int thumbVersion) {
        this.stickerset = stickerset;
        this.thumbVersion = thumbVersion;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(stickerset, stream);
        writeInt(thumbVersion, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        stickerset = readTLObject(stream, context, TLAbsInputStickerSet.class, -1);
        thumbVersion = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += stickerset.computeSerializedSize();
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

    public TLAbsInputStickerSet getStickerset() {
        return stickerset;
    }

    public void setStickerset(TLAbsInputStickerSet stickerset) {
        this.stickerset = stickerset;
    }

    public int getThumbVersion() {
        return thumbVersion;
    }

    public void setThumbVersion(int thumbVersion) {
        this.thumbVersion = thumbVersion;
    }
}
