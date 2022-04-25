package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLJsonNull extends TLAbsJSONValue {
    public static final int CONSTRUCTOR_ID = 0x3f6d7b68;

    private final String _constructor = "jsonNull#3f6d7b68";

    public TLJsonNull() {
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
