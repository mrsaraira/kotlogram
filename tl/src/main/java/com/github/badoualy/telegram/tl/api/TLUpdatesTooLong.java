package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLUpdatesTooLong extends TLAbsUpdates {
    public static final int CONSTRUCTOR_ID = 0xe317af7e;

    private final String _constructor = "updatesTooLong#e317af7e";

    public TLUpdatesTooLong() {
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
