package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputUser}: inputUser#f21158c6</li>
 * <li>{@link TLInputUserEmpty}: inputUserEmpty#b98886cf</li>
 * <li>{@link TLInputUserFromMessage}: inputUserFromMessage#1da448e2</li>
 * <li>{@link TLInputUserSelf}: inputUserSelf#f7c1b13f</li>
 * </ul>
 *
 */
public abstract class TLAbsInputUser extends TLObject {
    public TLAbsInputUser() {
    }
}
