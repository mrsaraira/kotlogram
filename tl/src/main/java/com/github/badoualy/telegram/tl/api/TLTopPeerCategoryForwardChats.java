package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLTopPeerCategoryForwardChats extends TLAbsTopPeerCategory {
    public static final int CONSTRUCTOR_ID = 0xfbeec0f0;

    private final String _constructor = "topPeerCategoryForwardChats#fbeec0f0";

    public TLTopPeerCategoryForwardChats() {
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
