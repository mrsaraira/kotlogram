package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLReplyInlineMarkup}: replyInlineMarkup#48a30254</li>
 * <li>{@link TLReplyKeyboardForceReply}: replyKeyboardForceReply#86b40b08</li>
 * <li>{@link TLReplyKeyboardHide}: replyKeyboardHide#a03e5b85</li>
 * <li>{@link TLReplyKeyboardMarkup}: replyKeyboardMarkup#85dd99d1</li>
 * </ul>
 *
 */
public abstract class TLAbsReplyMarkup extends TLObject {
    public TLAbsReplyMarkup() {
    }
}
