package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLRecentStickers}: messages.recentStickers#88d37c56</li>
 * <li>{@link TLRecentStickersNotModified}: messages.recentStickersNotModified#b17f890</li>
 * </ul>
 *
 */
public abstract class TLAbsRecentStickers extends TLObject {
    public TLAbsRecentStickers() {
    }
}
