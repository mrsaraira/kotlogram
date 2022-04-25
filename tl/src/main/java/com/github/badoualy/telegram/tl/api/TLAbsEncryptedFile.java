package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLEncryptedFile}: encryptedFile#4a70994c</li>
 * <li>{@link TLEncryptedFileEmpty}: encryptedFileEmpty#c21f497e</li>
 * </ul>
 *
 */
public abstract class TLAbsEncryptedFile extends TLObject {
    public TLAbsEncryptedFile() {
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLEncryptedFile getAsEncryptedFile() {
        return null;
    }
}
