package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLChannel}: channel#8261ac61</li>
 * <li>{@link TLChannelForbidden}: channelForbidden#17d493d5</li>
 * <li>{@link TLChat}: chat#41cbf256</li>
 * <li>{@link TLChatEmpty}: chatEmpty#29562865</li>
 * <li>{@link TLChatForbidden}: chatForbidden#6592a1a7</li>
 * </ul>
 *
 */
public abstract class TLAbsChat extends TLObject {
    protected long id;

    public TLAbsChat() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
