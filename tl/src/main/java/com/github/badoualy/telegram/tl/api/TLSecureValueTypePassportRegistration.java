package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSecureValueTypePassportRegistration extends TLAbsSecureValueType {
    public static final int CONSTRUCTOR_ID = 0x99e3806a;

    private final String _constructor = "secureValueTypePassportRegistration#99e3806a";

    public TLSecureValueTypePassportRegistration() {
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
