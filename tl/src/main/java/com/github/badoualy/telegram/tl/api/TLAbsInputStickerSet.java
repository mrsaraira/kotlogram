package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputStickerSetAnimatedEmoji}: inputStickerSetAnimatedEmoji#28703c8</li>
 * <li>{@link TLInputStickerSetAnimatedEmojiAnimations}: inputStickerSetAnimatedEmojiAnimations#cde3739</li>
 * <li>{@link TLInputStickerSetDice}: inputStickerSetDice#e67f520e</li>
 * <li>{@link TLInputStickerSetEmpty}: inputStickerSetEmpty#ffb62b95</li>
 * <li>{@link TLInputStickerSetID}: inputStickerSetID#9de7a269</li>
 * <li>{@link TLInputStickerSetShortName}: inputStickerSetShortName#861cc8a0</li>
 * </ul>
 *
 */
public abstract class TLAbsInputStickerSet extends TLObject {
    public TLAbsInputStickerSet() {
    }
}
