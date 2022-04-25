package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputMessagesFilterDocument extends TLAbsMessagesFilter {
    public static final int CONSTRUCTOR_ID = 0x9eddf188;

    private final String _constructor = "inputMessagesFilterDocument#9eddf188";

    public TLInputMessagesFilterDocument() {
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
