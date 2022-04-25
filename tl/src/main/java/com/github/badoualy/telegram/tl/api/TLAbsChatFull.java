package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;
import java.lang.Integer;
import java.lang.String;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLChannelFull}: channelFull#e13c3d20</li>
 * <li>{@link TLChatFull}: chatFull#d18ee226</li>
 * </ul>
 *
 */
public abstract class TLAbsChatFull extends TLObject {
    protected int flags;

    protected long id;

    protected String about;

    protected TLPeerNotifySettings notifySettings;

    protected Integer folderId;

    public TLAbsChatFull() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public TLPeerNotifySettings getNotifySettings() {
        return notifySettings;
    }

    public void setNotifySettings(TLPeerNotifySettings notifySettings) {
        this.notifySettings = notifySettings;
    }

    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }
}
