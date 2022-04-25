package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSendMessageRecordAudioAction extends TLAbsSendMessageAction {
    public static final int CONSTRUCTOR_ID = 0xd52f73f7;

    private final String _constructor = "sendMessageRecordAudioAction#d52f73f7";

    public TLSendMessageRecordAudioAction() {
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
