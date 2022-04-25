package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLUpdateStickerSets extends TLAbsUpdate {
    public static final int CONSTRUCTOR_ID = 0x43ae3dec;

    private final String _constructor = "updateStickerSets#43ae3dec";

    public TLUpdateStickerSets() {
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
