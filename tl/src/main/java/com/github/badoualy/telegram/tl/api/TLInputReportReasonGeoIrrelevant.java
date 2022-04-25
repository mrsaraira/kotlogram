package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputReportReasonGeoIrrelevant extends TLAbsReportReason {
    public static final int CONSTRUCTOR_ID = 0xdbd4feed;

    private final String _constructor = "inputReportReasonGeoIrrelevant#dbd4feed";

    public TLInputReportReasonGeoIrrelevant() {
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
