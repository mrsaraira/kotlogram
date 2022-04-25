package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSecureValueTypeDriverLicense extends TLAbsSecureValueType {
    public static final int CONSTRUCTOR_ID = 0x6e425c4;

    private final String _constructor = "secureValueTypeDriverLicense#6e425c4";

    public TLSecureValueTypeDriverLicense() {
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
