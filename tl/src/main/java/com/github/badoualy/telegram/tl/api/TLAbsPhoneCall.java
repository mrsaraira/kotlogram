package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLPhoneCall}: phoneCall#967f7c67</li>
 * <li>{@link TLPhoneCallAccepted}: phoneCallAccepted#3660c311</li>
 * <li>{@link TLPhoneCallDiscarded}: phoneCallDiscarded#50ca4de1</li>
 * <li>{@link TLPhoneCallEmpty}: phoneCallEmpty#5366c915</li>
 * <li>{@link TLPhoneCallRequested}: phoneCallRequested#14b0ed0c</li>
 * <li>{@link TLPhoneCallWaiting}: phoneCallWaiting#c5226f17</li>
 * </ul>
 *
 */
public abstract class TLAbsPhoneCall extends TLObject {
    protected long id;

    public TLAbsPhoneCall() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
