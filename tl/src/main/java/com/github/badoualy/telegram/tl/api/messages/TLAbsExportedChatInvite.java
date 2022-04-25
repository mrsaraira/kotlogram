package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.api.TLAbsUser;
import com.github.badoualy.telegram.tl.api.TLChatInviteExported;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLExportedChatInvite}: messages.exportedChatInvite#1871be50</li>
 * <li>{@link TLExportedChatInviteReplaced}: messages.exportedChatInviteReplaced#222600ef</li>
 * </ul>
 *
 */
public abstract class TLAbsExportedChatInvite extends TLObject {
    protected TLChatInviteExported invite;

    protected TLVector<TLAbsUser> users;

    public TLAbsExportedChatInvite() {
    }

    public TLChatInviteExported getInvite() {
        return invite;
    }

    public void setInvite(TLChatInviteExported invite) {
        this.invite = invite;
    }

    public TLVector<TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(TLVector<TLAbsUser> users) {
        this.users = users;
    }
}
