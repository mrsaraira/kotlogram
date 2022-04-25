package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputMessagesFilterRoundVideo extends TLAbsMessagesFilter {
    public static final int CONSTRUCTOR_ID = 0xb549da53;

    private final String _constructor = "inputMessagesFilterRoundVideo#b549da53";

    public TLInputMessagesFilterRoundVideo() {
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
