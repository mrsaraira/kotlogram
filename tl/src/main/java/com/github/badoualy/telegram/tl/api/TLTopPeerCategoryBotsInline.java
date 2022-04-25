package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLTopPeerCategoryBotsInline extends TLAbsTopPeerCategory {
    public static final int CONSTRUCTOR_ID = 0x148677e2;

    private final String _constructor = "topPeerCategoryBotsInline#148677e2";

    public TLTopPeerCategoryBotsInline() {
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
