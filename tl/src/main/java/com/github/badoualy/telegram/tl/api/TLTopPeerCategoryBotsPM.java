package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLTopPeerCategoryBotsPM extends TLAbsTopPeerCategory {
    public static final int CONSTRUCTOR_ID = 0xab661b5b;

    private final String _constructor = "topPeerCategoryBotsPM#ab661b5b";

    public TLTopPeerCategoryBotsPM() {
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
