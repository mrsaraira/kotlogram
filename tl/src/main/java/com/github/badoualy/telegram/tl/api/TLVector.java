package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;
import java.lang.Override;
import java.lang.String;

public class TLVector extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x1cb5c415;

    private final String _constructor = "vector#1cb5c415";

    public TLVector() {
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
