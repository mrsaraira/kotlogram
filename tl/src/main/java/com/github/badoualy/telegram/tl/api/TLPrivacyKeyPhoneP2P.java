package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPrivacyKeyPhoneP2P extends TLAbsPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0x39491cc8;

    private final String _constructor = "privacyKeyPhoneP2P#39491cc8";

    public TLPrivacyKeyPhoneP2P() {
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
