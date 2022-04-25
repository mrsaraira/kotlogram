package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLFeaturedStickers}: messages.featuredStickers#84c02310</li>
 * <li>{@link TLFeaturedStickersNotModified}: messages.featuredStickersNotModified#c6dc0c66</li>
 * </ul>
 *
 */
public abstract class TLAbsFeaturedStickers extends TLObject {
    protected int count;

    public TLAbsFeaturedStickers() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
