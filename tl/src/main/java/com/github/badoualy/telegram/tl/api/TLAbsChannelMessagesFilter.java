package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLChannelMessagesFilter}: channelMessagesFilter#cd77d957</li>
 * <li>{@link TLChannelMessagesFilterEmpty}: channelMessagesFilterEmpty#94d42ee7</li>
 * </ul>
 *
 */
public abstract class TLAbsChannelMessagesFilter extends TLObject {
    public TLAbsChannelMessagesFilter() {
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLChannelMessagesFilter getAsChannelMessagesFilter() {
        return null;
    }
}
