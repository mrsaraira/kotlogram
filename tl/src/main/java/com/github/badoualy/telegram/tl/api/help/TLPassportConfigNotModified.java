package com.github.badoualy.telegram.tl.api.help;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPassportConfigNotModified extends TLAbsPassportConfig {
    public static final int CONSTRUCTOR_ID = 0xbfb9f457;

    private final String _constructor = "help.passportConfigNotModified#bfb9f457";

    public TLPassportConfigNotModified() {
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
