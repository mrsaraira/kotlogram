package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputMessagesFilterRoundVoice extends TLAbsMessagesFilter {
    public static final int CONSTRUCTOR_ID = 0x7a7c17a4;

    private final String _constructor = "inputMessagesFilterRoundVoice#7a7c17a4";

    public TLInputMessagesFilterRoundVoice() {
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
