package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLChannelAdminLogEventActionParticipantJoin extends TLAbsChannelAdminLogEventAction {
    public static final int CONSTRUCTOR_ID = 0x183040d3;

    private final String _constructor = "channelAdminLogEventActionParticipantJoin#183040d3";

    public TLChannelAdminLogEventActionParticipantJoin() {
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
