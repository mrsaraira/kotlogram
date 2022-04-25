package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPrivacyKeyForwards extends TLAbsPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0x69ec56a3;

    private final String _constructor = "privacyKeyForwards#69ec56a3";

    public TLPrivacyKeyForwards() {
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
