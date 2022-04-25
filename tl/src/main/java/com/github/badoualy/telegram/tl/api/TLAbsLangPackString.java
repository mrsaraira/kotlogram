package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;
import java.lang.String;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLLangPackString}: langPackString#cad181f6</li>
 * <li>{@link TLLangPackStringDeleted}: langPackStringDeleted#2979eeb2</li>
 * <li>{@link TLLangPackStringPluralized}: langPackStringPluralized#6c47ac9f</li>
 * </ul>
 *
 */
public abstract class TLAbsLangPackString extends TLObject {
    protected String key;

    public TLAbsLangPackString() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
