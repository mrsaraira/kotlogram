package com.github.badoualy.telegram.tl.api.help;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLDeepLinkInfo}: help.deepLinkInfo#6a4ee832</li>
 * <li>{@link TLDeepLinkInfoEmpty}: help.deepLinkInfoEmpty#66afa166</li>
 * </ul>
 *
 */
public abstract class TLAbsDeepLinkInfo extends TLObject {
    public TLAbsDeepLinkInfo() {
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLDeepLinkInfo getAsDeepLinkInfo() {
        return null;
    }
}
