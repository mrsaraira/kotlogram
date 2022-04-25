package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLNotifyBroadcasts extends TLAbsNotifyPeer {
    public static final int CONSTRUCTOR_ID = 0xd612e8ef;

    private final String _constructor = "notifyBroadcasts#d612e8ef";

    public TLNotifyBroadcasts() {
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
