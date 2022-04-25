package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLChatParticipants}: chatParticipants#3cbc93f8</li>
 * <li>{@link TLChatParticipantsForbidden}: chatParticipantsForbidden#8763d3e1</li>
 * </ul>
 *
 */
public abstract class TLAbsChatParticipants extends TLObject {
    protected long chatId;

    public TLAbsChatParticipants() {
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }
}
