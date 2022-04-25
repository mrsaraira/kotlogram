package com.github.badoualy.telegram.tl.api.contacts;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.api.TLAbsChat;
import com.github.badoualy.telegram.tl.api.TLAbsUser;
import com.github.badoualy.telegram.tl.api.TLPeerBlocked;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLBlocked}: contacts.blocked#ade1591</li>
 * <li>{@link TLBlockedSlice}: contacts.blockedSlice#e1664194</li>
 * </ul>
 *
 */
public abstract class TLAbsBlocked extends TLObject {
    protected TLVector<TLPeerBlocked> blocked;

    protected TLVector<TLAbsChat> chats;

    protected TLVector<TLAbsUser> users;

    public TLAbsBlocked() {
    }

    public TLVector<TLPeerBlocked> getBlocked() {
        return blocked;
    }

    public void setBlocked(TLVector<TLPeerBlocked> blocked) {
        this.blocked = blocked;
    }

    public TLVector<TLAbsChat> getChats() {
        return chats;
    }

    public void setChats(TLVector<TLAbsChat> chats) {
        this.chats = chats;
    }

    public TLVector<TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(TLVector<TLAbsUser> users) {
        this.users = users;
    }
}
