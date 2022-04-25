package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputPeerSelf extends TLAbsInputPeer {
    public static final int CONSTRUCTOR_ID = 0x7da07ec9;

    private final String _constructor = "inputPeerSelf#7da07ec9";

    public TLInputPeerSelf() {
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
