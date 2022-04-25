package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputReportReasonOther extends TLAbsReportReason {
    public static final int CONSTRUCTOR_ID = 0xc1e4a2b1;

    private final String _constructor = "inputReportReasonOther#c1e4a2b1";

    public TLInputReportReasonOther() {
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
