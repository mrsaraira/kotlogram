package com.github.badoualy.telegram.tl.api.auth;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLCodeTypeCall}: auth.codeTypeCall#741cd3e3</li>
 * <li>{@link TLCodeTypeFlashCall}: auth.codeTypeFlashCall#226ccefb</li>
 * <li>{@link TLCodeTypeMissedCall}: auth.codeTypeMissedCall#d61ad6ee</li>
 * <li>{@link TLCodeTypeSms}: auth.codeTypeSms#72a3158c</li>
 * </ul>
 *
 */
public abstract class TLAbsCodeType extends TLObject {
    public TLAbsCodeType() {
    }
}
