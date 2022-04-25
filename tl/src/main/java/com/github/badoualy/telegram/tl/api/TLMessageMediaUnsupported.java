package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLMessageMediaUnsupported extends TLAbsMessageMedia {
    public static final int CONSTRUCTOR_ID = 0x9f84f49e;

    private final String _constructor = "messageMediaUnsupported#9f84f49e";

    public TLMessageMediaUnsupported() {
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
