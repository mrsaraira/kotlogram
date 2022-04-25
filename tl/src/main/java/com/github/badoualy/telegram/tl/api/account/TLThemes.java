package com.github.badoualy.telegram.tl.api.account;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLTheme;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLThemes extends TLAbsThemes {
    public static final int CONSTRUCTOR_ID = 0x9a3d8c6d;

    protected long hash;

    protected TLVector<TLTheme> themes;

    private final String _constructor = "account.themes#9a3d8c6d";

    public TLThemes() {
    }

    public TLThemes(long hash, TLVector<TLTheme> themes) {
        this.hash = hash;
        this.themes = themes;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(hash, stream);
        writeTLVector(themes, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        hash = readLong(stream);
        themes = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += themes.computeSerializedSize();
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

    public long getHash() {
        return hash;
    }

    public void setHash(long hash) {
        this.hash = hash;
    }

    public TLVector<TLTheme> getThemes() {
        return themes;
    }

    public void setThemes(TLVector<TLTheme> themes) {
        this.themes = themes;
    }
}
