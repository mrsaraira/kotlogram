package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputPrivacyKeyChatInvite extends TLAbsInputPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0xbdfb0426;

    private final String _constructor = "inputPrivacyKeyChatInvite#bdfb0426";

    public TLInputPrivacyKeyChatInvite() {
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
