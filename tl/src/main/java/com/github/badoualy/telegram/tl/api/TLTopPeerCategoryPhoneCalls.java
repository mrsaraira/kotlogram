package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLTopPeerCategoryPhoneCalls extends TLAbsTopPeerCategory {
    public static final int CONSTRUCTOR_ID = 0x1e76a78c;

    private final String _constructor = "topPeerCategoryPhoneCalls#1e76a78c";

    public TLTopPeerCategoryPhoneCalls() {
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
