package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLBaseThemeArctic extends TLAbsBaseTheme {
    public static final int CONSTRUCTOR_ID = 0x5b11125a;

    private final String _constructor = "baseThemeArctic#5b11125a";

    public TLBaseThemeArctic() {
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
