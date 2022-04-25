package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLChannelMessages}: messages.channelMessages#64479808</li>
 * <li>{@link TLMessages}: messages.messages#8c718e87</li>
 * <li>{@link TLMessagesNotModified}: messages.messagesNotModified#74535f21</li>
 * <li>{@link TLMessagesSlice}: messages.messagesSlice#3a54685e</li>
 * </ul>
 *
 */
public abstract class TLAbsMessages extends TLObject {
    public TLAbsMessages() {
    }
}
