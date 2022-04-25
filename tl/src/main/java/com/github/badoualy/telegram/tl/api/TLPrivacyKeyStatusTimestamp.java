package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPrivacyKeyStatusTimestamp extends TLAbsPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0xbc2eab30;

    private final String _constructor = "privacyKeyStatusTimestamp#bc2eab30";

    public TLPrivacyKeyStatusTimestamp() {
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
