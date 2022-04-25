package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputPrivacyKeyStatusTimestamp extends TLAbsInputPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0x4f96cb18;

    private final String _constructor = "inputPrivacyKeyStatusTimestamp#4f96cb18";

    public TLInputPrivacyKeyStatusTimestamp() {
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
