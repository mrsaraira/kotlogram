package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSendMessageChooseContactAction extends TLAbsSendMessageAction {
    public static final int CONSTRUCTOR_ID = 0x628cbc6f;

    private final String _constructor = "sendMessageChooseContactAction#628cbc6f";

    public TLSendMessageChooseContactAction() {
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
