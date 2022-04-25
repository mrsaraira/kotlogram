package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPrivacyKeyPhoneNumber extends TLAbsPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0xd19ae46d;

    private final String _constructor = "privacyKeyPhoneNumber#d19ae46d";

    public TLPrivacyKeyPhoneNumber() {
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
