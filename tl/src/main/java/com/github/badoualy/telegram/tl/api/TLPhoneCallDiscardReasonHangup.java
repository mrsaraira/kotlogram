package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPhoneCallDiscardReasonHangup extends TLAbsPhoneCallDiscardReason {
    public static final int CONSTRUCTOR_ID = 0x57adc690;

    private final String _constructor = "phoneCallDiscardReasonHangup#57adc690";

    public TLPhoneCallDiscardReasonHangup() {
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
