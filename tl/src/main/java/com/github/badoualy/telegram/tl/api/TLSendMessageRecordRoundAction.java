package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSendMessageRecordRoundAction extends TLAbsSendMessageAction {
    public static final int CONSTRUCTOR_ID = 0x88f27fbc;

    private final String _constructor = "sendMessageRecordRoundAction#88f27fbc";

    public TLSendMessageRecordRoundAction() {
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
