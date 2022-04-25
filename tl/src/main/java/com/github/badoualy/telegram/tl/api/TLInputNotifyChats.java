package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputNotifyChats extends TLAbsInputNotifyPeer {
    public static final int CONSTRUCTOR_ID = 0x4a95e84e;

    private final String _constructor = "inputNotifyChats#4a95e84e";

    public TLInputNotifyChats() {
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
