package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLChannelParticipantsAdmins extends TLAbsChannelParticipantsFilter {
    public static final int CONSTRUCTOR_ID = 0xb4608969;

    private final String _constructor = "channelParticipantsAdmins#b4608969";

    public TLChannelParticipantsAdmins() {
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
