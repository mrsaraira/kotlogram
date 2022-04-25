package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputPeerEmpty extends TLAbsInputPeer {
    public static final int CONSTRUCTOR_ID = 0x7f3b18ea;

    private final String _constructor = "inputPeerEmpty#7f3b18ea";

    public TLInputPeerEmpty() {
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
