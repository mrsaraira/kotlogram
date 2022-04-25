package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLSentEncryptedFile}: messages.sentEncryptedFile#9493ff32</li>
 * <li>{@link TLSentEncryptedMessage}: messages.sentEncryptedMessage#560f8935</li>
 * </ul>
 *
 */
public abstract class TLAbsSentEncryptedMessage extends TLObject {
    protected int date;

    public TLAbsSentEncryptedMessage() {
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
