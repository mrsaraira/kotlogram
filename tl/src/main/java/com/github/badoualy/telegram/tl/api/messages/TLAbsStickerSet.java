package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLStickerSet}: messages.stickerSet#b60a24a6</li>
 * <li>{@link TLStickerSetNotModified}: messages.stickerSetNotModified#d3f924eb</li>
 * </ul>
 *
 */
public abstract class TLAbsStickerSet extends TLObject {
    public TLAbsStickerSet() {
    }
}
