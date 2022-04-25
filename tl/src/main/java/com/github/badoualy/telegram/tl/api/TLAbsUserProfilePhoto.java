package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLUserProfilePhoto}: userProfilePhoto#82d1f706</li>
 * <li>{@link TLUserProfilePhotoEmpty}: userProfilePhotoEmpty#4f11bae1</li>
 * </ul>
 *
 */
public abstract class TLAbsUserProfilePhoto extends TLObject {
    public TLAbsUserProfilePhoto() {
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLUserProfilePhoto getAsUserProfilePhoto() {
        return null;
    }
}
