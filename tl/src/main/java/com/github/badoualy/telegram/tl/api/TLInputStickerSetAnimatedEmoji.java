package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputStickerSetAnimatedEmoji extends TLAbsInputStickerSet {
    public static final int CONSTRUCTOR_ID = 0x28703c8;

    private final String _constructor = "inputStickerSetAnimatedEmoji#28703c8";

    public TLInputStickerSetAnimatedEmoji() {
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
