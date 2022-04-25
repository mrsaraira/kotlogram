package com.github.badoualy.telegram.tl.api.auth;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLCodeTypeMissedCall extends TLAbsCodeType {
    public static final int CONSTRUCTOR_ID = 0xd61ad6ee;

    private final String _constructor = "auth.codeTypeMissedCall#d61ad6ee";

    public TLCodeTypeMissedCall() {
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
