package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;
import java.lang.Override;
import java.lang.String;

public class TLNull extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x56730bcc;

    private final String _constructor = "null#56730bcc";

    public TLNull() {
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
