package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputMessageCallbackQuery}: inputMessageCallbackQuery#acfa1a7e</li>
 * <li>{@link TLInputMessageID}: inputMessageID#a676a322</li>
 * <li>{@link TLInputMessagePinned}: inputMessagePinned#86872538</li>
 * <li>{@link TLInputMessageReplyTo}: inputMessageReplyTo#bad88395</li>
 * </ul>
 *
 */
public abstract class TLAbsInputMessage extends TLObject {
    public TLAbsInputMessage() {
    }
}
