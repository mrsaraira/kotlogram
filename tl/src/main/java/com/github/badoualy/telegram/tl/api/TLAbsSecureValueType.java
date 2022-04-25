package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLSecureValueTypeAddress}: secureValueTypeAddress#cbe31e26</li>
 * <li>{@link TLSecureValueTypeBankStatement}: secureValueTypeBankStatement#89137c0d</li>
 * <li>{@link TLSecureValueTypeDriverLicense}: secureValueTypeDriverLicense#6e425c4</li>
 * <li>{@link TLSecureValueTypeEmail}: secureValueTypeEmail#8e3ca7ee</li>
 * <li>{@link TLSecureValueTypeIdentityCard}: secureValueTypeIdentityCard#a0d0744b</li>
 * <li>{@link TLSecureValueTypeInternalPassport}: secureValueTypeInternalPassport#99a48f23</li>
 * <li>{@link TLSecureValueTypePassport}: secureValueTypePassport#3dac6a00</li>
 * <li>{@link TLSecureValueTypePassportRegistration}: secureValueTypePassportRegistration#99e3806a</li>
 * <li>{@link TLSecureValueTypePersonalDetails}: secureValueTypePersonalDetails#9d2a81e3</li>
 * <li>{@link TLSecureValueTypePhone}: secureValueTypePhone#b320aadb</li>
 * <li>{@link TLSecureValueTypeRentalAgreement}: secureValueTypeRentalAgreement#8b883488</li>
 * <li>{@link TLSecureValueTypeTemporaryRegistration}: secureValueTypeTemporaryRegistration#ea02ec33</li>
 * <li>{@link TLSecureValueTypeUtilityBill}: secureValueTypeUtilityBill#fc36954e</li>
 * </ul>
 *
 */
public abstract class TLAbsSecureValueType extends TLObject {
    public TLAbsSecureValueType() {
    }
}
