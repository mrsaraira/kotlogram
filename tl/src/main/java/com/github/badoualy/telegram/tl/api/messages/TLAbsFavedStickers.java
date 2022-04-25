package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLFavedStickers}: messages.favedStickers#2cb51097</li>
 * <li>{@link TLFavedStickersNotModified}: messages.favedStickersNotModified#9e8fa6d3</li>
 * </ul>
 *
 */
public abstract class TLAbsFavedStickers extends TLObject {
    public TLAbsFavedStickers() {
    }
}
