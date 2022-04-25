package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLGeoPoint}: geoPoint#b2a2f663</li>
 * <li>{@link TLGeoPointEmpty}: geoPointEmpty#1117dd5f</li>
 * </ul>
 *
 */
public abstract class TLAbsGeoPoint extends TLObject {
    public TLAbsGeoPoint() {
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLGeoPoint getAsGeoPoint() {
        return null;
    }
}
