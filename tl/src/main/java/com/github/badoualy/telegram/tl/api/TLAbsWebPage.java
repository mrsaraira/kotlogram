package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLWebPage}: webPage#e89c45b2</li>
 * <li>{@link TLWebPageEmpty}: webPageEmpty#eb1477e8</li>
 * <li>{@link TLWebPageNotModified}: webPageNotModified#7311ca11</li>
 * <li>{@link TLWebPagePending}: webPagePending#c586da1c</li>
 * </ul>
 *
 */
public abstract class TLAbsWebPage extends TLObject {
    public TLAbsWebPage() {
    }
}
