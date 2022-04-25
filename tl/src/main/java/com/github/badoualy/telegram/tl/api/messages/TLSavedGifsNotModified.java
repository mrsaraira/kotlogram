package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLSavedGifsNotModified extends TLAbsSavedGifs {
    public static final int CONSTRUCTOR_ID = 0xe8025ca2;

    private final String _constructor = "messages.savedGifsNotModified#e8025ca2";

    public TLSavedGifsNotModified() {
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
