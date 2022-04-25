package com.github.badoualy.telegram.tl.api.upload;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLFile}: upload.file#96a18d5</li>
 * <li>{@link TLFileCdnRedirect}: upload.fileCdnRedirect#f18cda44</li>
 * </ul>
 *
 */
public abstract class TLAbsFile extends TLObject {
    public TLAbsFile() {
    }
}
