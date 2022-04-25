package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPrivacyValueAllowContacts extends TLAbsPrivacyRule {
    public static final int CONSTRUCTOR_ID = 0xfffe1bac;

    private final String _constructor = "privacyValueAllowContacts#fffe1bac";

    public TLPrivacyValueAllowContacts() {
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
