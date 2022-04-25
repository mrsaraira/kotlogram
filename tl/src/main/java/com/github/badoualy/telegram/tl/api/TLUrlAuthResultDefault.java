package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLUrlAuthResultDefault extends TLAbsUrlAuthResult {
    public static final int CONSTRUCTOR_ID = 0xa9d6db1f;

    private final String _constructor = "urlAuthResultDefault#a9d6db1f";

    public TLUrlAuthResultDefault() {
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
