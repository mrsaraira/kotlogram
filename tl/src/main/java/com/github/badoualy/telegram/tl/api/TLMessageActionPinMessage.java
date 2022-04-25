package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLMessageActionPinMessage extends TLAbsMessageAction {
    public static final int CONSTRUCTOR_ID = 0x94bd38ed;

    private final String _constructor = "messageActionPinMessage#94bd38ed";

    public TLMessageActionPinMessage() {
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
