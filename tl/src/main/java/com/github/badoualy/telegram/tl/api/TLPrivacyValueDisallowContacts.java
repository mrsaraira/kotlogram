package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPrivacyValueDisallowContacts extends TLAbsPrivacyRule {
    public static final int CONSTRUCTOR_ID = 0xf888fa1a;

    private final String _constructor = "privacyValueDisallowContacts#f888fa1a";

    public TLPrivacyValueDisallowContacts() {
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
