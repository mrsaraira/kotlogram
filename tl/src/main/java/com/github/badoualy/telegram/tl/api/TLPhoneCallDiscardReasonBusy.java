package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLPhoneCallDiscardReasonBusy extends TLAbsPhoneCallDiscardReason {
    public static final int CONSTRUCTOR_ID = 0xfaf7e8c9;

    private final String _constructor = "phoneCallDiscardReasonBusy#faf7e8c9";

    public TLPhoneCallDiscardReasonBusy() {
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
