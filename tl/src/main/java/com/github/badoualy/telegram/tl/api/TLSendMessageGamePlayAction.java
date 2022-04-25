package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSendMessageGamePlayAction extends TLAbsSendMessageAction {
    public static final int CONSTRUCTOR_ID = 0xdd6a8f48;

    private final String _constructor = "sendMessageGamePlayAction#dd6a8f48";

    public TLSendMessageGamePlayAction() {
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
