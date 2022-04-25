package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLBotCommandScopeChats extends TLAbsBotCommandScope {
    public static final int CONSTRUCTOR_ID = 0x6fe1a881;

    private final String _constructor = "botCommandScopeChats#6fe1a881";

    public TLBotCommandScopeChats() {
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
