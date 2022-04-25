package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputMessagesFilterMusic extends TLAbsMessagesFilter {
    public static final int CONSTRUCTOR_ID = 0x3751b49e;

    private final String _constructor = "inputMessagesFilterMusic#3751b49e";

    public TLInputMessagesFilterMusic() {
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
