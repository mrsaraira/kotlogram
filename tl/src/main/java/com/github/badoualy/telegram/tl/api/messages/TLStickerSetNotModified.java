package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLStickerSetNotModified extends TLAbsStickerSet {
    public static final int CONSTRUCTOR_ID = 0xd3f924eb;

    private final String _constructor = "messages.stickerSetNotModified#d3f924eb";

    public TLStickerSetNotModified() {
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
