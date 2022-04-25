package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPageBlockUnsupported extends TLAbsPageBlock {
    public static final int CONSTRUCTOR_ID = 0x13567e8a;

    private final String _constructor = "pageBlockUnsupported#13567e8a";

    public TLPageBlockUnsupported() {
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
