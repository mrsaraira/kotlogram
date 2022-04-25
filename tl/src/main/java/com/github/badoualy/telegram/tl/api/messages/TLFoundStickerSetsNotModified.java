package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLFoundStickerSetsNotModified extends TLAbsFoundStickerSets {
    public static final int CONSTRUCTOR_ID = 0xd54b65d;

    private final String _constructor = "messages.foundStickerSetsNotModified#d54b65d";

    public TLFoundStickerSetsNotModified() {
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
