package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLMessageActionChatDeletePhoto extends TLAbsMessageAction {
    public static final int CONSTRUCTOR_ID = 0x95e3fbef;

    private final String _constructor = "messageActionChatDeletePhoto#95e3fbef";

    public TLMessageActionChatDeletePhoto() {
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
