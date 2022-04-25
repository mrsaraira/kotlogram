package com.github.badoualy.telegram.tl.api.help;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLPromoData}: help.promoData#8c39793f</li>
 * <li>{@link TLPromoDataEmpty}: help.promoDataEmpty#98f6ac75</li>
 * </ul>
 *
 */
public abstract class TLAbsPromoData extends TLObject {
    protected int expires;

    public TLAbsPromoData() {
    }

    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLPromoData getAsPromoData() {
        return null;
    }
}
