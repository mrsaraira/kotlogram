package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputReportReasonFake extends TLAbsReportReason {
    public static final int CONSTRUCTOR_ID = 0xf5ddd6e7;

    private final String _constructor = "inputReportReasonFake#f5ddd6e7";

    public TLInputReportReasonFake() {
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
