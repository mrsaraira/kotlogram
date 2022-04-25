package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSecureValueTypeBankStatement extends TLAbsSecureValueType {
    public static final int CONSTRUCTOR_ID = 0x89137c0d;

    private final String _constructor = "secureValueTypeBankStatement#89137c0d";

    public TLSecureValueTypeBankStatement() {
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
