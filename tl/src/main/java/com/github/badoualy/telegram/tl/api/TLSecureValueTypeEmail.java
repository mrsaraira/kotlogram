package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSecureValueTypeEmail extends TLAbsSecureValueType {
    public static final int CONSTRUCTOR_ID = 0x8e3ca7ee;

    private final String _constructor = "secureValueTypeEmail#8e3ca7ee";

    public TLSecureValueTypeEmail() {
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
