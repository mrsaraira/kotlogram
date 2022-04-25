package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPrivacyKeyProfilePhoto extends TLAbsPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0x96151fed;

    private final String _constructor = "privacyKeyProfilePhoto#96151fed";

    public TLPrivacyKeyProfilePhoto() {
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
