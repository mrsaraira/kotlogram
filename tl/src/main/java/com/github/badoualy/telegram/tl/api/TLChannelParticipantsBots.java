package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLChannelParticipantsBots extends TLAbsChannelParticipantsFilter {
    public static final int CONSTRUCTOR_ID = 0xb0d1865b;

    private final String _constructor = "channelParticipantsBots#b0d1865b";

    public TLChannelParticipantsBots() {
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
