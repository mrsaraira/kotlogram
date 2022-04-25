package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLPageListItemBlocks extends TLAbsPageListItem {
    public static final int CONSTRUCTOR_ID = 0x25e073fc;

    protected TLVector<TLAbsPageBlock> blocks;

    private final String _constructor = "pageListItemBlocks#25e073fc";

    public TLPageListItemBlocks() {
    }

    public TLPageListItemBlocks(TLVector<TLAbsPageBlock> blocks) {
        this.blocks = blocks;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(blocks, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        blocks = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += blocks.computeSerializedSize();
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

    public TLVector<TLAbsPageBlock> getBlocks() {
        return blocks;
    }

    public void setBlocks(TLVector<TLAbsPageBlock> blocks) {
        this.blocks = blocks;
    }
}
