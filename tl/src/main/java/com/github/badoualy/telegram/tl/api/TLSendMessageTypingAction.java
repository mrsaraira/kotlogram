package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSendMessageTypingAction extends TLAbsSendMessageAction {
    public static final int CONSTRUCTOR_ID = 0x16bf744e;

    private final String _constructor = "sendMessageTypingAction#16bf744e";

    public TLSendMessageTypingAction() {
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
