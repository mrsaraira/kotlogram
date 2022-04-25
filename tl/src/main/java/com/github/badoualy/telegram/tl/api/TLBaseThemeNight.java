package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLBaseThemeNight extends TLAbsBaseTheme {
    public static final int CONSTRUCTOR_ID = 0xb7b31ea8;

    private final String _constructor = "baseThemeNight#b7b31ea8";

    public TLBaseThemeNight() {
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
