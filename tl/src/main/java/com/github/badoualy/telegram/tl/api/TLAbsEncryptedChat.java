package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLEncryptedChat}: encryptedChat#61f0d4c7</li>
 * <li>{@link TLEncryptedChatDiscarded}: encryptedChatDiscarded#1e1c7c45</li>
 * <li>{@link TLEncryptedChatEmpty}: encryptedChatEmpty#ab7ec0a0</li>
 * <li>{@link TLEncryptedChatRequested}: encryptedChatRequested#48f1d94c</li>
 * <li>{@link TLEncryptedChatWaiting}: encryptedChatWaiting#66b25953</li>
 * </ul>
 *
 */
public abstract class TLAbsEncryptedChat extends TLObject {
    protected int id;

    public TLAbsEncryptedChat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
