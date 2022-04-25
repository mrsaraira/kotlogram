package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputCheckPasswordEmpty}: inputCheckPasswordEmpty#9880f658</li>
 * <li>{@link TLInputCheckPasswordSRP}: inputCheckPasswordSRP#d27ff082</li>
 * </ul>
 *
 */
public abstract class TLAbsInputCheckPasswordSRP extends TLObject {
    public TLAbsInputCheckPasswordSRP() {
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLInputCheckPasswordSRP getAsInputCheckPasswordSRP() {
        return null;
    }

    public static TLInputCheckPasswordEmpty newEmpty() {
        return new TLInputCheckPasswordEmpty();
    }

    public static TLInputCheckPasswordSRP newNotEmpty() {
        return new TLInputCheckPasswordSRP();
    }
}
