package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLBaseThemeTinted extends TLAbsBaseTheme {
    public static final int CONSTRUCTOR_ID = 0x6d5f77ee;

    private final String _constructor = "baseThemeTinted#6d5f77ee";

    public TLBaseThemeTinted() {
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
