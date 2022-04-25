package com.github.badoualy.telegram.tl.api.help;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLTermsOfServiceUpdate}: help.termsOfServiceUpdate#28ecf961</li>
 * <li>{@link TLTermsOfServiceUpdateEmpty}: help.termsOfServiceUpdateEmpty#e3309f7f</li>
 * </ul>
 *
 */
public abstract class TLAbsTermsOfServiceUpdate extends TLObject {
    protected int expires;

    public TLAbsTermsOfServiceUpdate() {
    }

    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLTermsOfServiceUpdate getAsTermsOfServiceUpdate() {
        return null;
    }
}
