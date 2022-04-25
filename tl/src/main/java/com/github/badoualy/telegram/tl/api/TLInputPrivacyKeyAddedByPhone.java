package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputPrivacyKeyAddedByPhone extends TLAbsInputPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0xd1219bdd;

    private final String _constructor = "inputPrivacyKeyAddedByPhone#d1219bdd";

    public TLInputPrivacyKeyAddedByPhone() {
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
