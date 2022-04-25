package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLUserStatusLastMonth extends TLAbsUserStatus {
    public static final int CONSTRUCTOR_ID = 0x77ebc742;

    private final String _constructor = "userStatusLastMonth#77ebc742";

    public TLUserStatusLastMonth() {
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
