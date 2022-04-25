package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputMessagesFilterGif extends TLAbsMessagesFilter {
    public static final int CONSTRUCTOR_ID = 0xffc86587;

    private final String _constructor = "inputMessagesFilterGif#ffc86587";

    public TLInputMessagesFilterGif() {
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
