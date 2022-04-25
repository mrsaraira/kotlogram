package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLSecurePasswordKdfAlgoPBKDF2HMACSHA512iter100000}: securePasswordKdfAlgoPBKDF2HMACSHA512iter100000#bbf2dda0</li>
 * <li>{@link TLSecurePasswordKdfAlgoSHA512}: securePasswordKdfAlgoSHA512#86471d92</li>
 * <li>{@link TLSecurePasswordKdfAlgoUnknown}: securePasswordKdfAlgoUnknown#4a8537</li>
 * </ul>
 *
 */
public abstract class TLAbsSecurePasswordKdfAlgo extends TLObject {
    public TLAbsSecurePasswordKdfAlgo() {
    }
}
