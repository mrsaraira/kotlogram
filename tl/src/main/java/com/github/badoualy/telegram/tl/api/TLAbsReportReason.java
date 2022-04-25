package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputReportReasonChildAbuse}: inputReportReasonChildAbuse#adf44ee3</li>
 * <li>{@link TLInputReportReasonCopyright}: inputReportReasonCopyright#9b89f93a</li>
 * <li>{@link TLInputReportReasonFake}: inputReportReasonFake#f5ddd6e7</li>
 * <li>{@link TLInputReportReasonGeoIrrelevant}: inputReportReasonGeoIrrelevant#dbd4feed</li>
 * <li>{@link TLInputReportReasonOther}: inputReportReasonOther#c1e4a2b1</li>
 * <li>{@link TLInputReportReasonPornography}: inputReportReasonPornography#2e59d922</li>
 * <li>{@link TLInputReportReasonSpam}: inputReportReasonSpam#58dbcab8</li>
 * <li>{@link TLInputReportReasonViolence}: inputReportReasonViolence#1e22c78d</li>
 * </ul>
 *
 */
public abstract class TLAbsReportReason extends TLObject {
    public TLAbsReportReason() {
    }
}
