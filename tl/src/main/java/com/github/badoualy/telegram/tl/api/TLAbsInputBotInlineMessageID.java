package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputBotInlineMessageID}: inputBotInlineMessageID#890c3d89</li>
 * <li>{@link TLInputBotInlineMessageID64}: inputBotInlineMessageID64#b6d915d7</li>
 * </ul>
 *
 */
public abstract class TLAbsInputBotInlineMessageID extends TLObject {
    protected int dcId;

    protected long accessHash;

    public TLAbsInputBotInlineMessageID() {
    }

    public int getDcId() {
        return dcId;
    }

    public void setDcId(int dcId) {
        this.dcId = dcId;
    }

    public long getAccessHash() {
        return accessHash;
    }

    public void setAccessHash(long accessHash) {
        this.accessHash = accessHash;
    }
}
