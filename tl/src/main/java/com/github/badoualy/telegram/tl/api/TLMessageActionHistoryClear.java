package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLMessageActionHistoryClear extends TLAbsMessageAction {
    public static final int CONSTRUCTOR_ID = 0x9fbab604;

    private final String _constructor = "messageActionHistoryClear#9fbab604";

    public TLMessageActionHistoryClear() {
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
