package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputMessagesFilterEmpty extends TLAbsMessagesFilter {
    public static final int CONSTRUCTOR_ID = 0x57e2f66c;

    private final String _constructor = "inputMessagesFilterEmpty#57e2f66c";

    public TLInputMessagesFilterEmpty() {
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
