package com.github.badoualy.telegram.tl.api.account;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLResetPasswordFailedWait}: account.resetPasswordFailedWait#e3779861</li>
 * <li>{@link TLResetPasswordOk}: account.resetPasswordOk#e926d63e</li>
 * <li>{@link TLResetPasswordRequestedWait}: account.resetPasswordRequestedWait#e9effc7d</li>
 * </ul>
 *
 */
public abstract class TLAbsResetPasswordResult extends TLObject {
    public TLAbsResetPasswordResult() {
    }
}
