package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputPaymentCredentials}: inputPaymentCredentials#3417d728</li>
 * <li>{@link TLInputPaymentCredentialsApplePay}: inputPaymentCredentialsApplePay#aa1c39f</li>
 * <li>{@link TLInputPaymentCredentialsGooglePay}: inputPaymentCredentialsGooglePay#8ac32801</li>
 * <li>{@link TLInputPaymentCredentialsSaved}: inputPaymentCredentialsSaved#c10eb2cf</li>
 * </ul>
 *
 */
public abstract class TLAbsInputPaymentCredentials extends TLObject {
    public TLAbsInputPaymentCredentials() {
    }
}
