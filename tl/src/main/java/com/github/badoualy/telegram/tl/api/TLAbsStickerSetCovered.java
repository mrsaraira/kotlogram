package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLStickerSetCovered}: stickerSetCovered#6410a5d2</li>
 * <li>{@link TLStickerSetMultiCovered}: stickerSetMultiCovered#3407e51b</li>
 * </ul>
 *
 */
public abstract class TLAbsStickerSetCovered extends TLObject {
    protected TLStickerSet set;

    public TLAbsStickerSetCovered() {
    }

    public TLStickerSet getSet() {
        return set;
    }

    public void setSet(TLStickerSet set) {
        this.set = set;
    }
}
