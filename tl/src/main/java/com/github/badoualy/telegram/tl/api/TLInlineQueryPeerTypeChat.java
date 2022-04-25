package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInlineQueryPeerTypeChat extends TLAbsInlineQueryPeerType {
    public static final int CONSTRUCTOR_ID = 0xd766c50a;

    private final String _constructor = "inlineQueryPeerTypeChat#d766c50a";

    public TLInlineQueryPeerTypeChat() {
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
