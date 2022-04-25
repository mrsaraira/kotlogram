package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputChannelEmpty extends TLAbsInputChannel {
    public static final int CONSTRUCTOR_ID = 0xee8c1e86;

    private final String _constructor = "inputChannelEmpty#ee8c1e86";

    public TLInputChannelEmpty() {
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
