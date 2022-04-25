package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLDraftMessage}: draftMessage#fd8e711f</li>
 * <li>{@link TLDraftMessageEmpty}: draftMessageEmpty#1b0c841a</li>
 * </ul>
 *
 */
public abstract class TLAbsDraftMessage extends TLObject {
    protected int flags;

    public TLAbsDraftMessage() {
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLDraftMessage getAsDraftMessage() {
        return null;
    }
}
