package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLGroupCall}: groupCall#d597650c</li>
 * <li>{@link TLGroupCallDiscarded}: groupCallDiscarded#7780bcb4</li>
 * </ul>
 *
 */
public abstract class TLAbsGroupCall extends TLObject {
    protected long id;

    protected long accessHash;

    public TLAbsGroupCall() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccessHash() {
        return accessHash;
    }

    public void setAccessHash(long accessHash) {
        this.accessHash = accessHash;
    }
}
