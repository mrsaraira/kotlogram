package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLMessageActionContactSignUp extends TLAbsMessageAction {
    public static final int CONSTRUCTOR_ID = 0xf3f25f76;

    private final String _constructor = "messageActionContactSignUp#f3f25f76";

    public TLMessageActionContactSignUp() {
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
