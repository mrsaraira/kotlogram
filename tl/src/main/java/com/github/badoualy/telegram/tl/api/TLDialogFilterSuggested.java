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

public class TLDialogFilterSuggested extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x77744d4a;

    protected TLDialogFilter filter;

    protected String description;

    private final String _constructor = "dialogFilterSuggested#77744d4a";

    public TLDialogFilterSuggested() {
    }

    public TLDialogFilterSuggested(TLDialogFilter filter, String description) {
        this.filter = filter;
        this.description = description;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(filter, stream);
        writeString(description, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        filter = readTLObject(stream, context, TLDialogFilter.class, TLDialogFilter.CONSTRUCTOR_ID);
        description = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += filter.computeSerializedSize();
        size += computeTLStringSerializedSize(description);
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

    public TLDialogFilter getFilter() {
        return filter;
    }

    public void setFilter(TLDialogFilter filter) {
        this.filter = filter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
