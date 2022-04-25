package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputBotInlineMessageGame}: inputBotInlineMessageGame#4b425864</li>
 * <li>{@link TLInputBotInlineMessageMediaAuto}: inputBotInlineMessageMediaAuto#3380c786</li>
 * <li>{@link TLInputBotInlineMessageMediaContact}: inputBotInlineMessageMediaContact#a6edbffd</li>
 * <li>{@link TLInputBotInlineMessageMediaGeo}: inputBotInlineMessageMediaGeo#96929a85</li>
 * <li>{@link TLInputBotInlineMessageMediaInvoice}: inputBotInlineMessageMediaInvoice#d7e78225</li>
 * <li>{@link TLInputBotInlineMessageMediaVenue}: inputBotInlineMessageMediaVenue#417bbf11</li>
 * <li>{@link TLInputBotInlineMessageText}: inputBotInlineMessageText#3dcd7a87</li>
 * </ul>
 *
 */
public abstract class TLAbsInputBotInlineMessage extends TLObject {
    protected int flags;

    protected TLAbsReplyMarkup replyMarkup;

    public TLAbsInputBotInlineMessage() {
    }

    public TLAbsReplyMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(TLAbsReplyMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }
}
