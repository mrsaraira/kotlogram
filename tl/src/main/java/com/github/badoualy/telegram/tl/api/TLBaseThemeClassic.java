package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLBaseThemeClassic extends TLAbsBaseTheme {
    public static final int CONSTRUCTOR_ID = 0xc3a12462;

    private final String _constructor = "baseThemeClassic#c3a12462";

    public TLBaseThemeClassic() {
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
