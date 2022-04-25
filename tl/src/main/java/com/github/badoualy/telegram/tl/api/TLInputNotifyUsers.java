package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputNotifyUsers extends TLAbsInputNotifyPeer {
    public static final int CONSTRUCTOR_ID = 0x193b4417;

    private final String _constructor = "inputNotifyUsers#193b4417";

    public TLInputNotifyUsers() {
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
