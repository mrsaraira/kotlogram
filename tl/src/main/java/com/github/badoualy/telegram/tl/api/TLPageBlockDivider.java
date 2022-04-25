package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPageBlockDivider extends TLAbsPageBlock {
    public static final int CONSTRUCTOR_ID = 0xdb20b188;

    private final String _constructor = "pageBlockDivider#db20b188";

    public TLPageBlockDivider() {
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
