package com.github.badoualy.telegram.tl.api.account;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLWallPapers}: account.wallPapers#cdc3858c</li>
 * <li>{@link TLWallPapersNotModified}: account.wallPapersNotModified#1c199183</li>
 * </ul>
 *
 */
public abstract class TLAbsWallPapers extends TLObject {
    public TLAbsWallPapers() {
    }
}
