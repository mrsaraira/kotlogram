package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLPeerLocated}: peerLocated#ca461b5d</li>
 * <li>{@link TLPeerSelfLocated}: peerSelfLocated#f8ec284b</li>
 * </ul>
 *
 */
public abstract class TLAbsPeerLocated extends TLObject {
    protected int expires;

    public TLAbsPeerLocated() {
    }

    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }
}
