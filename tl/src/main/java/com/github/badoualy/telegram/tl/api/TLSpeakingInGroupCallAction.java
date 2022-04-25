package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSpeakingInGroupCallAction extends TLAbsSendMessageAction {
    public static final int CONSTRUCTOR_ID = 0xd92c2285;

    private final String _constructor = "speakingInGroupCallAction#d92c2285";

    public TLSpeakingInGroupCallAction() {
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
