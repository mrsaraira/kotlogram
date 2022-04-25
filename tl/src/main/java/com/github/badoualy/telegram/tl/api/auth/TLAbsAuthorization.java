package com.github.badoualy.telegram.tl.api.auth;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLAuthorization}: auth.authorization#33fb7bb8</li>
 * <li>{@link TLAuthorizationSignUpRequired}: auth.authorizationSignUpRequired#44747e9a</li>
 * </ul>
 *
 */
public abstract class TLAbsAuthorization extends TLObject {
    protected int flags;

    public TLAbsAuthorization() {
    }
}
