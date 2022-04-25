package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSendMessageRecordVideoAction extends TLAbsSendMessageAction {
    public static final int CONSTRUCTOR_ID = 0xa187d66f;

    private final String _constructor = "sendMessageRecordVideoAction#a187d66f";

    public TLSendMessageRecordVideoAction() {
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
