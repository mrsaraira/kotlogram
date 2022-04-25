package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputMessagesFilterPhotos extends TLAbsMessagesFilter {
    public static final int CONSTRUCTOR_ID = 0x9609a51c;

    private final String _constructor = "inputMessagesFilterPhotos#9609a51c";

    public TLInputMessagesFilterPhotos() {
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
