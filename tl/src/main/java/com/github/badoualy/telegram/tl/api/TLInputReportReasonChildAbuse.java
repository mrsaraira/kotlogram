package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputReportReasonChildAbuse extends TLAbsReportReason {
    public static final int CONSTRUCTOR_ID = 0xadf44ee3;

    private final String _constructor = "inputReportReasonChildAbuse#adf44ee3";

    public TLInputReportReasonChildAbuse() {
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
