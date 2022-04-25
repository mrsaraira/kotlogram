package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInlineQueryPeerTypeBroadcast}: inlineQueryPeerTypeBroadcast#6334ee9a</li>
 * <li>{@link TLInlineQueryPeerTypeChat}: inlineQueryPeerTypeChat#d766c50a</li>
 * <li>{@link TLInlineQueryPeerTypeMegagroup}: inlineQueryPeerTypeMegagroup#5ec4be43</li>
 * <li>{@link TLInlineQueryPeerTypePM}: inlineQueryPeerTypePM#833c0fac</li>
 * <li>{@link TLInlineQueryPeerTypeSameBotPM}: inlineQueryPeerTypeSameBotPM#3081ed9d</li>
 * </ul>
 *
 */
public abstract class TLAbsInlineQueryPeerType extends TLObject {
    public TLAbsInlineQueryPeerType() {
    }
}
