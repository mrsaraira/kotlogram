package com.github.badoualy.telegram.tl.api.account;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLThemesNotModified extends TLAbsThemes {
    public static final int CONSTRUCTOR_ID = 0xf41eb622;

    private final String _constructor = "account.themesNotModified#f41eb622";

    public TLThemesNotModified() {
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
