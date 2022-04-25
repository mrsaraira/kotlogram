package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSendMessageGeoLocationAction extends TLAbsSendMessageAction {
    public static final int CONSTRUCTOR_ID = 0x176f8ba1;

    private final String _constructor = "sendMessageGeoLocationAction#176f8ba1";

    public TLSendMessageGeoLocationAction() {
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
