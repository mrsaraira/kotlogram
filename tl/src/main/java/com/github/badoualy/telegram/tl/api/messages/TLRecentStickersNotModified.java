package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLRecentStickersNotModified extends TLAbsRecentStickers {
    public static final int CONSTRUCTOR_ID = 0xb17f890;

    private final String _constructor = "messages.recentStickersNotModified#b17f890";

    public TLRecentStickersNotModified() {
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
