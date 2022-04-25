package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputReportReasonCopyright extends TLAbsReportReason {
    public static final int CONSTRUCTOR_ID = 0x9b89f93a;

    private final String _constructor = "inputReportReasonCopyright#9b89f93a";

    public TLInputReportReasonCopyright() {
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
