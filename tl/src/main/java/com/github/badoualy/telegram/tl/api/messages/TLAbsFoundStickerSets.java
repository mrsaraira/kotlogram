package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLFoundStickerSets}: messages.foundStickerSets#8af09dd2</li>
 * <li>{@link TLFoundStickerSetsNotModified}: messages.foundStickerSetsNotModified#d54b65d</li>
 * </ul>
 *
 */
public abstract class TLAbsFoundStickerSets extends TLObject {
    public TLAbsFoundStickerSets() {
    }
}
