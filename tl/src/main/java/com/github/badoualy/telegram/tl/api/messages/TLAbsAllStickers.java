package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLAllStickers}: messages.allStickers#cdbbcebb</li>
 * <li>{@link TLAllStickersNotModified}: messages.allStickersNotModified#e86602c3</li>
 * </ul>
 *
 */
public abstract class TLAbsAllStickers extends TLObject {
    public TLAbsAllStickers() {
    }
}
