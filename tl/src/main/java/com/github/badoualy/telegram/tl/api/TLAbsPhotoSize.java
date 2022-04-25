package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;
import java.lang.String;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLPhotoCachedSize}: photoCachedSize#21e1ad6</li>
 * <li>{@link TLPhotoPathSize}: photoPathSize#d8214d41</li>
 * <li>{@link TLPhotoSize}: photoSize#75c78e60</li>
 * <li>{@link TLPhotoSizeEmpty}: photoSizeEmpty#e17e23c</li>
 * <li>{@link TLPhotoSizeProgressive}: photoSizeProgressive#fa3efb95</li>
 * <li>{@link TLPhotoStrippedSize}: photoStrippedSize#e0b0bc2e</li>
 * </ul>
 *
 */
public abstract class TLAbsPhotoSize extends TLObject {
    protected String type;

    public TLAbsPhotoSize() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
