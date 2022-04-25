package com.github.badoualy.telegram.tl.api.channels;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLChannelParticipantsNotModified extends TLAbsChannelParticipants {
    public static final int CONSTRUCTOR_ID = 0xf0173fe9;

    private final String _constructor = "channels.channelParticipantsNotModified#f0173fe9";

    public TLChannelParticipantsNotModified() {
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
