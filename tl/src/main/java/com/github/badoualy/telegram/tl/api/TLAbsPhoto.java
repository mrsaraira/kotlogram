package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLPhoto}: photo#fb197a65</li>
 * <li>{@link TLPhotoEmpty}: photoEmpty#2331b22d</li>
 * </ul>
 *
 */
public abstract class TLAbsPhoto extends TLObject {
    protected long id;

    public TLAbsPhoto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLPhoto getAsPhoto() {
        return null;
    }
}
