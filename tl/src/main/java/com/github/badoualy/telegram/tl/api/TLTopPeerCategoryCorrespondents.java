package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLTopPeerCategoryCorrespondents extends TLAbsTopPeerCategory {
    public static final int CONSTRUCTOR_ID = 0x637b7ed;

    private final String _constructor = "topPeerCategoryCorrespondents#637b7ed";

    public TLTopPeerCategoryCorrespondents() {
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
