package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLChatInvite}: chatInvite#300c44c1</li>
 * <li>{@link TLChatInviteAlready}: chatInviteAlready#5a686d7c</li>
 * <li>{@link TLChatInvitePeek}: chatInvitePeek#61695cb0</li>
 * </ul>
 *
 */
public abstract class TLAbsChatInvite extends TLObject {
    public TLAbsChatInvite() {
    }
}
