package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLUser}: user#3ff6ecb0</li>
 * <li>{@link TLUserEmpty}: userEmpty#d3bc4b7a</li>
 * </ul>
 *
 */
public abstract class TLAbsUser extends TLObject {
    protected long id;

    public TLAbsUser() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLUser getAsUser() {
        return null;
    }
}
