package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputMessagesFilterGeo extends TLAbsMessagesFilter {
    public static final int CONSTRUCTOR_ID = 0xe7026d0d;

    private final String _constructor = "inputMessagesFilterGeo#e7026d0d";

    public TLInputMessagesFilterGeo() {
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
