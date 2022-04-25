package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLFavedStickersNotModified extends TLAbsFavedStickers {
    public static final int CONSTRUCTOR_ID = 0x9e8fa6d3;

    private final String _constructor = "messages.favedStickersNotModified#9e8fa6d3";

    public TLFavedStickersNotModified() {
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
