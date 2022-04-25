package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLMessage}: message#38116ee0</li>
 * <li>{@link TLMessageEmpty}: messageEmpty#90a6ca84</li>
 * <li>{@link TLMessageService}: messageService#2b085862</li>
 * </ul>
 *
 */
public abstract class TLAbsMessage extends TLObject {
    protected int flags;

    protected int id;

    public TLAbsMessage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
