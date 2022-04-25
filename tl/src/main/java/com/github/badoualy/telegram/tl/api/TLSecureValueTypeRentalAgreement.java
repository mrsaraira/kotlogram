package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSecureValueTypeRentalAgreement extends TLAbsSecureValueType {
    public static final int CONSTRUCTOR_ID = 0x8b883488;

    private final String _constructor = "secureValueTypeRentalAgreement#8b883488";

    public TLSecureValueTypeRentalAgreement() {
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
