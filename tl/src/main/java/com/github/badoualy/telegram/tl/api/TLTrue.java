package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;
import java.lang.Override;
import java.lang.String;

public class TLTrue extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x3fedd339;

    private final String _constructor = "true#3fedd339";

    public TLTrue() {
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
