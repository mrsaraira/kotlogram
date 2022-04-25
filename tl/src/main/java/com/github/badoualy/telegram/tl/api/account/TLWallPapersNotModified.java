package com.github.badoualy.telegram.tl.api.account;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLWallPapersNotModified extends TLAbsWallPapers {
    public static final int CONSTRUCTOR_ID = 0x1c199183;

    private final String _constructor = "account.wallPapersNotModified#1c199183";

    public TLWallPapersNotModified() {
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }
}
