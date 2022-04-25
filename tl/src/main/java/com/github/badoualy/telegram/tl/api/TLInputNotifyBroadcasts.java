package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputNotifyBroadcasts extends TLAbsInputNotifyPeer {
    public static final int CONSTRUCTOR_ID = 0xb1db7c7e;

    private final String _constructor = "inputNotifyBroadcasts#b1db7c7e";

    public TLInputNotifyBroadcasts() {
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
