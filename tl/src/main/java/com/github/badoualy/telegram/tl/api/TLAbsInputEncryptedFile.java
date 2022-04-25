package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputEncryptedFile}: inputEncryptedFile#5a17b5e5</li>
 * <li>{@link TLInputEncryptedFileBigUploaded}: inputEncryptedFileBigUploaded#2dc173c8</li>
 * <li>{@link TLInputEncryptedFileEmpty}: inputEncryptedFileEmpty#1837c364</li>
 * <li>{@link TLInputEncryptedFileUploaded}: inputEncryptedFileUploaded#64bd0306</li>
 * </ul>
 *
 */
public abstract class TLAbsInputEncryptedFile extends TLObject {
    public TLAbsInputEncryptedFile() {
    }
}
