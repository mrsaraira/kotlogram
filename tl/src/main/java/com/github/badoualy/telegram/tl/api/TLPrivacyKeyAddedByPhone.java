package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPrivacyKeyAddedByPhone extends TLAbsPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0x42ffd42b;

    private final String _constructor = "privacyKeyAddedByPhone#42ffd42b";

    public TLPrivacyKeyAddedByPhone() {
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
