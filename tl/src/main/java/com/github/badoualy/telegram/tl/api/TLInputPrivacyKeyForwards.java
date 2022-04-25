package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputPrivacyKeyForwards extends TLAbsInputPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0xa4dd4c08;

    private final String _constructor = "inputPrivacyKeyForwards#a4dd4c08";

    public TLInputPrivacyKeyForwards() {
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
