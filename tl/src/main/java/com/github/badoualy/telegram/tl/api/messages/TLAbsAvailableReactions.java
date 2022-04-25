package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLAvailableReactions}: messages.availableReactions#768e3aad</li>
 * <li>{@link TLAvailableReactionsNotModified}: messages.availableReactionsNotModified#9f071957</li>
 * </ul>
 *
 */
public abstract class TLAbsAvailableReactions extends TLObject {
    public TLAbsAvailableReactions() {
    }
}
