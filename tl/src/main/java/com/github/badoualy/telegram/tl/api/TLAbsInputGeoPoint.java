package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputGeoPoint}: inputGeoPoint#48222faf</li>
 * <li>{@link TLInputGeoPointEmpty}: inputGeoPointEmpty#e4c123d6</li>
 * </ul>
 *
 */
public abstract class TLAbsInputGeoPoint extends TLObject {
    public TLAbsInputGeoPoint() {
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLInputGeoPoint getAsInputGeoPoint() {
        return null;
    }

    public static TLInputGeoPointEmpty newEmpty() {
        return new TLInputGeoPointEmpty();
    }

    public static TLInputGeoPoint newNotEmpty() {
        return new TLInputGeoPoint();
    }
}
