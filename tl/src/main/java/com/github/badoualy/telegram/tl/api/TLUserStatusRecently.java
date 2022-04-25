package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLUserStatusRecently extends TLAbsUserStatus {
    public static final int CONSTRUCTOR_ID = 0xe26f42f1;

    private final String _constructor = "userStatusRecently#e26f42f1";

    public TLUserStatusRecently() {
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
