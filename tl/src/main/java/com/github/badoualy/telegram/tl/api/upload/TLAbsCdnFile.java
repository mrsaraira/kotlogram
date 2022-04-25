package com.github.badoualy.telegram.tl.api.upload;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLCdnFile}: upload.cdnFile#a99fca4f</li>
 * <li>{@link TLCdnFileReuploadNeeded}: upload.cdnFileReuploadNeeded#eea8e46e</li>
 * </ul>
 *
 */
public abstract class TLAbsCdnFile extends TLObject {
    public TLAbsCdnFile() {
    }
}
