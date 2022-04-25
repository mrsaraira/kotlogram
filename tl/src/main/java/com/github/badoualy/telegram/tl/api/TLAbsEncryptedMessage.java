package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLBytes;
import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLEncryptedMessage}: encryptedMessage#ed18c118</li>
 * <li>{@link TLEncryptedMessageService}: encryptedMessageService#23734b06</li>
 * </ul>
 *
 */
public abstract class TLAbsEncryptedMessage extends TLObject {
    protected long randomId;

    protected int chatId;

    protected int date;

    protected TLBytes bytes;

    public TLAbsEncryptedMessage() {
    }

    public long getRandomId() {
        return randomId;
    }

    public void setRandomId(long randomId) {
        this.randomId = randomId;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public TLBytes getBytes() {
        return bytes;
    }

    public void setBytes(TLBytes bytes) {
        this.bytes = bytes;
    }
}
