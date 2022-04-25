package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputPeerChannel}: inputPeerChannel#27bcbbfc</li>
 * <li>{@link TLInputPeerChannelFromMessage}: inputPeerChannelFromMessage#bd2a0840</li>
 * <li>{@link TLInputPeerChat}: inputPeerChat#35a95cb9</li>
 * <li>{@link TLInputPeerEmpty}: inputPeerEmpty#7f3b18ea</li>
 * <li>{@link TLInputPeerSelf}: inputPeerSelf#7da07ec9</li>
 * <li>{@link TLInputPeerUser}: inputPeerUser#dde8a54c</li>
 * <li>{@link TLInputPeerUserFromMessage}: inputPeerUserFromMessage#a87b0a1c</li>
 * </ul>
 *
 */
public abstract class TLAbsInputPeer extends TLObject {
    public TLAbsInputPeer() {
    }
}
