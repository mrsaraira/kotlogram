package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputStickerSetEmpty extends TLAbsInputStickerSet {
    public static final int CONSTRUCTOR_ID = 0xffb62b95;

    private final String _constructor = "inputStickerSetEmpty#ffb62b95";

    public TLInputStickerSetEmpty() {
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
