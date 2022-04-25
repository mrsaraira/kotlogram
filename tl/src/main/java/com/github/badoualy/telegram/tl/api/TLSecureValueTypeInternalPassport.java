package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSecureValueTypeInternalPassport extends TLAbsSecureValueType {
    public static final int CONSTRUCTOR_ID = 0x99a48f23;

    private final String _constructor = "secureValueTypeInternalPassport#99a48f23";

    public TLSecureValueTypeInternalPassport() {
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
