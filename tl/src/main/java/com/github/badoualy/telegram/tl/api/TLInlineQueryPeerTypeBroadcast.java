package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInlineQueryPeerTypeBroadcast extends TLAbsInlineQueryPeerType {
    public static final int CONSTRUCTOR_ID = 0x6334ee9a;

    private final String _constructor = "inlineQueryPeerTypeBroadcast#6334ee9a";

    public TLInlineQueryPeerTypeBroadcast() {
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
