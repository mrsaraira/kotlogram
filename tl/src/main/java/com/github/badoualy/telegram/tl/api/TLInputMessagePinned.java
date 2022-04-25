package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputMessagePinned extends TLAbsInputMessage {
    public static final int CONSTRUCTOR_ID = 0x86872538;

    private final String _constructor = "inputMessagePinned#86872538";

    public TLInputMessagePinned() {
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
