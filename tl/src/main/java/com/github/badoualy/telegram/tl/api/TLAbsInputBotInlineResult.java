package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;
import java.lang.String;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputBotInlineResult}: inputBotInlineResult#88bf9319</li>
 * <li>{@link TLInputBotInlineResultDocument}: inputBotInlineResultDocument#fff8fdc4</li>
 * <li>{@link TLInputBotInlineResultGame}: inputBotInlineResultGame#4fa417f2</li>
 * <li>{@link TLInputBotInlineResultPhoto}: inputBotInlineResultPhoto#a8d864a7</li>
 * </ul>
 *
 */
public abstract class TLAbsInputBotInlineResult extends TLObject {
    protected String id;

    protected TLAbsInputBotInlineMessage sendMessage;

    public TLAbsInputBotInlineResult() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TLAbsInputBotInlineMessage getSendMessage() {
        return sendMessage;
    }

    public void setSendMessage(TLAbsInputBotInlineMessage sendMessage) {
        this.sendMessage = sendMessage;
    }
}
