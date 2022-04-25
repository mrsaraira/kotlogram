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

public class TLPageBlockOrderedList extends TLAbsPageBlock {
    public static final int CONSTRUCTOR_ID = 0x9a8ae1e1;

    protected TLVector<TLAbsPageListOrderedItem> items;

    private final String _constructor = "pageBlockOrderedList#9a8ae1e1";

    public TLPageBlockOrderedList() {
    }

    public TLPageBlockOrderedList(TLVector<TLAbsPageListOrderedItem> items) {
        this.items = items;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(items, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        items = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += items.computeSerializedSize();
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

    public TLVector<TLAbsPageListOrderedItem> getItems() {
        return items;
    }

    public void setItems(TLVector<TLAbsPageListOrderedItem> items) {
        this.items = items;
    }
}
