package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputUserSelf extends TLAbsInputUser {
    public static final int CONSTRUCTOR_ID = 0xf7c1b13f;

    private final String _constructor = "inputUserSelf#f7c1b13f";

    public TLInputUserSelf() {
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
