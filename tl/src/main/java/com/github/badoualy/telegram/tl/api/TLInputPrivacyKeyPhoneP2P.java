package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputPrivacyKeyPhoneP2P extends TLAbsInputPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0xdb9e70d2;

    private final String _constructor = "inputPrivacyKeyPhoneP2P#db9e70d2";

    public TLInputPrivacyKeyPhoneP2P() {
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
