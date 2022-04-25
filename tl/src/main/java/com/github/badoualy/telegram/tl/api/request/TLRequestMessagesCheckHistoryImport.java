package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.messages.TLHistoryImportParsed;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestMessagesCheckHistoryImport extends TLMethod<TLHistoryImportParsed> {
    public static final int CONSTRUCTOR_ID = 0x43fe19f3;

    protected String importHead;

    private final String _constructor = "messages.checkHistoryImport#43fe19f3";

    public TLRequestMessagesCheckHistoryImport() {
    }

    public TLRequestMessagesCheckHistoryImport(String importHead) {
        this.importHead = importHead;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLHistoryImportParsed deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLHistoryImportParsed)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLHistoryImportParsed) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(importHead, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        importHead = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(importHead);
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

    public String getImportHead() {
        return importHead;
    }

    public void setImportHead(String importHead) {
        this.importHead = importHead;
    }
}
