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

public class TLUpdateTheme extends TLAbsUpdate {
    public static final int CONSTRUCTOR_ID = 0x8216fba3;

    protected TLTheme theme;

    private final String _constructor = "updateTheme#8216fba3";

    public TLUpdateTheme() {
    }

    public TLUpdateTheme(TLTheme theme) {
        this.theme = theme;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(theme, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        theme = readTLObject(stream, context, TLTheme.class, TLTheme.CONSTRUCTOR_ID);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += theme.computeSerializedSize();
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

    public TLTheme getTheme() {
        return theme;
    }

    public void setTheme(TLTheme theme) {
        this.theme = theme;
    }
}
