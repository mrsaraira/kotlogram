package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSecureValueTypeUtilityBill extends TLAbsSecureValueType {
    public static final int CONSTRUCTOR_ID = 0xfc36954e;

    private final String _constructor = "secureValueTypeUtilityBill#fc36954e";

    public TLSecureValueTypeUtilityBill() {
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
