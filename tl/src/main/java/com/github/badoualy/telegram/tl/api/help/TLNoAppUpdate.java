package com.github.badoualy.telegram.tl.api.help;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLNoAppUpdate extends TLAbsAppUpdate {
    public static final int CONSTRUCTOR_ID = 0xc45a6536;

    private final String _constructor = "help.noAppUpdate#c45a6536";

    public TLNoAppUpdate() {
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
