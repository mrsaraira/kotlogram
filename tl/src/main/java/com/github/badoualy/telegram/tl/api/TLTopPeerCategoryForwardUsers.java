package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLTopPeerCategoryForwardUsers extends TLAbsTopPeerCategory {
    public static final int CONSTRUCTOR_ID = 0xa8406ca9;

    private final String _constructor = "topPeerCategoryForwardUsers#a8406ca9";

    public TLTopPeerCategoryForwardUsers() {
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
