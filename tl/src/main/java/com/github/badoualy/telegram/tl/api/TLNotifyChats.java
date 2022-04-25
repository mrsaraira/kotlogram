package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLNotifyChats extends TLAbsNotifyPeer {
    public static final int CONSTRUCTOR_ID = 0xc007cec3;

    private final String _constructor = "notifyChats#c007cec3";

    public TLNotifyChats() {
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
