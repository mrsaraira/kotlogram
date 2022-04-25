package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSecureValueTypePhone extends TLAbsSecureValueType {
    public static final int CONSTRUCTOR_ID = 0xb320aadb;

    private final String _constructor = "secureValueTypePhone#b320aadb";

    public TLSecureValueTypePhone() {
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
