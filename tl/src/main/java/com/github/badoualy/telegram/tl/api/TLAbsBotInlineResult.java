package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;
import java.lang.String;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLBotInlineMediaResult}: botInlineMediaResult#17db940b</li>
 * <li>{@link TLBotInlineResult}: botInlineResult#11965f3a</li>
 * </ul>
 *
 */
public abstract class TLAbsBotInlineResult extends TLObject {
    protected int flags;

    protected String id;

    protected String type;

    protected TLAbsBotInlineMessage sendMessage;

    public TLAbsBotInlineResult() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TLAbsBotInlineMessage getSendMessage() {
        return sendMessage;
    }

    public void setSendMessage(TLAbsBotInlineMessage sendMessage) {
        this.sendMessage = sendMessage;
    }
}
