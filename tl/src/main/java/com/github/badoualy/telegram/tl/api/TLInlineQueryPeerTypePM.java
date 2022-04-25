package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInlineQueryPeerTypePM extends TLAbsInlineQueryPeerType {
    public static final int CONSTRUCTOR_ID = 0x833c0fac;

    private final String _constructor = "inlineQueryPeerTypePM#833c0fac";

    public TLInlineQueryPeerTypePM() {
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
