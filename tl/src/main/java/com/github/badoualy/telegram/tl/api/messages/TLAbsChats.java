package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.api.TLAbsChat;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLChats}: messages.chats#64ff9fd5</li>
 * <li>{@link TLChatsSlice}: messages.chatsSlice#9cd81144</li>
 * </ul>
 *
 */
public abstract class TLAbsChats extends TLObject {
    protected TLVector<TLAbsChat> chats;

    public TLAbsChats() {
    }

    public TLVector<TLAbsChat> getChats() {
        return chats;
    }

    public void setChats(TLVector<TLAbsChat> chats) {
        this.chats = chats;
    }
}
