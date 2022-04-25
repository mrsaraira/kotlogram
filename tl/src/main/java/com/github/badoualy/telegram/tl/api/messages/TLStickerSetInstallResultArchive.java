package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsStickerSetCovered;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLStickerSetInstallResultArchive extends TLAbsStickerSetInstallResult {
    public static final int CONSTRUCTOR_ID = 0x35e410a8;

    protected TLVector<TLAbsStickerSetCovered> sets;

    private final String _constructor = "messages.stickerSetInstallResultArchive#35e410a8";

    public TLStickerSetInstallResultArchive() {
    }

    public TLStickerSetInstallResultArchive(TLVector<TLAbsStickerSetCovered> sets) {
        this.sets = sets;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(sets, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        sets = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += sets.computeSerializedSize();
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

    public TLVector<TLAbsStickerSetCovered> getSets() {
        return sets;
    }

    public void setSets(TLVector<TLAbsStickerSetCovered> sets) {
        this.sets = sets;
    }
}
