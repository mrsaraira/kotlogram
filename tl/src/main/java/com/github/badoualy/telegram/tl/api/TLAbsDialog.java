package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLDialog}: dialog#2c171f72</li>
 * <li>{@link TLDialogFolder}: dialogFolder#71bd134c</li>
 * </ul>
 *
 */
public abstract class TLAbsDialog extends TLObject {
    protected int flags;

    protected boolean pinned;

    protected TLAbsPeer peer;

    protected int topMessage;

    public TLAbsDialog() {
    }

    public boolean getPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public TLAbsPeer getPeer() {
        return peer;
    }

    public void setPeer(TLAbsPeer peer) {
        this.peer = peer;
    }

    public int getTopMessage() {
        return topMessage;
    }

    public void setTopMessage(int topMessage) {
        this.topMessage = topMessage;
    }
}
