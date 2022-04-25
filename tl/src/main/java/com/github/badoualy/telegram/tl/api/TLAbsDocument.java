package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLDocument}: document#1e87342b</li>
 * <li>{@link TLDocumentEmpty}: documentEmpty#36f8c871</li>
 * </ul>
 *
 */
public abstract class TLAbsDocument extends TLObject {
    protected long id;

    public TLAbsDocument() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLDocument getAsDocument() {
        return null;
    }
}
