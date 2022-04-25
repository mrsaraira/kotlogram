package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLChatPhoto}: chatPhoto#1c6e1c11</li>
 * <li>{@link TLChatPhotoEmpty}: chatPhotoEmpty#37c1011c</li>
 * </ul>
 *
 */
public abstract class TLAbsChatPhoto extends TLObject {
    public TLAbsChatPhoto() {
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLChatPhoto getAsChatPhoto() {
        return null;
    }
}
