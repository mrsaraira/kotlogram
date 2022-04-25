package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLPeerChannel}: peerChannel#a2a5371e</li>
 * <li>{@link TLPeerChat}: peerChat#36c6019a</li>
 * <li>{@link TLPeerUser}: peerUser#59511722</li>
 * </ul>
 *
 */
public abstract class TLAbsPeer extends TLObject {
    public TLAbsPeer() {
    }
}
