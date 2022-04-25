package com.github.badoualy.telegram.tl.api.account;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsWallPaper;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLWallPapers extends TLAbsWallPapers {
    public static final int CONSTRUCTOR_ID = 0xcdc3858c;

    protected long hash;

    protected TLVector<TLAbsWallPaper> wallpapers;

    private final String _constructor = "account.wallPapers#cdc3858c";

    public TLWallPapers() {
    }

    public TLWallPapers(long hash, TLVector<TLAbsWallPaper> wallpapers) {
        this.hash = hash;
        this.wallpapers = wallpapers;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(hash, stream);
        writeTLVector(wallpapers, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        hash = readLong(stream);
        wallpapers = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += wallpapers.computeSerializedSize();
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

    public TLVector<TLAbsWallPaper> getWallpapers() {
        return wallpapers;
    }

    public void setWallpapers(TLVector<TLAbsWallPaper> wallpapers) {
        this.wallpapers = wallpapers;
    }
}
