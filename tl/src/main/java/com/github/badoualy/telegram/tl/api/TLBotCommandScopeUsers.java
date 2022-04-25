package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLBotCommandScopeUsers extends TLAbsBotCommandScope {
    public static final int CONSTRUCTOR_ID = 0x3c4f04d8;

    private final String _constructor = "botCommandScopeUsers#3c4f04d8";

    public TLBotCommandScopeUsers() {
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
