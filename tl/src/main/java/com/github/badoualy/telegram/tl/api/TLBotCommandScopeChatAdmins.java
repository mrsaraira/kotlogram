package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLBotCommandScopeChatAdmins extends TLAbsBotCommandScope {
    public static final int CONSTRUCTOR_ID = 0xb9aa606a;

    private final String _constructor = "botCommandScopeChatAdmins#b9aa606a";

    public TLBotCommandScopeChatAdmins() {
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
