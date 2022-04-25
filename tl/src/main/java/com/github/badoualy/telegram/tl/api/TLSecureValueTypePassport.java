package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSecureValueTypePassport extends TLAbsSecureValueType {
    public static final int CONSTRUCTOR_ID = 0x3dac6a00;

    private final String _constructor = "secureValueTypePassport#3dac6a00";

    public TLSecureValueTypePassport() {
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
