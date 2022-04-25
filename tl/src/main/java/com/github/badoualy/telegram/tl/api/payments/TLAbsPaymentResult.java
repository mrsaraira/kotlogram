package com.github.badoualy.telegram.tl.api.payments;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLPaymentResult}: payments.paymentResult#4e5f810d</li>
 * <li>{@link TLPaymentVerificationNeeded}: payments.paymentVerificationNeeded#d8411139</li>
 * </ul>
 *
 */
public abstract class TLAbsPaymentResult extends TLObject {
    public TLAbsPaymentResult() {
    }
}
