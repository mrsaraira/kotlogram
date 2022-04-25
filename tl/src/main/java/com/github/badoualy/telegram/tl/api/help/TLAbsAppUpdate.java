package com.github.badoualy.telegram.tl.api.help;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLAppUpdate}: help.appUpdate#ccbbce30</li>
 * <li>{@link TLNoAppUpdate}: help.noAppUpdate#c45a6536</li>
 * </ul>
 *
 */
public abstract class TLAbsAppUpdate extends TLObject {
    public TLAbsAppUpdate() {
    }
}
