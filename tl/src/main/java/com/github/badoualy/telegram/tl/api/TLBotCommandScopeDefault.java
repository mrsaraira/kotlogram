package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLBotCommandScopeDefault extends TLAbsBotCommandScope {
    public static final int CONSTRUCTOR_ID = 0x2f6cb2ab;

    private final String _constructor = "botCommandScopeDefault#2f6cb2ab";

    public TLBotCommandScopeDefault() {
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
