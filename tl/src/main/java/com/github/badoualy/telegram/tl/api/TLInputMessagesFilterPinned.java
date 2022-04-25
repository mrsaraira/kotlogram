package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputMessagesFilterPinned extends TLAbsMessagesFilter {
    public static final int CONSTRUCTOR_ID = 0x1bb00451;

    private final String _constructor = "inputMessagesFilterPinned#1bb00451";

    public TLInputMessagesFilterPinned() {
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
