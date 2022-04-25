package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLSavedGifs}: messages.savedGifs#84a02a0d</li>
 * <li>{@link TLSavedGifsNotModified}: messages.savedGifsNotModified#e8025ca2</li>
 * </ul>
 *
 */
public abstract class TLAbsSavedGifs extends TLObject {
    public TLAbsSavedGifs() {
    }
}
