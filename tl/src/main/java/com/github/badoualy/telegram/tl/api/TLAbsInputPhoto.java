package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputPhoto}: inputPhoto#3bb3b94a</li>
 * <li>{@link TLInputPhotoEmpty}: inputPhotoEmpty#1cd7bf0d</li>
 * </ul>
 *
 */
public abstract class TLAbsInputPhoto extends TLObject {
    public TLAbsInputPhoto() {
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLInputPhoto getAsInputPhoto() {
        return null;
    }

    public static TLInputPhotoEmpty newEmpty() {
        return new TLInputPhotoEmpty();
    }

    public static TLInputPhoto newNotEmpty() {
        return new TLInputPhoto();
    }
}
