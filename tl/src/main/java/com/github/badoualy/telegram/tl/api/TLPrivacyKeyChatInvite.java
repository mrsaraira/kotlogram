package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPrivacyKeyChatInvite extends TLAbsPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0x500e6dfa;

    private final String _constructor = "privacyKeyChatInvite#500e6dfa";

    public TLPrivacyKeyChatInvite() {
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
